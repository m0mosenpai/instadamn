package X;

import com.instagram.direct.model.textformatting.FormattedText;
import java.io.IOException;

/* renamed from: X.F4d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34127F4d {
    public static FormattedText parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FormattedText formattedText = new FormattedText();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("offset".equals(A0s)) {
                    formattedText.A01 = c16l.A1D();
                } else if ("length".equals(A0s)) {
                    formattedText.A00 = c16l.A1D();
                } else if ("style".equals(A0s)) {
                    formattedText.A02 = c16l.A1D();
                }
                c16l.A0z();
            }
            return formattedText;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
