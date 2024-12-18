package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository;

/* renamed from: X.NDe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52315NDe extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final EnumC39589Hdz A02;
    public final OLM A03;
    public final C54990OTy A04;
    public final String A05;

    public C52315NDe(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC39589Hdz enumC39589Hdz, OLM olm, C54990OTy c54990OTy, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A05 = str;
        this.A02 = enumC39589Hdz;
        this.A03 = olm;
        this.A04 = c54990OTy;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        String str = this.A05;
        EnumC39589Hdz enumC39589Hdz = this.A02;
        OLM olm = this.A03;
        return new AbstractC53034Nd6(new RemixSettingsRepository(this.A00, userSession, enumC39589Hdz, new OWU(enumC39589Hdz, olm, EnumC72375XcB.A08, str), olm, this.A04, str), EnumC53222NgK.A04);
    }
}
