package X;

/* renamed from: X.1Qq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC26611Qq {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "POST";
            case 2:
                return "PATCH";
            case 3:
                return "GET";
            case 4:
                return "DELETE";
            default:
                return "HEAD";
        }
    }
}
