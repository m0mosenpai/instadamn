package com.facebook.react;

import X.AbstractC166987dD;
import X.InterfaceC65356Tik;
import X.SX2;
import com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class CoreModulesPackage$$ReactModuleInfoProvider implements InterfaceC65356Tik {
    @Override // X.InterfaceC65356Tik
    public final Map Bkd() {
        HashMap A1G = AbstractC166987dD.A1G();
        SX2.A00(NativePlatformConstantsAndroidSpec.NAME, "com.facebook.react.modules.systeminfo.AndroidInfoModule", A1G);
        SX2.A00("DeviceEventManager", "com.facebook.react.modules.core.DeviceEventManagerModule", A1G);
        SX2.A00(NativeDeviceInfoSpec.NAME, "com.facebook.react.modules.deviceinfo.DeviceInfoModule", A1G);
        SX2.A00(NativeDevMenuSpec.NAME, "com.facebook.react.modules.debug.DevMenuModule", A1G);
        SX2.A00(NativeDevSettingsSpec.NAME, "com.facebook.react.modules.debug.DevSettingsModule", A1G);
        SX2.A00("ExceptionsManager", "com.facebook.react.modules.core.ExceptionsManagerModule", A1G);
        SX2.A00("LogBox", "com.facebook.react.devsupport.LogBoxModule", A1G);
        SX2.A00(NativeHeadlessJsTaskSupportSpec.NAME, "com.facebook.react.modules.core.HeadlessJsTaskSupportModule", A1G);
        SX2.A00(NativeSourceCodeSpec.NAME, "com.facebook.react.modules.debug.SourceCodeModule", A1G);
        SX2.A00("Timing", "com.facebook.react.modules.core.TimingModule", A1G);
        A1G.put(UIManagerModule.NAME, new SX2(UIManagerModule.NAME, "com.facebook.react.uimanager.UIManagerModule", false, false, false, false));
        return A1G;
    }
}
