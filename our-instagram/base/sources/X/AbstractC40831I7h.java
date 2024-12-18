package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I7h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40831I7h {
    public static C51759Mti parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C38685GzQ c38685GzQ = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("decorations".equals(A0s)) {
                    c38685GzQ = AbstractC40827I7d.parseFromJson(c16l);
                } else if ("labels".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51750MtZ parseFromJson = AbstractC40828I7e.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("labels", c16l, "DestinationItemMetadata");
                throw C00O.createAndThrow();
            }
            return new C51759Mti(c38685GzQ, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
