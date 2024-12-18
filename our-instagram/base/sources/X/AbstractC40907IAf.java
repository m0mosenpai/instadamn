package X;

import java.io.IOException;

/* renamed from: X.IAf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40907IAf {
    public static IG0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IG0 ig0 = new IG0();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("music_canonical_id".equals(A0s)) {
                    c16l.A0y();
                } else if ("music_info".equals(A0s)) {
                    ig0.A00 = C3XO.parseFromJson(c16l);
                } else if ("original_sound_info".equals(A0s)) {
                    ig0.A01 = C3XP.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return ig0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
