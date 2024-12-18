package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class DIK extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIK(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A06 = obj;
        this.A05 = obj2;
        this.A08 = z;
        this.A01 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
        this.A04 = obj6;
        this.A07 = obj7;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                C6Nu c6Nu = (C6Nu) obj;
                C14360o3.A0B(c6Nu, 0);
                List list = (List) this.A07;
                Object obj2 = this.A05;
                boolean z = this.A08;
                Object obj3 = this.A03;
                Object obj4 = this.A01;
                Object obj5 = this.A06;
                Object obj6 = this.A04;
                Object obj7 = this.A02;
                c6Nu.CgN(null, new C57744PjX(list, 14), C5UA.A03(new C30739Dfb(list, obj2, obj4, obj3, obj7, obj6, obj5, 0, z), -1091073711), list.size());
                break;
            case 1:
                C14360o3.A0B(obj, 0);
                if (!this.A08) {
                    int indexOf = ((List) this.A05).indexOf(obj);
                    ((InterfaceC16660sJ) this.A02).invoke(Integer.valueOf(indexOf));
                    C19L c19l = (C19L) this.A03;
                    C27872CQj c27872CQj = (C27872CQj) this.A04;
                    AbstractC166987dD.A1Z(new C57155PYz(c27872CQj, null, indexOf, 27), c19l);
                    int A03 = c27872CQj.A00.A03();
                    String str = ((C26073Bg2) this.A06).A05.A05;
                    AbstractC28507Ci0.A0B((InterfaceC11380iw) this.A01, (UserSession) this.A07, str, "tap", A03);
                    break;
                }
                break;
            case 2:
                InterfaceC30984Djg interfaceC30984Djg = (InterfaceC30984Djg) obj;
                C14360o3.A0B(interfaceC30984Djg, 0);
                C51751Mta c51751Mta = (C51751Mta) this.A06;
                List list2 = (List) c51751Mta.A00;
                Object obj8 = this.A05;
                boolean z2 = this.A08;
                Object obj9 = this.A01;
                Object obj10 = this.A03;
                Object obj11 = this.A02;
                Object obj12 = this.A04;
                Object obj13 = this.A07;
                interfaceC30984Djg.CgP(null, new C57748Pjb(list2, 5), null, C5UA.A04(new C30739Dfb(list2, obj8, obj9, obj10, obj11, obj12, obj13, 1, z2), 1229287273, true), list2.size());
                if (c51751Mta.A01 == C74.A05) {
                    interfaceC30984Djg.CgI(AbstractC167017dG.A0n(obj8, "loading", AbstractC166987dD.A1C()), null, C30111DOt.A00, AbstractC27779CMu.A00);
                    break;
                }
                break;
            default:
                C6Nu A0T = AbstractC25228BEl.A0T(obj);
                List list3 = (List) this.A07;
                DP5 dp5 = DP5.A00;
                Object obj14 = this.A05;
                Object obj15 = this.A03;
                Object obj16 = this.A01;
                Object obj17 = this.A02;
                Object obj18 = this.A04;
                Object obj19 = this.A06;
                DP6 dp6 = DP6.A00;
                int size = list3.size();
                AbstractC25227BEk.A15(A0T, new C30736DfY(2, obj19, obj14, list3, obj17, obj15, obj16, obj18), new C57750Pjd(40, list3, (InterfaceC16660sJ) dp5), new C57750Pjd(41, list3, (InterfaceC16660sJ) dp6), size);
                if (this.A08) {
                    A0T.CgH(null, CN0.A00);
                    break;
                }
                break;
        }
        return C0eB.A00;
    }
}
