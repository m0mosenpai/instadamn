package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5cj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC120405cj {
    public static C120415ck parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C120415ck c120415ck = new C120415ck();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (!"ambient".equals(A0q) && !"triggered".equals(A0q)) {
                    if ("experimentalCameraInfo".equals(A0q)) {
                        c120415ck.A01 = c16l.A0d();
                    } else if ("count".equals(A0q)) {
                        c16l.A1D();
                    } else if ("sub-capabilities".equals(A0q)) {
                        ArrayList arrayList = null;
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    arrayList.add(A1P);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c120415ck.A00 = arrayList;
                    }
                } else {
                    c16l.A0d();
                }
                c16l.A0z();
            }
            return c120415ck;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
