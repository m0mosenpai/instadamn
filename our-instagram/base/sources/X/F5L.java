package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F5L {
    public static C34331jX parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34331jX c34331jX = new C34331jX();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("recommended_user_ids".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c34331jX.A00 = arrayList;
                } else {
                    AbstractC47856LCb.A01(c16l, c34331jX, A0s);
                }
                c16l.A0z();
            }
            return c34331jX;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
