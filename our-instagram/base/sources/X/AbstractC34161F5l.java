package X;

import java.io.IOException;

/* renamed from: X.F5l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34161F5l {
    public static C31601f3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C31601f3 c31601f3 = new C31601f3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("seen_marker".equals(A0s)) {
                    c31601f3.A00 = AbstractC80983jS.parseFromJson(c16l);
                } else if (MSV.A00(1407).equals(A0s)) {
                    c31601f3.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("last_seen_shh_message_id".equals(A0s)) {
                    c31601f3.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("is_advancing_shh_seen_marker".equals(A0s)) {
                    c31601f3.A03 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c31601f3, A0s);
                }
                c16l.A0z();
            }
            return c31601f3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
