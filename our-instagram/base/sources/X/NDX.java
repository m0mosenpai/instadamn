package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDX extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public NDX(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        this.A02 = str;
        this.A04 = true;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C171537kj A00 = AbstractC171517kh.A00(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        String str = this.A03;
        String str2 = this.A02;
        return new C50946MfF(A00, new OUK(interfaceC11380iw, userSession, str, str2, null), str2, this.A04);
    }
}
