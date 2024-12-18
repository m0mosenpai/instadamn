package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F63 {
    public static C30631dS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30631dS c30631dS = new C30631dS();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c30631dS.A01 = AbstractC31172DnG.A0o(c16l);
                } else if ("comment_id".equals(A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c30631dS.A02 = A0m;
                } else if ("text".equals(A0q)) {
                    c30631dS.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("pending_xma".equals(A0q)) {
                    c30631dS.A00 = AbstractC34252F8y.parseFromJson(c16l);
                } else if (AbstractC43591JPw.A00(415).equals(A0q)) {
                    c30631dS.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("url".equals(A0q)) {
                    c30631dS.A06 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC43591JPw.A00(411).equals(A0q)) {
                    c30631dS.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("send_as_quoted_reply".equals(A0q)) {
                    c30631dS.A07 = c16l.A0d();
                } else {
                    AbstractC47856LCb.A01(c16l, c30631dS, A0q);
                }
                c16l.A0z();
            }
            return c30631dS;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
