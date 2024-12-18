package X;

/* renamed from: X.0GM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0GM {
    public static String A00(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("[bad fmt: \"");
            sb.append(str);
            sb.append("\" (");
            sb.append(e);
            sb.append(")]");
            return sb.toString();
        }
    }
}
