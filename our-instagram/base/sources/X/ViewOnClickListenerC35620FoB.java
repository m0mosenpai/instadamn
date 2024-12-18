package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FoB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35620FoB implements View.OnClickListener {
    public final /* synthetic */ C35164Ff6 A00;
    public final /* synthetic */ C105954q9 A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public ViewOnClickListenerC35620FoB(C35164Ff6 c35164Ff6, C105954q9 c105954q9, User user, String str, String str2, boolean z) {
        this.A02 = user;
        this.A01 = c105954q9;
        this.A00 = c35164Ff6;
        this.A05 = z;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-559757563);
        User user = this.A02;
        if (user != null && (str = this.A01.A01) != null && str.equals("appointment_booking_cta")) {
            C35164Ff6 c35164Ff6 = this.A00;
            if (this.A05) {
                UserSession userSession = c35164Ff6.A08;
                if (C18U.A06(C06090Tz.A05, userSession, 36317015094334226L)) {
                    C35157Fez c35157Fez = C35157Fez.A00;
                    Activity activity = c35164Ff6.A05;
                    AbstractC31171DnF.A1P(activity);
                    c35157Fez.A02((FragmentActivity) activity, c35164Ff6.A07, userSession, AbstractC111324zv.A00(102), userSession.userId, user.getId(), null, "composer", "");
                    C0f9.A0C(-1822892809, A05);
                }
            }
        }
        this.A00.A09.A00.A1i.A06(null, this.A04, this.A03);
        C0f9.A0C(-1822892809, A05);
    }
}
