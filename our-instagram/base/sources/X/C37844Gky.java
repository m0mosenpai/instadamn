package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Gky, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37844Gky {
    public static C37845Gkz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C37845Gkz c37845Gkz = new C37845Gkz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                if ("mid_cards".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C54734OFl parseFromJson = AbstractC40908IAg.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c37845Gkz.A00 = arrayList;
                } else if ("mid_cards_v2".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C26136BhN parseFromJson2 = AbstractC40084HqB.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c37845Gkz.A01 = arrayList;
                } else {
                    C55702hA.A01(c16l, c37845Gkz, A0q);
                }
                c16l.A0z();
            }
            return c37845Gkz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
