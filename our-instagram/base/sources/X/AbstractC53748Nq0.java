package X;

/* renamed from: X.Nq0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53748Nq0 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DASH_VIDEO";
            case 2:
                return "DASH_AUDIO";
            case 3:
                return "DASH_TEXT";
            case 4:
                return "DASH_UNKNOWN";
            case 5:
                return "PROGRESSIVE";
            case 6:
                return "LIVE_VIDEO";
            case 7:
                return "LIVE_AUDIO";
            case 8:
                return "LIVE_MANIFEST";
            case 9:
                return "LIVE_TEXT";
            default:
                return "UNKNOWN";
        }
    }
}
