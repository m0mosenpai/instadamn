package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.IOc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41261IOc {
    /* JADX WARN: Type inference failed for: r6v0, types: [X.H8h, X.1um, X.1ul] */
    public static C38833H8h parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
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
                    if ("product_configs".equals(A0s)) {
                        HashMap hashMap = null;
                        if (c16l.A11() == c16r) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                if (AbstractC37301Gc2.A05(c16l) == C16R.A0G) {
                                    A1G.put(A1P, null);
                                } else {
                                    C51792Muw parseFromJson = AbstractC40106HqZ.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        A1G.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = A1G;
                        }
                        c40791um.A01 = hashMap;
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                    c16l.A0z();
                } else {
                    c40791um.A00 = new C51793Mux(c40791um.A01);
                    return c40791um;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
