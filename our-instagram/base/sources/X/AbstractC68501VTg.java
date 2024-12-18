package X;

import java.io.IOException;

/* renamed from: X.VTg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68501VTg {
    public static C68768Vbl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C68768Vbl c68768Vbl = new C68768Vbl();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("uri".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c68768Vbl.A00 = A1P;
                }
                c16l.A0z();
            }
            return c68768Vbl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
