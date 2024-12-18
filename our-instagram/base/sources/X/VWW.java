package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VWW {
    public static C69151Vig parseFromJson(C16L c16l) {
        List arrayList;
        C14360o3.A0B(c16l, 0);
        try {
            C69151Vig c69151Vig = new C69151Vig();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("preview_number".equals(A0s)) {
                    c69151Vig.A00 = c16l.A1D();
                } else if ("list".equals(A0s)) {
                    ArrayList arrayList2 = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            U0v parseFromJson = U0u.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    c69151Vig.A01 = arrayList2;
                }
                c16l.A0z();
            }
            List list = c69151Vig.A01;
            if (list != null) {
                arrayList = U12.A00(U13.A00, list);
            } else {
                arrayList = new ArrayList();
            }
            c69151Vig.A02 = arrayList;
            return c69151Vig;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
