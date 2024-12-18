package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NuU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54018NuU {
    public static C54542O7u parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C54542O7u c54542O7u = new C54542O7u();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("text".equals(A0s)) {
                    c54542O7u.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("ranges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            OAH parseFromJson = AbstractC54017NuT.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c54542O7u.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c54542O7u;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
