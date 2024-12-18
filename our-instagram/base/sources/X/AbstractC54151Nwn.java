package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.Nwn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54151Nwn {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 2:
                return "carousel";
            case 3:
                return "carousel_photo";
            case 4:
                return "carousel_video";
            case 5:
                return "reels";
            case 6:
                return AbstractC43591JPw.A00(977);
            case 7:
                return "unknown";
            default:
                return "photo";
        }
    }
}
