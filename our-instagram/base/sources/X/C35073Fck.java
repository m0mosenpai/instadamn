package X;

import java.io.IOException;

/* renamed from: X.Fck, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35073Fck {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EDW, X.1um] */
    public static EDW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                A00(c16l, c40791um, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C16L c16l, EDW edw, String str) {
        if ("errors".equals(str)) {
            edw.A01 = AbstractC33653Eu3.A00(c16l);
            return;
        }
        if ("phone_number_valid".equals(str)) {
            edw.A02 = c16l.A0d();
        } else if ("phone_verification_settings".equals(str)) {
            edw.A00 = F8W.parseFromJson(c16l);
        } else {
            C55702hA.A01(c16l, edw, str);
        }
    }
}
