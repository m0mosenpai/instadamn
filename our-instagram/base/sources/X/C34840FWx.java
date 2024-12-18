package X;

import java.io.IOException;

/* renamed from: X.FWx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34840FWx {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1um, X.EBs, X.1ul] */
    public static C32171EBs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("category_item".equals(A0s)) {
                    FPs parseFromJson = AbstractC34839FWw.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c40791um.A00 = parseFromJson;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
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
