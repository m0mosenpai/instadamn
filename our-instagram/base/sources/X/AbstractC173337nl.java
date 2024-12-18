package X;

/* renamed from: X.7nl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC173337nl {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "http";
            case 1:
                return "in_memory";
            case 2:
                return "db";
            case 3:
                return "expired_db";
            case 4:
                return "";
            case 5:
                return "partial_cache";
            default:
                throw new RuntimeException();
        }
    }
}
