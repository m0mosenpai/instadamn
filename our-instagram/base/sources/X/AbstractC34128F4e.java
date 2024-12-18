package X;

import java.io.IOException;

/* renamed from: X.F4e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34128F4e {
    public static FGI parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FGI fgi = new FGI();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("is_hidden_in_messages_primary_tab".equals(AbstractC166997dE.A0s(c16l))) {
                    fgi.A00 = c16l.A0d();
                }
                c16l.A0z();
            }
            return fgi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
