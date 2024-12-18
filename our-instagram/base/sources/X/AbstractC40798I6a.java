package X;

/* renamed from: X.I6a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40798I6a {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "declined";
            case 2:
                return "recently_edited";
            case 3:
                return "approved";
            default:
                return "pending";
        }
    }
}
