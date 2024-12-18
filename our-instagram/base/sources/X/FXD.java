package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FXD {
    public static C32199ECu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32199ECu c32199ECu = new C32199ECu();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("mutual_followers".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    c32199ECu.A00 = arrayList;
                } else if ("show_see_all_followers_button".equals(A0s)) {
                    c32199ECu.A02 = c16l.A0d();
                } else if ("suggested_users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C47O parseFromJson = AbstractC31357DqM.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c32199ECu.A01 = arrayList;
                } else {
                    C55702hA.A01(c16l, c32199ECu, A0s);
                }
                c16l.A0z();
            }
            return c32199ECu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
