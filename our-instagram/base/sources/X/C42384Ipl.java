package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ipl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42384Ipl implements InterfaceC43071ya {
    public final UserSession A00;
    public final C64092vU A01;
    public final C37526Gfi A02;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Long l;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        C120985dq c120985dq = (C120985dq) c59062n7.A03;
        C82383m1 A00 = this.A01.A00(AbstractC25226BEj.A1E(c120985dq));
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != 0 && A01 != A1R) {
            A00.A04(interfaceC57162jr);
            if (A00.A05 >= 250) {
                C37526Gfi c37526Gfi = this.A02;
                int A06 = ((C37644Ghd) c59062n7.A04).A06();
                long j = A00.A04;
                double d = A00.A05;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c37526Gfi.A01, "instagram_ad_vpvd_imp");
                if (A0f.isSampled()) {
                    C38321qM A0y = AbstractC25226BEj.A0y(c120985dq);
                    C14360o3.A0B(A0y, 0);
                    String id = A0y.getId();
                    if (id != null) {
                        Long A0U = AbstractC37302Gc3.A0U(A0y);
                        if (A0U != null) {
                            IntentAwareAdsInfoIntf A002 = C42159Im7.A00(c120985dq);
                            AbstractC37300Gc1.A0l(A0f, id);
                            A0f.A9K("m_t", A0U);
                            A0f.A9K("max_duration_ms", Long.valueOf(j));
                            A0f.A8I("sum_duration_ms", Double.valueOf(d));
                            String A1E = AbstractC25226BEj.A1E(c120985dq);
                            C14360o3.A0B(A1E, 0);
                            AbstractC37300Gc1.A0g(A0f, AbstractC003100w.A0k(10, A1E));
                            AbstractC37301Gc2.A12(A0f, A06);
                            AbstractC37300Gc1.A0r(A0f, c37526Gfi.A03.getSessionId());
                            A0f.AAP("contextual_ads_category", "");
                            AbstractC37301Gc2.A14(A0f, A002);
                            AbstractC37301Gc2.A15(A0f, c37526Gfi.A00);
                            String Brx = A002.Brx();
                            if (Brx != null) {
                                l = AbstractC003100w.A0k(10, Brx);
                            } else {
                                l = null;
                            }
                            A0f.A9K("hscroll_seed_ad_id", l);
                            AbstractC31176DnK.A1I(A0f);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            A00.A02();
            return;
        }
        A00.A03(c59062n7, interfaceC57162jr);
    }

    public C42384Ipl(UserSession userSession, C37526Gfi c37526Gfi) {
        this.A00 = userSession;
        this.A02 = c37526Gfi;
        this.A01 = AbstractC37302Gc3.A0R(userSession);
    }
}
