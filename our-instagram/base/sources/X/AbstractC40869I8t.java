package X;

import java.io.IOException;

/* renamed from: X.I8t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40869I8t {
    public static C38684GzP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38684GzP c38684GzP = new C38684GzP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("title_meta".equals(A0s)) {
                    c38684GzP.A08 = I90.parseFromJson(c16l);
                } else if ("divider_meta".equals(A0s)) {
                    c38684GzP.A02 = AbstractC40858I8i.parseFromJson(c16l);
                } else if ("commerce_item_meta".equals(A0s)) {
                    c38684GzP.A01 = AbstractC40854I8e.parseFromJson(c16l);
                } else if ("keyword_search_meta".equals(A0s)) {
                    c38684GzP.A04 = AbstractC40860I8k.parseFromJson(c16l);
                } else if ("expansion_meta".equals(A0s)) {
                    c38684GzP.A03 = AbstractC40859I8j.parseFromJson(c16l);
                } else if ("bloks_meta".equals(A0s)) {
                    c38684GzP.A00 = AbstractC40852I8c.parseFromJson(c16l);
                } else if ("text_with_entities_block_meta".equals(A0s)) {
                    c38684GzP.A07 = AbstractC40874I8y.parseFromJson(c16l);
                } else if ("null_state_shops_meta".equals(A0s)) {
                    c38684GzP.A05 = AbstractC40865I8p.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c38684GzP;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
