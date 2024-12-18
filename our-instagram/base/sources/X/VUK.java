package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUK {
    public static C68798VcF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68798VcF c68798VcF = new C68798VcF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("stories_unit".equals(AbstractC166997dE.A0s(c16l))) {
                    c68798VcF.A00 = VUJ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68798VcF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
