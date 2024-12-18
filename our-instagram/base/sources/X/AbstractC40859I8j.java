package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I8j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40859I8j {
    public static C38687GzS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38687GzS c38687GzS = new C38687GzS(16);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC37300Gc1.A1D(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c38687GzS.A01 = A0m;
                } else if ("feed".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38619GyM parseFromJson = AbstractC40870I8u.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38687GzS.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c38687GzS;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
