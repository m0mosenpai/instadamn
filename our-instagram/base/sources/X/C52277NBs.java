package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.NBs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52277NBs extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;

    public C52277NBs(Application application, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44448JlG(this.A00, this.A01);
    }
}
