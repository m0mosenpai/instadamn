package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.0ND, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0ND {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "AfterStartup";
            case 2:
                return "AMA";
            case 3:
                return "Anr";
            case 4:
                return "AnrAppDeath";
            case 5:
                return "AnrAppDeathEarly";
            case 6:
                return "Battery";
            case 7:
                return "Bizapp";
            case 8:
                return "BlackBoxRestartTrigger";
            case 9:
                return "BreakpadEarlyNative";
            case 10:
                return "BreakpadLater";
            case 11:
                return "BugReport";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "ExtraCollection";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "ExtraStartupActivityManagerListener";
            case 14:
                return "ExtraStartupActivityThreadMessageListener";
            case Process.SIGTERM /* 15 */:
                return "ExtraStartupBinderListener";
            case 16:
                return "ExtraStartupBootShutdownBroadcastReceiver";
            case 17:
                return "ExtraStartupBroadcastReceiver";
            case 18:
                return "ExtraStartupContentProvider";
            case Process.SIGSTOP /* 19 */:
                return "ExtraStartupOomPolling";
            case 20:
                return "ExtraStartupPauseReqRecv";
            case 21:
                return "ExtraStartupPauseReqStartExe";
            case 22:
                return "ExtraStartupThreadData";
            case 23:
                return "Helium";
            case 24:
                return "IgExtraLog";
            case 25:
                return "Java";
            case 26:
                return "Javascript";
            case 27:
                return "JavaAppDeath";
            case 28:
                return "JavaAppDeathEarly";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "LateStartup";
            case 30:
                return "LiteCustomEarlyJava";
            case 31:
                return "LiteCustomEarlyNative";
            case 32:
                return "LiteNativeJvmStream";
            case 33:
                return "LogcatInterceptor";
            case 34:
                return "Lyra";
            case 35:
                return "MemoryPeriodic";
            case 36:
                return "MemoryTrim";
            case 37:
                return "MessageQueueDoctor";
            case 38:
                return "MobileConfig";
            case 39:
                return "Native";
            case 40:
                return "NativeAppDeathEarly";
            case Seq.NULL_REFNUM /* 41 */:
                return "NativeAsl";
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return "NativeExtraTombstone";
            case 43:
                return "NativeExtraUnwind";
            case 44:
                return "NativeExtraUnwindElf";
            case 45:
                return "NativeJvmStream";
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return "NativeOomScore";
            case 47:
                return "Nightwatch";
            case 48:
                return "OculusPresence";
            case 49:
                return "OrangeBox";
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return "Parcelable";
            case 51:
                return "ParseJavaExceptionHandersLog";
            case 52:
                return "ProcessMonitorAnr";
            case 53:
                return "ReportSource";
            case 54:
                return "SoftError";
            case 55:
                return "SoftErrorCustom";
            case 56:
                return "Startup";
            case 57:
                return "StartupAttributionId";
            case 58:
                return "StartupBackground";
            case 59:
                return "StartupCustom";
            case 60:
                return "StartupForeground";
            case 61:
                return "StartupGlobalProperties";
            case 62:
                return "StartupLifecycle";
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return "StartupNavigation";
            case 64:
                return "StartupUserPerceptible";
            case 65:
                return "StaticNative";
            case 66:
                return "StaticNativeBreakpad";
            case 67:
                return "Test";
            case 68:
                return "Unexplained";
            case 69:
                return "UnexplainedAppDeathEarly";
            case 70:
                return "UserChange";
            default:
                return "AbortHooks";
        }
    }
}
