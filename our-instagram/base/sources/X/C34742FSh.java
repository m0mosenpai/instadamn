package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FSh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34742FSh {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.EAw, X.1um, X.1ul] */
    public static C32149EAw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fb_close_friends_count".equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(949).equals(A0s)) {
                    c40791um.A00 = AbstractC33730EvI.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("members".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167017dG.A1H(c16l, arrayList);
                            }
                        }
                        c40791um.A04 = arrayList;
                    } else if ("suggested_users".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167017dG.A1H(c16l, arrayList);
                            }
                        }
                        c40791um.A05 = arrayList;
                    } else if ("suggested_users_max_id".equals(A0s)) {
                        c40791um.A03 = AbstractC167017dG.A0m(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            Integer num = c40791um.A02;
            E82 e82 = c40791um.A00;
            List list = c40791um.A04;
            C14360o3.A0A(list);
            c40791um.A01 = new C45145Jyl(e82, num, c40791um.A03, list, c40791um.A05);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
