package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.Ggf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37584Ggf extends AbstractC38017Go4 {
    public final InterfaceC116925Qy A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final C1M1 A04;

    public C37584Ggf(InterfaceC116925Qy interfaceC116925Qy, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1M1 c1m1) {
        AbstractC167027dH.A0a(1, userSession, c1m1, interfaceC11380iw, interfaceC116925Qy);
        this.A03 = userSession;
        this.A04 = c1m1;
        this.A01 = interfaceC11380iw;
        this.A00 = interfaceC116925Qy;
        this.A02 = AbstractC37302Gc3.A0I(interfaceC11380iw, userSession);
    }

    @Override // X.JI9
    public final void ClL(String str) {
        Boolean bool;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_ads_feedback_interface_response");
        if (A0f.isSampled() && super.A01 != null) {
            C09530e4 A1L = AbstractC166987dD.A1L("ads_category", A00());
            C09530e4 A1L2 = AbstractC166987dD.A1L("is_mid_scene_shown", String.valueOf(AbstractC38017Go4.A06(this)));
            C25377BKu c25377BKu = ((AbstractC38017Go4) this).A00;
            if (c25377BKu != null) {
                bool = Boolean.valueOf(c25377BKu.A0H);
            } else {
                bool = null;
            }
            LinkedHashMap A0u = AbstractC167017dG.A0u("view_visible_percentage", "", A1L, A1L2, AbstractC166987dD.A1L("is_social_context_shown", String.valueOf(bool)));
            String str2 = AFI_TYPE.A06.A00;
            long A04 = AbstractC38017Go4.A04(this);
            AbstractC37303Gc4.A0i(A0f, A07());
            UserSession userSession = this.A03;
            AbstractC37585Ggg.A01(A0f, this, Long.parseLong(userSession.userId));
            AbstractC38017Go4.A05(A0f, this, str2);
            AbstractC37300Gc1.A0u(A0f, A0u);
            A0f.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, "ad_dwell");
            AbstractC37302Gc3.A11(A0f, "main_question", str);
            AbstractC37301Gc2.A11(A0f, A04);
            AbstractC37301Gc2.A19(A0f, this.A04.getSessionId());
            C120985dq A03 = C128085qc.A03(A07());
            C37644Ghd A01 = AbstractC37652Ghl.A01(A03, userSession, C3YS.A00(userSession), null, null);
            this.A00.DVi(new C6T6(null, new XVS(C05F.A00, ((AbstractC37585Ggg) this).A00, A07().A0j, str2, "main_question", "ad_dwell", str, A0u, A04), "", ""), AnonymousClass317.A05, A03, A01);
        }
    }

    @Override // X.JI9
    public final void Cm9(long j) {
    }

    @Override // X.JI9
    public final void CmG(String str) {
        Boolean bool;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_ads_feedback_interface_undo");
        if (A0f.isSampled() && super.A01 != null) {
            C09530e4 A1L = AbstractC166987dD.A1L("ads_category", A00());
            C09530e4 A1L2 = AbstractC166987dD.A1L("is_mid_scene_shown", String.valueOf(AbstractC38017Go4.A06(this)));
            C25377BKu c25377BKu = ((AbstractC38017Go4) this).A00;
            if (c25377BKu != null) {
                bool = Boolean.valueOf(c25377BKu.A0H);
            } else {
                bool = null;
            }
            LinkedHashMap A0u = AbstractC167017dG.A0u("view_visible_percentage", "", A1L, A1L2, AbstractC166987dD.A1L("is_social_context_shown", String.valueOf(bool)));
            String str2 = AFI_TYPE.A06.A00;
            long A04 = AbstractC38017Go4.A04(this);
            AbstractC37303Gc4.A0i(A0f, A07());
            UserSession userSession = this.A03;
            AbstractC37585Ggg.A01(A0f, this, Long.parseLong(userSession.userId));
            AbstractC38017Go4.A05(A0f, this, str2);
            AbstractC37300Gc1.A0u(A0f, A0u);
            A0f.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, "ad_dwell");
            AbstractC37302Gc3.A11(A0f, "main_question", str);
            AbstractC37301Gc2.A11(A0f, A04);
            AbstractC37301Gc2.A19(A0f, this.A04.getSessionId());
            C120985dq A03 = C128085qc.A03(A07());
            C37644Ghd A01 = AbstractC37652Ghl.A01(A03, userSession, C3YS.A00(userSession), null, null);
            this.A00.DVi(new C6T6(null, new XVS(C05F.A01, ((AbstractC37585Ggg) this).A00, A07().A0j, str2, "main_question", "ad_dwell", str, A0u, A04), "", ""), AnonymousClass317.A05, A03, A01);
        }
    }

    private final String A00() {
        boolean A06 = C18U.A06(C06090Tz.A05, this.A03, 36314652862778112L);
        C40971v4 A07 = A07();
        if (A06) {
            String A2Y = A07.A0K.A2Y();
            if (A2Y == null) {
                return "";
            }
            return A2Y;
        }
        InterfaceC39271s5 interfaceC39271s5 = A07.A03;
        if (interfaceC39271s5 != null) {
            return interfaceC39271s5.AaI();
        }
        return null;
    }

    @Override // X.JI9
    public final void Ck6() {
        Boolean bool;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_ads_feedback_interface_impression");
        if (A0f.isSampled() && super.A01 != null) {
            AbstractC37303Gc4.A0i(A0f, A07());
            AbstractC37585Ggg.A01(A0f, this, Long.parseLong(this.A03.userId));
            AbstractC38017Go4.A05(A0f, this, AFI_TYPE.A06.A00);
            C09530e4 A1L = AbstractC166987dD.A1L("ads_category", A00());
            C09530e4 A1L2 = AbstractC166987dD.A1L("is_mid_scene_shown", String.valueOf(AbstractC38017Go4.A06(this)));
            C25377BKu c25377BKu = ((AbstractC38017Go4) this).A00;
            if (c25377BKu != null) {
                bool = Boolean.valueOf(c25377BKu.A0H);
            } else {
                bool = null;
            }
            AbstractC37585Ggg.A03(A0f, AbstractC167017dG.A0u("view_visible_percentage", "", A1L, A1L2, AbstractC166987dD.A1L("is_social_context_shown", String.valueOf(bool))));
            AbstractC37301Gc2.A11(A0f, AbstractC38017Go4.A04(this));
            AbstractC37301Gc2.A19(A0f, this.A04.getSessionId());
        }
    }
}
