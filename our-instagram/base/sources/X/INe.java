package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public final class INe {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.H9D, X.1um, X.1ul] */
    public static H9D parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ad_id".equals(A0s)) {
                    c40791um.A03 = AbstractC31173DnH.A0h(c16l);
                } else if ("content".equals(A0s)) {
                    c40791um.A00 = AbstractC39730Hk0.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(33).equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0d(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            Long l = c40791um.A03;
            C14360o3.A0A(l);
            c40791um.A01 = new C38608GyB(c40791um.A00, l.longValue(), AbstractC31172DnG.A1b(c40791um.A02));
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
