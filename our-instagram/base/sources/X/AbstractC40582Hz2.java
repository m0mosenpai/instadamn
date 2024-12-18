package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hz2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40582Hz2 {
    public static C40946IBt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C40946IBt c40946IBt = new C40946IBt();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("reactions".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IEP parseFromJson = AbstractC40581Hz1.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c40946IBt.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c40946IBt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
