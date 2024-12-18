package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.Euf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33691Euf {
    public static E7j parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C50679MYx c50679MYx = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("link_text".equals(A0s)) {
                    c50679MYx = AbstractC33711Euz.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (c50679MYx == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("link_text", c16l, "FooterComponentImpl");
                throw C00O.createAndThrow();
            }
            return new E7j(c50679MYx, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
