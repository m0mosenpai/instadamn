package X;

import com.instagram.api.schemas.FormattedStringImpl;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IO9 {
    public static FormattedStringImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "text")) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("text", c16l, "FormattedStringImpl");
                throw C00O.createAndThrow();
            }
            return new FormattedStringImpl(str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, FormattedStringImpl formattedStringImpl) {
        anonymousClass182.A0d();
        AbstractC37301Gc2.A1E(anonymousClass182, formattedStringImpl.A00);
        anonymousClass182.A0a();
    }
}
