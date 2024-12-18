package X;

import java.io.IOException;

/* renamed from: X.Nvc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54078Nvc {
    public static C54968OSz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("is_optimistic_upload".equals(AbstractC166997dE.A0s(c16l))) {
                    bool = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("is_optimistic_upload", c16l, "DirectPendingMediaUploadParams");
                throw C00O.createAndThrow();
            }
            return new C54968OSz(bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
