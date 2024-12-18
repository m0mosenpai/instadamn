package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.ISo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41361ISo {
    public static HB1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HB1 hb1 = new HB1();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("tabs".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C40850I8a parseFromJson = AbstractC40851I8b.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    hb1.A02 = arrayList;
                } else if ("sectional_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51757Mtg parseFromJson2 = I85.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    hb1.A01 = arrayList;
                } else if (AbstractC37300Gc1.A1W(A0s)) {
                    hb1.A03 = c16l.A0d();
                } else if ("pagination_token".equals(A0s)) {
                    hb1.A00 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, hb1, A0s);
                }
                c16l.A0z();
            }
            return hb1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
