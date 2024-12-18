package X;

import java.io.IOException;

/* renamed from: X.920, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class AnonymousClass920 {
    public static AnonymousClass921 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("pk".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("pk", "VisualRepliesOriginalMediaInfoImpl");
                throw C00O.createAndThrow();
            }
            return new AnonymousClass921(str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
