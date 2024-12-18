package X;

import java.util.List;

/* renamed from: X.Lxp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49720Lxp implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C49720Lxp(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A04 = str;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
        this.A05 = str2;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C41761wQ c41761wQ;
        C42221xC A0C;
        InterfaceC42241xE interfaceC42241xE;
        List list;
        List list2;
        switch (this.A00) {
            case 0:
                String str = this.A04;
                if (str.length() == 0) {
                    return;
                }
                c41761wQ = ((C49296Lqq) this.A03).A00;
                A0C = ((C6JY) this.A02).A0C((InterfaceC2056098k) this.A01, str, this.A05);
                interfaceC42241xE = C49774Lyh.A00;
                break;
            case 1:
                String str2 = this.A04;
                if (str2.length() == 0) {
                    return;
                }
                c41761wQ = ((C49296Lqq) this.A03).A00;
                A0C = ((C6JY) this.A02).A0C((InterfaceC2056098k) this.A01, str2, this.A05);
                interfaceC42241xE = C49779Lym.A00;
                break;
            default:
                if (((EnumC61185Rgl) obj).A01) {
                    ((InterfaceC23621Ds) this.A01).resumeWith(C32929EeA.A00);
                    return;
                }
                LI9 li9 = (LI9) this.A03;
                boolean A06 = C18U.A06(C06090Tz.A05, li9.A02, 36325888496973276L);
                List list3 = null;
                C56138Ovy c56138Ovy = (C56138Ovy) li9.A05.getValue();
                Object obj2 = this.A02;
                Integer num = C05F.A01;
                if (A06) {
                    if (obj2 == num) {
                        list2 = AbstractC166987dD.A1J(this.A04);
                    } else {
                        list2 = null;
                    }
                    if (obj2 == C05F.A00) {
                        list3 = AbstractC166987dD.A1J(this.A04);
                    }
                    c56138Ovy.A03(new C35861Fsb(this.A04, (InterfaceC24901Jp) this.A01), this.A05, list2, list3);
                    return;
                }
                if (obj2 == num) {
                    list = AbstractC166987dD.A1J(this.A04);
                } else {
                    list = null;
                }
                if (obj2 == C05F.A00) {
                    list3 = AbstractC166987dD.A1J(this.A04);
                }
                c56138Ovy.A04(new C35862Fsc(this.A04, (InterfaceC24901Jp) this.A01), list, list3);
                return;
        }
        c41761wQ.A02(A0C, interfaceC42241xE);
    }
}
