package X;

import com.instagram.api.schemas.CreationToolEnum;
import java.io.IOException;

/* renamed from: X.Hns, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39963Hns {
    public static H3X parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CreationToolEnum creationToolEnum = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "tool")) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    creationToolEnum = (CreationToolEnum) CreationToolEnum.A01.get(A1P);
                    if (creationToolEnum == null) {
                        creationToolEnum = CreationToolEnum.A05;
                    }
                }
                c16l.A0z();
            }
            if (creationToolEnum == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("tool", c16l, "HighlightedCreationToolInfoImpl");
                throw C00O.createAndThrow();
            }
            return new H3X(creationToolEnum);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
