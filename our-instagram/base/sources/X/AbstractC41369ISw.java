package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.ISw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41369ISw {
    public static C41051IFu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41051IFu c41051IFu = new C41051IFu();
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
                    if ("impressions".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                if (AbstractC37301Gc2.A05(c16l) == C16R.A0G) {
                                    A1G.put(A1P, null);
                                } else {
                                    IDY parseFromJson = AbstractC40882I9g.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        A1G.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = A1G;
                        }
                        c41051IFu.A00 = hashMap;
                    } else if ("grid_impressions".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c41051IFu.A01 = arrayList;
                    }
                    c16l.A0z();
                } else {
                    return c41051IFu;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C41051IFu c41051IFu) {
        anonymousClass182.A0d();
        if (c41051IFu.A00 != null) {
            anonymousClass182.A0r("impressions");
            anonymousClass182.A0d();
            Iterator A14 = AbstractC166997dE.A14(c41051IFu.A00);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                if (!C16V.A04(anonymousClass182, A1K)) {
                    IDY idy = (IDY) A1K.getValue();
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("view_progress_s", idy.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0a();
        }
        if (c41051IFu.A01 != null) {
            C16V.A03(anonymousClass182, "grid_impressions");
            Iterator it = c41051IFu.A01.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
