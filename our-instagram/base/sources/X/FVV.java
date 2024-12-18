package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FVV {
    public static EV2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            EV2 ev2 = new EV2();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("search_results".equals(AbstractC166997dE.A0s(c16l))) {
                    ev2.A00 = F82.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return ev2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
