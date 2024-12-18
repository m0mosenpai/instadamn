package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F4N {
    public static E6A parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            E6A e6a = new E6A();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC111324zv.A00(4891).equals(A0s)) {
                    e6a.A00 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(4892).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C50679MYx parseFromJson = F4P.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    e6a.A01 = arrayList;
                }
                c16l.A0z();
            }
            return e6a;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
