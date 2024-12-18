package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.service.OngoingCallServiceWithMic;

/* renamed from: X.OuV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56054OuV implements InterfaceC12870lZ {
    public final /* synthetic */ C3ES A00;

    public C56054OuV(C3ES c3es) {
        this.A00 = c3es;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C0f9.A0A(-877821141, C0f9.A03(-46444453));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(399917422);
        C3ES c3es = this.A00;
        if (!AbstractC167007dF.A1Z(c3es.A0B) && c3es.A02) {
            UserSession userSession = c3es.A06;
            Context context = c3es.A04;
            C51885MwT c51885MwT = (C51885MwT) MWJ.A00(context, userSession).A09.A0H.A01.getValue();
            OGW ogw = OngoingCallServiceWithMic.A05;
            boolean z = c51885MwT.A05;
            ogw.A00(context, c51885MwT.A01, c51885MwT.A03, z);
            c3es.A02 = false;
        }
        C0f9.A0A(395516840, A03);
    }
}
