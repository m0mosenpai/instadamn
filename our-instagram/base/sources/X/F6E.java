package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F6E {
    public static C30441cz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30441cz c30441cz = new C30441cz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c30441cz.A00 = AbstractC31172DnG.A0o(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("locationId".equals(A0q)) {
                        String A0m = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m, 0);
                        c30441cz.A01 = A0m;
                    } else if ("header_title_text".equals(A0q)) {
                        c30441cz.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("location_share_xma".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC31180DnO.A1O(c16l, arrayList);
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c30441cz.A03 = arrayList;
                    } else {
                        AbstractC47856LCb.A01(c16l, c30441cz, A0q);
                    }
                }
                c16l.A0z();
            }
            return c30441cz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
