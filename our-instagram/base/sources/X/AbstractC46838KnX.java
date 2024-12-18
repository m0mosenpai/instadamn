package X;

import java.io.IOException;

/* renamed from: X.KnX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46838KnX {
    public static C31200Dnj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "encrypted_payload")) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("encrypted_payload", c16l, "DirectMessageOpaqueMessageToplevel");
                throw C00O.createAndThrow();
            }
            return new C31200Dnj(str, 18);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
