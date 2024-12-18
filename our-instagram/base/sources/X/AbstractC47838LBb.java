package X;

/* renamed from: X.LBb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47838LBb {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "REACTIONS";
                break;
            case 2:
                str = "TRANSITIONS";
                break;
            case 3:
                str = "TV";
                break;
            case 4:
                str = "MUSIC";
                break;
            case 5:
                str = "GREETINGS";
                break;
            case 6:
                str = "MEMES";
                break;
            default:
                str = "TRENDING";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "giphycategoryreactions";
            case 2:
                return "giphycategorytransitions";
            case 3:
                return "giphycategorytv";
            case 4:
                return "giphycategorymusic";
            case 5:
                return "giphycategorygreetings";
            case 6:
                return "giphycategorymemes";
            default:
                return "";
        }
    }
}
