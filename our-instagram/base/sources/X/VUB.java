package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUB {
    public static C68793VcA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68793VcA c68793VcA = new C68793VcA();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("share".equals(AbstractC166997dE.A0s(c16l))) {
                    c68793VcA.A00 = VUA.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68793VcA;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
