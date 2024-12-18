package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VVN {
    public static C68826Vch parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C68826Vch c68826Vch = new C68826Vch();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("after_media_id".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c68826Vch.A00 = A1P;
                }
                c16l.A0z();
            }
            return c68826Vch;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
