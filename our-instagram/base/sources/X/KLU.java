package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KLU extends AbstractRunnableC14200nk {
    public final /* synthetic */ JR2 A00;

    @Override // java.lang.Runnable
    public final void run() {
        UserSession A0p = this.A00.A0p();
        C14360o3.A0B(A0p, 0);
        ((LFv) A0p.A01(LFv.class, new C50159MDm(A0p, 20))).A01();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLU(JR2 jr2) {
        super(2003543849, 3, false, false);
        this.A00 = jr2;
    }
}
