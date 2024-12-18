package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Dca, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30553Dca extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ C26081BgA A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16660sJ A02;
    public final /* synthetic */ C15100pQ A03;
    public final /* synthetic */ C5Hc A04;
    public final /* synthetic */ InterfaceC137486Kt A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30553Dca(C26081BgA c26081BgA, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, C15100pQ c15100pQ, C5Hc c5Hc, InterfaceC137486Kt interfaceC137486Kt) {
        super(3);
        this.A05 = interfaceC137486Kt;
        this.A03 = c15100pQ;
        this.A00 = c26081BgA;
        this.A04 = c5Hc;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long A02;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-313785114, "com.instagram.profilecard.ui.ProfileCardTagsContainer.<anonymous>.<anonymous> (ProfileCardContent.kt:1042)");
            }
            InterfaceC137486Kt interfaceC137486Kt = this.A05;
            C15100pQ c15100pQ = this.A03;
            C26081BgA c26081BgA = this.A00;
            C5Hc c5Hc = this.A04;
            InterfaceC16820sZ interfaceC16820sZ = this.A01;
            InterfaceC16660sJ interfaceC16660sJ = this.A02;
            Iterator A15 = AbstractC166997dE.A15(interfaceC137486Kt);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                List list = (List) A1K.getValue();
                EnumC53163NfI enumC53163NfI = (EnumC53163NfI) A1K.getKey();
                c5Tl.Eno(-401243483);
                int i = 0;
                while (i < list.size()) {
                    String str = (String) AbstractC001800i.A0O(list, i);
                    c5Tl.Eno(-401240554);
                    if (str != null) {
                        int i2 = c15100pQ.A00;
                        C28208Cc5 c28208Cc5 = c26081BgA.A05;
                        if (c28208Cc5.A01 != -1) {
                            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r0 & 63)], C1132359l.A03(r0), C1132359l.A02(r0), C1132359l.A01(c28208Cc5.A00() << 32), 1.0f);
                        } else {
                            A02 = ((C1132359l) AbstractC167007dF.A0e(c5Hc, i2)).A00;
                        }
                        AbstractC28509Ci3.A07(c5Tl, enumC53163NfI, c28208Cc5, str, interfaceC16820sZ, interfaceC16660sJ, i2, 0, A02, c26081BgA.A0F, c26081BgA.A0E);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    i++;
                    c15100pQ.A00++;
                }
                AbstractC25225BEi.A1V(c5Tl, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(-739046375);
            }
        }
        return C0eB.A00;
    }
}
