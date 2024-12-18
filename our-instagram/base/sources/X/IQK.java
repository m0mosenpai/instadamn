package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IQK {
    public static HB5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HB5 hb5 = new HB5();
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
                            arrayList.add(C3XG.A00(c16l));
                        }
                    }
                    hb5.A05 = arrayList;
                } else if (AbstractC37300Gc1.A1W(A0q)) {
                    hb5.A07 = c16l.A0d();
                } else if (AbstractC111324zv.A00(45).equals(A0q)) {
                    hb5.A06 = c16l.A0d();
                } else if (AbstractC37300Gc1.A1S(A0q)) {
                    hb5.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("chain_pagination_token_chain_scope".equals(A0q)) {
                    hb5.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("chain_pagination_token".equals(A0q)) {
                    hb5.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("client_gap_enforcer_matrix".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C40951IBy parseFromJson = AbstractC40604HzO.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    hb5.A04 = arrayList;
                } else {
                    C55702hA.A01(c16l, hb5, A0q);
                }
                c16l.A0z();
            }
            return hb5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
