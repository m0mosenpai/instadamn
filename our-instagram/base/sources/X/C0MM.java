package X;

import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.os.Build;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.0MM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0MM {
    public static int A00 = -1;
    public static int A01 = -1;

    public static boolean A00(int i, int i2) {
        int importance;
        Integer num;
        Integer num2;
        Integer num3;
        if (i != -1) {
            int i3 = Build.VERSION.SDK_INT;
            switch (i3) {
                case 28:
                    switch (i) {
                        case 2:
                            num2 = C05F.A01;
                            break;
                        case 3:
                            num2 = C05F.A0Y;
                            break;
                        case 4:
                            num2 = C05F.A0j;
                            break;
                        case 5:
                            num2 = C05F.A0u;
                            break;
                        case 6:
                            num2 = C05F.A15;
                            break;
                        case 7:
                            num2 = C05F.A1F;
                            break;
                        case 8:
                            num2 = C05F.A1I;
                            break;
                        case 9:
                            num2 = C05F.A02;
                            break;
                        case 10:
                            num2 = C05F.A03;
                            break;
                        case 11:
                            num2 = C05F.A04;
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            num2 = C05F.A05;
                            break;
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            num2 = C05F.A06;
                            break;
                        case 14:
                            num2 = C05F.A07;
                            break;
                        case Process.SIGTERM /* 15 */:
                            num2 = C05F.A08;
                            break;
                        case 16:
                            num2 = C05F.A09;
                            break;
                        case 17:
                            num2 = C05F.A0A;
                            break;
                        case 18:
                            num2 = C05F.A0B;
                            break;
                        case Process.SIGSTOP /* 19 */:
                            num2 = C05F.A0D;
                            break;
                        default:
                            num2 = C05F.A0E;
                            break;
                    }
                    switch (num2.intValue()) {
                        case 1:
                        case 4:
                        case 5:
                            return true;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        case 14:
                        case Process.SIGTERM /* 15 */:
                        case 16:
                        case 17:
                        case 18:
                        case Process.SIGSTOP /* 19 */:
                        case 20:
                            return false;
                    }
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    switch (i) {
                        case 2:
                            num = C05F.A01;
                            break;
                        case 3:
                            num = C05F.A0C;
                            break;
                        case 4:
                            num = C05F.A0N;
                            break;
                        case 5:
                            num = C05F.A0Y;
                            break;
                        case 6:
                            num = C05F.A0j;
                            break;
                        case 7:
                            num = C05F.A0u;
                            break;
                        case 8:
                            num = C05F.A15;
                            break;
                        case 9:
                            num = C05F.A1F;
                            break;
                        case 10:
                            num = C05F.A1I;
                            break;
                        case 11:
                            num = C05F.A02;
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            num = C05F.A03;
                            break;
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            num = C05F.A04;
                            break;
                        case 14:
                            num = C05F.A05;
                            break;
                        case Process.SIGTERM /* 15 */:
                            num = C05F.A06;
                            break;
                        case 16:
                            num = C05F.A07;
                            break;
                        case 17:
                            num = C05F.A08;
                            break;
                        case 18:
                            num = C05F.A09;
                            break;
                        case Process.SIGSTOP /* 19 */:
                            num = C05F.A0A;
                            break;
                        case 20:
                            num = C05F.A0B;
                            break;
                        case 21:
                            num = C05F.A0D;
                            break;
                        default:
                            num = C05F.A0E;
                            break;
                    }
                    switch (num.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            return true;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        case 14:
                        case Process.SIGTERM /* 15 */:
                        case 16:
                        case 17:
                        case 18:
                        case Process.SIGSTOP /* 19 */:
                        case 20:
                            return false;
                    }
                default:
                    if (i3 >= 30) {
                        switch (i) {
                            case 2:
                                num3 = C05F.A01;
                                break;
                            case 3:
                                num3 = C05F.A0N;
                                break;
                            case 4:
                                num3 = C05F.A0Y;
                                break;
                            case 5:
                                num3 = C05F.A0j;
                                break;
                            case 6:
                                num3 = C05F.A0u;
                                break;
                            case 7:
                                num3 = C05F.A15;
                                break;
                            case 8:
                                num3 = C05F.A1F;
                                break;
                            case 9:
                                num3 = C05F.A1I;
                                break;
                            case 10:
                                num3 = C05F.A02;
                                break;
                            case 11:
                                num3 = C05F.A03;
                                break;
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                num3 = C05F.A04;
                                break;
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                num3 = C05F.A05;
                                break;
                            case 14:
                                num3 = C05F.A06;
                                break;
                            case Process.SIGTERM /* 15 */:
                                num3 = C05F.A07;
                                break;
                            case 16:
                                num3 = C05F.A08;
                                break;
                            case 17:
                                num3 = C05F.A09;
                                break;
                            case 18:
                                num3 = C05F.A0A;
                                break;
                            case Process.SIGSTOP /* 19 */:
                                num3 = C05F.A0B;
                                break;
                            case 20:
                                num3 = C05F.A0D;
                                break;
                            default:
                                num3 = C05F.A0E;
                                break;
                        }
                        switch (num3.intValue()) {
                            case 1:
                            case 3:
                            case 4:
                            case 5:
                                return true;
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            case 14:
                            case Process.SIGTERM /* 15 */:
                            case 16:
                            case 17:
                            case 18:
                            case Process.SIGSTOP /* 19 */:
                            case 20:
                                return false;
                        }
                    }
                    break;
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 > 0) {
            if (A01 == i2) {
                importance = A00;
            } else {
                Application application = ActivityThread.currentActivityThread().getApplication();
                String packageName = application.getPackageName();
                ActivityManager activityManager = (ActivityManager) application.getSystemService(ActivityManager.class);
                if (activityManager != null) {
                    List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(packageName, i2, 1);
                    if (!historicalProcessExitReasons.isEmpty()) {
                        ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(0);
                        A01 = i2;
                        A00 = applicationExitInfo.getImportance();
                        importance = applicationExitInfo.getImportance();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (importance >= 100 && importance <= 125) {
                return true;
            }
            return false;
        }
        return false;
    }
}
