package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.CoreModulesPackage;
import com.facebook.react.DebugCorePackage;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TVi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64818TVi implements InterfaceC08830cm {
    public final R3M A00;
    public final String A01;
    public final /* synthetic */ AbstractC64130Szs A02;

    public C64818TVi(AbstractC64130Szs abstractC64130Szs, R3M r3m, String str) {
        this.A02 = abstractC64130Szs;
        this.A01 = str;
        this.A00 = r3m;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        int i;
        List list;
        AbstractC64130Szs abstractC64130Szs = this.A02;
        String str = this.A01;
        R3M r3m = this.A00;
        if (abstractC64130Szs instanceof DebugCorePackage) {
            if (!str.equals(NativeJSCHeapCaptureSpec.NAME)) {
                return null;
            }
            return new JSCHeapCapture(r3m);
        }
        CoreModulesPackage coreModulesPackage = (CoreModulesPackage) abstractC64130Szs;
        switch (str.hashCode()) {
            case -2013505529:
                if (str.equals("LogBox")) {
                    return new LogBoxModule(r3m, coreModulesPackage.A01.A0A);
                }
                break;
            case -1789797270:
                if (str.equals("Timing")) {
                    return new TimingModule(r3m, coreModulesPackage.A01.A0A);
                }
                break;
            case -1633589448:
                if (str.equals(NativeDevSettingsSpec.NAME)) {
                    return new DevSettingsModule(r3m, coreModulesPackage.A01.A0A);
                }
                break;
            case -1520650172:
                if (str.equals(NativeDeviceInfoSpec.NAME)) {
                    return new DeviceInfoModule(r3m);
                }
                break;
            case -1071344908:
                if (str.equals(NativeDevMenuSpec.NAME)) {
                    return new DevMenuModule(r3m, coreModulesPackage.A01.A0A);
                }
                break;
            case -1037217463:
                if (str.equals("DeviceEventManager")) {
                    return new DeviceEventManagerModule(r3m, coreModulesPackage.A02);
                }
                break;
            case -790603268:
                if (str.equals(NativePlatformConstantsAndroidSpec.NAME)) {
                    return new BaseJavaModule(r3m);
                }
                break;
            case 512434409:
                if (str.equals("ExceptionsManager")) {
                    return new ExceptionsManagerModule(coreModulesPackage.A01.A0A);
                }
                break;
            case 881516744:
                if (str.equals(NativeSourceCodeSpec.NAME)) {
                    return new SourceCodeModule(r3m);
                }
                break;
            case 1256514152:
                if (str.equals(NativeHeadlessJsTaskSupportSpec.NAME)) {
                    return new BaseJavaModule(r3m);
                }
                break;
            case 1861242489:
                if (str.equals(UIManagerModule.NAME)) {
                    ReactMarker.logMarker(RhX.A0T);
                    C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "createUIManagerModule", -1318039336);
                    try {
                        C63343Shy c63343Shy = coreModulesPackage.A01;
                        ReactMarker.logMarker(RhX.A0V);
                        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "createAllViewManagers", -1925276048);
                        try {
                            if (c63343Shy.A04 == null) {
                                List list2 = c63343Shy.A0E;
                                synchronized (list2) {
                                    if (c63343Shy.A04 == null) {
                                        ArrayList A1E = AbstractC166987dD.A1E();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            A1E.addAll(((InterfaceC65493TlF) it.next()).ANV(r3m));
                                        }
                                        c63343Shy.A04 = A1E;
                                        i = 976339579;
                                        list = A1E;
                                    }
                                }
                                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i);
                                ReactMarker.logMarker(RhX.A0U);
                                UIManagerModule uIManagerModule = new UIManagerModule(r3m, list, coreModulesPackage.A00);
                                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1656188881);
                                ReactMarker.logMarker(RhX.A0S);
                                return uIManagerModule;
                            }
                            i = -1670965249;
                            list = c63343Shy.A04;
                            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i);
                            ReactMarker.logMarker(RhX.A0U);
                            UIManagerModule uIManagerModule2 = new UIManagerModule(r3m, list, coreModulesPackage.A00);
                            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1656188881);
                            ReactMarker.logMarker(RhX.A0S);
                            return uIManagerModule2;
                        } catch (Throwable th) {
                            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 142818296);
                            ReactMarker.logMarker(RhX.A0U);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1283444191);
                        ReactMarker.logMarker(RhX.A0S);
                        throw th2;
                    }
                }
                break;
        }
        throw AbstractC167007dF.A0c("In CoreModulesPackage, could not find Native module for ", str);
    }
}
