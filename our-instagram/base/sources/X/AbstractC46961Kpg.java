package X;

import java.io.IOException;

/* renamed from: X.Kpg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46961Kpg {
    public static C1dJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C1dJ c1dJ = new C1dJ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("info_center_type".equals(A0s)) {
                    c1dJ.A03 = AbstractC47054KrB.A00(c16l.A1Q());
                } else if ("fact_name".equals(A0s)) {
                    c1dJ.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("fact_title".equals(A0s)) {
                    c1dJ.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("content_source".equals(A0s)) {
                    c1dJ.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("header_title".equals(A0s)) {
                    c1dJ.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("header_subtitle".equals(A0s)) {
                    c1dJ.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("header_icon_url".equals(A0s)) {
                    c1dJ.A00 = AbstractC222616c.A00(c16l);
                } else if ("preview_image_url".equals(A0s)) {
                    c1dJ.A01 = AbstractC222616c.A00(c16l);
                } else if ("deep_link_url".equals(A0s)) {
                    c1dJ.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("all_facts_deep_link_url".equals(A0s)) {
                    c1dJ.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("cta_button_text".equals(A0s)) {
                    c1dJ.A06 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c1dJ, A0s);
                }
                c16l.A0z();
            }
            return c1dJ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
