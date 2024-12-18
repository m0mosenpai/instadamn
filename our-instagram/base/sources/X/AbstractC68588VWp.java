package X;

import java.io.IOException;

/* renamed from: X.VWp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68588VWp {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.6Rw, java.lang.Object] */
    public static C139156Rw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C139146Rv c139146Rv = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C139166Rx c139166Rx = null;
            C139176Ry c139176Ry = null;
            C6S4 c6s4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("move_to_action".equals(A0s)) {
                    c139146Rv = AbstractC68587VWo.parseFromJson(c16l);
                } else if ("line_to_action".equals(A0s)) {
                    c139166Rx = AbstractC68586VWn.parseFromJson(c16l);
                } else if ("close_action".equals(A0s)) {
                    c139176Ry = AbstractC68585VWm.parseFromJson(c16l);
                } else if ("add_round_rect_action".equals(A0s)) {
                    c6s4 = AbstractC68584VWl.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (c139146Rv != null) {
                obj.A03 = c139146Rv;
            }
            if (c139166Rx != null) {
                obj.A02 = c139166Rx;
            }
            if (c139176Ry != null) {
                obj.A01 = c139176Ry;
            }
            if (c6s4 != null) {
                obj.A00 = c6s4;
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
