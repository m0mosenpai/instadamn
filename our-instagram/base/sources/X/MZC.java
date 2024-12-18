package X;

import com.instagram.common.session.UserSession;
import com.instagram.nido.impl.explore.NidoExploreViewModel;

/* loaded from: classes9.dex */
public final class MZC extends AbstractC61132qb {
    public final UserSession A00;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new NidoExploreViewModel(this.A00);
    }

    public MZC(UserSession userSession) {
        this.A00 = userSession;
    }
}
