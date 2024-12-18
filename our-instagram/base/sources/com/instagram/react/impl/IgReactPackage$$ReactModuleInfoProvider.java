package com.instagram.react.impl;

import X.AbstractC166987dD;
import X.InterfaceC65356Tik;
import X.SX2;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec;
import com.facebook.fbreact.specs.NativeCameraRollManagerSpec;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.fbreact.specs.NativeIntentAndroidSpec;
import com.facebook.fbreact.specs.NativeLocationObserverSpec;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.fbreact.specs.NativeSoundManagerSpec;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class IgReactPackage$$ReactModuleInfoProvider implements InterfaceC65356Tik {
    @Override // X.InterfaceC65356Tik
    public final Map Bkd() {
        HashMap A1G = AbstractC166987dD.A1G();
        SX2.A00("Appearance", "com.facebook.react.modules.appearance.AppearanceModule", A1G);
        SX2.A00("AppState", "com.facebook.react.modules.appstate.AppStateModule", A1G);
        SX2.A00(NativeAsyncSQLiteDBStorageSpec.NAME, "com.facebook.catalyst.modules.storage.AsyncStorageModule", A1G);
        SX2.A00(NativeCameraRollManagerSpec.NAME, "com.facebook.catalyst.modules.cameraroll.CameraRollManager", A1G);
        SX2.A00(NativeDialogManagerAndroidSpec.NAME, "com.facebook.react.modules.dialog.DialogModule", A1G);
        SX2.A00("DatePickerAndroid", "com.facebook.fbreactmodules.datepicker.DatePickerDialogModule", A1G);
        SX2.A00("FBLinkingAndroid", "com.facebook.catalyst.modules.linking.FBLinkingModule", A1G);
        A1G.put("I18nAssets", new SX2("I18nAssets", "com.facebook.fbreact.i18n.FbReactI18nAssetsModule", true, false, true, true));
        SX2.A00("I18n", "com.facebook.fbreact.i18n.FbReactI18nModule", A1G);
        SX2.A00(NativeI18nManagerSpec.NAME, "com.facebook.react.modules.i18nmanager.I18nManagerModule", A1G);
        SX2.A00("I18nResources", "com.facebook.i18n.react.impl.I18nResourcesModule", A1G);
        SX2.A00("IGNativeColors", "com.instagram.react.modules.base.IgNativeColorsModule", A1G);
        SX2.A00("Networking", "com.instagram.react.modules.base.IgNetworkingModule", A1G);
        SX2.A00("Analytics", "com.instagram.react.modules.base.IgReactAnalyticsModule", A1G);
        SX2.A00("IGMediaPickerNativeModule", "com.instagram.react.modules.product.IgReactMediaPickerNativeModule", A1G);
        SX2.A00("IGBoostPostReactModule", "com.instagram.react.modules.product.IgReactBoostPostModule", A1G);
        SX2.A00("IGReactCountryCodeRoute", "com.instagram.react.modules.product.IgReactCountryCodeRoute", A1G);
        SX2.A00("IGCommentModerationReactModule", "com.instagram.react.modules.product.IgReactCommentModerationModule", A1G);
        SX2.A00("CompassionResourceModule", "com.instagram.react.modules.product.IgReactCompassionResourceModule", A1G);
        SX2.A00("IgDialog", "com.instagram.react.modules.base.IgReactDialogModule", A1G);
        A1G.put("ExceptionsManager", new SX2("ExceptionsManager", "com.instagram.react.modules.exceptionmanager.IgReactExceptionManager", true, true, false, true));
        SX2.A00("FBUserAgent", "com.instagram.react.modules.base.IgReactFBUserAgentModule", A1G);
        SX2.A00("IGGeoGatingReactModule", "com.instagram.react.modules.product.IgReactGeoGatingModule", A1G);
        SX2.A00("ImageLoader", "com.instagram.react.views.image.IgReactImageLoaderModule", A1G);
        A1G.put("Navigation", new SX2("Navigation", "com.instagram.react.modules.navigator.IgReactNavigatorModule", false, true, false, true));
        A1G.put("ReactPerformanceLogger", new SX2("ReactPerformanceLogger", "com.instagram.react.modules.base.IgReactPerformanceLoggerModule", false, true, false, true));
        SX2.A00("IGPostInsightsReactModule", "com.instagram.react.modules.product.IgReactPostInsightsModule", A1G);
        SX2.A00("IGPromoteMigrationReactModule", "com.instagram.react.modules.product.IgReactPromoteMigrationModule", A1G);
        SX2.A00("IGPurchaseProtectionSheetNativeModule", "com.instagram.react.modules.product.IgReactPurchaseProtectionSheetModule", A1G);
        SX2.A00("IGShoppingPickerModule", "com.instagram.react.modules.product.IgReactShoppingPickerModule", A1G);
        SX2.A00("IGReactQE", "com.instagram.react.modules.base.IgReactQEModule", A1G);
        SX2.A00("IGPurchaseExperienceBridgeModule", "com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule", A1G);
        SX2.A00("IGSharedPreferencesModule", "com.instagram.react.modules.base.IgSharedPreferencesModule", A1G);
        SX2.A00(NativeIntentAndroidSpec.NAME, "com.facebook.react.modules.intent.IntentModule", A1G);
        SX2.A00(NativeLocationObserverSpec.NAME, "com.facebook.react.modules.location.LocationModule", A1G);
        SX2.A00(NativeAnimatedModuleSpec.NAME, "com.facebook.react.animated.NativeAnimatedModule", A1G);
        SX2.A00("NetInfo", "com.facebook.catalyst.modules.netinfo.NetInfoModule", A1G);
        SX2.A00(NativePermissionsAndroidSpec.NAME, "com.facebook.react.modules.permissions.PermissionsModule", A1G);
        SX2.A00("RelayAPIConfig", "com.instagram.react.modules.base.RelayAPIConfigModule", A1G);
        SX2.A00("StatusBarManager", "com.facebook.react.modules.statusbar.StatusBarModule", A1G);
        SX2.A00(NativeSoundManagerSpec.NAME, "com.facebook.react.modules.sound.SoundManagerModule", A1G);
        A1G.put(SwipeRefreshLayoutManager.REACT_CLASS, new SX2(SwipeRefreshLayoutManager.REACT_CLASS, "com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager", false, false, false, false));
        SX2.A00("ToastAndroid", "com.facebook.react.modules.toast.ToastModule", A1G);
        SX2.A00("Clipboard", "com.facebook.react.modules.clipboard.ClipboardModule", A1G);
        SX2.A00("IGBloksNavigationReactModule", "com.instagram.react.modules.product.IgReactBloksNavigationModule", A1G);
        SX2.A00("SegmentFetcher", "com.facebook.common.downloadondemand.js.interfaces.JsSegmentFetcherModule", A1G);
        SX2.A00("BillingPTT", "com.facebook.fbreact.billingptt.ReactBillingPTT", A1G);
        SX2.A00("IGFordDirectModule", "com.facebook.fbreact.igford.ReactIGFordDirectModule", A1G);
        SX2.A00("SafeArea", "com.facebook.fbreact.safearea.ReactSafeArea", A1G);
        return A1G;
    }
}
