package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I5x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40795I5x {
    public static C40959ICg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C40959ICg c40959ICg = new C40959ICg();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("tracks".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            HYY parseFromJson = AbstractC40796I5y.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c40959ICg.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c40959ICg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
