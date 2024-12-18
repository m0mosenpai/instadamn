package X;

import com.instagram.common.session.UserSession;
import com.instagram.mediakit.repository.MediaKitRepository;

/* loaded from: classes9.dex */
public final class NCU extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final EnumC53194Nfq A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C54780OIu A00 = Nv6.A00(userSession);
        OEV A01 = OPO.A01(userSession);
        AbstractC167017dG.A1N(userSession, A00);
        MediaKitRepository mediaKitRepository = (MediaKitRepository) userSession.A01(MediaKitRepository.class, C57535Pg9.A00(A00, userSession, 19));
        return new C51052Mh6(this.A00, A00, this.A02, mediaKitRepository, A01);
    }

    public NCU(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC53194Nfq enumC53194Nfq) {
        AbstractC167017dG.A1P(userSession, enumC53194Nfq);
        this.A01 = userSession;
        this.A02 = enumC53194Nfq;
        this.A00 = interfaceC11380iw;
    }
}
