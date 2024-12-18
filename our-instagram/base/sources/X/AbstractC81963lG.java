package X;

import com.instagram.api.schemas.FanClubStatusSyncInfoImpl;
import java.io.IOException;

/* renamed from: X.3lG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81963lG {
    public static FanClubStatusSyncInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Long l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("eligible_to_subscribe".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("subscribed".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if (AbstractC111324zv.A00(3189).equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("eligible_to_subscribe", "FanClubStatusSyncInfoImpl");
            } else if (bool2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("subscribed", "FanClubStatusSyncInfoImpl");
            } else {
                return new FanClubStatusSyncInfoImpl(l, bool.booleanValue(), bool2.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
