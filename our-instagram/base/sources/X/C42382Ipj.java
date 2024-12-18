package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ipj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42382Ipj implements InterfaceC43071ya {
    public final C18920wW A00;
    public final UserSession A01;
    public final String A02;

    public C42382Ipj(UserSession userSession, String str, String str2) {
        this.A01 = userSession;
        this.A02 = str2;
        this.A00 = AbstractC31176DnK.A0O(userSession, str);
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String str;
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        String str2 = ((C103464lM) c59062n7.A03).A06;
        C14360o3.A07(str2);
        Integer CFq = interfaceC57162jr.CFq(c59062n7);
        Integer num = C05F.A00;
        if (CFq == num) {
            if (str2.equals("alternative_topic_nudge")) {
                UserSession userSession = this.A01;
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
                A0w.E7G("alternate_topic_nudge_last_seen_time", currentTimeMillis);
                A0w.apply();
                AbstractC41670Ic2.A02(userSession, num, AbstractC31177DnL.A06());
            }
            if (str2.equals("take_a_break_nudge")) {
                AbstractC23021Ah.A00(this.A01).A0m(AbstractC31177DnL.A06());
                return;
            }
            return;
        }
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C) {
            return;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "discover_media_chaining_alt_topic_nudge");
        AbstractC31171DnF.A1C(A0f, "vpvd_impression");
        if (str2.equals("take_a_break_nudge")) {
            num = C05F.A01;
        } else if (!str2.equals("alternative_topic_nudge")) {
            str = "Unknown";
            A0f.AAP("nudge_name", str);
            AbstractC37300Gc1.A0r(A0f, this.A02);
            A0f.A8I("dwell_time", AbstractC37302Gc3.A0S(interfaceC57162jr.B0m(c59062n7)));
            A0f.Cht();
        }
        str = IAT.A00(num);
        A0f.AAP("nudge_name", str);
        AbstractC37300Gc1.A0r(A0f, this.A02);
        A0f.A8I("dwell_time", AbstractC37302Gc3.A0S(interfaceC57162jr.B0m(c59062n7)));
        A0f.Cht();
    }
}
