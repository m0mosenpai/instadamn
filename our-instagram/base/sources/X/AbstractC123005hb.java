package X;

import java.io.IOException;

/* renamed from: X.5hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123005hb {
    public static C206369Bt parseFromJson(C16L c16l) {
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
                if ("limit".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("control_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("limit", "NFTruncationConfig");
            } else if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("control_title", "NFTruncationConfig");
            } else {
                return new C206369Bt(num.intValue(), str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
