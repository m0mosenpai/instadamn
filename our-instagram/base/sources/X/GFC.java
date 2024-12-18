package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class GFC implements InterfaceC37178GZp {
    public final /* synthetic */ AtomicInteger A00;

    public GFC(AtomicInteger atomicInteger) {
        this.A00 = atomicInteger;
    }

    @Override // X.InterfaceC37178GZp
    public final void AOO(C25531Mh c25531Mh, C1Q9 c1q9, C35037FcA c35037FcA) {
        if (c1q9 == C1Q9.A1I) {
            c25531Mh.A0R("retry_strategy", AbstractC34292FAm.A00(AbstractC35794FrW.A00()));
            c25531Mh.A0Q("attempt_count", AbstractC31171DnF.A0V(this.A00.get()));
        }
    }

    @Override // X.InterfaceC37178GZp
    public final int Ad9() {
        return this.A00.get();
    }

    @Override // X.InterfaceC37178GZp
    public final String Bp0() {
        return AbstractC34292FAm.A00(AbstractC35794FrW.A00());
    }
}
