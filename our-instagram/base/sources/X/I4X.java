package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I4X {
    public static ICU parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ICU icu = new ICU();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("track_item".equals(AbstractC166997dE.A0s(c16l))) {
                    icu.A00 = AbstractC84383pX.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return icu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
