package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import kotlin.Deprecated;

@Deprecated(message = "This class is temporary and exists for the Reels Viewer migration")
/* loaded from: classes5.dex */
public final class BKP implements InterfaceC31163Dn7 {
    public final FragmentActivity A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final C37522Gfe A03;

    public BKP(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, C37522Gfe c37522Gfe) {
        AbstractC167007dF.A1F(c37522Gfe, 3, userSession);
        this.A00 = fragmentActivity;
        this.A01 = abstractC59962oe;
        this.A03 = c37522Gfe;
        this.A02 = userSession;
    }

    @Override // X.InterfaceC31016DkF
    public final void EI3(C120985dq c120985dq, User user) {
        AbstractC167017dG.A1N(c120985dq, user);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            UserSession userSession = this.A02;
            C55772hI.A00(userSession).A08 = c38321qM.A38();
            C55772hI.A00(userSession).A09 = AbstractC25226BEj.A1G(c38321qM);
            AbstractC25234BEr.A1L(c120985dq, this.A03, userSession, user);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC31016DkF
    public final View.OnTouchListener Dbd(C120985dq c120985dq, User user, String str) {
        return ViewOnTouchListenerC25477BOq.A00;
    }
}
