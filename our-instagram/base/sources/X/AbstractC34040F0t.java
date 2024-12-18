package X;

/* renamed from: X.F0t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34040F0t {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "user_selected";
            case 1:
                return "pre_selected_suggestions";
            case 2:
                return "suggestions";
            default:
                return "confirmed_favorites";
        }
    }
}
