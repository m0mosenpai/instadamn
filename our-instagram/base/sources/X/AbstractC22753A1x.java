package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.A1x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22753A1x {
    public static A69 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            A69 a69 = new A69();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("media_dicts".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38321qM A00 = C38321qM.A00(c16l);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    a69.A00 = arrayList;
                }
                c16l.A0z();
            }
            return a69;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
