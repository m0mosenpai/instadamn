package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;

/* renamed from: X.9y7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225889y7 {
    public static final boolean A00(UserSession userSession, EnumC76383bi enumC76383bi, ProductType productType, User user, boolean z, boolean z2) {
        C06090Tz c06090Tz;
        long j;
        if (!z || z2 || !C2TN.A06(user) || enumC76383bi != EnumC76383bi.A06) {
            return false;
        }
        if (productType == ProductType.CLIPS) {
            c06090Tz = C06090Tz.A05;
            j = 36326575691544548L;
        } else {
            if (productType != ProductType.FEED && productType != ProductType.FEED_CAROUSEL) {
                return false;
            }
            c06090Tz = C06090Tz.A05;
            j = 36326575691610085L;
        }
        boolean A06 = C18U.A06(c06090Tz, userSession, j);
        C14360o3.A0A(Boolean.valueOf(A06));
        return A06;
    }
}
