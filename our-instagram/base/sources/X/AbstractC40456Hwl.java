package X;

import com.instagram.api.schemas.WordOffsetImpl;
import java.io.IOException;

/* renamed from: X.Hwl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40456Hwl {
    public static WordOffsetImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("end_index".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("end_offset_ms".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("start_index".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("start_offset_ms".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "trailing_space");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("end_index", c16l, "WordOffsetImpl");
            } else if (num2 != null || !(c16l instanceof C07950bF)) {
                if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("start_index", c16l, "WordOffsetImpl");
                } else if (num4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("start_offset_ms", c16l, "WordOffsetImpl");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("trailing_space", c16l, "WordOffsetImpl");
                } else {
                    return new WordOffsetImpl(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("end_offset_ms", c16l, "WordOffsetImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
