package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IPZ {
    public static HB6 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HB6 hb6 = new HB6();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1W(c16l, A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IJT parseFromJson = AbstractC40467Hww.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    hb6.A00 = arrayList;
                } else if ("count".equals(A0q)) {
                    c16l.A1D();
                } else {
                    C55702hA.A01(c16l, hb6, A0q);
                }
                c16l.A0z();
            }
            return hb6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
