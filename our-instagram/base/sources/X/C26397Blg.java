package X;

import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.Blg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26397Blg extends AbstractC51572Yf {
    public final FoaUserSession A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public C26397Blg(FoaUserSession foaUserSession, String str, String str2, List list) {
        C14360o3.A0B(list, 1);
        this.A03 = list;
        this.A00 = foaUserSession;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C2XE c2xe = c76223bS.A05;
        Object A06 = c2xe.A06(CWZ.class);
        if (A06 != null) {
            InterfaceC16620sF A02 = AbstractC85303rL.A02(c76223bS, new C30486DbV(9, A06, this));
            WXo wXo = (WXo) AbstractC77073ct.A00(c76223bS, new C57243PbR(AbstractC85303rL.A00(c76223bS, C29892DGg.A00(this, 39)), 33)).A03;
            List<UserAccountInfo> list = this.A03;
            for (UserAccountInfo userAccountInfo : list) {
                String str = userAccountInfo.A09;
                if (C14360o3.A0K(str, "CURRENT") || C14360o3.A0K(str, "CURRENT_AP")) {
                    AbstractC27448C9q A01 = AbstractC28336CeO.A01(c76223bS, EnumC27353C5i.A02);
                    C75933ay c75933ay = C51722Yv.A02;
                    C51722Yv A00 = C9CU.A00(null, C05F.A08, 0, Double.doubleToRawLongBits(-8.0d));
                    C14360o3.A0B(wXo, 2);
                    C51722Yv A002 = C9CV.A00(A00, C05F.A00, new C77843eC(wXo, C0eB.A00), 2);
                    long A0D = AbstractC25229BEm.A0D();
                    C3F1 c3f1 = AbstractC169037gc.A00;
                    C2V3 c2v3 = c2xe.A02.A01;
                    C2VF c2vf = c2v3.A02;
                    boolean z = c2v3.A0W;
                    C168877gM c168877gM = new C168877gM(c2xe);
                    FoaUserSession foaUserSession = this.A00;
                    String str2 = userAccountInfo.A08;
                    DQ9 dq9 = DQ9.A00;
                    AbstractC167007dF.A1F(foaUserSession, 1, A02);
                    AbstractC25229BEm.A1J(dq9, 9, A01);
                    AbstractC28336CeO.A02(c168877gM, A01, new DIJ(dq9, list, null, null, null, A02, foaUserSession, str2, 1));
                    return new C168977gW(c3f1, null, null, null, A002, null, AbstractC168947gT.A00(c2xe, c2vf, AbstractC25232BEp.A0n(c76223bS, A0D), z), c168877gM.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false);
                }
            }
            throw new NoSuchElementException(MSV.A00(1));
        }
        throw AbstractC166997dE.A0g();
    }
}
