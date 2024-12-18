package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.I8c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40852I8c {
    public static C51757Mtg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51757Mtg c51757Mtg = new C51757Mtg(28);
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    HashMap hashMap = null;
                    if ("path".equals(A0s)) {
                        String A0m = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m, 0);
                        c51757Mtg.A02 = A0m;
                    } else if ("params".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                AbstractC31179DnN.A1F(c16l, hashMap);
                            }
                        }
                        C14360o3.A0B(hashMap, 0);
                        c51757Mtg.A00 = hashMap;
                    }
                    c16l.A0z();
                } else {
                    return c51757Mtg;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
