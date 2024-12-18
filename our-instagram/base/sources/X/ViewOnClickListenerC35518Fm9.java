package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Fm9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35518Fm9 implements View.OnClickListener {
    public final /* synthetic */ C34963Fan A00;

    public ViewOnClickListenerC35518Fm9(C34963Fan c34963Fan) {
        this.A00 = c34963Fan;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(143785597);
        C34963Fan c34963Fan = this.A00;
        UserSession userSession = c34963Fan.A04;
        InterfaceC11380iw interfaceC11380iw = c34963Fan.A03;
        Integer num = C05F.A00;
        Reel reel = c34963Fan.A07;
        C1NB c1nb = reel.A0W;
        if (c1nb != null) {
            User CDj = c1nb.CDj();
            if (CDj != null) {
                FCG.A00(interfaceC11380iw, userSession, CDj, num, null, "story_tray");
                Integer num2 = C05F.A1I;
                C1NB c1nb2 = reel.A0W;
                if (c1nb2 != null) {
                    User CDj2 = c1nb2.CDj();
                    if (CDj2 != null) {
                        FCG.A00(interfaceC11380iw, userSession, CDj2, num2, null, "story_tray");
                        C1NB c1nb3 = reel.A0W;
                        if (c1nb3 != null) {
                            User CDj3 = c1nb3.CDj();
                            if (CDj3 != null) {
                                AbstractC35095Fd6.A02(new C31702Dw7(c34963Fan, 31), userSession, CDj3, interfaceC11380iw.getModuleName());
                                C0f9.A0C(2122655060, A05);
                                return;
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
