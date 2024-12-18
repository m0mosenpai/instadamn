package X;

/* loaded from: classes5.dex */
public abstract class CCJ {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ROTATION";
            case 2:
                return "ROTATION_X";
            case 3:
                return "ROTATION_Y";
            case 4:
                return "SCALE";
            default:
                return "ALPHA";
        }
    }
}
