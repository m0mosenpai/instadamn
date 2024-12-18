package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.I9i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40884I9i {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IDZ, java.lang.Object] */
    public static IDZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
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
                    if ("pending_felix_seen_states".equals(AbstractC166997dE.A0s(c16l))) {
                        HashMap hashMap = null;
                        if (c16l.A11() == c16r) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                if (AbstractC37301Gc2.A05(c16l) == C16R.A0G) {
                                    A1G.put(A1P, null);
                                } else {
                                    IHP parseFromJson = AbstractC40883I9h.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        A1G.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = A1G;
                        }
                        obj.A00 = hashMap;
                    }
                    c16l.A0z();
                } else {
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
