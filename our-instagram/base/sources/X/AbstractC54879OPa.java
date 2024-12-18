package X;

import java.io.IOException;

/* renamed from: X.OPa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54879OPa {
    public static N3A A00(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        N3A parseFromJson = parseFromJson(c16l);
        C14360o3.A07(parseFromJson);
        return parseFromJson;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.N3A, X.1um, X.1ul] */
    public static N3A parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media".equals(A0s)) {
                    c40791um.A00 = C38321qM.A00(c16l);
                } else if ("cooldown_time_in_seconds".equals(A0s)) {
                    c40791um.A03 = AbstractC166997dE.A0h(c16l);
                } else if ("retry_entire_upload_flow".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("max_cutout_sticker_limit".equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0h(c16l);
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
