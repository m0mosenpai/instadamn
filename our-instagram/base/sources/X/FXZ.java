package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FXZ {
    public static EC5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            EC5 ec5 = new EC5();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                String str = null;
                ArrayList arrayList = null;
                if ("suggested_users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    ec5.A00 = arrayList;
                } else if ("suggested_users_max_id".equals(A0s)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                } else {
                    C55702hA.A01(c16l, ec5, A0s);
                }
                c16l.A0z();
            }
            return ec5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
