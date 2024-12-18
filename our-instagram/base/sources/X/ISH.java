package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class ISH {
    public static HAV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HAV hav = new HAV();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("catalog_source_sections".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C42506Irl parseFromJson = I8W.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    hav.A01 = arrayList;
                } else if ("selected_catalog_id".equals(A0s)) {
                    hav.A00 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, hav, A0s);
                }
                c16l.A0z();
            }
            return hav;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
