package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hz4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40584Hz4 {
    public static IGP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IGP igp = new IGP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("invited_collaborators".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    igp.A01 = arrayList;
                } else if ("joined_collaborators".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    igp.A02 = arrayList;
                } else if ("input_mode".equals(A0s)) {
                    igp.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return igp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
