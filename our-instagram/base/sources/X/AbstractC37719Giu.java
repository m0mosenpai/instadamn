package X;

/* renamed from: X.Giu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37719Giu {
    public static final String A00(EnumC129395t1 enumC129395t1) {
        if (enumC129395t1 == null) {
            return "unknown";
        }
        switch (enumC129395t1.ordinal()) {
            case 0:
                return "organic";
            case 1:
                return "ad_preview";
            case 2:
                return "ad";
            case 3:
                return "multiads";
            case 4:
                return "midcard";
            case 5:
                return "qpmidcard";
            case 6:
                return "survey";
            case 7:
                return "unavailable";
            case 8:
                return "ghost";
            default:
                return "unknown";
        }
    }
}
