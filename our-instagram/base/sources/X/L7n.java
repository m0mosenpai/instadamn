package X;

import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L7n {
    public final AuthenticityUploadMedium A00;
    public final UserSession A01;
    public final MQM A02;
    public final String A03;
    public final String A04;

    public final void A00() {
        EnumC40111tc enumC40111tc = EnumC40111tc.A0H;
        String A0x = AbstractC43593JPy.A0x();
        String A02 = C6WI.A02();
        C14360o3.A07(A02);
        WVG wvg = new WVG(new OVd(this.A01));
        AbstractC166987dD.A1Z(new JZ1(enumC40111tc, wvg, this, A0x, A02, null, 14), AbstractC24771Iv.A01(677, 3));
    }

    public L7n(AuthenticityUploadMedium authenticityUploadMedium, UserSession userSession, MQM mqm, String str, String str2) {
        AbstractC167017dG.A1P(userSession, str);
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = authenticityUploadMedium;
        this.A02 = mqm;
    }
}
