package X;

import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes7.dex */
public abstract class I87 {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.IDI, java.lang.Object] */
    public static IDI parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            HashMap hashMap = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                if ("incentives_offers_last_seen_times".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == c16r) {
                        hashMap = AbstractC166987dD.A1G();
                        while (c16l.A1J() != c16r2) {
                            String A1P = c16l.A1P();
                            if (AbstractC37301Gc2.A05(c16l) == C16R.A0G) {
                                hashMap.put(A1P, null);
                            } else {
                                Long A0h = AbstractC31173DnH.A0h(c16l);
                                if (A0h != null) {
                                    hashMap.put(A1P, A0h);
                                }
                            }
                        }
                    } else {
                        hashMap = null;
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (hashMap != null) {
                obj.A00 = hashMap;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
