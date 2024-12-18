package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.settings.language.ContentLanguageSettingsApi;
import com.instagram.settings.language.ContentLanguageSettingsRepository;

/* loaded from: classes6.dex */
public final class EWG extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;

    public EWG(Application application, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C50859Mdq(application, new ContentLanguageSettingsRepository(application, userSession, new ContentLanguageSettingsApi(userSession)), C1Q2.A03());
    }
}
