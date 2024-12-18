package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hoc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39995Hoc {
    public static C38721H3j parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("availabilityConditions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "isAvailable");
                }
                c16l.A0z();
            }
            return new C38721H3j(bool, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
