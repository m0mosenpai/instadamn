package X;

/* renamed from: X.Nyr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54271Nyr {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "APP_INACTIVE";
            case 2:
                return "LIVE_SWAP";
            case 3:
                return "CONNECTION_QUALITY";
            case 4:
                return "LOST_CONNECTION";
            case 5:
                return "VIDEO_MUTE_TOGGLE";
            default:
                return "UNKNOWN";
        }
    }
}
