package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class C5G extends CT0 {
    public final C38321qM A00;
    public final InterfaceC31009Dk8 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final C40031tU A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5G(C120985dq c120985dq, UserSession userSession, InterfaceC31009Dk8 interfaceC31009Dk8) {
        super(c120985dq, null, userSession, null, null, C05F.A00);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        AbstractC167007dF.A1E(userSession, 1, interfaceC31009Dk8);
        String str8 = null;
        C40031tU c40031tU = null;
        this.A01 = interfaceC31009Dk8;
        C38321qM c38321qM = c120985dq.A02;
        this.A00 = c38321qM;
        c40031tU = c38321qM != null ? c38321qM.A0c : c40031tU;
        this.A08 = c40031tU;
        if (c40031tU != null) {
            str = c40031tU.A01;
        } else {
            str = null;
        }
        this.A03 = str;
        if (c40031tU != null) {
            str2 = c40031tU.A06;
        } else {
            str2 = null;
        }
        this.A06 = str2;
        if (c40031tU != null) {
            str3 = c40031tU.A05;
        } else {
            str3 = null;
        }
        this.A05 = str3;
        if (c40031tU != null) {
            str4 = c40031tU.A00;
        } else {
            str4 = null;
        }
        this.A02 = str4;
        if (c40031tU != null) {
            str5 = c40031tU.A03;
        } else {
            str5 = null;
        }
        this.A04 = str5;
        if (c40031tU != null) {
            str6 = c40031tU.A07;
        } else {
            str6 = null;
        }
        this.A07 = str6;
        if (c40031tU != null) {
            str7 = c40031tU.A04;
            str8 = c40031tU.A02;
        } else {
            str7 = null;
        }
        super.A00 = new C26007Bev(Integer.valueOf(R.dimen.account_discovery_bottom_gap), null, str6, str7, str8, true, false, false);
    }
}
