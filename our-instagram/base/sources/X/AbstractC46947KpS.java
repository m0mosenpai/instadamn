package X;

import java.io.IOException;

/* renamed from: X.KpS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46947KpS {
    public static C33771id parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33771id c33771id = new C33771id();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("direct_voice_media".equals(A0s)) {
                    C4G2 parseFromJson = C4G1.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c33771id.A00 = parseFromJson;
                } else if ("note_reply".equals(A0s)) {
                    C44993Jvj parseFromJson2 = AbstractC46985Kq4.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c33771id.A01 = parseFromJson2;
                } else {
                    AbstractC47856LCb.A01(c16l, c33771id, A0s);
                }
                c16l.A0z();
            }
            return c33771id;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
