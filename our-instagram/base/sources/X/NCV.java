package X;

import com.instagram.common.session.UserSession;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.monetization.repository.MonetizationRepository;

/* loaded from: classes9.dex */
public final class NCV extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C54780OIu A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        ODC odc = (ODC) userSession.A01(ODC.class, new C57248PbW(userSession, 34));
        C54780OIu c54780OIu = this.A02;
        AbstractC167017dG.A1N(userSession, c54780OIu);
        MediaKitRepository mediaKitRepository = (MediaKitRepository) userSession.A01(MediaKitRepository.class, C57535Pg9.A00(c54780OIu, userSession, 19));
        MonetizationRepository A00 = AbstractC63302u8.A00(userSession);
        OH7 A002 = AbstractC54051NvA.A00(userSession);
        return new C51053Mh7(this.A00, userSession, AbstractC28761aE.A00(userSession), c54780OIu, odc, A002, mediaKitRepository, A00);
    }

    public /* synthetic */ NCV(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C54780OIu A00 = Nv6.A00(userSession);
        AbstractC167017dG.A1Q(userSession, A00);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = A00;
    }
}
