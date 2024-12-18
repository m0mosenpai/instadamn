package X;

/* renamed from: X.Nse, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53905Nse {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "UPLOAD";
                break;
            case 2:
                str = "REMIX_ORIGINAL";
                break;
            case 3:
                str = "SEQUENTIAL_REMIX_ORIGINAL";
                break;
            case 4:
                str = "AUDIO_BROWSER";
                break;
            default:
                str = "SEGMENT_REVIEW";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
