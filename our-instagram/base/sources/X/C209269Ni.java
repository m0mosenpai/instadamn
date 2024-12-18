package X;

import java.io.IOException;
import java.util.List;

/* renamed from: X.9Ni, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209269Ni {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1um, X.9ee, X.1ul] */
    public static C214409ee parseFromJson(C16L c16l) {
        List list;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("lyrics".equals(A0q)) {
                    c40791um.A00 = AbstractC38058Gol.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            C38059Gom c38059Gom = c40791um.A00;
            if (c38059Gom == null || (list = c38059Gom.A00) == null || !AbstractC166987dD.A1b(list)) {
                c40791um.A00 = null;
                return c40791um;
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
