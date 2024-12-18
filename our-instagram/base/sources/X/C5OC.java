package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.5OC, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5OC {
    public static final boolean A00(UserSession userSession, ProductType productType, String str, int i) {
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(userSession, 0);
        if (productType != null) {
            int ordinal = productType.ordinal();
            if (ordinal != 13) {
                if (ordinal == 9) {
                    c06090Tz = C06090Tz.A05;
                    j = 36318320764524643L;
                }
            } else {
                c06090Tz = C06090Tz.A05;
                j = 36318320764459106L;
            }
            if (C18U.A06(c06090Tz, userSession, j)) {
                return true;
            }
        }
        if (i > -1) {
            if (C14360o3.A0K(str, "clips_viewer_clips_tab") && productType == ProductType.CLIPS) {
                C06090Tz c06090Tz2 = C06090Tz.A05;
                if (C18U.A06(c06090Tz2, userSession, 36318320764590180L) && i >= C18U.A01(c06090Tz2, userSession, 36599795741363841L)) {
                    return true;
                }
            }
            if (C14360o3.A0K(str, "feed_timeline") && productType == ProductType.CLIPS) {
                C06090Tz c06090Tz3 = C06090Tz.A05;
                if (C18U.A06(c06090Tz3, userSession, 36318320764721253L) && i >= C18U.A01(c06090Tz3, userSession, 36599795741494914L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
