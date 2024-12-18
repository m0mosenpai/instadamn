package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUJ {
    public static C68797VcE parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68797VcE c68797VcE = new C68797VcE();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("stories".equals(AbstractC166997dE.A0s(c16l))) {
                    c68797VcE.A00 = VUI.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68797VcE;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
