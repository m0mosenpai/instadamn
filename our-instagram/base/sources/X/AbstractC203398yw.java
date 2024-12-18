package X;

import java.io.IOException;

/* renamed from: X.8yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203398yw {
    public static C198958qv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C198958qv c198958qv = new C198958qv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                C16V.A02(c16l);
                c16l.A0z();
            }
            return c198958qv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
