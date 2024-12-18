package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;

/* renamed from: X.OjQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55415OjQ implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C146076i5 A01;
    public final /* synthetic */ UpcomingEvent A02;
    public final /* synthetic */ User A03;

    public ViewOnClickListenerC55415OjQ(Context context, C146076i5 c146076i5, UpcomingEvent upcomingEvent, User user) {
        this.A00 = context;
        this.A03 = user;
        this.A02 = upcomingEvent;
        this.A01 = c146076i5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-986464403);
        Intent A04 = AbstractC31171DnF.A04();
        Intent action = A04.setAction("android.intent.action.SEND");
        Context context = this.A00;
        String username = this.A03.getUsername();
        UpcomingEvent upcomingEvent = this.A02;
        String id = upcomingEvent.getId();
        Uri.Builder buildUpon = AbstractC08820cl.A03(AnonymousClass001.A0R(AbstractC43591JPw.A00(383), username)).buildUpon();
        if (id == null) {
            id = "";
        }
        action.putExtra("android.intent.extra.TEXT", AbstractC167007dF.A0f(context, AbstractC31174DnI.A0B(buildUpon, "upcoming_event_id", id), 2131965535)).setType("text/plain");
        C12260kU.A00(context, Intent.createChooser(A04, null));
        this.A01.A04(upcomingEvent, AbstractC41774Ieq.A04(upcomingEvent), "share_link", AbstractC111324zv.A00(2921));
        C0f9.A0C(860472538, A05);
    }
}
