package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F58 {
    public static C34512FIy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34512FIy c34512FIy = new C34512FIy();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("senders".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c34512FIy.A01 = arrayList;
                } else if ("media".equals(A0s)) {
                    c34512FIy.A00 = AbstractC31176DnK.A0Y(c16l);
                }
                c16l.A0z();
            }
            return c34512FIy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
