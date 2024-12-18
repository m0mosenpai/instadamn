package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bvk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27005Bvk extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25797BbE(this.A00, this.A01);
    }

    public C27005Bvk(Application application, UserSession userSession) {
        AbstractC167017dG.A1P(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
    }
}
