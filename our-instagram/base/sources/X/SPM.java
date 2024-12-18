package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class SPM {
    public SCZ A00;
    public String A01;
    public String A02;
    public long A03;
    public final C18920wW A04;
    public final String A05;
    public final String A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;

    public SPM(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 1);
        this.A08 = userSession;
        this.A07 = interfaceC11380iw;
        this.A05 = str;
        this.A01 = str2;
        this.A06 = str3;
        this.A04 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A00(float f) {
        A01(String.valueOf((int) (f * 100.0f)));
    }

    public final void A01(String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "instagram_cnb_partial_sheet_open");
        this.A02 = str;
        if (A0f.isSampled()) {
            A0f.AAP("launch_method", this.A06);
            A0f.AAP("browser_size", this.A02);
            A0f.A9K("ad_id", AbstractC25233BEq.A0n(this.A05));
            A0f.AAP("callsite_session_id", this.A01);
            A0f.Cht();
        }
    }

    public final void A02(String str, String str2, String str3) {
        long j;
        int i;
        if (!C14360o3.A0K(this.A02, "secondary_cta")) {
            SCZ scz = this.A00;
            if (scz != null) {
                C23016ACq c23016ACq = scz.A00.A0e;
                if (c23016ACq != null) {
                    i = c23016ACq.A01;
                } else {
                    i = 0;
                }
                j = i;
            } else {
                j = 0;
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "instagram_cnb_partial_sheet_interaction");
            if (A0f.isSampled()) {
                A0f.AAP("dismiss_method", str3);
                A0f.AAP("from_size", this.A02);
                A0f.AAP("to_size", str);
                A0f.A9K("ad_id", AbstractC25233BEq.A0n(this.A05));
                A0f.AAP("callsite_session_id", this.A01);
                A0f.A9K("interaction_count", Long.valueOf(j - this.A03));
                if (C14360o3.A0K(this.A02, str) || (C14360o3.A0K(str, "anchored") && !C14360o3.A0K(this.A02, "full") && !C14360o3.A0K(this.A02, "collapsed") && !C14360o3.A0K(this.A02, "secondary_cta") && !C14360o3.A0K(this.A02, "anchored"))) {
                    str2 = "bounce";
                }
                A0f.AAP("action_type", str2);
                A0f.AAP("launch_method", this.A06);
                A0f.Cht();
            }
            this.A02 = str;
            this.A03 = j;
        }
    }
}
