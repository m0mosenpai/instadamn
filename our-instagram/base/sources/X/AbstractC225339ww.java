package X;

/* renamed from: X.9ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225339ww {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "CREATING";
            case 1:
                return "CREATED";
            case 2:
                return "ACQUIRED_FROM_POOL";
            case 3:
                return "RETURNED_TO_POOL";
            case 4:
                return "RELEASING";
            default:
                return "RELEASED";
        }
    }
}
