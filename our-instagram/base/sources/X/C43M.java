package X;

import java.io.IOException;

/* renamed from: X.43M, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C43M {
    public static C9BW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9BW c9bw = new C9BW(16);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("cooldown_days".equals(A0q)) {
                    c9bw.A00 = Integer.valueOf(c16l.A1D());
                } else if ("impression_limits".equals(A0q)) {
                    c9bw.A01 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return c9bw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
