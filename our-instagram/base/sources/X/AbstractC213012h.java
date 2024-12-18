package X;

/* renamed from: X.12h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC213012h {
    public static final long A00(long j, String str, long j2) {
        try {
            String property = System.getProperty(str);
            if (property != null) {
                Long A0k = AbstractC003100w.A0k(10, property);
                if (A0k != null) {
                    long longValue = A0k.longValue();
                    if (1 <= longValue && longValue <= j2) {
                        return longValue;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("System property '");
                    sb.append(str);
                    sb.append("' should be in range ");
                    sb.append(1L);
                    sb.append("..");
                    sb.append(j2);
                    sb.append(", but is '");
                    sb.append(longValue);
                    sb.append('\'');
                    throw new IllegalStateException(sb.toString());
                }
                throw new IllegalStateException(AnonymousClass001.A0v("System property '", str, "' has unrecognized value '", property, '\''));
            }
        } catch (SecurityException unused) {
        }
        return j;
    }
}
