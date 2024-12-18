package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class Hp7 {
    public static C38733H3w parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38729H3s c38729H3s = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C108054to c108054to = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("profile_card_info".equals(A0s)) {
                    c38729H3s = AbstractC40010Hor.parseFromJson(c16l);
                } else if ("question_card_info".equals(A0s)) {
                    c108054to = AbstractC108044tn.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38733H3w(c108054to, c38729H3s);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
