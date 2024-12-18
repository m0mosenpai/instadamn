package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FU5 {
    public static ED0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ED0 ed0 = new ED0();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("icebreakers".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            FR9 parseFromJson = F2J.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    ed0.A01 = arrayList;
                } else if ("enabled".equals(A0s)) {
                    ed0.A02 = c16l.A0d();
                } else if ("persistent_menu_enabled".equals(A0s)) {
                    ed0.A03 = c16l.A0d();
                } else if ("has_msgr_icebreakers".equals(A0s)) {
                    ed0.A00 = AbstractC166997dE.A0d(c16l);
                } else if ("vertical_category_id".equals(A0s)) {
                    c16l.A0y();
                } else {
                    C55702hA.A01(c16l, ed0, A0s);
                }
                c16l.A0z();
            }
            return ed0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
