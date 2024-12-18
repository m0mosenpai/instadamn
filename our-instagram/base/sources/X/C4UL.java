package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.4UL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4UL implements C4UM {
    public static int A00(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return 7000;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGSTOP /* 19 */:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case Process.SIGTERM /* 15 */:
                return CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }
}
