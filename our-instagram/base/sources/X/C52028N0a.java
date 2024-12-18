package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.N0a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52028N0a extends AbstractC55094Ob5 {
    public final C53618NnP A00;

    public final void A07(String str, String str2, boolean z) {
        if (z && super.A00 != 3) {
            super.A00 = (short) 3376;
        } else {
            super.A00 = (short) 3;
        }
        A05("error_reason", str);
        A05("error_log", str2);
    }

    public static final void A00(C52028N0a c52028N0a, Integer num) {
        boolean z;
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 37:
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                z = false;
                break;
            case 6:
            case 7:
            case 10:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            default:
                z = true;
                break;
        }
        QuickPerformanceLogger A01 = AbstractC55094Ob5.A01(c52028N0a);
        if (A01 != null) {
            A01.markerAnnotate(884869075, c52028N0a.A01, "is_user_triggered", z);
        }
        switch (intValue) {
            case 1:
                str = "CallEngineDispatch";
                break;
            case 2:
                str = "CallEngineState";
                break;
            case 3:
                str = "CallState";
                break;
            case 4:
                str = "DEPRECATED_CheckStateEnableStella";
                break;
            case 5:
                str = "ContactChangeEvent";
                break;
            case 6:
                str = "EndCall";
                break;
            case 7:
                str = "DeclineCall";
                break;
            case 8:
                str = "FetchContacts";
                break;
            case 9:
                str = "FetchGroupThreads";
                break;
            case 10:
                str = "FetchLogs";
                break;
            case 11:
                str = "FetchMessageAudio";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str = "FetchMessageImage";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = "FetchUnreadMessage";
                break;
            case 14:
                str = "GetCallHistory";
                break;
            case Process.SIGTERM /* 15 */:
                str = "GetCallState";
                break;
            case 16:
                str = "GetRequestToken";
                break;
            case 17:
                str = "GroupThreadsChangeEvent";
                break;
            case 18:
                str = "Inbox";
                break;
            case Process.SIGSTOP /* 19 */:
                str = "IncomingCall";
                break;
            case 20:
                str = "IncomingMessage";
                break;
            case 21:
                str = "LoadMessages";
                break;
            case 22:
                str = "LoadThreads";
                break;
            case 23:
                str = "MarkRead";
                break;
            case 24:
                str = "MarkPlayed";
                break;
            case 25:
                str = "MissedCall";
                break;
            case 26:
                str = "OptInOut";
                break;
            case 27:
                str = "OptOut";
                break;
            case 28:
                str = "PlayVoiceMessage";
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                str = "PendingImports";
                break;
            case 30:
                str = "RevokeMessage";
                break;
            case 31:
                str = "SendMessage";
                break;
            case 32:
                str = "ShareMedia";
                break;
            case 33:
                str = "ShareMediaFeed";
                break;
            case 34:
                str = "ShareMediaReel";
                break;
            case 35:
                str = "ShareMediaStory";
                break;
            case 36:
                str = "StartCall";
                break;
            case 37:
                str = "StopVoiceMessage";
                break;
            case 38:
                str = "ConnectedUserActive";
                break;
            case 39:
                str = "Unknown";
                break;
            case 40:
                str = "FetchPendingMedia";
                break;
            case Seq.NULL_REFNUM /* 41 */:
                str = "ImportMediaItem";
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                str = "MediaItemImportStatus";
                break;
            default:
                str = "AnswerCall";
                break;
        }
        c52028N0a.A05("request_type", str);
    }

    public C52028N0a(C53618NnP c53618NnP) {
        super(QuickPerformanceLoggerProvider.getQPLInstance(), c53618NnP.hashCode());
        this.A00 = c53618NnP;
    }
}
