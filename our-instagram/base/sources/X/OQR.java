package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class OQR {
    public static C54491O5t parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C54491O5t c54491O5t = new C54491O5t();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("live_comment_like_subscribe".equals(AbstractC166997dE.A0s(c16l))) {
                    OCP parseFromJson = AbstractC54261Nyg.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c54491O5t.A00 = parseFromJson;
                }
                c16l.A0z();
            }
            return c54491O5t;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
