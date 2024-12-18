package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes6.dex */
public final class G4A implements InterfaceC165567aj {
    public final C163867Va A00;
    public final Context A01;
    public final UserSession A02;
    public final C34700FQl A03;

    public G4A(Context context, UserSession userSession, C163867Va c163867Va) {
        C14360o3.A0B(c163867Va, 3);
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = c163867Va;
        this.A03 = new C34700FQl(userSession);
    }

    @Override // X.InterfaceC165567aj
    public final void ANC(MessageIdentifier messageIdentifier) {
        C14360o3.A0B(messageIdentifier, 0);
        AbstractC31181DnP.A0u(this.A03.A00, "direct_shared_album_create_album", "direct_thread");
        EgY.A02.A00(this.A01, this.A02, new C36568GAs(2, messageIdentifier, this), false);
    }
}
