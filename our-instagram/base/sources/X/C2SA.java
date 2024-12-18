package X;

/* renamed from: X.2SA, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2SA {
    public static final String A00(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (sb.length() > 0) {
                sb.append(" AND ");
            }
            sb.append(str);
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }
}
