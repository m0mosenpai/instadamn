package X;

import java.io.IOException;

/* renamed from: X.HrF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40146HrF {
    public static H4V parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38070Goz c38070Goz = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "playlist")) {
                    c38070Goz = AbstractC40144HrD.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (c38070Goz == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("playlist", c16l, "Playlist");
                throw C00O.createAndThrow();
            }
            return new H4V(c38070Goz);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
