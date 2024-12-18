package X;

import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* loaded from: classes9.dex */
public final class N9O extends C1P1 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ InstagramMainActivity A02;
    public final /* synthetic */ C47Z A03;

    public N9O(UserSession userSession, C38321qM c38321qM, InstagramMainActivity instagramMainActivity, C47Z c47z) {
        this.A02 = instagramMainActivity;
        this.A01 = c38321qM;
        this.A00 = userSession;
        this.A03 = c47z;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1962560499);
        C52081N2h c52081N2h = (C52081N2h) obj;
        int A032 = C0f9.A03(1762476422);
        C14360o3.A0B(c52081N2h, 0);
        if (c52081N2h.A00) {
            InstagramMainActivity instagramMainActivity = this.A02;
            if (instagramMainActivity.A0Q) {
                instagramMainActivity.A0Q = false;
                InstagramMainActivity.A0Q(this.A01, instagramMainActivity, true);
            }
            InstagramMainActivity.A0O(this.A01, this.A02);
        } else {
            UserSession userSession = this.A00;
            if (C18U.A06(C06090Tz.A05, userSession, 36312763076707582L)) {
                InstagramMainActivity.A0M(userSession, this.A02, this.A03);
            }
            InstagramMainActivity.A0O(this.A01, this.A02);
        }
        C0f9.A0A(-2133852560, A032);
        C0f9.A0A(5847380, A03);
    }
}
