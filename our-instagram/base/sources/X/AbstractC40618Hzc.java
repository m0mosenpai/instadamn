package X;

import com.instagram.discovery.refinement.model.RefinementAttributes;
import java.io.IOException;

/* renamed from: X.Hzc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40618Hzc {
    /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.discovery.refinement.model.RefinementAttributes, java.lang.Object] */
    public static RefinementAttributes parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("category_id".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("category".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("on_sale".equals(A0s)) {
                    obj.A05 = c16l.A0d();
                } else if ("keyword".equals(A0s)) {
                    obj.A02 = MZ7.parseFromJson(c16l);
                } else if ("map_query".equals(A0s)) {
                    obj.A00 = AbstractC40617Hzb.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            obj.A00();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
