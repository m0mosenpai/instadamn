package X;

import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;

/* renamed from: X.Drv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31451Drv implements InterfaceC54962fv {
    public final int A00;
    public final Object A01;

    public C31451Drv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC54962fv
    public final void AHP() {
        switch (this.A00) {
            case 0:
                ((C44548Jms) ((C32301EKo) this.A01).A04.getValue()).A0E.Egh(null);
                return;
            case 1:
                JR2 jr2 = (JR2) this.A01;
                C43626JRj A0q = jr2.A0q();
                A0q.A0E.A02 = AbstractC54912fq.A00().A00(A0q.A0B, null);
                C43626JRj.A03(A0q);
                JR2.A0b(jr2, jr2.A1E);
                return;
            case 2:
                C36010Fv8 A02 = ((DirectSearchInboxFragment) this.A01).A02();
                if (A02 == null) {
                    return;
                }
                C36684GFe c36684GFe = A02.A02;
                c36684GFe.A00 = AbstractC54912fq.A00().A00(c36684GFe.A0Q, null);
                InterfaceC169517hR interfaceC169517hR = A02.A04;
                if (interfaceC169517hR == null) {
                    return;
                }
                A02.A02.DcI(interfaceC169517hR);
                return;
            default:
                ((N6G) this.A01).A00 = null;
                return;
        }
    }
}
