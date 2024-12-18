package X;

import com.facebook.location.platform.api.Location;
import java.io.IOException;

/* renamed from: X.F5x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34173F5x {
    public static C30461d4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30461d4 c30461d4 = new C30461d4();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c30461d4.A02 = AbstractC31172DnG.A0o(c16l);
                } else if (Location.LATITUDE.equals(A0q)) {
                    c30461d4.A00 = c16l.A0U();
                } else if ("longitude".equals(A0q)) {
                    c30461d4.A01 = c16l.A0U();
                } else if ("localized_address".equals(A0q)) {
                    c30461d4.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("header_title_text".equals(A0q)) {
                    c30461d4.A03 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c30461d4, A0q);
                }
                c16l.A0z();
            }
            return c30461d4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
