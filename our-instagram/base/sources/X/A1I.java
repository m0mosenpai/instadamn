package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class A1I {
    public static C22856A5z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                if ("transform_matrices".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(AbstractC167007dF.A0a(c16l));
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            C22856A5z c22856A5z = new C22856A5z();
            if (arrayList != null) {
                c22856A5z.A00 = arrayList;
            }
            return c22856A5z;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
