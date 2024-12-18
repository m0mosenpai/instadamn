package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;

/* loaded from: classes6.dex */
public final class G4T implements C7YI {
    public final /* synthetic */ EOJ A00;

    @Override // X.C7YI
    public final void Cgg(ImageUrl imageUrl, MessagingUser messagingUser) {
    }

    @Override // X.C7YI
    public final void CrK(View view, MessagingUser messagingUser) {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0iw, java.lang.Object] */
    @Override // X.C7YI
    public final void Cre(MessagingUser messagingUser, String str) {
        AbstractC167007dF.A1K(messagingUser, str);
        EOJ eoj = this.A00;
        F3L.A00(eoj.requireActivity(), new Object(), AbstractC166987dD.A0r(eoj.A0S), messagingUser, str, null, false, false);
    }

    public G4T(EOJ eoj) {
        this.A00 = eoj;
    }
}
