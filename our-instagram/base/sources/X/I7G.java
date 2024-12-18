package X;

import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes7.dex */
public abstract class I7G {
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.HjK] */
    public static C39688HjK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            HashMap hashMap = null;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    if (AbstractC37301Gc2.A1W(c16l, c16l.A0q())) {
                        if (c16l.A11() == c16r) {
                            hashMap = AbstractC166987dD.A1G();
                            while (c16l.A12() != c16r2) {
                                String A0q = c16l.A0q();
                                if (c16l.A12() == c16r) {
                                    HashMap A1G = AbstractC166987dD.A1G();
                                    while (c16l.A11() == c16r) {
                                        String A0q2 = c16l.A0q();
                                        IJD parseFromJson = I7C.parseFromJson(c16l);
                                        C14360o3.A0B(parseFromJson, 0);
                                        AbstractC42328Ioq A00 = AbstractC40800I6c.A00(null, parseFromJson);
                                        if (A00 != null) {
                                            A1G.put(A0q2, A00);
                                        }
                                        c16l.A12();
                                    }
                                    if (!A1G.isEmpty()) {
                                        hashMap.put(A0q, A1G);
                                    }
                                } else {
                                    c16l.A0z();
                                }
                            }
                        } else {
                            c16l.A0z();
                            hashMap = null;
                        }
                    }
                    c16l.A0z();
                } else {
                    ?? obj = new Object();
                    obj.A00 = hashMap;
                    return obj;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
