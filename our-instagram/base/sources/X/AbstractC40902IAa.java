package X;

/* renamed from: X.IAa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40902IAa {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "EXIT_VISIBILITY";
            case 2:
                return "ENTER_COVERAGE";
            case 3:
                return "EXIT_COVERAGE";
            case 4:
                return "UPDATE_VISIBILITY";
            case 5:
                return "UPDATE_COVERAGE";
            default:
                return "ENTER_VISIBILITY";
        }
    }
}
