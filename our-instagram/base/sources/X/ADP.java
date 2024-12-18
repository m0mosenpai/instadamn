package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ADP {
    public static C214329eW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C214329eW c214329eW = new C214329eW();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(472).equals(A0s)) {
                    c16l.A1D();
                } else if (AbstractC111324zv.A00(950).equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            E82 parseFromJson = AbstractC33730EvI.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c214329eW.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c214329eW, A0s);
                }
                c16l.A0z();
            }
            return c214329eW;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
