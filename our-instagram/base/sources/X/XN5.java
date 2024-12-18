package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes12.dex */
public final class XN5 implements BusinessFlowAnalyticsLogger {
    public final C18920wW A00;
    public final String A01;

    public static C18920wW A00(XN5 xn5, Object obj) {
        C14360o3.A0B(obj, 0);
        return xn5.A00;
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cim(Y7A y7a) {
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CmQ(Y7A y7a) {
    }

    public XN5(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str) {
        this.A01 = str;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cid(Y7A y7a) {
        InterfaceC02590Ai A00 = Y7A.A00(y7a, A00(this, y7a), "business_conversion_cancel");
        AbstractC72048XLo.A0T(A00);
        MSW.A1U(A00, this.A01);
        A00.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjJ(Y7A y7a) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this, y7a), "business_conversion_fetch_data");
        Y7A.A08(A0f, y7a, OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
        A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, y7a.A01);
        AbstractC72048XLo.A0T(A0f);
        Y7A.A05(A0f, y7a, this.A01);
        Y7A.A01(A0f, y7a);
        Y7A.A04(A0f, y7a);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjK(Y7A y7a) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this, y7a), "business_conversion_fetch_data_error");
        Y7A.A08(A0f, y7a, OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
        A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, y7a.A01);
        AbstractC72048XLo.A0T(A0f);
        A0f.AAP("error_message", y7a.A03);
        MSW.A1U(A0f, this.A01);
        Y7A.A01(A0f, y7a);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjL(Y7A y7a) {
        InterfaceC02590Ai A00 = Y7A.A00(y7a, A00(this, y7a), "business_conversion_finish_step");
        AbstractC72048XLo.A0T(A00);
        MSW.A1U(A00, this.A01);
        A00.A9M("default_values", y7a.A0A());
        A00.A9M("selected_values", y7a.A0B());
        A00.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clj(Y7A y7a) {
        InterfaceC02590Ai A00 = Y7A.A00(y7a, A00(this, y7a), "business_conversion_skip");
        AbstractC72048XLo.A0T(A00);
        MSW.A1U(A00, this.A01);
        A00.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clo(Y7A y7a) {
        InterfaceC02590Ai A00 = Y7A.A00(y7a, A00(this, y7a), "business_conversion_start_step");
        AbstractC72048XLo.A0T(A00);
        Y7A.A05(A00, y7a, this.A01);
        Y7A.A01(A00, y7a);
        A00.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clu(Y7A y7a) {
        InterfaceC02590Ai A00 = Y7A.A00(y7a, A00(this, y7a), "business_conversion_submit");
        Y7A.A02(A00, y7a);
        AbstractC72048XLo.A0T(A00);
        Y7A.A05(A00, y7a, this.A01);
        Y7A.A01(A00, y7a);
        A00.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clv(Y7A y7a) {
        InterfaceC02590Ai A00 = Y7A.A00(y7a, A00(this, y7a), "business_conversion_submit_error");
        Y7A.A02(A00, y7a);
        A00.AAP("error_message", y7a.A03);
        A00.AAP("error_identifier", y7a.A02);
        AbstractC72048XLo.A0T(A00);
        Y7A.A05(A00, y7a, this.A01);
        Y7A.A01(A00, y7a);
        A00.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cm3(Y7A y7a) {
        InterfaceC02590Ai A00 = Y7A.A00(y7a, A00(this, y7a), "business_conversion_tap_component");
        Y7A.A02(A00, y7a);
        AbstractC72048XLo.A0T(A00);
        Y7A.A05(A00, y7a, this.A01);
        Y7A.A01(A00, y7a);
        A00.Cht();
    }
}
