package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FTl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34766FTl {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.EAv, X.1um, X.1ul] */
    public static C32148EAv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("gating_decisions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C26127BhE parseFromJson = AbstractC33682EuW.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A04 = arrayList;
                } else if ("ineligible_tools_section_title".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(4773).equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("tools_to_setup_section_title".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            List list = c40791um.A04;
            C14360o3.A0A(list);
            String str = c40791um.A02;
            C14360o3.A0A(str);
            boolean A1b = AbstractC31172DnG.A1b(c40791um.A01);
            String str2 = c40791um.A03;
            C14360o3.A0A(str2);
            c40791um.A00 = new C26211Bib(list, A1b, str, str2);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
