package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.upsells.fragment.dismissnudge.DismissNudgeRepository;

/* renamed from: X.NCx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52308NCx extends AbstractC61132qb {
    public final UserSession A00;
    public final OWU A01;
    public final C54990OTy A02;

    public C52308NCx(UserSession userSession, OWU owu, C54990OTy c54990OTy) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = owu;
        this.A02 = c54990OTy;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new AbstractC53034Nd6(new DismissNudgeRepository(this.A00, this.A01, this.A02), EnumC53124Nec.A03);
    }
}
