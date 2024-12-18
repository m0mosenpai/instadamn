package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FTc {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EPL, X.EBK] */
    public static EPL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? ebk = new EBK();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("pre_selected_suggestions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    ebk.A00 = arrayList;
                } else if ("suggestions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    ebk.A01 = arrayList;
                } else {
                    C35048FcL.A00(c16l, ebk, A0s);
                }
                c16l.A0z();
            }
            return ebk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
