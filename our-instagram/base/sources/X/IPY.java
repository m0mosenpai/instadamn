package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IPY {
    public static HAJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HAJ haj = new HAJ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37301Gc2.A1W(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    haj.A01 = arrayList;
                } else if ("day_reel_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            O73 parseFromJson = AbstractC53796Nqm.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    haj.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, haj, A0q);
                }
                c16l.A0z();
            }
            return haj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
