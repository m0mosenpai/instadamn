package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Ois, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55382Ois implements View.OnClickListener {
    public final /* synthetic */ UpcomingEvent A00;
    public final /* synthetic */ OCU A01;

    public ViewOnClickListenerC55382Ois(UpcomingEvent upcomingEvent, OCU ocu) {
        this.A01 = ocu;
        this.A00 = upcomingEvent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1610309769);
        OCU ocu = this.A01;
        UpcomingEvent upcomingEvent = this.A00;
        Bundle A0b = AbstractC166987dD.A0b();
        UserSession userSession = ocu.A01;
        AbstractC31173DnH.A1C(A0b, userSession);
        A0b.putString("creation_session_id", ocu.A02);
        A0b.putParcelable("upcoming_live", upcomingEvent);
        AbstractC59962oe abstractC59962oe = ocu.A00;
        A0b.putString("prior_module_name", abstractC59962oe.getModuleName());
        C140966Yy A0C = AbstractC31175DnJ.A0C(abstractC59962oe, userSession);
        C4M5.A00();
        AbstractC31175DnJ.A0t(A0b, new N6P(), A0C);
        C0f9.A0C(-537342404, A05);
    }
}
