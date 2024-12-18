package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class ISF {
    public static HBF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HBF hbf = new HBF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IIT parseFromJson = I8V.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    hbf.A01 = arrayList;
                } else if (AbstractC37300Gc1.A1W(A0s)) {
                    hbf.A02 = c16l.A0d();
                } else if (AbstractC37300Gc1.A1S(A0s)) {
                    hbf.A00 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, hbf, A0s);
                }
                c16l.A0z();
            }
            return hbf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
