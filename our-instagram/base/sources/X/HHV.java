package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository;

/* loaded from: classes7.dex */
public final class HHV extends AbstractC61132qb {
    public final Bundle A00;
    public final UserSession A01;
    public final EnumC39540HdC A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        EnumC39540HdC enumC39540HdC = this.A02;
        Bundle bundle = this.A00;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, enumC39540HdC);
        if (enumC39540HdC.ordinal() == 0) {
            if (bundle != null) {
                return new C38316GtB(AbstractC25651Mw.A00(userSession), new FeaturedProductsMediaFeedRepository(userSession, AbstractC153636vY.A01(bundle, "media_id"), bundle.getString("parent_media_id"), bundle.getBoolean(AbstractC111324zv.A00(524), A1R)));
            }
            throw AbstractC166987dD.A14("FeaturedProductsMediaFeedRepository requires extra arguments");
        }
        throw AbstractC166987dD.A14("unsupported ShoppingMediaFeedEntryPoint type");
    }

    public HHV(Bundle bundle, UserSession userSession, EnumC39540HdC enumC39540HdC) {
        AbstractC167017dG.A1P(userSession, enumC39540HdC);
        this.A01 = userSession;
        this.A02 = enumC39540HdC;
        this.A00 = bundle;
    }
}
