package X;

import com.instagram.common.session.UserSession;
import com.instagram.mediakit.repository.MediaKitRepository;

/* loaded from: classes9.dex */
public final class NC0 extends AbstractC61132qb {
    public final UserSession A00;
    public final InterfaceC58279PsX A01;

    public NC0(UserSession userSession, InterfaceC58279PsX interfaceC58279PsX) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = interfaceC58279PsX;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C2DS A00 = AbstractC28761aE.A00(userSession);
        InterfaceC58279PsX interfaceC58279PsX = this.A01;
        C54780OIu BOh = interfaceC58279PsX.BOh();
        AbstractC167017dG.A1N(userSession, BOh);
        return new C50978Mfl(userSession, A00, interfaceC58279PsX, (MediaKitRepository) userSession.A01(MediaKitRepository.class, C57535Pg9.A00(BOh, userSession, 19)));
    }
}
