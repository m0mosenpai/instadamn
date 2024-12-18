package X;

/* renamed from: X.MXh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC50644MXh implements Runnable {
    public final /* synthetic */ C50643MXf A00;

    public RunnableC50644MXh(C50643MXf c50643MXf) {
        this.A00 = c50643MXf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC58267PsB interfaceC58267PsB;
        int A02;
        Integer num;
        C50643MXf c50643MXf = this.A00;
        if (c50643MXf.A0H && (interfaceC58267PsB = c50643MXf.A0B) != null) {
            int A01 = C50643MXf.A01(c50643MXf, interfaceC58267PsB);
            if (A01 >= c50643MXf.A01 && !c50643MXf.A0G) {
                InterfaceC58267PsB interfaceC58267PsB2 = c50643MXf.A0B;
                if (interfaceC58267PsB2 != null) {
                    interfaceC58267PsB2.seekTo(c50643MXf.A02);
                }
            } else if (A01 != -1) {
                int i = A01;
                C8RS c8rs = c50643MXf.A0A;
                C8RR c8rr = c50643MXf.A0X;
                if (c8rs == c8rr) {
                    int BsQ = c50643MXf.A0V.BsQ(c50643MXf.A05);
                    i = AbstractC13600mm.A03((A01 + BsQ) - c50643MXf.A02, BsQ, c50643MXf.A03);
                }
                int A00 = C50643MXf.A00(c50643MXf, i);
                if (c50643MXf.A0A == c8rr && ((num = c8rr.A02) == C05F.A0C || num == C05F.A0N)) {
                    A02 = 1;
                } else {
                    C8JT c8jt = c50643MXf.A0U.A00;
                    A02 = AbstractC31172DnG.A02(c8jt.A1o.A07, MSW.A06(c8jt.A0J));
                }
                C50643MXf.A08(c50643MXf, i, A00, A02);
                C8RS c8rs2 = c50643MXf.A0A;
                if (c8rs2 != c8rr || !c50643MXf.A0G) {
                    c8rs2.DzG(A01, A00, MSW.A06(c50643MXf.A0D));
                }
            }
            c50643MXf.A0N.postOnAnimation(c50643MXf.A0g);
        }
    }
}
