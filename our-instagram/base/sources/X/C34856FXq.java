package X;

import java.io.IOException;

/* renamed from: X.FXq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34856FXq {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.ED9, X.1um, X.1ul] */
    public static ED9 parseFromJson(C16L c16l) {
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
                    c40791um.A03 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("suggested_users".equals(A0s)) {
                    c40791um.A00 = I0Z.parseFromJson(c16l);
                } else if ("user_story".equals(A0s)) {
                    c40791um.A02 = C154546x4.parseFromJson(c16l);
                } else if ("has_stories".equals(A0s)) {
                    c40791um.A04 = AbstractC166997dE.A0d(c16l);
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
