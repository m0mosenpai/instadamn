package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dvp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31684Dvp {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Dvs, X.1um, X.1ul] */
    public static C31687Dvs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                if ("explore_diagonal_customizations".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C66126U0j parseFromJson = AbstractC31686Dvr.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A02 = arrayList;
                } else if ("explore_low_diagonal_customizations".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C66126U0j parseFromJson2 = AbstractC31686Dvr.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c40791um.A03 = arrayList;
                } else if ("global_config".equals(A0q)) {
                    c40791um.A00 = AbstractC31685Dvq.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            List list = c40791um.A02;
            C14360o3.A0A(list);
            List list2 = c40791um.A03;
            C14360o3.A0A(list2);
            C66125U0i c66125U0i = c40791um.A00;
            C14360o3.A0A(c66125U0i);
            c40791um.A01 = new C66127U0k(c66125U0i, list, list2);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
