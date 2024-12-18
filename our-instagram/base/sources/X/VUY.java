package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUY {
    public static C68804VcL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68804VcL c68804VcL = new C68804VcL();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("image".equals(AbstractC166997dE.A0s(c16l))) {
                    c68804VcL.A00 = VUX.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68804VcL;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
