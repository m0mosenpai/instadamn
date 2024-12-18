package X;

import com.facebook.R;
import com.instagram.api.schemas.CreatorDigestSignalInfo;
import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class C5F extends CT0 {
    public final InspirationSignalType A00;
    public final CreatorDigestSignalInfo A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5F(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC30883Dhw interfaceC30883Dhw, InterfaceC31067Dl9 interfaceC31067Dl9) {
        super(c120985dq, c37644Ghd, userSession, interfaceC30883Dhw, interfaceC31067Dl9, C05F.A01);
        CreatorDigestSignalInfo creatorDigestSignalInfo;
        InspirationSignalType inspirationSignalType;
        String str;
        String str2;
        C14360o3.A0B(userSession, 1);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            creatorDigestSignalInfo = c38321qM.A0C.Asu();
        } else {
            creatorDigestSignalInfo = null;
        }
        this.A01 = creatorDigestSignalInfo;
        if (creatorDigestSignalInfo != null) {
            inspirationSignalType = creatorDigestSignalInfo.BxI();
        } else {
            inspirationSignalType = null;
        }
        this.A00 = inspirationSignalType;
        if (creatorDigestSignalInfo != null) {
            str = creatorDigestSignalInfo.getTitle();
            str2 = creatorDigestSignalInfo.getSubtitle();
        } else {
            str = null;
            str2 = null;
        }
        C38321qM c38321qM2 = c120985dq.A02;
        boolean z = false;
        if ((c38321qM2 != null ? c38321qM2.A0C.BqH() : null) != null && C18U.A06(C06090Tz.A05, userSession, 36324999438611083L)) {
            z = true;
        }
        super.A00 = new C26007Bev(null, Integer.valueOf(R.dimen.account_discovery_bottom_gap), str, str2, null, false, !z, true);
    }
}
