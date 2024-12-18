package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.Nyf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54260Nyf {
    public static C26087BgG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C26087BgG c26087BgG = new C26087BgG();
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
                    ArrayList arrayList = null;
                    HashMap hashMap = null;
                    HashMap hashMap2 = null;
                    if ("supporters_in_comments".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                AbstractC31179DnN.A1F(c16l, hashMap);
                            }
                        }
                        C14360o3.A0B(hashMap, 0);
                        c26087BgG.A01 = hashMap;
                    } else if ("supporters_in_comments_v2".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    A1G.put(A1P, null);
                                } else {
                                    C51745MtU parseFromJson = AbstractC54258Nyd.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        A1G.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap2 = A1G;
                        }
                        C14360o3.A0B(hashMap2, 0);
                        c26087BgG.A02 = hashMap2;
                    } else if ("new_supporters".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C56801PIs parseFromJson2 = AbstractC54255Nya.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c26087BgG.A00 = arrayList;
                    } else if ("new_supporters_next_min_id".equals(A0s)) {
                        c26087BgG.A03 = AbstractC167017dG.A0m(c16l);
                    }
                    c16l.A0z();
                } else {
                    return c26087BgG;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
