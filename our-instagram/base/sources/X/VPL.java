package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VPL {
    public static C68934VeY parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            UPA upa = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            E6Z e6z = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("error".equals(A0s)) {
                    upa = AbstractC40190HsA.parseFromJson(c16l);
                } else if ("payload".equals(A0s)) {
                    e6z = AbstractC33760Evm.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C68934VeY(upa, e6z);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
