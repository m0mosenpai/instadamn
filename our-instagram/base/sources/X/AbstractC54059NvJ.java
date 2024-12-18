package X;

/* renamed from: X.NvJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54059NvJ {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "VIDEO";
            case 2:
                return "CAROUSEL_PHOTO";
            case 3:
                return "CAROUSEL_VIDEO";
            case 4:
                return "CAROUSEL";
            case 5:
                return "IGTV";
            case 6:
                return "REELS";
            case 7:
                return "UNKNOWN";
            default:
                return "PHOTO";
        }
    }
}
