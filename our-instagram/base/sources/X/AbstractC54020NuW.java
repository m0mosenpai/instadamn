package X;

import java.io.IOException;

/* renamed from: X.NuW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54020NuW {
    public static OD7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            OD7 od7 = new OD7();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body".equals(A0s)) {
                    od7.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("button_text".equals(A0s)) {
                    od7.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("gated_content_link".equals(A0s)) {
                    od7.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    od7.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("phone_link".equals(A0s)) {
                    od7.A03 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return od7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
