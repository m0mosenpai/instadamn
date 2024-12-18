package X;

import java.io.IOException;

/* renamed from: X.4zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC111224zk {
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X.4zl] */
    public static C111234zl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("start".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("end".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (num != null) {
                obj.A01 = num.intValue();
            }
            if (num2 != null) {
                obj.A00 = num2.intValue();
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
