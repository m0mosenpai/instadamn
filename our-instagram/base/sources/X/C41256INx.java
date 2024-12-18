package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.INx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41256INx {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.H9U, X.1um, X.1ul] */
    public static H9U parseFromJson(C16L c16l) {
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
                    if ("cxp_deep_deletion_global_response".equals(A0s)) {
                        HashMap hashMap = null;
                        if (c16l.A11() == c16r) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                if (AbstractC37301Gc2.A05(c16l) == C16R.A0G) {
                                    A1G.put(A1P, null);
                                } else {
                                    Boolean A0d = AbstractC166997dE.A0d(c16l);
                                    if (A0d != null) {
                                        A1G.put(A1P, A0d);
                                    }
                                }
                            }
                            hashMap = A1G;
                        }
                        c40791um.A05 = hashMap;
                    } else if (MSV.A00(193).equals(A0s)) {
                        c40791um.A02 = AbstractC166997dE.A0d(c16l);
                    } else if (MSV.A00(1170).equals(A0s)) {
                        c40791um.A03 = AbstractC166997dE.A0d(c16l);
                    } else if (MSV.A00(1172).equals(A0s)) {
                        c40791um.A04 = AbstractC166997dE.A0d(c16l);
                    } else if ("updated_media".equals(A0s)) {
                        c40791um.A01 = C38321qM.A00(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                    c16l.A0z();
                } else {
                    HashMap hashMap2 = c40791um.A05;
                    boolean A1b = AbstractC31172DnG.A1b(c40791um.A02);
                    c40791um.A00 = new C38622GyP(c40791um.A01, c40791um.A03, c40791um.A04, hashMap2, A1b);
                    return c40791um;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
