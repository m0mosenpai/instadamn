package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.5Hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114915Hf {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractMap, java.util.HashMap] */
    public static C9CK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9CK c9ck = new C9CK(3);
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
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    String str = null;
                    if ("action_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        C14360o3.A0B(str, 0);
                        c9ck.A02 = str;
                    } else if ("action_text".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c9ck.A01 = str;
                    } else if ("confirmation_text".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c9ck.A03 = str;
                    } else if ("controls".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            ?? hashMap = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap.put(A1P, null);
                                } else {
                                    String A1P2 = c16l.A1P();
                                    if (A1P2 != null) {
                                        hashMap.put(A1P, A1P2);
                                    }
                                }
                            }
                            str = hashMap;
                        }
                        c9ck.A00 = str;
                    }
                    c16l.A0z();
                } else {
                    return c9ck;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
