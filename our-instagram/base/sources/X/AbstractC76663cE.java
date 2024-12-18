package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3cE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76663cE {
    public static final boolean A02(OnFeedMessagesIntf onFeedMessagesIntf) {
        if (3 != AbstractC76673cF.A00(onFeedMessagesIntf)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession, C38321qM c38321qM, boolean z) {
        boolean z2;
        OnFeedMessagesIntf onFeedMessagesIntf;
        OnFeedMessagesIntf onFeedMessagesIntf2;
        boolean z3;
        OnFeedMessagesIntf onFeedMessagesIntf3;
        IGCTMessagingAdsInfoDictIntf A1I = c38321qM.A1I();
        if (A1I != null) {
            z2 = C14360o3.A0K(A1I.CPO(), true);
        } else {
            z2 = false;
        }
        IGCTMessagingAdsInfoDictIntf A1I2 = c38321qM.A1I();
        OnFeedMessagesIntf onFeedMessagesIntf4 = null;
        if (A1I2 != null) {
            onFeedMessagesIntf = A1I2.BUJ();
        } else {
            onFeedMessagesIntf = null;
        }
        if (2 == AbstractC76673cF.A00(onFeedMessagesIntf) && z) {
            z3 = C18U.A06(C06090Tz.A05, userSession, 36316641432179253L);
        } else {
            IGCTMessagingAdsInfoDictIntf A1I3 = c38321qM.A1I();
            if (A1I3 != null) {
                onFeedMessagesIntf2 = A1I3.BUJ();
            } else {
                onFeedMessagesIntf2 = null;
            }
            if (2 == AbstractC76673cF.A00(onFeedMessagesIntf2) && !z) {
                z3 = C18U.A06(C06090Tz.A05, userSession, 36316641432572472L);
            } else {
                z3 = false;
            }
        }
        if (z2) {
            if (!z3) {
                IGCTMessagingAdsInfoDictIntf A1I4 = c38321qM.A1I();
                if (A1I4 != null) {
                    onFeedMessagesIntf3 = A1I4.BUJ();
                } else {
                    onFeedMessagesIntf3 = null;
                }
                if (3 != AbstractC76673cF.A00(onFeedMessagesIntf3) || !C18U.A06(C06090Tz.A05, userSession, 36316641432310326L)) {
                    IGCTMessagingAdsInfoDictIntf A1I5 = c38321qM.A1I();
                    if (A1I5 != null) {
                        onFeedMessagesIntf4 = A1I5.BUJ();
                    }
                    if (1 != AbstractC76673cF.A00(onFeedMessagesIntf4) || !C18U.A06(C06090Tz.A05, userSession, 36316641432441399L)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final String A00(OnFeedMessagesIntf onFeedMessagesIntf) {
        if (onFeedMessagesIntf == null) {
            return "";
        }
        int A00 = AbstractC76673cF.A00(onFeedMessagesIntf);
        if (A00 == 3) {
            return "INSTAGRAM";
        }
        if (A00 == 1) {
            return "MESSENGER";
        }
        if (A00 == 2) {
            return "WHATSAPP";
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O(AbstractC111324zv.A00(647), AbstractC76673cF.A00(onFeedMessagesIntf)));
    }

    public static final boolean A01(IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf, UserSession userSession) {
        Boolean CTO;
        OnFeedMessagesIntf BUJ;
        List BEf;
        if (iGCTMessagingAdsInfoDictIntf != null && (CTO = iGCTMessagingAdsInfoDictIntf.CTO()) != null && CTO.booleanValue() && (BUJ = iGCTMessagingAdsInfoDictIntf.BUJ()) != null) {
            if (2 != AbstractC76673cF.A00(BUJ) && 1 != AbstractC76673cF.A00(BUJ)) {
                if (A02(BUJ)) {
                    String BAJ = BUJ.BAJ();
                    if ((BAJ != null && BAJ.length() != 0) || (BEf = BUJ.BEf()) == null || BEf.isEmpty() || C18U.A06(C06090Tz.A05, userSession, 36317027979236116L)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
