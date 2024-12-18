package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.profilecard.data.ProfileCardRepository;
import com.instagram.profilecard.domain.ProfileCardViewModel;

/* loaded from: classes9.dex */
public final class NDV extends AbstractC61132qb {
    public final Application A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final String A03;
    public final boolean A04;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        Application application = this.A00;
        AbstractC59962oe abstractC59962oe = this.A01;
        String str = this.A03;
        AbstractC167027dH.A12(userSession, application, abstractC59962oe);
        return new ProfileCardViewModel(application, userSession, new ProfileCardRepository(application, abstractC59962oe, userSession, str), (C70803WhJ) userSession.A01(C70803WhJ.class, C57397Pdv.A00), (C23652Adl) userSession.A01(C23652Adl.class, B80.A00), this.A04);
    }

    public NDV(Application application, AbstractC59962oe abstractC59962oe, UserSession userSession, String str, boolean z) {
        AbstractC167017dG.A1P(userSession, application);
        this.A02 = userSession;
        this.A00 = application;
        this.A01 = abstractC59962oe;
        this.A03 = str;
        this.A04 = z;
    }
}
