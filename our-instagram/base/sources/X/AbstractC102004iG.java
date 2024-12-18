package X;

import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import java.io.IOException;

/* renamed from: X.4iG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102004iG {
    public static DirectCountBasedReaction parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("emoji".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("is_viewer_reacted".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("emoji", "DirectCountBasedReaction");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_viewer_reacted", "DirectCountBasedReaction");
                } else {
                    return new DirectCountBasedReaction(str, num.intValue(), bool.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("count", "DirectCountBasedReaction");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
