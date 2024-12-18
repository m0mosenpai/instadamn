package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class MZN {
    public static MZO parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MZO mzo = new MZO();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("list".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C66130U0o parseFromJson = MZ9.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    mzo.A01 = arrayList;
                } else if ("cache_timeout_sec".equals(A0q)) {
                    mzo.A00 = c16l.A1D();
                } else {
                    C55702hA.A01(c16l, mzo, A0q);
                }
                c16l.A0z();
            }
            return mzo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
