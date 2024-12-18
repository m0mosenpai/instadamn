package X;

import java.io.IOException;

/* renamed from: X.HqD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40086HqD {
    public static C26137BhO parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C26128BhF c26128BhF = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("draft_midcard_fallback_metadata".equals(AbstractC166997dE.A0s(c16l))) {
                    c26128BhF = AbstractC39902Hmp.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C26137BhO(c26128BhF);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
