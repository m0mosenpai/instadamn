package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.G4y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36423G4y implements InterfaceC37161GYy {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C7U0 A03;

    @Override // X.InterfaceC37161GYy
    public final C32073E6z BXV() {
        User user = (User) AbstractC001800i.A0J(AbstractC31174DnI.A0V(this.A03).A0b);
        String str = null;
        if (user != null) {
            str = user.A03.Aae();
        }
        UserSession userSession = this.A02;
        return new C32073E6z(new ViewOnClickListenerC35673Fp8(new C28484Chc(userSession), this, C7W8.A00(userSession), str, 4), R.drawable.instagram_direct_pano_outline_24, 2131968876);
    }

    @Override // X.InterfaceC37161GYy
    public final boolean isEnabled() {
        IGAIAgentVisibilityStatus iGAIAgentVisibilityStatus;
        C7TT A0V = AbstractC31174DnI.A0V(this.A03);
        List list = A0V.A0b;
        if (list.size() != 1) {
            return false;
        }
        UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 36330376737604430L)) {
            return false;
        }
        int i = A0V.A08;
        if (i == 1012) {
            return AbstractC31268Doq.A06(userSession);
        }
        if (i != 1014) {
            return false;
        }
        User user = (User) AbstractC001800i.A0J(list);
        if (user != null) {
            iGAIAgentVisibilityStatus = user.A03.Aai();
        } else {
            iGAIAgentVisibilityStatus = null;
        }
        if (iGAIAgentVisibilityStatus == IGAIAgentVisibilityStatus.A05 && AbstractC31268Doq.A06(userSession)) {
            return true;
        }
        return false;
    }

    public C36423G4y(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7U0 c7u0) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = c7u0;
        this.A01 = interfaceC11380iw;
    }
}
