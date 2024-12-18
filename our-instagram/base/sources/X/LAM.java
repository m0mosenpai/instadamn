package X;

/* loaded from: classes8.dex */
public abstract class LAM {
    public static String A01(Integer num) {
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    return "IG_DEBUG_PLAYGROUND";
                case 2:
                    return "IG_MUSIC_STICKER";
                default:
                    return "UNDEFINED";
            }
        }
        return "null";
    }

    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "IG_DEBUG_PLAYGROUND";
                break;
            case 2:
                str = "IG_MUSIC_STICKER";
                break;
            default:
                str = "UNDEFINED";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
