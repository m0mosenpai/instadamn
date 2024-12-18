package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class A1V {
    public static A65 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            A65 a65 = new A65();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("timestamps".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(AbstractC167007dF.A0a(c16l));
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    a65.A00 = arrayList;
                }
                c16l.A0z();
            }
            return a65;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
