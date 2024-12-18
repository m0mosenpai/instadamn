package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VX4 {
    public static C70875Wig parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C70875Wig c70875Wig = new C70875Wig();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("primary_color".equals(A0s)) {
                    c70875Wig.A03 = c16l.A1D();
                } else if (AbstractC111324zv.A00(1252).equals(A0s)) {
                    c70875Wig.A04 = c16l.A1D();
                } else if ("text_emphasis_mode".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c70875Wig.A05 = A2Y.A00(A1P);
                } else if ("top_padding_ratio".equals(A0s)) {
                    c70875Wig.A02 = (float) c16l.A0U();
                } else if ("bottom_padding_ratio".equals(A0s)) {
                    c70875Wig.A00 = (float) c16l.A0U();
                } else if ("horizontal_padding_ratio".equals(A0s)) {
                    c70875Wig.A01 = (float) c16l.A0U();
                } else if ("emphasis_rect".equals(A0s)) {
                    C69250VkJ parseFromJson = AbstractC69986Vz5.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c70875Wig.A06 = parseFromJson;
                }
                c16l.A0z();
            }
            return c70875Wig;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
