package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class JZG implements InterfaceC50513MRq {
    public final UserSession A00;
    public final AtomicInteger A01;
    public final C19L A02;
    public final C05A A03;

    @Override // X.InterfaceC50513MRq
    public final void start() {
        if (this.A01.getAndIncrement() <= 0) {
            AbstractC166987dD.A1Z(new PYu(this, null, 17), this.A02);
        }
    }

    @Override // X.InterfaceC50513MRq
    public final void stop() {
        AtomicInteger atomicInteger = this.A01;
        if (atomicInteger.decrementAndGet() <= 0) {
            atomicInteger.set(0);
            C57Z.A02(this.A02.Arv());
        }
    }

    public JZG(C12N c12n, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, c12n);
        this.A00 = userSession;
        this.A01 = new AtomicInteger(0);
        this.A02 = AnonymousClass194.A02(new AnonymousClass197(null).plus(c12n.CPG(1282794279, 3)));
        this.A03 = C10E.A00(C2056698q.A01);
    }
}
