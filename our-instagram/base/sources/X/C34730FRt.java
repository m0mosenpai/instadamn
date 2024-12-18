package X;

import java.io.IOException;

/* renamed from: X.FRt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34730FRt {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1um, X.ED5, X.1ul] */
    public static ED5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(33).equals(A0s)) {
                    c40791um.A04 = c16l.A0d();
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c40791um.A03 = A0m;
                } else if (AbstractC111324zv.A00(1992).equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c40791um.A00 = A0m2;
                } else if (AbstractC111324zv.A00(73).equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c40791um.A01 = A0m3;
                } else if (MSV.A00(63).equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    c40791um.A02 = A0m4;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
