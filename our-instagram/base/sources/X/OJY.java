package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OJY {
    public Boolean A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final UserSession A06;

    public OJY(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A01 = C05F.A00;
        this.A04 = true;
        this.A02 = "";
    }

    public final void A00() {
        boolean z;
        if (this.A00 == null) {
            UserSession userSession = this.A06;
            if (C18U.A06(C06090Tz.A05, userSession, 36324037365935955L)) {
                z = AbstractC31172DnG.A1a(AbstractC173927ok.A00(userSession).A00, "PREFERENCE_SHARE_TO_BARCELONA_AUTO_POSTING");
            } else {
                z = false;
            }
            this.A00 = Boolean.valueOf(z);
        }
    }
}
