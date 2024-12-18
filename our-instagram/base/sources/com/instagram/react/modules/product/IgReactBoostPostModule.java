package com.instagram.react.modules.product;

import X.AbstractC018607g;
import X.AbstractC12220kQ;
import X.AbstractC12990ll;
import X.AbstractC138316On;
import X.AbstractC2044893h;
import X.AbstractC25651Mw;
import X.AbstractC31175DnJ;
import X.AbstractC62820SSs;
import X.AbstractC65702TsY;
import X.AbstractC68362VNw;
import X.AbstractC68468VRy;
import X.C019707r;
import X.C14360o3;
import X.C18920wW;
import X.C1GJ;
import X.C63255SgD;
import X.C70187WFq;
import X.C70658Wee;
import X.C70711Wfa;
import X.InterfaceC02590Ai;
import X.Q1k;
import X.R3M;
import X.RunnableC71615WxL;
import X.RunnableC71616WxM;
import X.VG4;
import X.Wx6;
import android.app.Activity;
import android.content.IntentFilter;
import android.webkit.CookieManager;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

@ReactModule(name = "IGBoostPostReactModule")
/* loaded from: classes11.dex */
public class IgReactBoostPostModule extends NativeIGBoostPostReactModuleSpec {
    public static final String MODULE_NAME = "IGBoostPostReactModule";
    public final R3M mReactContext;
    public final UserSession mUserSession;

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void clearTokenAndReLoginToFB(Callback callback, Callback callback2) {
        callback2.invoke(new Object[0]);
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void dismissModalWithReactTag(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public String getFBAccessToken() {
        return "";
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGBoostPostReactModule";
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public String getBusinessUserAccessToken() {
        return AbstractC68468VRy.A00(this.mUserSession).A00;
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void nexusLandingScreenLoaded(boolean z, String str, String str2) {
        InterfaceC02590Ai A00;
        if (str2 != null) {
            if (z) {
                UserSession userSession = this.mUserSession;
                C14360o3.A0B(userSession, 1);
                C18920wW A02 = AbstractC12220kQ.A02(userSession);
                A00 = A02.A00(A02.A00, "promoted_posts_action");
                if (A00.isSampled()) {
                    AbstractC65702TsY.A1F(A00, "ads_manager");
                    A00.AAP("action", "nexus_page_load");
                    A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, VG4.A1G.toString());
                } else {
                    return;
                }
            } else {
                if (str == null) {
                    return;
                }
                UserSession userSession2 = this.mUserSession;
                C14360o3.A0B(userSession2, 1);
                C18920wW A022 = AbstractC12220kQ.A02(userSession2);
                A00 = A022.A00(A022.A00, "promoted_posts_action_error");
                if (!A00.isSampled()) {
                    return;
                }
                AbstractC65702TsY.A1F(A00, "ads_manager");
                A00.AAP("action", "nexus_page_load");
                A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, VG4.A1G.toString());
                A00.AAP("error_message", str);
            }
            AbstractC31175DnJ.A17(A00, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1vN] */
    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void promotionManagerShouldRefresh() {
        AbstractC25651Mw.A00(this.mUserSession).E4s(new Object());
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void refreshMediaAfterPromotion(String str) {
        C1GJ.A03(AbstractC2044893h.A04(this.mUserSession, str));
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void sendBillingWizardClosedEvent(String str, String str2) {
        AbstractC25651Mw.A00(this.mUserSession).E4s(new C70711Wfa(str, str2));
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void showPromotePreview(String str, String str2, String str3, ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        Iterator it = readableArray.toArrayList().iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC68362VNw.A00(((String) it.next()).toUpperCase(Locale.US)));
        }
        Activity currentActivity = getCurrentActivity();
        currentActivity.getClass();
        AbstractC138316On.A02(currentActivity, this.mUserSession, "ads_manager", str, str2, str3, arrayList);
    }

    public IgReactBoostPostModule(R3M r3m, AbstractC12990ll abstractC12990ll) {
        super(r3m);
        this.mReactContext = r3m;
        C019707r A00 = C019707r.A00(r3m);
        A00.A01(new Q1k(this, 15), new IntentFilter("IGBoostPostSubmitSuccessNotification"));
        A00.A01(new Q1k(this, 16), new IntentFilter("IGBoostPostRefreshPromotionInsights"));
        this.mUserSession = (UserSession) abstractC12990ll;
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void clearWebviewCookie() {
        CookieManager.getInstance().removeAllCookies(null);
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void getFBAuth(Callback callback, Callback callback2) {
        C70187WFq.A01(getCurrentActivity(), AbstractC018607g.A00((ComponentActivity) getCurrentActivity()), new C70658Wee(callback, callback2, this), this.mUserSession);
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void navigateToBoostPost(String str, String str2) {
        C63255SgD.A01(new Wx6(AbstractC62820SSs.A00(getCurrentActivity()), this, str, str2));
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void navigateToCampaignControls(String str, String str2, String str3) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            C63255SgD.A01(new RunnableC71616WxM((FragmentActivity) currentActivity, this, str, str2, str3));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec
    public void pushAdsPreviewForMediaID(String str, String str2, double d, String str3) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            C63255SgD.A01(new RunnableC71615WxL((FragmentActivity) currentActivity, this, str, str2, str3));
        }
    }
}
