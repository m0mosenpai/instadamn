package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.G4x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36422G4x implements InterfaceC37161GYy {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C7U0 A03;

    @Override // X.InterfaceC37161GYy
    public final C32073E6z BXV() {
        User user = (User) AbstractC001800i.A0J(AbstractC31174DnI.A0V(this.A03).A0b);
        String str = null;
        if (user != null) {
            str = user.A03.Aab();
        }
        UserSession userSession = this.A02;
        return new C32073E6z(new ViewOnClickListenerC35619FoA(this, new C28484Chc(userSession), user, C7W8.A00(userSession), str, 1), R.drawable.instagram_user_circle_pano_outline_24, 2131968878);
    }

    @Override // X.InterfaceC37161GYy
    public final boolean isEnabled() {
        return AbstractC167007dF.A1P(AbstractC31174DnI.A0V(this.A03).A08, 1014);
    }

    public C36422G4x(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7U0 c7u0) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = c7u0;
        this.A01 = interfaceC11380iw;
    }
}
