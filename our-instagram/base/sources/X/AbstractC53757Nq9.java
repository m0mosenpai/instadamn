package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.Nq9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53757Nq9 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "image";
            case 2:
                return "image_photo";
            default:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
        }
    }
}
