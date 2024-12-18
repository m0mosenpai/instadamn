package com.facebook.react;

import X.AbstractC166987dD;
import X.AbstractC58322PtE;
import X.C63137Sdi;
import X.C64816TVg;
import X.C64819TVj;
import X.InterfaceC65493TlF;
import X.R3M;
import X.RhX;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.linking.FBLinkingModule;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.catalyst.modules.storage.AsyncStorageModule;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.common.downloadondemand.js.interfaces.JsSegmentFetcherModule;
import com.facebook.fbreact.billingptt.ReactBillingPTT;
import com.facebook.fbreact.i18n.FbReactI18nModule;
import com.facebook.fbreact.igford.ReactIGFordDirectModule;
import com.facebook.fbreact.safearea.ReactSafeArea;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.i18n.react.impl.I18nResourcesModule;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.location.LocationModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.systrace.SystraceMessage;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.base.IgNativeColorsModule;
import com.instagram.react.modules.base.IgNetworkingModule;
import com.instagram.react.modules.base.IgReactAnalyticsModule;
import com.instagram.react.modules.base.IgReactDialogModule;
import com.instagram.react.modules.base.IgReactFBUserAgentModule;
import com.instagram.react.modules.base.IgReactPerformanceLoggerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.base.IgSharedPreferencesModule;
import com.instagram.react.modules.base.RelayAPIConfigModule;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactBloksNavigationModule;
import com.instagram.react.modules.product.IgReactBoostPostModule;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.react.modules.product.IgReactCompassionResourceModule;
import com.instagram.react.modules.product.IgReactCountryCodeRoute;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPostInsightsModule;
import com.instagram.react.modules.product.IgReactPromoteMigrationModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.react.modules.product.IgReactPurchaseProtectionSheetModule;
import com.instagram.react.modules.product.IgReactShoppingPickerModule;
import com.instagram.react.views.image.IgReactImageLoaderModule;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated(since = "This class is deprecated, please use BaseReactPackage instead.")
/* loaded from: classes10.dex */
public abstract class LazyReactPackage implements InterfaceC65493TlF {
    public final ArrayList A01(R3M r3m) {
        IgReactPackage igReactPackage = (IgReactPackage) this;
        ArrayList A1E = AbstractC166987dD.A1E();
        A00(r3m, igReactPackage, IntentModule.class, A1E, 10);
        A00(r3m, igReactPackage, NativeAnimatedModule.class, A1E, 20);
        A00(r3m, igReactPackage, CameraRollManager.class, A1E, 31);
        A00(r3m, igReactPackage, DialogModule.class, A1E, 41);
        A00(r3m, igReactPackage, DatePickerDialogModule.class, A1E, 42);
        A00(r3m, igReactPackage, IgNetworkingModule.class, A1E, 43);
        A00(r3m, igReactPackage, IgReactAnalyticsModule.class, A1E, 44);
        A00(r3m, igReactPackage, IgNativeColorsModule.class, A1E, 45);
        A00(r3m, igReactPackage, IgReactCommentModerationModule.class, A1E, 46);
        A00(r3m, igReactPackage, IgReactCountryCodeRoute.class, A1E, 0);
        A00(r3m, igReactPackage, IgReactPostInsightsModule.class, A1E, 1);
        A00(r3m, igReactPackage, IgReactPromoteMigrationModule.class, A1E, 2);
        A1E.add(new C63137Sdi("I18nAssets", new C64819TVj(r3m, igReactPackage, 3)));
        A00(r3m, igReactPackage, FbReactI18nModule.class, A1E, 4);
        A00(r3m, igReactPackage, I18nManagerModule.class, A1E, 5);
        A00(r3m, igReactPackage, I18nResourcesModule.class, A1E, 6);
        A00(r3m, igReactPackage, IgReactNavigatorModule.class, A1E, 7);
        A00(r3m, igReactPackage, IgSharedPreferencesModule.class, A1E, 8);
        A00(r3m, igReactPackage, LocationModule.class, A1E, 9);
        A00(r3m, igReactPackage, PermissionsModule.class, A1E, 11);
        A00(r3m, igReactPackage, AsyncStorageModule.class, A1E, 12);
        A00(r3m, igReactPackage, ToastModule.class, A1E, 13);
        A00(r3m, igReactPackage, RelayAPIConfigModule.class, A1E, 14);
        A1E.add(C63137Sdi.A00(IgReactExceptionManager.class, new C64816TVg(igReactPackage, 2)));
        A00(r3m, igReactPackage, IgReactFBUserAgentModule.class, A1E, 15);
        A00(r3m, igReactPackage, IgReactDialogModule.class, A1E, 16);
        A00(r3m, igReactPackage, IgReactPerformanceLoggerModule.class, A1E, 17);
        A00(r3m, igReactPackage, IgReactImageLoaderModule.class, A1E, 18);
        A00(r3m, igReactPackage, IgReactQEModule.class, A1E, 19);
        A00(r3m, igReactPackage, IgReactPurchaseProtectionSheetModule.class, A1E, 21);
        A00(r3m, igReactPackage, IgReactShoppingPickerModule.class, A1E, 22);
        A00(r3m, igReactPackage, IgReactPurchaseExperienceBridgeModule.class, A1E, 23);
        A00(r3m, igReactPackage, IgReactCompassionResourceModule.class, A1E, 24);
        A00(r3m, igReactPackage, AppearanceModule.class, A1E, 25);
        A00(r3m, igReactPackage, AppStateModule.class, A1E, 26);
        A00(r3m, igReactPackage, IgReactMediaPickerNativeModule.class, A1E, 27);
        A00(r3m, igReactPackage, IgReactBoostPostModule.class, A1E, 28);
        A00(r3m, igReactPackage, StatusBarModule.class, A1E, 29);
        A00(r3m, igReactPackage, SoundManagerModule.class, A1E, 30);
        A00(r3m, igReactPackage, IgReactGeoGatingModule.class, A1E, 32);
        A00(r3m, igReactPackage, ClipboardModule.class, A1E, 33);
        A00(r3m, igReactPackage, IgReactBloksNavigationModule.class, A1E, 34);
        A00(r3m, igReactPackage, NetInfoModule.class, A1E, 35);
        A00(r3m, igReactPackage, JsSegmentFetcherModule.class, A1E, 36);
        A00(r3m, igReactPackage, ReactIGFordDirectModule.class, A1E, 37);
        A00(r3m, igReactPackage, ReactBillingPTT.class, A1E, 38);
        A00(r3m, igReactPackage, FBLinkingModule.class, A1E, 39);
        A00(r3m, igReactPackage, ReactSafeArea.class, A1E, 40);
        return A1E;
    }

    public static void A00(R3M r3m, IgReactPackage igReactPackage, Class cls, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(C63137Sdi.A00(cls, new C64819TVj(r3m, igReactPackage, i)));
    }

    @Override // X.InterfaceC65493TlF
    public final List AMb(R3M r3m) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A01(r3m).iterator();
        while (it.hasNext()) {
            C63137Sdi c63137Sdi = (C63137Sdi) it.next();
            SystraceMessage.A00(SystraceMessage.A00, "createNativeModule", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED).A02();
            ReactMarker.logMarker(RhX.A0N, c63137Sdi.A00, 0);
            try {
                NativeModule nativeModule = (NativeModule) c63137Sdi.A01.get();
                ReactMarker.logMarker(RhX.A0M);
                AbstractC58322PtE.A15();
                A1E.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(RhX.A0M);
                AbstractC58322PtE.A15();
                throw th;
            }
        }
        return A1E;
    }
}
