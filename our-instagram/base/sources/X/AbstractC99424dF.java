package X;

import java.io.IOException;

/* renamed from: X.4dF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99424dF {
    public static C99484dN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C4dL c4dL = null;
            C4dL c4dL2 = null;
            C4dL c4dL3 = null;
            C4dL c4dL4 = null;
            C4dL c4dL5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("media_destination".equals(A0q)) {
                    c4dL = AbstractC99434dG.parseFromJson(c16l);
                } else if ("ufi_like_destination".equals(A0q)) {
                    c4dL2 = AbstractC99434dG.parseFromJson(c16l);
                } else if ("ufi_reply_destination".equals(A0q)) {
                    c4dL3 = AbstractC99434dG.parseFromJson(c16l);
                } else if ("ufi_repost_destination".equals(A0q)) {
                    c4dL4 = AbstractC99434dG.parseFromJson(c16l);
                } else if ("ufi_reshare_destination".equals(A0q)) {
                    c4dL5 = AbstractC99434dG.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C99484dN(c4dL, c4dL2, c4dL3, c4dL4, c4dL5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
