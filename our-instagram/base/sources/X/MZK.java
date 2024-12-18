package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public abstract class MZK {
    public static MZL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MZL mzl = new MZL();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("keywords".equals(A0q)) {
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
                    mzl.A00 = arrayList;
                }
                c16l.A0z();
            }
            return mzl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
