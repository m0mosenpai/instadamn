package X;

import java.util.Map;

/* renamed from: X.0II, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0II {
    public static final String A00() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : C0I4.A05.entrySet()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C00Q.A03((String) entry.getKey(), 10));
            sb2.append('=');
            sb2.append(((Number) entry.getValue()).intValue());
            sb2.append('|');
            sb.append(sb2.toString());
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }
}
