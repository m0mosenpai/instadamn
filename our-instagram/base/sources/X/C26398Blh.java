package X;

import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Blh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26398Blh extends AbstractC51572Yf {
    public final FoaUserSession A00;
    public final String A01;
    public final String A02;
    public final InterfaceC19390xP A03;

    public C26398Blh(FoaUserSession foaUserSession, String str, String str2, InterfaceC19390xP interfaceC19390xP) {
        C14360o3.A0B(interfaceC19390xP, 1);
        this.A03 = interfaceC19390xP;
        this.A00 = foaUserSession;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Object c33;
        Object obj;
        C14360o3.A0B(c76223bS, 0);
        InterfaceC19390xP interfaceC19390xP = this.A03;
        C14360o3.A0B(interfaceC19390xP, 1);
        if (interfaceC19390xP instanceof C0UO) {
            c33 = ((C0UO) interfaceC19390xP).getValue();
        } else {
            C16930sl c16930sl = C16930sl.A00;
            c33 = new C33(c16930sl, c16930sl, 0);
        }
        C33 c332 = (C33) AbstractC80353iP.A00(c76223bS, C29892DGg.A00(c33, 38), new C57157PZb(interfaceC19390xP, (InterfaceC23621Ds) null, 45, 42), new Object[]{interfaceC19390xP});
        List list = c332.A01;
        int i = c332.A00;
        List list2 = c332.A02;
        BX7 bx7 = (BX7) AbstractC77183d4.A00(c76223bS, DEJ.A00, new Object[0]);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, DE8.A00);
        C51762Yz A002 = AbstractC77073ct.A00(c76223bS, DE9.A00);
        C2XE c2xe = c76223bS.A05;
        Object A06 = c2xe.A06(CWZ.class);
        if (A06 != null) {
            AbstractC27448C9q A01 = AbstractC28336CeO.A01(c76223bS, EnumC27353C5i.A02);
            C168127f7 c168127f7 = (C168127f7) AbstractC77073ct.A00(c76223bS, C167227db.A00).A03;
            AbstractC77313dH.A00(c76223bS, C29892DGg.A00(this, 41), AbstractC25225BEi.A1b());
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String str = ((UserAccountInfo) obj).A09;
                    if (C14360o3.A0K(str, "CURRENT") || C14360o3.A0K(str, "CURRENT_AP")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            InterfaceC16620sF A02 = AbstractC85303rL.A02(c76223bS, new BWE(7, A00, this, obj, c76223bS, A06));
            InterfaceC16660sJ A012 = AbstractC85303rL.A01(c76223bS, new C30177DRh(30, this, A06, obj, c76223bS));
            if (obj == null) {
                return new C26356Bl1(EnumC72394Xcg.A1w, new C51722Yv(null, null).A00(AbstractC25232BEp.A15(null, C05F.A00, EnumC77683ds.CENTER)), C05F.A0N);
            }
            C30557Dce c30557Dce = new C30557Dce(3, this, A01, A012, A02, obj);
            C57751Pje c57751Pje = new C57751Pje(41, c30557Dce, list2);
            String string = AbstractC25229BEm.A0O(c76223bS).getString(2131962959);
            if (string == null) {
                string = "";
            }
            C26355Bl0 c26355Bl0 = new C26355Bl0(bx7, string, new C29722D8s(10, c30557Dce, c57751Pje, list, A002, c168127f7, bx7));
            String string2 = AbstractC25229BEm.A0O(c76223bS).getString(2131962960);
            if (string2 == null) {
                string2 = "";
            }
            C27985CVi c27985CVi = new C27985CVi(string2, C05F.A0C, C29892DGg.A00(A06, 43));
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) A002.A03;
            C75933ay c75933ay = C51722Yv.A02;
            C51722Yv A0Q = AbstractC25233BEq.A0Q(null, -8.0d);
            C29892DGg A003 = C29892DGg.A00(c168127f7, 42);
            long A0D = AbstractC25229BEm.A0D();
            C3F1 c3f1 = AbstractC169037gc.A00;
            C2VF c2vf = c2xe.A02.A01.A02;
            C168877gM c168877gM = new C168877gM(c2xe);
            c30557Dce.invoke(c168877gM, list, Boolean.valueOf(AbstractC167007dF.A1Q(list.size(), i)));
            return new C26452BmZ(new C168977gW(c3f1, null, null, null, A0Q, null, AbstractC168947gT.A00(c2xe, c2vf, AbstractC25232BEp.A0n(c76223bS, A0D), true), c168877gM.A01, c168127f7, null, null, null, null, null, null, null, null, null, null, A003, null, true, false), c26355Bl0, c27985CVi, DH2.A01(A00, c57751Pje, A002, 3), new C29895DGj(42, A00, bx7), interfaceC16660sJ);
        }
        throw AbstractC166997dE.A0g();
    }
}
