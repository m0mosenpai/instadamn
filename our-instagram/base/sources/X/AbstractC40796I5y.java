package X;

import java.io.IOException;

/* renamed from: X.I5y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40796I5y {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.TwV, X.HYY] */
    public static HYY parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? abstractC65924TwV = new AbstractC65924TwV();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("track".equals(A0s)) {
                    abstractC65924TwV.A01 = AbstractC84383pX.parseFromJson(c16l);
                } else if ("metadata".equals(A0s)) {
                    abstractC65924TwV.A02 = AbstractC38068Gox.parseFromJson(c16l);
                } else if ("original_sound".equals(A0s)) {
                    abstractC65924TwV.A00 = C3XP.parseFromJson(c16l);
                } else {
                    AbstractC37930GmS.A01(c16l, abstractC65924TwV, A0s);
                }
                c16l.A0z();
            }
            return abstractC65924TwV;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
