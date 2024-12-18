package X;

import android.graphics.PointF;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class LFb {
    public static final LFb A00 = new Object();
    public static final C49082Ln8 A01 = new C49082Ln8(0);
    public static final C36413G4o A02 = new C36413G4o(1);

    public final void A00(FragmentActivity fragmentActivity, UserSession userSession, C32050E6c c32050E6c, InterfaceC164347Wx interfaceC164347Wx, C3o9 c3o9, String str, String str2, float f, float f2, boolean z) {
        AbstractC167007dF.A1I(interfaceC164347Wx, 6, str2);
        DirectThreadKey A012 = JRE.A01(c3o9);
        G49 g49 = new G49(c32050E6c, str, userSession.userId);
        String str3 = A012.A00;
        String str4 = A012.A01;
        C16930sl c16930sl = C16930sl.A00;
        PointF pointF = new PointF(f, f2);
        G4D g4d = new G4D(userSession, A012, str2);
        C49082Ln8 c49082Ln8 = A01;
        C36413G4o c36413G4o = A02;
        C14360o3.A0B(c16930sl, 9);
        MessageIdentifier messageIdentifier = g49.A03;
        long micros = TimeUnit.MILLISECONDS.toMicros(g49.A00);
        C2EY c2ey = g49.A02;
        List list = g49.A04;
        boolean A002 = C98Q.A00(userSession).A00(JRE.A05(c3o9), 42);
        C49086LnC c49086LnC = C49086LnC.A00;
        C49046LmY c49046LmY = C49046LmY.A00;
        C14360o3.A0C(interfaceC164347Wx, "null cannot be cast to non-null type com.instagram.direct.messagethread.environment.CanPauseThreadAutoScrolling");
        InterfaceC163877Vb interfaceC163877Vb = (InterfaceC163877Vb) interfaceC164347Wx;
        C49078Ln4 c49078Ln4 = C49078Ln4.A00;
        C7XS c7xs = (C7XS) interfaceC164347Wx;
        MG9 mg9 = MG9.A00;
        if (z) {
            boolean A1P = AbstractC167007dF.A1P(g49.A05 ? 1 : 0, 1);
            C18U.A06(C06090Tz.A05, userSession, 36316473928454562L);
            MessageActionsViewModel A003 = MessageActionsViewModel.A0a.A00(fragmentActivity, pointF, AbstractC166987dD.A0U(), null, c2ey, messageIdentifier, null, null, null, null, str3, str4, null, null, null, null, null, c16930sl, list, null, 0, 0, micros, true, false, A1P, false, z, false, false, false, A002, false, false, false, false);
            C14360o3.A0B(c49086LnC, 28);
            C14360o3.A0B(c49046LmY, 32);
            C14360o3.A0B(interfaceC163877Vb, 36);
            C14360o3.A0B(c49078Ln4, 37);
            C14360o3.A0B(c7xs, 38);
            C14360o3.A0B(mg9, 56);
            if (A003.A0X) {
                C23031Ai A004 = AbstractC23021Ah.A00(userSession);
                C14360o3.A0B(A004, 0);
                InterfaceC19630xq interfaceC19630xq = A004.A01;
                int i = interfaceC19630xq.getInt("should_show_long_press_nux_count", 0);
                if (i < 2) {
                    AbstractC167007dF.A18(interfaceC19630xq, "should_show_long_press_nux_count", i + 1);
                }
            }
            interfaceC164347Wx.E3k();
            LnU lnU = new LnU(fragmentActivity, null, userSession, null, null, null, null, null, null, null, null, g49, null, null, null, null, g4d, c49046LmY, null, null, null, null, null, null, interfaceC164347Wx, c49078Ln4, null, null, c49082Ln8, null, c49086LnC, null, null, null, null, c7xs, null, null, null, interfaceC163877Vb, null, null, c36413G4o, null, null, null, null, null, null, null, A003, null, c3o9, null, null, mg9, 0, false, interfaceC163877Vb.CXB(), false);
            KB3 A013 = KB3.A01(userSession, A003, null, c3o9, 0, false, false, false, false);
            A013.A0N(lnU);
            AbstractC10360h2 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                C14240no c14240no = new C14240no(supportFragmentManager);
                c14240no.A0C(A013, AbstractC111324zv.A00(3571), R.id.media_viewer_content_view);
                c14240no.A00();
            }
        }
    }
}
