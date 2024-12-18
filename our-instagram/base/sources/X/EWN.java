package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EWN extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final MSM A02;

    public EWN(Application application, UserSession userSession, MSM msm) {
        C14360o3.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = msm;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31789Dy8(this.A00, this.A01, this.A02);
    }
}
