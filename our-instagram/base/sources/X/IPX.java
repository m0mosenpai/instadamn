package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public final class IPX {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.5jh, X.HBZ, X.HDf] */
    public static HBZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c124275jh = new C124275jh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("creative_tool_page_reporting_id".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else {
                    C41649Ibh.A00(c16l, c124275jh, A0s);
                }
                c16l.A0z();
            }
            return c124275jh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
