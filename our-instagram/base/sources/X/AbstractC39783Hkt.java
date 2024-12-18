package X;

import com.instagram.api.schemas.IGConsiderAndBrowseType;
import java.io.IOException;

/* renamed from: X.Hkt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39783Hkt {
    public static C38245Gro parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IGConsiderAndBrowseType iGConsiderAndBrowseType = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "watch_type")) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGConsiderAndBrowseType = (IGConsiderAndBrowseType) IGConsiderAndBrowseType.A01.get(A1P);
                    if (iGConsiderAndBrowseType == null) {
                        iGConsiderAndBrowseType = IGConsiderAndBrowseType.A07;
                    }
                }
                c16l.A0z();
            }
            if (iGConsiderAndBrowseType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("watch_type", c16l, "BrowseInfoDictImpl");
                throw C00O.createAndThrow();
            }
            return new C38245Gro(iGConsiderAndBrowseType);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
