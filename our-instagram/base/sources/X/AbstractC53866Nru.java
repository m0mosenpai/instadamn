package X;

/* renamed from: X.Nru, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53866Nru {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "JOIN_AND_REINVITE";
                break;
            case 2:
                str = "BLEND_CLIPS_VIEWER";
                break;
            default:
                str = "INVITE";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
