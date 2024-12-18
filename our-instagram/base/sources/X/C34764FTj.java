package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FTj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34764FTj {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.ECl, X.1um, X.1ul] */
    public static C32190ECl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1Z(A0s)) {
                    c40791um.A00 = AbstractC31171DnF.A0S(c16l, false);
                } else {
                    ArrayList arrayList = null;
                    if ("media".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC31180DnO.A1N(c16l, arrayList);
                            }
                        }
                        c40791um.A01 = arrayList;
                    } else if (!"like_count".equals(A0s) && !AbstractC111324zv.A00(829).equals(A0s)) {
                        if ("stats".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList);
                                }
                            }
                            c40791um.A02 = arrayList;
                        } else {
                            C55702hA.A01(c16l, c40791um, A0s);
                        }
                    } else {
                        c16l.A1D();
                    }
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
