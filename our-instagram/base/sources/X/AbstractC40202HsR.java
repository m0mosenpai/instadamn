package X;

import com.instagram.api.schemas.EntityImpl;
import com.instagram.api.schemas.Range;
import java.io.IOException;

/* renamed from: X.HsR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40202HsR {
    public static Range parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            EntityImpl entityImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("entity".equals(A0s)) {
                    entityImpl = AbstractC39908Hmv.parseFromJson(c16l);
                } else if ("length".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "offset");
                }
                c16l.A0z();
            }
            return new Range(entityImpl, num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
