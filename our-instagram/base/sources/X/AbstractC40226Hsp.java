package X;

import com.instagram.api.schemas.ScheduledLiveDiscountInfoImpl;
import java.io.IOException;

/* renamed from: X.Hsp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40226Hsp {
    public static ScheduledLiveDiscountInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("discount_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "is_auto_tagged");
                }
                c16l.A0z();
            }
            return new ScheduledLiveDiscountInfoImpl(str, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
