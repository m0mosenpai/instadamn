package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I7n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40837I7n {
    public static C51750MtZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51750MtZ c51750MtZ = new C51750MtZ(7);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC37301Gc2.A1W(c16l, c16l.A0q())) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38688GzT parseFromJson = AbstractC40836I7m.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c51750MtZ.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c51750MtZ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
