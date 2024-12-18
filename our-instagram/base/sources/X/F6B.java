package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6B {
    public static C35411lN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35411lN c35411lN = new C35411lN();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c35411lN.A02 = AbstractC31172DnG.A0o(c16l);
                } else if ("generation_id".equals(A0q)) {
                    c35411lN.A00 = c16l.A0y();
                } else if ("media_id".equals(A0q)) {
                    c35411lN.A03 = AbstractC31173DnH.A0h(c16l);
                } else if ("preview_url".equals(A0q)) {
                    c35411lN.A04 = AbstractC167017dG.A0m(c16l);
                } else if (TraceFieldType.ContentType.equals(A0q)) {
                    c35411lN.A05 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c35411lN, A0q);
                }
                c16l.A0z();
            }
            return c35411lN;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
