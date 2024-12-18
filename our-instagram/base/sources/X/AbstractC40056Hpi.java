package X;

import java.io.IOException;

/* renamed from: X.Hpi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40056Hpi {
    public static C50627MWo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            H48 h48 = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("category_id_for_old_clients".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("map_query".equals(A0s)) {
                    h48 = AbstractC40057Hpj.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (h48 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("map_query", c16l, "MapQueryAttributes");
                throw C00O.createAndThrow();
            }
            return new C50627MWo(h48, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
