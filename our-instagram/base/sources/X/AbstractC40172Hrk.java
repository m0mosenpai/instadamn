package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hrk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40172Hrk {
    public static C38743H4i parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Boolean bool = null;
            String str = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1W(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38742H4h parseFromJson = AbstractC40171Hrj.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC37300Gc1.A1W(A0q)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC37300Gc1.A1S(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0q, "num_results");
                }
                c16l.A0z();
            }
            return new C38743H4i(bool, num, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
