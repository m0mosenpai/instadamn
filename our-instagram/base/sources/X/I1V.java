package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I1V {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.HAr, X.1um, X.1ul] */
    public static C38895HAr parseFromJson(C16L c16l) {
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
                String str = null;
                if (AbstractC37300Gc1.A1E(A0s)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    EnumC39586Hdw.A01.get(str);
                } else if ("item".equals(A0s)) {
                    c40791um.A01 = C38321qM.A00(c16l);
                } else if ("channel".equals(A0s)) {
                    c40791um.A02 = C41314IQk.parseFromJson(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if (AbstractC37300Gc1.A1Q(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("image_url".equals(A0s)) {
                    c40791um.A00 = AbstractC222616c.A00(c16l);
                } else if ("image_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("logging_info".equals(A0s)) {
                    c40791um.A06 = I1X.parseFromJson(c16l);
                } else if ("layout_info".equals(A0s)) {
                    c40791um.A05 = I1W.parseFromJson(c16l);
                } else if ("recommendation_reason".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    c40791um.A07 = arrayList;
                } else if (AbstractC111324zv.A00(2082).equals(A0s)) {
                    c40791um.A04 = I1T.parseFromJson(c16l);
                } else if ("upsell".equals(A0s)) {
                    c40791um.A03 = I1S.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
