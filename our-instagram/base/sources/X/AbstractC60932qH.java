package X;

/* renamed from: X.2qH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60932qH {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ON_CREATE";
            case 1:
                return "ON_CREATE_VIEW";
            case 2:
                return "ON_VIEW_CREATED";
            case 3:
                return "ON_START";
            default:
                return "ON_RESUME";
        }
    }
}
