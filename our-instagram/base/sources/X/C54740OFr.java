package X;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OFr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54740OFr {
    public final ViewGroup A00;
    public final FragmentActivity A01;
    public final AbstractC10360h2 A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C57112jm A05;
    public final OI6 A06;
    public final C55177Odh A07;
    public final OJM A08 = new OJM();
    public final O4S A09;
    public final OWf A0A;
    public final C56139Ovz A0B;
    public final C54613OAo A0C;
    public final OJ2 A0D;
    public final C55095Ob6 A0E;
    public final InterfaceC16820sZ A0F;
    public final InterfaceC16820sZ A0G;
    public final C07X A0H;

    public C54740OFr(ViewGroup viewGroup, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, C07X c07x, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A04 = userSession;
        this.A00 = viewGroup;
        this.A01 = fragmentActivity;
        this.A02 = abstractC10360h2;
        this.A03 = interfaceC11380iw;
        this.A0F = interfaceC16820sZ;
        this.A0G = interfaceC16820sZ2;
        this.A05 = c57112jm;
        this.A0H = c07x;
        C55177Odh c55177Odh = new C55177Odh(null, null, 1);
        this.A07 = c55177Odh;
        OI6 oi6 = new OI6(userSession);
        this.A06 = oi6;
        this.A0E = new C55095Ob6(userSession, oi6);
        this.A0D = new OJ2(fragmentActivity, viewGroup, userSession, c55177Odh);
        C56139Ovz A00 = MWJ.A00(AbstractC166987dD.A0O(fragmentActivity), userSession);
        C54613OAo c54613OAo = new C54613OAo(A00.A08, A00.A04, A00.A06);
        this.A0C = c54613OAo;
        OWf oWf = c54613OAo.A02;
        C14360o3.A0C(oWf, "null cannot be cast to non-null type com.instagram.rtc.manager.RtcCallAnalyticsManager");
        this.A0A = oWf;
        this.A09 = c54613OAo.A01;
        this.A0B = MWJ.A00(AbstractC166987dD.A0O(fragmentActivity), userSession);
    }
}
