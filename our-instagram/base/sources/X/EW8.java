package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.gifting.FanClubGiftingApi;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel;

/* loaded from: classes6.dex */
public final class EW8 extends AbstractC61132qb {
    public final Context A00;
    public final UserSession A01;

    public EW8(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        FanClubGiftingApi fanClubGiftingApi = new FanClubGiftingApi(userSession, AbstractC40691uc.A01(userSession));
        Context context = this.A00;
        AbstractC167017dG.A1N(userSession, context);
        return new FanClubGiftingViewModel((C48511Ld7) userSession.A01(C48511Ld7.class, new C50171MDy(25, context, userSession)), fanClubGiftingApi);
    }
}
