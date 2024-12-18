package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class ISG {
    public static HB8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HB8 hb8 = new HB8();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("catalog_source".equals(A0s)) {
                    I8X.A00(AbstractC167017dG.A0m(c16l));
                } else if ("catalogs".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IH8 parseFromJson = I8Z.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    hb8.A01 = arrayList;
                } else if (AbstractC37300Gc1.A1W(A0s)) {
                    hb8.A02 = c16l.A0d();
                } else if (AbstractC37300Gc1.A1S(A0s)) {
                    hb8.A00 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, hb8, A0s);
                }
                c16l.A0z();
            }
            return hb8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
