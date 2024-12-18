package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6W {
    public static C35071km parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35071km c35071km = new C35071km();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c35071km.A01 = AbstractC31172DnG.A0o(c16l);
                } else if ("nudge".equals(A0q)) {
                    C9BO parseFromJson = AbstractC81653ka.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c35071km.A00 = parseFromJson;
                } else {
                    AbstractC43669JTd.A01(c16l, c35071km, A0q);
                }
                c16l.A0z();
            }
            return c35071km;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
