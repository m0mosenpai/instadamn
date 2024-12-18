package X;

/* loaded from: classes6.dex */
public abstract class F24 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "tap";
            case 2:
                return "toggle";
            case 3:
                return "automated_toggle";
            default:
                return "swipe";
        }
    }
}
