package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Oic, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55371Oic implements View.OnClickListener {
    public final /* synthetic */ C56161OwT A00;

    public ViewOnClickListenerC55371Oic(C56161OwT c56161OwT) {
        this.A00 = c56161OwT;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String sessionId;
        int A05 = C0f9.A05(-1941473517);
        C50947MfG c50947MfG = this.A00.A00;
        if (c50947MfG == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        C147776l2 c147776l2 = c50947MfG.A00;
        OJ4 oj4 = c50947MfG.A01;
        C41551w4 c41551w4 = oj4.A00;
        long A06 = AbstractC50523MSb.A06(c50947MfG.A02.A07);
        if (c41551w4 != null) {
            UserSession userSession = c147776l2.A09;
            InterfaceC11380iw interfaceC11380iw = c147776l2.A00;
            if (interfaceC11380iw == null) {
                interfaceC11380iw = c147776l2.A07;
            }
            C25531Mh A0C = C25531Mh.A0C(AbstractC12220kQ.A01(interfaceC11380iw, userSession));
            Reel reel = c41551w4.A0H;
            C105824pt c105824pt = reel.A0H;
            String str2 = "";
            if (c105824pt == null) {
                str = "";
            } else {
                str = c105824pt.A0e;
                str.getClass();
            }
            A0C.A0l(str);
            A0C.A0Q("m_t", AbstractC167007dF.A0d());
            A0C.A0P("time_elapsed", AbstractC37302Gc3.A0S(A06));
            A0C.A0P("time_remaining", MSY.A0Y());
            String str3 = c147776l2.A05;
            if (str3 == null) {
                str3 = "";
            }
            A0C.A0R("tray_session_id", str3);
            C1M1 c1m1 = c147776l2.A01;
            if (c1m1 != null && (sessionId = c1m1.getSessionId()) != null) {
                str2 = sessionId;
            }
            A0C.A0R("viewer_session_id", str2);
            A0C.A0R("reel_id", reel.getId());
            A0C.A0j("live_preview_cta_click");
            A0C.A0R("reel_type", AbstractC111324zv.A00(4838));
            A0C.A0Q("a_pk", AbstractC25228BEl.A13(c147776l2.A03));
            A0C.A0Q("tray_position", AbstractC31171DnF.A0V(c41551w4.A0E));
            A0C.Cht();
        }
        oj4.A00();
        PYu.A01(c50947MfG, AbstractC141776au.A00(c50947MfG), 9);
        C0f9.A0C(-2144730181, A05);
    }
}
