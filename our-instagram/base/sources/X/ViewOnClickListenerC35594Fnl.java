package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.Fnl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35594Fnl implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC148366m6 A02;
    public final /* synthetic */ C2EE A03;

    public ViewOnClickListenerC35594Fnl(View view, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C2EE c2ee) {
        this.A00 = view;
        this.A01 = userSession;
        this.A03 = c2ee;
        this.A02 = interfaceC148366m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1575177959);
        View view2 = this.A00;
        C14360o3.A0A(view2);
        UserSession userSession = this.A01;
        C2EE c2ee = this.A03;
        InterfaceC148366m6 interfaceC148366m6 = this.A02;
        View findViewById = view2.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            AbstractC167017dG.A0g(AbstractC166987dD.A0x(userSession), AbstractC111324zv.A00(4933)).apply();
            AbstractC34082F2k.A00(findViewById);
            interfaceC148366m6.DWL();
            String C7I = c2ee.C7I();
            if (C7I != null) {
                F8L.A00(userSession, C7I, "moderation_controls_dismissed", "impression", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
            }
        }
        C0f9.A0C(2004995575, A05);
    }
}
