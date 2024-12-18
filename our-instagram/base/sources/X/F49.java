package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F49 {
    public static FGF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34502FIo c34502FIo = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "nicknames")) {
                    c34502FIo = F46.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (c34502FIo == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("nicknames", c16l, "DirectNicknameUpdate");
                throw C00O.createAndThrow();
            }
            return new FGF(c34502FIo);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
