package X;

import java.util.regex.Matcher;

/* renamed from: X.1FP, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1FP {
    public static final double A02(String str) {
        long j = 0;
        if (str != null) {
            Matcher matcher = C1FS.A00.matcher(str);
            if (matcher.find()) {
                String group = matcher.group(1);
                r7 = group != null ? Double.parseDouble(group) : -1.0d;
                String group2 = matcher.group(2);
                if (group2 != null) {
                    j = Long.parseLong(group2);
                }
            }
        }
        if (System.currentTimeMillis() - j >= 86400000) {
            return -1.0d;
        }
        return r7;
    }

    public static final double A00() {
        C1FR c1fr = C1FQ.A00().A00;
        C14360o3.A07(c1fr);
        if (c1fr.A01) {
            return c1fr.A00;
        }
        return A02(AbstractC19730y1.A00(AbstractC12960li.A00).A00.getString("cm_last_bandwidth", null));
    }

    public static final double A01() {
        C1FR c1fr = C1FQ.A00().A01;
        C14360o3.A07(c1fr);
        if (c1fr.A01) {
            return c1fr.A00;
        }
        return A02(AbstractC19730y1.A00(AbstractC12960li.A00).A00.getString("cm_last_latency", null));
    }
}
