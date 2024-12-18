package X;

import java.io.IOException;

/* renamed from: X.3vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87813vp {
    public static C87823vq parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("subitem_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("subitem_str".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("subitem_count", "SocialContextSubitemImpl");
            } else if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("subitem_str", "SocialContextSubitemImpl");
            } else {
                return new C87823vq(num.intValue(), str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
