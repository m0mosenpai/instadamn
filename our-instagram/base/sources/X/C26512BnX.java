package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import java.util.Map;

/* renamed from: X.BnX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26512BnX extends AbstractC51572Yf {
    public final UserSession A00;
    public final C40971v4 A01;
    public final InterfaceC31031DkU A02;
    public final C62862tP A03;
    public final C38321qM A04;
    public final InterfaceC31138Dmd A05;
    public final String A06;
    public final Map A07;
    public final boolean A08;
    public final boolean A09;

    public C26512BnX(InterfaceC31031DkU interfaceC31031DkU, C62862tP c62862tP, UserSession userSession, C38321qM c38321qM, C40971v4 c40971v4, InterfaceC31138Dmd interfaceC31138Dmd, String str, Map map, boolean z, boolean z2) {
        C14360o3.A0B(c62862tP, 2);
        AbstractC167007dF.A1I(map, 7, interfaceC31138Dmd);
        this.A01 = c40971v4;
        this.A03 = c62862tP;
        this.A00 = userSession;
        this.A09 = z;
        this.A08 = z2;
        this.A06 = str;
        this.A07 = map;
        this.A05 = interfaceC31138Dmd;
        this.A02 = interfaceC31031DkU;
        this.A04 = c38321qM;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        IgShowreelComposition Bx5;
        InterfaceC104924o5 interfaceC104924o5;
        AbstractC50812Vc c26622BpJ;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C29854DEu.A00);
        C40971v4 c40971v4 = this.A01;
        InterfaceC104804nl interfaceC104804nl = c40971v4.A06;
        if (interfaceC104804nl != null && (Bx5 = interfaceC104804nl.Bx5()) != null) {
            C51762Yz A002 = C29902DGq.A00(c76223bS, Bx5, 0);
            boolean z = false;
            String str = (String) AbstractC77183d4.A00(c76223bS, C29902DGq.A01(this, 1), new Object[]{c40971v4.A0S, c40971v4.A0j});
            Object obj = A002.A03;
            C139406Sv c139406Sv = (C139406Sv) AbstractC77183d4.A00(c76223bS, new C57259Pbh(str, A002, 35), new Object[]{str, obj});
            C138746Qe c138746Qe = (C138746Qe) AbstractC77183d4.A00(c76223bS, new D8J(40, c139406Sv, this), new Object[]{c139406Sv});
            C29375Cx8 c29375Cx8 = (C29375Cx8) AbstractC77183d4.A00(c76223bS, new D8J(39, c76223bS, this), new Object[0]);
            C77783e3 c77783e3 = new C77783e3(null, new C65075Td4(new C30184DRp(48, A00, c29375Cx8, c138746Qe), 20));
            C2XE c2xe = c76223bS.A05;
            C2Y5 c2y5 = c2xe.A05;
            c2y5.getClass();
            c2y5.A01 = c77783e3;
            if (A00.A03 != null) {
                c26622BpJ = new C75723ad();
            } else {
                C38321qM c38321qM = this.A04;
                if ((c38321qM != null && c38321qM.Cff()) || ((interfaceC104924o5 = c40971v4.A0I) != null && interfaceC104924o5.BVT() != null)) {
                    z = true;
                }
                String Aqq = ((IgShowreelComposition) obj).Aqq();
                C62862tP c62862tP = this.A03;
                UserSession userSession = this.A00;
                boolean z2 = this.A09;
                boolean z3 = this.A08;
                c26622BpJ = new C26622BpJ(c139406Sv, c138746Qe, this.A02, c62862tP, userSession, c29375Cx8, this.A05, Aqq, this.A06, this.A07, z2, z, z3);
            }
            C17280tP A0y = AbstractC166987dD.A0y();
            boolean A0d = A0y.A0d();
            boolean A0e = A0y.A0e();
            if (!A0d && !A0e) {
                return c26622BpJ;
            }
            String A0p = AbstractC16490ru.A0p(AnonymousClass001.A11(AbstractC111324zv.A00(3330), c139406Sv.A01, AbstractC111324zv.A00(3331), c139406Sv.A04, AbstractC111324zv.A00(1379)));
            C75933ay c75933ay = C51722Yv.A02;
            return AbstractC25227BEk.A0W(new C26602Boz(A0p, A0d, A0e), AbstractC25232BEp.A11(c26622BpJ, c2xe), c76223bS, AbstractC25230BEn.A0d(AbstractC25230BEn.A0d(null, C05F.A01, 100.0f, 0), C05F.A00, 100.0f, 0));
        }
        throw AbstractC166987dD.A14("Expected a valid ShowreelComposition");
    }
}
