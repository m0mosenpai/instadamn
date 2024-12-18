package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class IPW {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.H9Q, X.1um, X.1ul] */
    public static H9Q parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("pending_approval_requests_count".equals(A0s)) {
                    c40791um.A03 = AbstractC166997dE.A0h(c16l);
                } else if ("require_ad_approval".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("require_approval".equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0d(c16l);
                } else if ("whitelisted_users".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    c40791um.A04 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            Integer num = c40791um.A03;
            C14360o3.A0A(num);
            int intValue = num.intValue();
            Boolean bool = c40791um.A01;
            boolean A1b = AbstractC31172DnG.A1b(c40791um.A02);
            List list = c40791um.A04;
            C14360o3.A0A(list);
            c40791um.A00 = new C45152Jys(bool, list, intValue, A1b);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
