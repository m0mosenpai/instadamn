package X;

/* renamed from: X.Hwr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40462Hwr {
    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        return "MEDIA_PILL_LABEL";
                    }
                    throw B4Z.A00();
                }
                return "MEDIA_COVER_WITH_BOTTOM_BANNER";
            }
            return "MEDIA_COVER";
        }
        return "BOTTOM_BANNER";
    }
}
