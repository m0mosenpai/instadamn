package X;

/* renamed from: X.I9y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40900I9y {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "APPROVED";
            case 2:
                return "REJECTED";
            case 3:
                return "PENDING";
            case 4:
                return "OUTDATED";
            default:
                return "NO_REVIEW";
        }
    }
}
