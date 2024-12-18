package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes12.dex */
public final class YE1 implements BusinessFlowAnalyticsLogger {
    public final C18920wW A00;
    public final String A01;

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cid(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_signup_cancel");
        String str = y7a.A01;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Y7A.A06(A0f, y7a, str);
        String str3 = this.A01;
        if (str3 != null) {
            str2 = str3;
        }
        MSW.A1U(A0f, str2);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cim(Y7A y7a) {
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjJ(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_signup_fetch_data");
        String str = this.A01;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        MSW.A1U(A0f, str);
        String str3 = y7a.A01;
        if (str3 != null) {
            str2 = str3;
        }
        Y7A.A06(A0f, y7a, str2);
        Y7A.A02(A0f, y7a);
        Y7A.A04(A0f, y7a);
        Y7A.A01(A0f, y7a);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjK(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_signup_fetch_data_error");
        A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
        String str = this.A01;
        if (str == null) {
            str = "";
        }
        MSW.A1U(A0f, str);
        Y7A.A07(A0f, y7a, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, y7a.A01);
        Y7A.A01(A0f, y7a);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjL(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_signup_finish_step");
        String str = y7a.A01;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Y7A.A06(A0f, y7a, str);
        String str3 = this.A01;
        if (str3 != null) {
            str2 = str3;
        }
        Y7A.A05(A0f, y7a, str2);
        Y7A.A01(A0f, y7a);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clj(Y7A y7a) {
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clo(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_signup_start_step");
        String str = y7a.A01;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Y7A.A06(A0f, y7a, str);
        String str3 = this.A01;
        if (str3 != null) {
            str2 = str3;
        }
        Y7A.A05(A0f, y7a, str2);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clu(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_signup_submit");
        String str = this.A01;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        MSW.A1U(A0f, str);
        String str3 = y7a.A01;
        if (str3 != null) {
            str2 = str3;
        }
        Y7A.A06(A0f, y7a, str2);
        Y7A.A02(A0f, y7a);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clv(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_signup_submit_error");
        String str = this.A01;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        MSW.A1U(A0f, str);
        A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
        String str3 = y7a.A01;
        if (str3 != null) {
            str2 = str3;
        }
        Y7A.A07(A0f, y7a, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cm3(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_signup_tap_component");
        String str = y7a.A01;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Y7A.A06(A0f, y7a, str);
        String str3 = this.A01;
        if (str3 != null) {
            str2 = str3;
        }
        Y7A.A08(A0f, y7a, "waterfall_id", str2);
        Y7A.A03(A0f, y7a);
        Y7A.A01(A0f, y7a);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CmQ(Y7A y7a) {
    }

    public YE1(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str) {
        this.A01 = str;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
    }
}
