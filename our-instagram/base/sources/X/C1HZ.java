package X;

import java.io.IOException;

/* renamed from: X.1HZ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1HZ {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Ha, java.lang.Object] */
    public static C24311Ha parseFromJson(C16L c16l) {
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
                String str = null;
                if ("n".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A01 = str;
                } else if ("v".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A02 = str;
                } else if ("t".equals(A0q)) {
                    obj.A00 = (EnumC24331Hc) EnumC24331Hc.A03.get(c16l.A1Q());
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
