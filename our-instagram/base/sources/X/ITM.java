package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ITM {
    public static HB4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HB4 hb4 = new HB4();
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
                            AbstractC37302Gc3.A1K(c16l, arrayList);
                        }
                    }
                    hb4.A03 = arrayList;
                } else if ("paging_info".equals(A0q)) {
                    hb4.A02 = AbstractC111064zN.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, hb4, A0q);
                }
                c16l.A0z();
            }
            List list = hb4.A03;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C38321qM c38321qM = ((C111034zF) it.next()).A00;
                    if (c38321qM != null) {
                        hb4.A04.add(c38321qM);
                    }
                }
                return hb4;
            }
            return hb4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
