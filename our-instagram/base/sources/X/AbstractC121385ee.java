package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.5ee, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC121385ee {
    public static C121395ef parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C121395ef c121395ef = new C121395ef();
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
                    String str2 = null;
                    HashMap hashMap = null;
                    if ("view_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c121395ef.A03 = str2;
                    } else if ("expiration_ms".equals(A0q)) {
                        c121395ef.A00 = c16l.A0y();
                    } else if ("score_map".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P, null);
                                } else {
                                    C121415eh parseFromJson = AbstractC121405eg.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        hashMap2.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        C14360o3.A0B(hashMap, 0);
                        c121395ef.A04 = hashMap;
                    } else if ("ranking_request_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c121395ef.A02 = str;
                    } else if ("expiration_timestamp".equals(A0q)) {
                        c121395ef.A01 = c16l.A0y();
                    }
                    c16l.A0z();
                } else {
                    return c121395ef;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
