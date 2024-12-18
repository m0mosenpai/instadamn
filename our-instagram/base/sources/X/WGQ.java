package X;

import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class WGQ {
    public static final boolean A00(InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations, PromoteData promoteData) {
        C14360o3.A0B(instagramProfileCallToActionDestinations, 1);
        if (promoteData.A2q || instagramProfileCallToActionDestinations.ordinal() != 1) {
            return false;
        }
        Boolean A0c = AbstractC166997dE.A0c(C06090Tz.A06, promoteData.A0y, 36315249862773880L);
        C14360o3.A0A(A0c);
        return A0c.booleanValue();
    }

    public static final boolean A01(XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(userSession, 0);
        if (!z || xIGIGBoostDestination == null) {
            return false;
        }
        int ordinal = xIGIGBoostDestination.ordinal();
        if (ordinal != 12) {
            if (ordinal == 4 || ordinal != 10) {
                return false;
            }
            c06090Tz = C06090Tz.A05;
            j = 36315464611138813L;
        } else {
            c06090Tz = C06090Tz.A05;
            j = 36314760236501803L;
        }
        return AbstractC31177DnL.A1U(c06090Tz, userSession, j);
    }

    public static final boolean A02(XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        long j;
        if (!z || xIGIGBoostDestination == null) {
            return false;
        }
        int ordinal = xIGIGBoostDestination.ordinal();
        if (ordinal != 12) {
            if (ordinal == 4 || ordinal != 10) {
                return false;
            }
            c06090Tz = C06090Tz.A06;
            j = 36315464611138813L;
        } else {
            c06090Tz = C06090Tz.A06;
            j = 36314760236501803L;
        }
        return AbstractC31177DnL.A1U(c06090Tz, userSession, j);
    }

    public static final boolean A04(PromoteData promoteData) {
        BoostFlowType[] boostFlowTypeArr = {BoostFlowType.A05, BoostFlowType.A04};
        C14360o3.A0B(boostFlowTypeArr, 0);
        if (AbstractC009903n.A0K(boostFlowTypeArr).contains(promoteData.A0l) || promoteData.A0D()) {
            return false;
        }
        return AbstractC31178DnM.A1X(C06090Tz.A05, promoteData.A0y, 36326923583895752L);
    }

    public static final boolean A08(PromoteData promoteData, boolean z) {
        C06090Tz c06090Tz;
        if (promoteData.A2q || !promoteData.A1p.contains(XIGIGBoostDestination.A0G) || !C97F.A04(promoteData)) {
            return false;
        }
        UserSession userSession = promoteData.A0y;
        if (!z) {
            c06090Tz = C06090Tz.A06;
        } else {
            c06090Tz = C06090Tz.A05;
        }
        return AbstractC31178DnM.A1X(c06090Tz, userSession, 36325970101155367L);
    }

    public static final boolean A03(PromoteData promoteData) {
        int ordinal;
        XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus;
        BoostFlowType boostFlowType = promoteData.A0l;
        if (boostFlowType == null) {
            ordinal = -1;
        } else {
            ordinal = boostFlowType.ordinal();
        }
        if (ordinal != 0) {
            if ((ordinal != 2 && ordinal != 1) || (xFBCTXWelcomeMessageStatus = promoteData.A0a) == null || xFBCTXWelcomeMessageStatus == XFBCTXWelcomeMessageStatus.A07) {
                return false;
            }
            return true;
        }
        UserSession userSession = promoteData.A0y;
        C14360o3.A06(userSession);
        return AbstractC31177DnL.A1U(C06090Tz.A05, userSession, 36320708766212928L);
    }

    public static final boolean A05(PromoteData promoteData) {
        if (PromoteState.A02(promoteData) || promoteData.A0v == PromoteLaunchOrigin.A05) {
            return false;
        }
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination != XIGIGBoostDestination.A04 && xIGIGBoostDestination != XIGIGBoostDestination.A0G && xIGIGBoostDestination != XIGIGBoostDestination.A08) {
            return false;
        }
        if (!AbstractC31178DnM.A1X(C06090Tz.A05, promoteData.A0y, 36320043046281172L)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(PromoteData promoteData) {
        if (PromoteState.A02(promoteData) || promoteData.A0v == PromoteLaunchOrigin.A05 || promoteData.A0i != XIGIGBoostDestination.A0B) {
            return false;
        }
        if (!AbstractC31178DnM.A1X(C06090Tz.A05, promoteData.A0y, 36321529104967204L)) {
            return false;
        }
        return true;
    }

    public static final boolean A07(PromoteData promoteData) {
        if (PromoteState.A02(promoteData) || promoteData.A0v == PromoteLaunchOrigin.A05 || promoteData.A0i != XIGIGBoostDestination.A0E) {
            return false;
        }
        if (!AbstractC31178DnM.A1X(C06090Tz.A05, promoteData.A0y, 36321524809999907L)) {
            return false;
        }
        return true;
    }
}
