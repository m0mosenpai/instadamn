package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.Nsx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53924Nsx {
    public static OUP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            OUP oup = new OUP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("generated_content_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    oup.A01 = A0m;
                } else if ("prompt".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    oup.A02 = A0m2;
                } else if ("recipe_caption".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    oup.A03 = A0m3;
                } else if ("background_color".equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    oup.A00 = A0m4;
                } else if ("sticker_style_str".equals(A0s)) {
                    String A0m5 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m5, 0);
                    oup.A06 = A0m5;
                } else if ("user_interactions_id".equals(A0s)) {
                    String A0m6 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m6, 0);
                    oup.A08 = A0m6;
                } else if ("topic".equals(A0s)) {
                    String A0m7 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m7, 0);
                    oup.A07 = A0m7;
                } else if (TraceFieldType.RequestID.equals(A0s)) {
                    String A0m8 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m8, 0);
                    oup.A04 = A0m8;
                } else if ("response_id".equals(A0s)) {
                    String A0m9 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m9, 0);
                    oup.A05 = A0m9;
                }
                c16l.A0z();
            }
            return oup;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
