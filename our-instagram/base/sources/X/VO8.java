package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VO8 {
    public static C51756Mtf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("has_winning_submissions".equals(AbstractC166997dE.A0s(c16l))) {
                    bool = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return new C51756Mtf(bool, 16);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
