package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;

/* renamed from: X.86V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86V extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;

    public C86V(Application application, UserSession userSession) {
        C14360o3.A0B(application, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00;
        Context applicationContext = application.getApplicationContext();
        C14360o3.A07(applicationContext);
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 1);
        return new ClipsAssetHubViewModel(application, C2Ps.A00(applicationContext, userSession));
    }
}
