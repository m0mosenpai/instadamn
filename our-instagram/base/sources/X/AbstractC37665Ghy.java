package X;

/* renamed from: X.Ghy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37665Ghy {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 0;
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "clips_request_start";
            case 2:
                return "clips_request_end";
            case 3:
                return "video_playback_request_start";
            case 4:
                return "video_playback_request_end";
            default:
                return "initialized";
        }
    }
}
