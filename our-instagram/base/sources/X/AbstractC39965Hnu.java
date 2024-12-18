package X;

import com.instagram.api.schemas.HzwPageInfoImpl;
import java.io.IOException;

/* renamed from: X.Hnu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39965Hnu {
    public static HzwPageInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("end_cursor".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "has_next_page");
                }
                c16l.A0z();
            }
            return new HzwPageInfoImpl(str, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
