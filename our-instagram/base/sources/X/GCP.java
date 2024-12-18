package X;

import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class GCP implements InterfaceC55012g0 {
    public final int A00;
    public final Object A01;

    public GCP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC55012g0
    public final void DSU(C4NL c4nl) {
        C4NJ c4nj;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c4nl, 0);
                C32301EKo c32301EKo = (C32301EKo) this.A01;
                C44548Jms c44548Jms = (C44548Jms) c32301EKo.A04.getValue();
                C64842wi c64842wi = c32301EKo.A00;
                if (c64842wi != null) {
                    C56473P5n c56473P5n = null;
                    if ((c4nl instanceof C4NJ) && (c4nj = (C4NJ) c4nl) != null) {
                        c56473P5n = new C56473P5n(c64842wi, c4nj);
                    }
                    c44548Jms.A0E.Egh(c56473P5n);
                    return;
                }
                break;
            case 1:
                C14360o3.A0B(c4nl, 0);
                C43626JRj A0q = ((JR2) this.A01).A0q();
                A0q.A0E.A02 = AbstractC54912fq.A00().A00(A0q.A0B, c4nl);
                C43626JRj.A03(A0q);
                return;
            case 2:
                C14360o3.A0B(c4nl, 0);
                C36010Fv8 A02 = ((DirectSearchInboxFragment) this.A01).A02();
                if (A02 == null) {
                    return;
                }
                C36684GFe c36684GFe = A02.A02;
                c36684GFe.A00 = AbstractC54912fq.A00().A00(c36684GFe.A0Q, c4nl);
                InterfaceC169517hR interfaceC169517hR = A02.A04;
                if (interfaceC169517hR == null) {
                    return;
                }
                A02.A02.DcI(interfaceC169517hR);
                return;
            default:
                C14360o3.A0B(c4nl, 0);
                EgK egK = (EgK) this.A01;
                C64842wi c64842wi2 = egK.A00;
                if (c64842wi2 != null) {
                    ((N6G) egK).A00 = new C56473P5n(c64842wi2, (C4NJ) c4nl);
                    InterfaceC09390do interfaceC09390do = egK.A0B;
                    ArrayList A1F = AbstractC166987dD.A1F(((C51157Mj0) interfaceC09390do.getValue()).A01);
                    C56473P5n c56473P5n2 = ((N6G) egK).A00;
                    if (c56473P5n2 != null) {
                        A1F.add(0, c56473P5n2);
                    }
                    ((C51157Mj0) interfaceC09390do.getValue()).A00(A1F);
                    return;
                }
                break;
        }
        C14360o3.A0F("quickPromotionDelegate");
        throw C00O.createAndThrow();
    }
}
