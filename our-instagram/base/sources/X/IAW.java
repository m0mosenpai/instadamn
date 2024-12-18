package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class IAW {
    public static ILV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ILV ilv = new ILV();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC37300Gc1.A1D(A0s)) {
                    ilv.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("markup".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IHT parseFromJson = IAV.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    ilv.A01 = arrayList;
                }
                c16l.A0z();
            }
            return ilv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
