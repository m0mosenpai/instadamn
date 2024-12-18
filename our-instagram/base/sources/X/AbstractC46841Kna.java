package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kna, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46841Kna {
    public static L4Y parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            L4Y l4y = new L4Y();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    l4y.A01 = c16l.A0y();
                } else {
                    ArrayList arrayList = null;
                    if ("accessibility_label".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            c16l.A1P();
                        }
                    } else if ("is_voted".equals(A0q)) {
                        l4y.A06 = c16l.A0d();
                    } else if ("text".equals(A0q)) {
                        l4y.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("voter_igids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        l4y.A04 = arrayList;
                    } else if ("voters_accessibility_label".equals(A0q)) {
                        l4y.A03 = AbstractC167017dG.A0m(c16l);
                    } else if ("total_count".equals(A0q)) {
                        l4y.A00 = c16l.A1D();
                    } else if ("voters".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167017dG.A1H(c16l, arrayList);
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        l4y.A05 = arrayList;
                    }
                }
                c16l.A0z();
            }
            return l4y;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
