package X;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class JSR {
    public C47600L0k A00;
    public final C47600L0k A01;
    public final String A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.L0k] */
    public static void A00(JSR jsr, Object obj, String str) {
        ?? obj2 = new Object();
        jsr.A00.A00 = obj2;
        jsr.A00 = obj2;
        obj2.A01 = obj;
        obj2.A02 = str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.L0k] */
    public final void A01(Object name, String value) {
        ?? obj = new Object();
        this.A00.A00 = obj;
        this.A00 = obj;
        obj.A01 = name;
        obj.A02 = value;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.A02);
        sb.append('{');
        String str = "";
        for (C47600L0k c47600L0k = this.A01.A00; c47600L0k != null; c47600L0k = c47600L0k.A00) {
            Object obj = c47600L0k.A01;
            sb.append(str);
            String str2 = c47600L0k.A02;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            str = ", ";
        }
        return AbstractC167027dH.A0R(sb);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.L0k] */
    public JSR(String className) {
        ?? obj = new Object();
        this.A01 = obj;
        this.A00 = obj;
        className.getClass();
        this.A02 = className;
    }

    public final void A02(String name, int value) {
        A00(this, String.valueOf(value), name);
    }

    public final void A03(String name, long value) {
        A00(this, String.valueOf(value), name);
    }

    public final void A04(String name, boolean value) {
        A00(this, String.valueOf(value), name);
    }
}
