package X;

import android.content.Context;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.monetization.repository.MonetizationRepository;

/* loaded from: classes9.dex */
public final class NCP extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public NCP(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Context context = this.A00;
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        BrandedContentSettingsRepository A00 = AbstractC46657Kka.A00(userSession);
        MonetizationRepository A002 = AbstractC63302u8.A00(userSession);
        C54780OIu A003 = Nv6.A00(userSession);
        A003.A00(MediaKitEntryPoint.A03);
        AbstractC167017dG.A1N(userSession, A003);
        return new C44548Jms(context, A00, interfaceC11380iw, userSession, (MediaKitRepository) userSession.A01(MediaKitRepository.class, C57535Pg9.A00(A003, userSession, 19)), A002, C1AT.A01(userSession));
    }
}
