package X;

import com.instagram.model.shopping.video.ShoppingCreationConfig;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I4M {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.instagram.model.shopping.video.ShoppingCreationConfig] */
    public static ShoppingCreationConfig parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2909).equals(A0s)) {
                    obj.A01 = c16l.A0d();
                } else if (AbstractC111324zv.A00(1093).equals(A0s)) {
                    obj.A00 = c16l.A1D();
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
