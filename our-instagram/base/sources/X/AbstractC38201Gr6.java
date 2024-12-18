package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Gr6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38201Gr6 {
    public static C38202Gr7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38202Gr7 c38202Gr7 = new C38202Gr7();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("places".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            HYX parseFromJson = I60.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38202Gr7.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c38202Gr7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
