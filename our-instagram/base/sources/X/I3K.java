package X;

import com.instagram.model.shopping.ProductSource;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I3K {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.model.shopping.ProductSource, java.lang.Object] */
    public static ProductSource parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1E(A0q)) {
                    obj.A00 = I3J.A00(AbstractC167017dG.A0m(c16l));
                } else if (AbstractC31171DnF.A1a(A0q)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1L(A0q)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("image_url".equals(A0q)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
