package org.endava.chapter5.ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment c) {
        CommentProcessor p = context.getBean(CommentProcessor.class);

        p.setComment(c);
        p.processComment(c);
        p.validateComment(c);

        c = p.getComment();
        // do something further
    }

}

/**
 *
 * De fiecare dată când se apelează sendComment(), el cere o instanță NOUĂ din context:
 *
 * CommentProcessor p = context.getBean(CommentProcessor.class);
 *
 *
 * 🔹 CommentService → DOAR un container logic care cere instanțe
 * 🔹 CommentProcessor → bean prototype, deci Spring dă o nouă instanță de fiecare dată
 *
 * ➡️ Faptul că CommentService e singleton nu influențează deloc numărul instanțelor CommentProcessor.
 *
 * 🧠 Analogia simplă
 *
 * Imaginează-ți că:
 *
 * CommentService = un chelner (există doar unul)
 *
 * ApplicationContext = bucătăria restaurantului
 *
 * CommentProcessor = o pizza (se face una NOUĂ de fiecare dată când este comandată)
 *
 * Chelnerul (singleton) spune:
 *
 * „Dă-mi o pizza!”
 * Și bucătăria (Spring) prepară o pizza NOUĂ (prototype) de fiecare dată.
 *
 * Faptul că ai un singur chelner nu înseamnă că primește aceeași pizza la infinit.
 *
 * 🧩 De ce a arătat exemplul?
 *
 * Pentru că majoritatea începătorilor fac GREȘEALA asta:
 *
 * @Autowired
 * private CommentProcessor processor;  // INVALID, chiar dacă CommentProcessor e PROTOTYPE
 *
 *
 * Pentru că:
 *
 * CommentService este singleton
 *
 * Spring creează toate dependențele lui o singură dată
 *
 * deci injecția produce o singură instanță de CommentProcessor, distrugând scopul prototype
 *
 * De aceea autorul arată codul greșit și apoi codul corect.
 *
 */