package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class H8L extends AbstractC38017Go4 {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final C1M1 A03;

    @Override // X.JI9
    public final void ClL(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "instagram_ads_feedback_interface_response");
        if (A0f.isSampled() && super.A01 != null) {
            AbstractC37303Gc4.A0i(A0f, A07());
            AbstractC37585Ggg.A01(A0f, this, Long.parseLong(this.A02.userId));
            AbstractC38017Go4.A05(A0f, this, AFI_TYPE.A0E.A00);
            InterfaceC39271s5 interfaceC39271s5 = A07().A03;
            if (interfaceC39271s5 != null) {
                str2 = interfaceC39271s5.AaI();
            } else {
                str2 = null;
            }
            AbstractC37300Gc1.A0u(A0f, AbstractC25233BEq.A0p("is_mid_scene_shown", String.valueOf(AbstractC38017Go4.A06(this)), AbstractC166987dD.A1L("ads_category", str2)));
            A0f.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, "ad_ufi");
            AbstractC37302Gc3.A11(A0f, "main_question", str);
            AbstractC37301Gc2.A11(A0f, AbstractC38017Go4.A04(this));
            AbstractC37301Gc2.A19(A0f, this.A03.getSessionId());
        }
    }

    @Override // X.JI9
    public final void Cm9(long j) {
    }

    @Override // X.JI9
    public final void CmG(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "instagram_ads_feedback_interface_undo");
        if (A0f.isSampled() && super.A01 != null) {
            AbstractC37303Gc4.A0i(A0f, A07());
            AbstractC37585Ggg.A01(A0f, this, Long.parseLong(this.A02.userId));
            AbstractC38017Go4.A05(A0f, this, AFI_TYPE.A0E.A00);
            InterfaceC39271s5 interfaceC39271s5 = A07().A03;
            if (interfaceC39271s5 != null) {
                str2 = interfaceC39271s5.AaI();
            } else {
                str2 = null;
            }
            AbstractC37300Gc1.A0u(A0f, AbstractC25233BEq.A0p("is_mid_scene_shown", String.valueOf(AbstractC38017Go4.A06(this)), AbstractC166987dD.A1L("ads_category", str2)));
            A0f.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, "ad_ufi");
            AbstractC37302Gc3.A11(A0f, "main_question", str);
            AbstractC37301Gc2.A11(A0f, AbstractC38017Go4.A04(this));
            AbstractC37301Gc2.A19(A0f, this.A03.getSessionId());
        }
    }

    @Override // X.JI9
    public final void Ck6() {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "instagram_ads_feedback_interface_impression");
        if (A0f.isSampled() && super.A01 != null) {
            AbstractC37303Gc4.A0i(A0f, A07());
            AbstractC37585Ggg.A01(A0f, this, Long.parseLong(this.A02.userId));
            AbstractC38017Go4.A05(A0f, this, AFI_TYPE.A0E.A00);
            InterfaceC39271s5 interfaceC39271s5 = A07().A03;
            if (interfaceC39271s5 != null) {
                str = interfaceC39271s5.AaI();
            } else {
                str = null;
            }
            AbstractC37300Gc1.A0u(A0f, AbstractC25233BEq.A0p("is_mid_scene_shown", String.valueOf(AbstractC38017Go4.A06(this)), AbstractC166987dD.A1L("ads_category", str)));
            A0f.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, "ad_ufi");
            A0f.AAP("question_id", "main_question");
            AbstractC37301Gc2.A11(A0f, AbstractC38017Go4.A04(this));
            AbstractC37301Gc2.A19(A0f, this.A03.getSessionId());
        }
    }

    public H8L(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1M1 c1m1) {
        AbstractC167027dH.A13(userSession, c1m1, interfaceC11380iw);
        this.A02 = userSession;
        this.A03 = c1m1;
        this.A00 = interfaceC11380iw;
        this.A01 = AbstractC37302Gc3.A0I(interfaceC11380iw, userSession);
    }
}
