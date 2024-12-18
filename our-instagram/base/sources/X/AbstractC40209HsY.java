package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HsY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40209HsY {
    public static C38604Gy7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C38011pl c38011pl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("client_gap_rules".equals(A0s)) {
                    c38011pl = AbstractC38761r8.parseFromJson(c16l);
                } else if ("multi_ads_media_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C37471Gep parseFromJson = AbstractC37470Geo.parseFromJson(c16l);
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
                AbstractC166997dE.A1V("multi_ads_media_items", c16l, "ReelsIAARenderData");
                throw C00O.createAndThrow();
            }
            return new C38604Gy7(c38011pl, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
