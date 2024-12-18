package X;

/* renamed from: X.Nwf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54143Nwf {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "IMAGE";
                break;
            case 2:
                str = "SUBTITLE";
                break;
            case 3:
                str = "END_SCENE_ICON";
                break;
            case 4:
                str = "END_SCENE_TITLE";
                break;
            case 5:
                str = "SPONSORED_LABEL";
                break;
            case 6:
                str = "SOCIAL_CONTEXT_FOLLOWED_BY";
                break;
            case 7:
                str = "HEADER_POPULARITY_PROOF";
                break;
            default:
                str = "TITLE";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
