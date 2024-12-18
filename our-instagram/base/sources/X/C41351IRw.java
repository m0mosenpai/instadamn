package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IRw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41351IRw {
    public static HAU parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HAU hau = new HAU();
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
                            C38061Goo parseFromJson = AbstractC38073Gp2.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    hau.A01 = arrayList;
                } else if ("page_info".equals(A0q)) {
                    hau.A00 = AbstractC40787I5p.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, hau, A0q);
                }
                c16l.A0z();
            }
            return hau;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
