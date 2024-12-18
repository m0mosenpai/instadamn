package X;

import android.app.Activity;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;

/* renamed from: X.Fch, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35070Fch {
    public static final long A00(UserSession userSession, C38321qM c38321qM) {
        IGCTMessagingAdsInfoDictIntf A00;
        OnFeedMessagesIntf BUJ;
        C14360o3.A0B(userSession, 0);
        if (c38321qM == null || (A00 = AbstractC41071vF.A00(userSession, c38321qM)) == null || (BUJ = A00.BUJ()) == null || A02(userSession, c38321qM) || AbstractC31177DnL.A1b(BUJ.BvT())) {
            return 0L;
        }
        return C18U.A01(C06090Tz.A05, userSession, 36605108615648473L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (X.AbstractC166997dE.A1Z(r0.CXJ(), true) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(com.instagram.common.session.UserSession r3, X.C38321qM r4) {
        /*
            r2 = 0
            r1 = 1
            X.1w7 r0 = X.AbstractC41561w6.A00(r3)
            X.1v4 r0 = r0.A00(r4)
            if (r0 == 0) goto L1b
            X.1s8 r0 = r0.A0A
        Le:
            if (r0 == 0) goto L28
            java.lang.Boolean r0 = r0.CXJ()
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r1)
            if (r0 == 0) goto L28
        L1a:
            return r1
        L1b:
            X.1rF r0 = r4.A0C
            X.1sb r0 = r0.getInjected()
            if (r0 == 0) goto L28
            X.1s8 r0 = r0.Ann()
            goto Le
        L28:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.AbstractC41071vF.A00(r3, r4)
            r1 = 0
            if (r0 != 0) goto L30
            return r2
        L30:
            java.lang.Boolean r0 = r0.BvD()
            if (r0 == 0) goto L1a
            boolean r1 = r0.booleanValue()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35070Fch.A02(com.instagram.common.session.UserSession, X.1qM):boolean");
    }

    public static final boolean A01(Activity activity, UserSession userSession, C38321qM c38321qM, User user, Integer num, String str) {
        boolean A1a = AbstractC31175DnJ.A1a(activity);
        if (!A02(userSession, c38321qM)) {
            return false;
        }
        C36881nl A01 = C36881nl.A01(activity, AbstractC31171DnF.A0D("INSTAGRAM"), userSession, String.valueOf("feed_ufi"));
        ImageUrl imageUrl = PendingRecipient.A0g;
        C14360o3.A0A(user);
        AbstractC31179DnN.A1Q(A01, user);
        A01.A06();
        C2DS A00 = AbstractC28761aE.A00(userSession);
        C14360o3.A0A(user);
        C81663kb BZR = A00.BZR(null, null, null, AbstractC31177DnL.A0j(user));
        C7NF A002 = C7ND.A00(userSession);
        A002.A01();
        if (str == null) {
            str = "";
        }
        A002.A01 = str;
        A002.A03 = user.getId();
        String C7I = BZR.C7I();
        String str2 = "";
        if (C7I == null) {
            C7I = "";
        }
        A002.A04 = C7I;
        String C7q = BZR.C7q();
        if (C7q != null) {
            str2 = C7q;
        }
        A002.A05 = str2;
        A002.A00 = AbstractC167017dG.A0K(num);
        return A1a;
    }
}
