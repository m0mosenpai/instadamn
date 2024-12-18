package X;

import java.io.IOException;

/* renamed from: X.3XA, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3XA {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.3XB] */
    public static C3XB parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("explore".equals(A0q)) {
                    C3XD parseFromJson = C3XC.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    obj.A01 = parseFromJson;
                } else if ("clips".equals(A0q)) {
                    C3XD parseFromJson2 = C3XC.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    obj.A00 = parseFromJson2;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
