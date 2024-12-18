package X;

import java.io.IOException;

/* renamed from: X.1sF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39341sF {
    public static C39381sJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C39361sH c39361sH = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C87593vR c87593vR = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("browser_peek".equals(A0q)) {
                    c39361sH = AbstractC39351sG.parseFromJson(c16l);
                } else if ("persistent_iab".equals(A0q)) {
                    c87593vR = AbstractC87583vQ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C39381sJ(c39361sH, c87593vR);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
