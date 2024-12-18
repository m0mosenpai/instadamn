package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class IRR {
    public static C38902HAz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38902HAz c38902HAz = new C38902HAz();
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
                            C41026IEv parseFromJson = I4W.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38902HAz.A01 = arrayList;
                } else {
                    C55702hA.A01(c16l, c38902HAz, A0q);
                }
                c16l.A0z();
            }
            List<C41026IEv> list = c38902HAz.A01;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (C41026IEv c41026IEv : list) {
                C38061Goo c38061Goo = c41026IEv.A00;
                if (c38061Goo != null || (c38061Goo = c41026IEv.A01) != null) {
                    A1E.add(c38061Goo);
                }
            }
            c38902HAz.A00 = A1E;
            return c38902HAz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
