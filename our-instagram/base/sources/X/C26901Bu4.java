package X;

import com.instagram.creator.agent.settings.facts.repository.FactsRepository;
import com.instagram.creator.agent.settings.facts.viewmodel.AddFactUseCase;
import java.io.Closeable;

/* renamed from: X.Bu4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26901Bu4 extends AbstractC61152qd {
    public final AddFactUseCase A00;
    public final C26899Bu0 A01;
    public final AbstractC26895Btw A02;

    public C26901Bu4(FactsRepository factsRepository, AddFactUseCase addFactUseCase, C26899Bu0 c26899Bu0, AbstractC26895Btw abstractC26895Btw) {
        this.A01 = c26899Bu0;
        this.A00 = addFactUseCase;
        this.A02 = abstractC26895Btw;
        c26899Bu0.A04(this, true);
        addFactUseCase.A04(this, true);
        abstractC26895Btw.A04(this, true);
        addCloseable((Closeable) factsRepository);
    }
}
