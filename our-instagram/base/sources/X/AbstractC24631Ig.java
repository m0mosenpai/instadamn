package X;

import com.instagram.common.session.UserSession;
import com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator;

/* renamed from: X.1Ig, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC24631Ig {
    public static final IgSignalsTtncEstimator A00(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36321765328365371L) && !C18U.A06(c06090Tz, userSession, 36321765328168761L)) {
            return null;
        }
        return (IgSignalsTtncEstimator) userSession.A01(IgSignalsTtncEstimator.class, new C9EM(userSession, 41));
    }
}
