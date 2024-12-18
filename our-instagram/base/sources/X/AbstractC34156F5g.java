package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F5g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34156F5g {
    public static C33021hQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33021hQ c33021hQ = new C33021hQ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("forward_music".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC31180DnO.A1O(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c33021hQ.A01 = arrayList;
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c33021hQ.A00 = FUT.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c33021hQ, A0s);
                }
                c16l.A0z();
            }
            return c33021hQ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
