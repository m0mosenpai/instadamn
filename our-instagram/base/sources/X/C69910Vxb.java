package X;

import com.instagram.api.schemas.Estimate;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Vxb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69910Vxb {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Uz6, X.1um, X.1ul] */
    public static C67833Uz6 parseFromJson(C16L c16l) {
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
                    HashMap hashMap = null;
                    if ("total_budget_with_offset_to_reach_estimate".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P, null);
                                } else {
                                    Estimate parseFromJson = VOG.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        hashMap2.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        c40791um.A02 = hashMap;
                    } else if ("total_budget_with_offset_to_outcome_estimate".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap3 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P2 = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap3.put(A1P2, null);
                                } else {
                                    Estimate parseFromJson2 = VOG.parseFromJson(c16l);
                                    if (parseFromJson2 != null) {
                                        hashMap3.put(A1P2, parseFromJson2);
                                    }
                                }
                            }
                            hashMap = hashMap3;
                        }
                        c40791um.A01 = hashMap;
                    } else if ("error".equals(A0s)) {
                        c40791um.A00 = AbstractC40190HsA.parseFromJson(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                    c16l.A0z();
                } else {
                    return c40791um;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
