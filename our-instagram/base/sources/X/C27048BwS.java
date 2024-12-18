package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;

/* renamed from: X.BwS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27048BwS extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final C28374Cfc A02;
    public final MagicModLaunchParams A03;
    public final String A04;
    public final boolean A05;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C25813BbU(application, userSession, this.A02, new CQM(userSession), this.A03, this.A04, this.A05);
    }

    public C27048BwS(Application application, UserSession userSession, C28374Cfc c28374Cfc, MagicModLaunchParams magicModLaunchParams, String str, boolean z) {
        AbstractC167017dG.A1P(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = c28374Cfc;
        this.A03 = magicModLaunchParams;
        this.A05 = z;
        this.A04 = str;
    }
}
