package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.common.dextricks.SC;
import java.io.File;

/* renamed from: X.0eS, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0eS {
    public static File A00(Context context, int i) {
        String str;
        String str2;
        switch (i) {
            case 114712842:
                str = "lib-compressed";
                break;
            case 157877869:
                str = "app_secure_shared";
                break;
            case 194178138:
                str = "app_sigquit";
                break;
            case 211429074:
                str = "modules";
                break;
            case 343672752:
                str = "files/mqtt_analytics";
                break;
            case 344748284:
                str = "files/nativemetrics";
                break;
            case SC.android_optsvc_analytics /* 345253467 */:
                str = "app_optsvc_analytics";
                break;
            case 372754419:
                str = "app_browser_proc_webview";
                break;
            case 486209204:
                str = "cache/browser_proc";
                break;
            case 993853946:
                str = "cache/tmp_resources";
                break;
            case 998546933:
                str = "app_overtheair";
                break;
            case 1045170971:
                str = "app_qpl";
                break;
            case 1080615614:
                str = "app_developer/resources";
                break;
            case 1210469102:
                str = "app_multiprocess_tracking";
                break;
            case 1239662554:
                str = "app_light_prefs";
                break;
            case 1262619000:
                str = "app_analytics_beacon";
                break;
            case 1377433890:
                str = "cache/secure_shared";
                break;
            case 1436876361:
                str = "app_appcomponents";
                break;
            case 1543572765:
                str = "app_analytics";
                break;
            case 1660028321:
                str = "app_overtheair/resources";
                break;
            case 1672668047:
                str = "files/secure_shared";
                break;
            case 1832390025:
                str = "app_RiskyStartupConfig";
                break;
            case 1874789883:
                str = "app_minidumps";
                break;
            case com.facebook.forker.SC.android_fbapps_forker_tempdir /* 2101388817 */:
                str = "app_fb-forker-tmp";
                break;
            default:
                throw new IllegalArgumentException(AnonymousClass001.A0c("Storage config ", " not in startup registry.", i));
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (context.isDeviceProtectedStorage()) {
            str2 = applicationInfo.deviceProtectedDataDir;
        } else {
            str2 = applicationInfo.dataDir;
        }
        return new File(new File(str2), str);
    }
}
