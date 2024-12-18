package X;

import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.Rxh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62033Rxh {
    public static String A00(int i) {
        switch (i) {
            case 5251:
                return "FWA_NULL_PAIRING_FUNNEL";
            case 5804:
                return "BT_PAIRING";
            case 6079:
                return "FIND_MY_PING";
            case 7324:
                return "FIND_MY_WIPE";
            case CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD /* 8000 */:
                return "FIND_MY_DEVICE_FUNNEL";
            case 8471:
                return "GALLERY_MEDIA_UPLOAD";
            case 12131:
                return "COMPONENT_TTI";
            case 12310:
                return "BT_CONNECTION";
            case 12781:
                return "GALLERY_MEDIA_DELETE_CLOUD_SYNC";
            case 13091:
                return "ONBOARDING";
            case 14346:
                return "WEARABLE_FIND_MY_DEVICE_FUNNEL";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
