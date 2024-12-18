package X;

import com.instagram.api.schemas.AdMetadataType;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.api.schemas.SocialProofInfo;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3uY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87153uY {
    public static final C87153uY A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r4.length() <= 13) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BHS A00(com.instagram.common.session.UserSession r6, X.C38321qM r7, boolean r8) {
        /*
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r5 = 1
            X.C14360o3.A0B(r7, r5)
            com.instagram.user.model.User r0 = A01(r6, r7)
            r1 = 0
            if (r0 == 0) goto L40
            java.lang.String r4 = r0.getUsername()
            if (r8 == 0) goto L1e
            int r2 = r4.length()
            r0 = 13
            r3 = 1
            if (r2 > r0) goto L1f
        L1e:
            r3 = 0
        L1f:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = r7.A1I()
            if (r0 == 0) goto L54
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r0.BUJ()
        L29:
            int r2 = X.AbstractC76673cF.A00(r0)
            if (r2 != r5) goto L41
            r2 = 2131957326(0x7f13164e, float:1.9551233E38)
            if (r3 == 0) goto L37
            r2 = 2131957327(0x7f13164f, float:1.9551235E38)
        L37:
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            X.BHS r1 = new X.BHS
            r1.<init>(r0, r2)
        L40:
            return r1
        L41:
            r0 = 2
            if (r2 != r0) goto L4d
            r2 = 2131957329(0x7f131651, float:1.9551239E38)
            if (r3 == 0) goto L37
            r2 = 2131957330(0x7f131652, float:1.955124E38)
            goto L37
        L4d:
            r0 = 3
            if (r2 != r0) goto L40
            r2 = 2131957324(0x7f13164c, float:1.9551229E38)
            goto L37
        L54:
            r0 = r1
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87153uY.A00(com.instagram.common.session.UserSession, X.1qM, boolean):X.BHS");
    }

    public static final User A01(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        User A2E = c38321qM.A2E(userSession);
        User A2D = c38321qM.A2D();
        String str = null;
        IGCTMessagingAdsInfoDictIntf A002 = AbstractC41071vF.A00(userSession, c38321qM);
        if (A002 != null) {
            str = A002.BFQ();
        }
        if (A2D != null && AbstractC002300n.A0g(str, A2D.getId(), false)) {
            return A2D;
        }
        return A2E;
    }

    public static final String A02(C38321qM c38321qM) {
        Object obj;
        AdMetadataType adMetadataType;
        C14360o3.A0B(c38321qM, 0);
        List AZJ = c38321qM.A0C.AZJ();
        if (AZJ == null) {
            AZJ = C16930sl.A00;
        }
        boolean z = false;
        if (AZJ.isEmpty()) {
            z = true;
        }
        if (z) {
            return null;
        }
        Iterator it = AZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                InterfaceC88223wX interfaceC88223wX = (InterfaceC88223wX) obj;
                if (interfaceC88223wX != null) {
                    adMetadataType = interfaceC88223wX.CBQ();
                } else {
                    adMetadataType = null;
                }
                if (adMetadataType == AdMetadataType.A04) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC88223wX interfaceC88223wX2 = (InterfaceC88223wX) obj;
        if (interfaceC88223wX2 == null) {
            return null;
        }
        return interfaceC88223wX2.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r1 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(com.instagram.common.session.UserSession r1, X.C38321qM r2) {
        /*
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            if (r2 == 0) goto L19
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.AbstractC41071vF.A00(r1, r2)
            if (r0 == 0) goto L19
            java.lang.String r0 = r0.BFQ()
            if (r0 == 0) goto L19
            boolean r1 = X.AbstractC001900j.A0T(r0)
            r0 = 0
            if (r1 == 0) goto L1a
        L19:
            r0 = 1
        L1a:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87153uY.A03(com.instagram.common.session.UserSession, X.1qM):boolean");
    }

    public static final boolean A04(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        if (A03(userSession, c38321qM) && ((int) C18U.A01(C06090Tz.A05, userSession, 36604301161927734L)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession, C38321qM c38321qM) {
        if (A09(userSession, c38321qM) && A05(userSession, c38321qM) && ((int) C18U.A01(C06090Tz.A05, userSession, 36605581062051114L)) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean A08(UserSession userSession, C38321qM c38321qM) {
        OnFeedMessagesIntf onFeedMessagesIntf;
        IGCTMessagingAdsInfoDictIntf A002;
        IGCTMessagingAdsInfoDictIntf A003 = AbstractC41071vF.A00(userSession, c38321qM);
        if (A003 != null) {
            onFeedMessagesIntf = A003.BUJ();
        } else {
            onFeedMessagesIntf = null;
        }
        if (AbstractC76673cF.A00(onFeedMessagesIntf) == 2 && !c38321qM.A5v() && (A002 = AbstractC41071vF.A00(userSession, c38321qM)) != null && A002.BrS() != null && ((int) C18U.A01(C06090Tz.A05, userSession, 36605581062116651L)) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean A0A(UserSession userSession, C38321qM c38321qM) {
        SocialProofInfo ByW;
        Integer BXn;
        IGCTMessagingAdsInfoDictIntf A002 = AbstractC41071vF.A00(userSession, c38321qM);
        if (A002 == null || (ByW = A002.ByW()) == null || (BXn = ByW.BXn()) == null) {
            return false;
        }
        int intValue = BXn.intValue();
        if (c38321qM.A5v() || c38321qM.A5m() || AbstractC76673cF.A00(A002.BUJ()) != 3 || !c38321qM.CdW()) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        long A01 = C18U.A01(c06090Tz, userSession, 36605581062247725L);
        long A012 = C18U.A01(c06090Tz, userSession, 36605581062313262L);
        long j = intValue;
        if (j < A01 || j > A012 || ((int) C18U.A01(c06090Tz, userSession, 36605581062182188L)) <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean A0B(C38321qM c38321qM) {
        OnFeedMessagesIntf onFeedMessagesIntf;
        IGCTMessagingAdsInfoDictIntf A1I;
        if (c38321qM != null && (A1I = c38321qM.A1I()) != null) {
            onFeedMessagesIntf = A1I.BUJ();
        } else {
            onFeedMessagesIntf = null;
        }
        int A002 = AbstractC76673cF.A00(onFeedMessagesIntf);
        if (Integer.valueOf(A002) != null && 1 == A002) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession, C38321qM c38321qM) {
        if (!c38321qM.A5v()) {
            IGCTMessagingAdsInfoDictIntf A002 = AbstractC41071vF.A00(userSession, c38321qM);
            String str = null;
            if (A002 != null) {
                OnFeedMessagesIntf BUJ = A002.BUJ();
                if (BUJ != null) {
                    str = BUJ.BDG();
                }
                String BrS = A002.BrS();
                if (str != null && BrS != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A07(UserSession userSession, C38321qM c38321qM) {
        if (A09(userSession, c38321qM) && A05(userSession, c38321qM) && ((int) C18U.A01(C06090Tz.A05, userSession, 36605581062051114L)) == 2) {
            return true;
        }
        return false;
    }

    public static final boolean A09(UserSession userSession, C38321qM c38321qM) {
        OnFeedMessagesIntf onFeedMessagesIntf;
        IGCTMessagingAdsInfoDictIntf A002 = AbstractC41071vF.A00(userSession, c38321qM);
        if (A002 != null) {
            onFeedMessagesIntf = A002.BUJ();
        } else {
            onFeedMessagesIntf = null;
        }
        int A003 = AbstractC76673cF.A00(onFeedMessagesIntf);
        if (A003 != 1 && A003 != 3) {
            return false;
        }
        return true;
    }
}
