package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.8pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC198448pt {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "photo";
            case 1:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            default:
                return "photo_and_video";
        }
    }
}
