package X;

import com.instagram.direct.model.comments.DirectMessageComments;
import java.io.IOException;

/* renamed from: X.4iI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102014iI {
    public static DirectMessageComments parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            DirectMessageComments directMessageComments = new DirectMessageComments();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("comment_count".equals(A0q)) {
                    directMessageComments.A00 = c16l.A1D();
                } else if ("facade_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    directMessageComments.A01 = A1P;
                }
                c16l.A0z();
            }
            return directMessageComments;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
