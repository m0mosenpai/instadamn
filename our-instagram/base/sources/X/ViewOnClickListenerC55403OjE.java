package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.OjE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55403OjE implements View.OnClickListener {
    public final /* synthetic */ C146076i5 A00;
    public final /* synthetic */ UpcomingEvent A01;
    public final /* synthetic */ OCU A02;

    public ViewOnClickListenerC55403OjE(C146076i5 c146076i5, UpcomingEvent upcomingEvent, OCU ocu) {
        this.A02 = ocu;
        this.A01 = upcomingEvent;
        this.A00 = c146076i5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1236278248);
        OCU ocu = this.A02;
        AbstractC59962oe abstractC59962oe = ocu.A00;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        UserSession userSession = ocu.A01;
        UpcomingEvent upcomingEvent = this.A01;
        AbstractC70058W0s.A00(requireActivity, abstractC59962oe, null, userSession, upcomingEvent);
        this.A00.A04(upcomingEvent, AbstractC41774Ieq.A04(upcomingEvent), "share_as_story", AbstractC111324zv.A00(2921));
        C0f9.A0C(100161250, A05);
    }
}
