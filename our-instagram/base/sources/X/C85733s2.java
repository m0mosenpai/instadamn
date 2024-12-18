package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.3s2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85733s2 {
    public static C40741uh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C40741uh c40741uh = new C40741uh();
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
                    HashMap hashMap = null;
                    HashMap hashMap2 = null;
                    if ("reels".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap3 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap3.put(A1P, null);
                                } else {
                                    C37771pE parseFromJson = AbstractC38741r6.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        hashMap3.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = hashMap3;
                        }
                        c40741uh.A08 = hashMap;
                    } else if ("client_hints".equals(A0q)) {
                        c40741uh.A00 = AbstractC74353Vr.parseFromJson(c16l);
                    } else if ("cached_reels".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap4 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P2 = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap4.put(A1P2, null);
                                } else {
                                    C26086BgF parseFromJson2 = AbstractC40695I2b.parseFromJson(c16l);
                                    if (parseFromJson2 != null) {
                                        hashMap4.put(A1P2, parseFromJson2);
                                    }
                                }
                            }
                            hashMap2 = hashMap4;
                        }
                        c40741uh.A07 = hashMap2;
                    } else if ("next_ad_request_index".equals(A0q)) {
                        c40741uh.A05 = Integer.valueOf(c16l.A1D());
                    } else if ("viewer_session_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c40741uh.A06 = str;
                    } else if ("ads_pool_threshold_for_next_request".equals(A0q)) {
                        c40741uh.A02 = Integer.valueOf(c16l.A1D());
                    } else if ("earliest_request_position".equals(A0q)) {
                        c40741uh.A04 = Integer.valueOf(c16l.A1D());
                    } else {
                        C55702hA.A01(c16l, c40741uh, A0q);
                    }
                    c16l.A0z();
                } else {
                    return c40741uh;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
