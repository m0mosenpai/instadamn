package X;

import java.io.IOException;

/* renamed from: X.OQi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54911OQi {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.N3F, X.1um, X.1ul] */
    public static N3F parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_enabled".equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0d(c16l);
                } else if ("limited_categories".equals(A0s)) {
                    c40791um.A00 = AbstractC54285Nz5.parseFromJson(c16l);
                } else if ("limited_features".equals(A0s)) {
                    c40791um.A01 = AbstractC54286Nz6.parseFromJson(c16l);
                } else if ("reminder_date".equals(A0s)) {
                    c40791um.A03 = AbstractC31173DnH.A0h(c16l);
                } else if ("start_date".equals(A0s)) {
                    c40791um.A04 = AbstractC31173DnH.A0h(c16l);
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