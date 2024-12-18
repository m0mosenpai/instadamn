package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes11.dex */
public final class W6I {
    public static final InterfaceC11380iw A01 = new C19270xB("waterfall_ads_manager");
    public final C18920wW A00;

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ads_manager_cancel");
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A00.Cht();
    }

    public final void A02(String str, String str2) {
        C14360o3.A0B(str2, 1);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ads_manager_enter_error");
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        AbstractC65702TsY.A1C(A00, this, "error_message", str2);
        A00.Cht();
    }

    public final void A03(String str, String str2) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ads_manager_enter");
        AbstractC65702TsY.A1C(A00, this, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        if (str2 != null) {
            A00.AAP("m_pk", str2);
        }
        A00.Cht();
    }

    public final void A04(String str, String str2, String str3) {
        C14360o3.A0B(str3, 2);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ads_manager_fetch_data");
        A00.AAP("action", str2);
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A00.AAP("m_pk", str3);
        A00.Cht();
    }

    public final void A07(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 0);
        A0B(str, str2, str3, null, str4);
    }

    public final void A08(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ads_manager_action");
        A00.AAP("action", str2);
        AbstractC65702TsY.A1C(A00, this, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        if (str3 != null) {
            A00.A9K("m_pk", AbstractC003100w.A0k(10, str3));
        }
        if (str4 != null) {
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str4);
        }
        A00.Cht();
    }

    public final void A09(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ads_manager_fetch_data_error");
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        AbstractC65702TsY.A1C(A00, this, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A00.AAP("component", str3);
        A00.AAP("error_message", str4);
        A00.AAP("error_identifier", null);
        A00.Cht();
    }

    public final String A00() {
        String A05 = C1QE.A01("ads_manager").A05();
        C14360o3.A07(A05);
        return A05;
    }

    public final void A05(String str, String str2, String str3) {
        C1QE.A01("ads_manager").A08();
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ads_manager_tap_entry_point");
        AbstractC65702TsY.A1C(A00, this, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        A00.AAP("m_pk", str3);
        A00.Cht();
    }

    public final void A0B(String str, String str2, String str3, String str4, String str5) {
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ads_manager_action_error");
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        AbstractC65702TsY.A1C(A00, this, "action", str2);
        if (str3 != null) {
            A00.A9K("m_pk", AbstractC003100w.A0k(10, str3));
        }
        if (str5 != null) {
            A00.AAP("error_message", str5);
        }
        if (str4 != null) {
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str4);
        }
        A00.Cht();
    }

    public W6I(UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(A01, userSession);
    }

    public final void A06(String str, String str2, String str3) {
        AbstractC167017dG.A1P(str2, str3);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ads_manager_view_component");
        A00.AAP("component", str2);
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
        AbstractC65702TsY.A1C(A00, this, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A00.Cht();
    }

    public final void A0A(String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1N(str, str2);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ads_manager_tap_component");
        A00.AAP("component", str2);
        AbstractC65702TsY.A1C(A00, this, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        if (str3 != null) {
            A00.AAP("m_pk", str3);
        }
        if (str4 != null) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("suggested_post_reason", str4);
            A00.AAQ(c0Zx, "configurations");
        }
        A00.Cht();
    }
}
