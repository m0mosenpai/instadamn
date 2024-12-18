package X;

/* loaded from: classes5.dex */
public abstract class CLA {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "Visible";
            case 1:
                return "FocusedAndFilled";
            case 2:
                return "FocusedOrFilled";
            case 3:
                return "Filled";
            case 4:
                return "FocusedAndFilledNotBlank";
            case 5:
                return "FocusedOrFilledNotBlank";
            default:
                return "FilledNotBlank";
        }
    }
}
