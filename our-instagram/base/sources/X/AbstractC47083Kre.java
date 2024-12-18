package X;

import java.io.IOException;

/* renamed from: X.Kre, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47083Kre {
    public static MUD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MUD mud = new MUD(29);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (MSV.A00(48).equals(A0s)) {
                    mud.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("gif_url".equals(A0s)) {
                    mud.A00 = C54X.parseFromJson(c16l);
                } else if (MSV.A00(1107).equals(A0s)) {
                    mud.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return mud;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
