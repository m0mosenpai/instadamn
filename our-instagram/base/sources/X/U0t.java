package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class U0t {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Uz3, X.1um, X.1ul] */
    public static C67830Uz3 parseFromJson(C16L c16l) {
        List list;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("recent".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            U0v parseFromJson = U0u.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            List list2 = c40791um.A00;
            if (list2 == null || (list = U12.A00(U13.A00, list2)) == null) {
                list = C16930sl.A00;
            }
            c40791um.A01 = list;
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
