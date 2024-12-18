package X;

/* loaded from: classes7.dex */
public final class J50 implements Runnable {
    public final /* synthetic */ C39030HGg A00;
    public final /* synthetic */ C75363a3 A01;

    public J50(C39030HGg c39030HGg, C75363a3 c75363a3) {
        this.A00 = c39030HGg;
        this.A01 = c75363a3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4QT c4qt = (C4QT) this.A00.A01;
        InterfaceC08100bW interfaceC08100bW = C4QT.A1L;
        C4SE c4se = c4qt.A0O;
        if (c4se != null) {
            C75363a3 c75363a3 = this.A01;
            InterfaceC74623Ww interfaceC74623Ww = c4qt.A0J;
            C4S7 c4s7 = c4se.A0B;
            float f = c4qt.A02;
            boolean z = c4se.A0E;
            String str = c4qt.A0Q;
            AbstractC25229BEm.A1I(c4s7, 3, str);
            String str2 = c4se.A0C;
            int i = c4qt.A0A;
            int currentPositionMs = c4qt.getCurrentPositionMs();
            C4QP c4qp = c4se.A03;
            C14360o3.A0B(c4qp, 0);
            c4qt.E5v(new C4SC(interfaceC74623Ww, c4qp, c75363a3, c4s7, str2, str, f, i, currentPositionMs, z));
        }
    }
}
