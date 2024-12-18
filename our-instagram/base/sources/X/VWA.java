package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VWA {
    public static Al7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Al7 al7 = new Al7();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("first_option_string".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    al7.A05 = A0m;
                } else if ("second_option_string".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    al7.A07 = A0m2;
                } else if ("first_option_text_size".equals(A0s)) {
                    al7.A00 = (float) c16l.A0U();
                } else if ("second_option_text_size".equals(A0s)) {
                    al7.A02 = (float) c16l.A0U();
                } else if ("question".equals(A0s)) {
                    al7.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("question_text_size".equals(A0s)) {
                    al7.A01 = (float) c16l.A0U();
                } else if ("question_max_width".equals(A0s)) {
                    al7.A03 = c16l.A1D();
                } else if ("question_padding_bottom".equals(A0s)) {
                    al7.A04 = c16l.A1D();
                }
                c16l.A0z();
            }
            return al7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
