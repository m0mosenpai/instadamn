package X;

import java.io.IOException;

/* renamed from: X.FVq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34814FVq {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.ECr, X.1um] */
    public static C32196ECr parseFromJson(C16L c16l) {
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

    public static void A00(C16L c16l, C32196ECr c32196ECr, String str) {
        if ("two_factor_required".equals(str)) {
            c32196ECr.A02 = c16l.A0d();
            return;
        }
        if ("two_factor_info".equals(str)) {
            c32196ECr.A01 = F8Y.parseFromJson(c16l);
        } else if ("phone_verification_settings".equals(str)) {
            c32196ECr.A00 = F8W.parseFromJson(c16l);
        } else {
            C55702hA.A01(c16l, c32196ECr, str);
        }
    }
}
