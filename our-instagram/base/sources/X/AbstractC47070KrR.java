package X;

import com.instagram.model.shopping.ProductAREffectContainer;
import java.io.IOException;

/* renamed from: X.KrR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47070KrR {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.instagram.model.shopping.ProductAREffectContainer] */
    public static ProductAREffectContainer parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("effect_product".equals(AbstractC166997dE.A0s(c16l))) {
                    obj.A00 = IR9.parseFromJson(c16l);
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
