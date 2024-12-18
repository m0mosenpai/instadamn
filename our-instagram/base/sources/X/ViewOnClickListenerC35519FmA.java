package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.FmA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35519FmA implements View.OnClickListener {
    public final /* synthetic */ C34963Fan A00;

    public ViewOnClickListenerC35519FmA(C34963Fan c34963Fan) {
        this.A00 = c34963Fan;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        User user;
        User CDj;
        int A05 = C0f9.A05(1028124436);
        C34963Fan c34963Fan = this.A00;
        UserSession userSession = c34963Fan.A04;
        InterfaceC11380iw interfaceC11380iw = c34963Fan.A03;
        Integer num = C05F.A00;
        Reel reel = c34963Fan.A07;
        C1NB c1nb = reel.A0W;
        if (c1nb != null) {
            user = c1nb.CDj();
        } else {
            user = null;
        }
        if (user != null) {
            FCG.A00(interfaceC11380iw, userSession, user, num, null, "story_tray");
            FragmentActivity fragmentActivity = c34963Fan.A02;
            C1NB c1nb2 = reel.A0W;
            if (c1nb2 != null && (CDj = c1nb2.CDj()) != null) {
                AbstractC34859FXt.A00(fragmentActivity, interfaceC11380iw, userSession, CDj, new GIW(c34963Fan), C05F.A0C, null, "story_tray");
                C0f9.A0C(1500516239, A05);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
