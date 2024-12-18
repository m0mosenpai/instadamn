package X;

import java.io.IOException;

/* renamed from: X.F3c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34100F3c {
    public static C34498FIk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34498FIk c34498FIk = new C34498FIk();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(558).equals(A0s)) {
                    c34498FIk.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("emoji".equals(A0s)) {
                    c34498FIk.A00 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c34498FIk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
