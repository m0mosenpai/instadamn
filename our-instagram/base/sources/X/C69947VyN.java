package X;

import java.io.IOException;

/* renamed from: X.VyN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69947VyN {
    public static C67959V3y parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C67959V3y c67959V3y = new C67959V3y();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("create_mes_appeal".equals(AbstractC166997dE.A0s(c16l))) {
                    c67959V3y.A00 = AbstractC68500VTf.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c67959V3y;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
