package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VU9 {
    public static C68791Vc8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68791Vc8 c68791Vc8 = new C68791Vc8();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("actions".equals(AbstractC166997dE.A0s(c16l))) {
                    c68791Vc8.A00 = VU8.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68791Vc8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
