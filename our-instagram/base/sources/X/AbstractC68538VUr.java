package X;

import java.io.IOException;

/* renamed from: X.VUr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68538VUr {
    public static C69001Vfd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69001Vfd c69001Vfd = new C69001Vfd();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("routing_destination".equals(A0s)) {
                    c69001Vfd.A00 = AbstractC68536VUp.parseFromJson(c16l);
                } else if ("routing_value".equals(A0s)) {
                    c69001Vfd.A01 = AbstractC68537VUq.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c69001Vfd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
