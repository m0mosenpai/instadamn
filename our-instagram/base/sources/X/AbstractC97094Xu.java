package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4Xu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97094Xu {
    public static C97104Xv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C97104Xv c97104Xv = new C97104Xv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("medias".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38321qM A0C = C38321qM.A0h.A0C(c16l, true, false);
                            if (A0C != null) {
                                arrayList.add(A0C);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c97104Xv.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c97104Xv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
