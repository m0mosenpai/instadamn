package com.facebook.react.modules.systeminfo;

import X.AbstractC166997dE;
import X.AbstractC58321PtD;
import X.R3M;
import android.app.UiModeManager;
import android.provider.Settings;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

@ReactModule(name = NativePlatformConstantsAndroidSpec.NAME)
/* loaded from: classes10.dex */
public class AndroidInfoModule extends NativePlatformConstantsAndroidSpec implements TurboModule {
    public static final String IS_DISABLE_ANIMATIONS = "IS_DISABLE_ANIMATIONS";
    public static final String IS_TESTING = "IS_TESTING";

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
    }

    private Boolean isRunningScreenshotTest() {
        try {
            Class.forName("com.facebook.testing.react.screenshots.ReactAppScreenshotTestActivity");
            return AbstractC166997dE.A0b();
        } catch (ClassNotFoundException unused) {
            return AbstractC166997dE.A0a();
        }
    }

    public AndroidInfoModule(R3M r3m) {
        super(r3m);
    }

    private String uiMode() {
        int currentModeType = ((UiModeManager) AbstractC58321PtD.A0b(this).getBaseContext().getSystemService("uimode")).getCurrentModeType();
        if (currentModeType != 1) {
            if (currentModeType != 2) {
                if (currentModeType != 3) {
                    if (currentModeType != 4) {
                        if (currentModeType != 6) {
                            if (currentModeType != 7) {
                                return "unknown";
                            }
                            return "vrheadset";
                        }
                        return "watch";
                    }
                    return "tv";
                }
                return "car";
            }
            return "desk";
        }
        return "normal";
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    public String getAndroidID() {
        return Settings.Secure.getString(AbstractC58321PtD.A0b(this).getContentResolver(), "android_id");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0055, code lost:
    
        if (isRunningScreenshotTest().booleanValue() != false) goto L6;
     */
    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map getTypedExportedConstants() {
        /*
            r4 = this;
            java.util.HashMap r2 = X.AbstractC166987dD.A1G()
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "Version"
            r2.put(r0, r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = "Release"
            r2.put(r0, r1)
            java.lang.String r1 = android.os.Build.SERIAL
            java.lang.String r0 = "Serial"
            r2.put(r0, r1)
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.lang.String r0 = "Fingerprint"
            r2.put(r0, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Model"
            r2.put(r0, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r0 = 810(0x32a, float:1.135E-42)
            java.lang.String r0 = X.MSV.A00(r0)
            r2.put(r0, r1)
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r0 = "Brand"
            r2.put(r0, r1)
            java.lang.String r0 = "IS_TESTING"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r3 = "true"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L57
            java.lang.Boolean r0 = r4.isRunningScreenshotTest()
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L58
        L57:
            r0 = 1
        L58:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isTesting"
            r2.put(r0, r1)
            java.lang.String r0 = "IS_DISABLE_ANIMATIONS"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L76
            boolean r0 = r3.equals(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isDisableAnimations"
            r2.put(r0, r1)
        L76:
            java.util.Map r1 = X.STZ.A00
            java.lang.String r0 = "reactNativeVersion"
            r2.put(r0, r1)
            java.lang.String r1 = r4.uiMode()
            java.lang.String r0 = "uiMode"
            r2.put(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.systeminfo.AndroidInfoModule.getTypedExportedConstants():java.util.Map");
    }
}
