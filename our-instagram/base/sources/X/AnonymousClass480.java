package X;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.480, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass480 {
    public static C916047t parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C916047t c916047t = new C916047t();
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
                    if ("reupload_count".equals(A0q)) {
                        c916047t.A01 = c16l.A1D();
                    } else if ("no_network_retry_count".equals(A0q)) {
                        c916047t.A00 = c16l.A1D();
                    } else {
                        HashMap hashMap = null;
                        if ("step_auto_retry_count_map".equals(A0q)) {
                            if (c16l.A11() == c16r) {
                                HashMap hashMap2 = new HashMap();
                                while (c16l.A1J() != c16r2) {
                                    String A1P = c16l.A1P();
                                    c16l.A1J();
                                    if (c16l.A11() == C16R.A0G) {
                                        hashMap2.put(A1P, null);
                                    } else {
                                        Integer valueOf = Integer.valueOf(c16l.A1D());
                                        if (valueOf != null) {
                                            hashMap2.put(A1P, valueOf);
                                        }
                                    }
                                }
                                hashMap = hashMap2;
                            }
                            C14360o3.A0B(hashMap, 0);
                            c916047t.A02 = new ConcurrentHashMap(hashMap);
                        } else if ("step_manual_count_map".equals(A0q)) {
                            if (c16l.A11() == c16r) {
                                HashMap hashMap3 = new HashMap();
                                while (c16l.A1J() != c16r2) {
                                    String A1P2 = c16l.A1P();
                                    c16l.A1J();
                                    if (c16l.A11() == C16R.A0G) {
                                        hashMap3.put(A1P2, null);
                                    } else {
                                        Integer valueOf2 = Integer.valueOf(c16l.A1D());
                                        if (valueOf2 != null) {
                                            hashMap3.put(A1P2, valueOf2);
                                        }
                                    }
                                }
                                hashMap = hashMap3;
                            }
                            C14360o3.A0B(hashMap, 0);
                            c916047t.A03 = new ConcurrentHashMap(hashMap);
                        }
                    }
                    c16l.A0z();
                } else {
                    return c916047t;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C916047t c916047t) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("reupload_count", c916047t.A01);
        anonymousClass182.A0Q("no_network_retry_count", c916047t.A00);
        anonymousClass182.A0r("step_auto_retry_count_map");
        anonymousClass182.A0d();
        for (Map.Entry entry : c916047t.A02.entrySet()) {
            if (!C16V.A04(anonymousClass182, entry)) {
                anonymousClass182.A0h(((Number) entry.getValue()).intValue());
            }
        }
        anonymousClass182.A0a();
        anonymousClass182.A0r("step_manual_count_map");
        anonymousClass182.A0d();
        for (Map.Entry entry2 : c916047t.A03.entrySet()) {
            if (!C16V.A04(anonymousClass182, entry2)) {
                anonymousClass182.A0h(((Number) entry2.getValue()).intValue());
            }
        }
        anonymousClass182.A0a();
        anonymousClass182.A0a();
    }
}
