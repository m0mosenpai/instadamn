package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F5e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34154F5e {
    public static C35771lx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35771lx c35771lx = new C35771lx();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("folder_sequence".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c35771lx.A00 = arrayList;
                } else {
                    AbstractC43669JTd.A01(c16l, c35771lx, A0s);
                }
                c16l.A0z();
            }
            return c35771lx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
