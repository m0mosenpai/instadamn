package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.catalyst.modules.storage.AsyncStorageModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.downloadondemand.js.interfaces.JsSegmentFetcherModule;
import com.facebook.fbreact.i18n.FbReactI18nAssetsModule;
import com.facebook.fbreact.i18n.FbReactI18nModule;
import com.facebook.fbreact.igford.ReactIGFordDirectModule;
import com.facebook.fbreact.safearea.ReactSafeArea;
import com.facebook.forker.Process;
import com.facebook.i18n.react.impl.I18nResourcesModule;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.location.LocationModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.toast.ToastModule;
import com.instagram.common.session.UserSession;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.base.IgNetworkingModule;
import com.instagram.react.modules.base.IgReactAnalyticsModule;
import com.instagram.react.modules.base.IgReactPerformanceLoggerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.base.IgSharedPreferencesModule;
import com.instagram.react.modules.base.RelayAPIConfigModule;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactBloksNavigationModule;
import com.instagram.react.modules.product.IgReactBoostPostModule;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.react.modules.product.IgReactCountryCodeRoute;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.react.modules.product.IgReactPurchaseProtectionSheetModule;
import com.instagram.react.modules.product.IgReactShoppingPickerModule;
import go.Seq;
import java.util.HashSet;

/* renamed from: X.TVj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64819TVj implements InterfaceC08830cm {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64819TVj(R3M r3m, IgReactPackage igReactPackage, int i) {
        this.A00 = i;
        this.A01 = igReactPackage;
        this.A02 = r3m;
    }

    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, X.Rt9] */
    /* JADX WARN: Type inference failed for: r2v49, types: [X.13l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, X.Rpu] */
    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        C63975Sx1 c63975Sx1;
        SXE sxe;
        C61571Rpu c61571Rpu;
        T86 t86;
        InterfaceC217213y interfaceC217213y;
        switch (this.A00) {
            case 0:
                return new IgReactCountryCodeRoute((R3M) this.A02, ((IgReactPackage) this.A01).A00);
            case 1:
                return new BaseJavaModule((R3M) this.A02);
            case 2:
                return new BaseJavaModule((R3M) this.A02);
            case 3:
                return new FbReactI18nAssetsModule((Context) this.A02, R.raw.ads_countries_config, R.raw.localizable);
            case 4:
                R3M r3m = (R3M) this.A02;
                synchronized (S6U.class) {
                    interfaceC217213y = S6U.A00;
                    if (interfaceC217213y == null) {
                        interfaceC217213y = new C217113x(new Object(), new C64812TVb(0));
                        S6U.A00 = interfaceC217213y;
                    }
                }
                return new FbReactI18nModule(r3m, interfaceC217213y);
            case 5:
                return new BaseJavaModule((R3M) this.A02);
            case 6:
                return new I18nResourcesModule((R3M) this.A02, C11X.A00().A01(), new C64816TVg(this, 1));
            case 7:
                return new IgReactNavigatorModule((R3M) this.A02, ((IgReactPackage) this.A01).A00);
            case 8:
                return new IgSharedPreferencesModule((R3M) this.A02);
            case 9:
                return new LocationModule((R3M) this.A02);
            case 10:
                return new IntentModule((R3M) this.A02);
            case 11:
                return new PermissionsModule((R3M) this.A02);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new AsyncStorageModule((R3M) this.A02);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new ToastModule((R3M) this.A02);
            case 14:
                return new RelayAPIConfigModule((R3M) this.A02, ((IgReactPackage) this.A01).A00);
            case Process.SIGTERM /* 15 */:
                return new BaseJavaModule((R3M) this.A02);
            case 16:
                return new BaseJavaModule((R3M) this.A02);
            case 17:
                return new IgReactPerformanceLoggerModule((R3M) this.A02, ((IgReactPackage) this.A01).A00);
            case 18:
                return new BaseJavaModule((R3M) this.A02);
            case Process.SIGSTOP /* 19 */:
                return new IgReactQEModule((R3M) this.A02, ((IgReactPackage) this.A01).A00);
            case 20:
                return new NativeAnimatedModule((R3M) this.A02);
            case 21:
                return new IgReactPurchaseProtectionSheetModule((R3M) this.A02, ((IgReactPackage) this.A01).A00);
            case 22:
                return new IgReactShoppingPickerModule((R3M) this.A02, ((IgReactPackage) this.A01).A00);
            case 23:
                C41585IaY c41585IaY = (C41585IaY) C41585IaY.A04.getValue();
                R3M r3m2 = (R3M) this.A02;
                C14360o3.A0B(r3m2, 0);
                IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = new IgReactPurchaseExperienceBridgeModule(r3m2);
                c41585IaY.A01 = igReactPurchaseExperienceBridgeModule;
                igReactPurchaseExperienceBridgeModule.mUserSession = c41585IaY.A00;
                igReactPurchaseExperienceBridgeModule.mSurveyController = c41585IaY.A02;
                igReactPurchaseExperienceBridgeModule.mProducts = c41585IaY.A03;
                return igReactPurchaseExperienceBridgeModule;
            case 24:
                return new BaseJavaModule((R3M) this.A02);
            case 25:
                return new AppearanceModule((R3M) this.A02);
            case 26:
                return new AppStateModule((R3M) this.A02);
            case 27:
                return new IgReactMediaPickerNativeModule((R3M) this.A02, (UserSession) ((IgReactPackage) this.A01).A00);
            case 28:
                return new IgReactBoostPostModule((R3M) this.A02, ((IgReactPackage) this.A01).A00);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new BaseJavaModule((R3M) this.A02);
            case 30:
                return new BaseJavaModule((R3M) this.A02);
            case 31:
                return new BaseJavaModule((R3M) this.A02);
            case 32:
                return new BaseJavaModule((R3M) this.A02);
            case 33:
                return new ClipboardModule((R3M) this.A02);
            case 34:
                return new IgReactBloksNavigationModule((R3M) this.A02, ((IgReactPackage) this.A01).A00);
            case 35:
                return new NetInfoModule((R3M) this.A02);
            case 36:
                R3M r3m3 = (R3M) this.A02;
                synchronized (S6R.class) {
                    c63975Sx1 = S6R.A00;
                    if (c63975Sx1 == null) {
                        synchronized (S6Q.class) {
                            sxe = S6Q.A00;
                            if (sxe == null) {
                                C18720vz c18720vz = AbstractC12960li.A00;
                                C64462TEy c64462TEy = new C64462TEy(c18720vz);
                                synchronized (C61571Rpu.class) {
                                    try {
                                        C61571Rpu c61571Rpu2 = C61571Rpu.A05;
                                        c61571Rpu = c61571Rpu2;
                                        if (c61571Rpu2 == null) {
                                            SWU A00 = SWU.A00(r3m3);
                                            SHM shm = new SHM(r3m3);
                                            HashSet A13 = AbstractC58319PtB.A13(new String[]{"main.jsbundle"});
                                            ?? obj = new Object();
                                            obj.A03 = C05F.A00;
                                            obj.A02 = c64462TEy;
                                            obj.A00 = A00;
                                            obj.A01 = shm;
                                            obj.A04 = A13;
                                            C61571Rpu.A05 = obj;
                                            c61571Rpu = obj;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                synchronized (T86.class) {
                                    try {
                                        t86 = T86.A01;
                                        if (t86 == null) {
                                            t86 = new T86(r3m3);
                                            T86.A01 = t86;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                C1B4 A002 = AbstractC23881Ey.A00();
                                SHL shl = new SHL(t86, A002.AXd(null, 1660028321), A002.AXd(null, 993853946));
                                ?? obj2 = new Object();
                                T85 t85 = new T85(c18720vz);
                                SKO sko = new SKO(r3m3, c61571Rpu);
                                C62532SFj c62532SFj = new C62532SFj(r3m3, A002.AXd(null, 1080615614));
                                sxe = new SXE(S6N.A00, shl, S6O.A00, S6M.A00, c62532SFj, obj2, sko, t85);
                                S6Q.A00 = sxe;
                            }
                        }
                        c63975Sx1 = new C63975Sx1(sxe, C006802i.A0p, new C14140ne(1164602917, 2, false, false));
                        S6R.A00 = c63975Sx1;
                    }
                }
                return new JsSegmentFetcherModule(r3m3, c63975Sx1);
            case 37:
                return new ReactIGFordDirectModule((R3M) this.A02);
            case 38:
                return new BaseJavaModule((R3M) this.A02);
            case 39:
                return new BaseJavaModule((R3M) this.A02);
            case 40:
                return new ReactSafeArea((R3M) this.A02);
            case Seq.NULL_REFNUM /* 41 */:
                return new BaseJavaModule((R3M) this.A02);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new BaseJavaModule((R3M) this.A02);
            case 43:
                return new IgNetworkingModule((R3M) this.A02, ((IgReactPackage) this.A01).A00);
            case 44:
                return new IgReactAnalyticsModule((R3M) this.A02, ((IgReactPackage) this.A01).A00);
            case 45:
                return new BaseJavaModule((R3M) this.A02);
            default:
                return new IgReactCommentModerationModule((R3M) this.A02, ((IgReactPackage) this.A01).A00);
        }
    }
}
