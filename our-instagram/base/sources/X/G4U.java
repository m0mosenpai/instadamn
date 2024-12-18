package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;

/* loaded from: classes6.dex */
public final class G4U implements C7YI {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;

    @Override // X.C7YI
    public final void Cgg(ImageUrl imageUrl, MessagingUser messagingUser) {
    }

    @Override // X.C7YI
    public final void CrK(View view, MessagingUser messagingUser) {
    }

    @Override // X.C7YI
    public final void Cre(MessagingUser messagingUser, String str) {
        AbstractC167007dF.A1K(messagingUser, str);
        F3L.A00(this.A00, this.A01, this.A02, messagingUser, str, null, false, false);
    }

    public G4U(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
