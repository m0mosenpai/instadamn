package X;

import android.app.Application;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.common.session.UserSession;

/* renamed from: X.NDf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52316NDf extends AbstractC61132qb {
    public final Application A00;
    public final TrackOrOriginalSoundSchema A01;
    public final UserSession A02;
    public final EnumC39549HdL A03;
    public final String A04;
    public final String A05;

    public C52316NDf(Application application, TrackOrOriginalSoundSchema trackOrOriginalSoundSchema, UserSession userSession, EnumC39549HdL enumC39549HdL, String str, String str2) {
        C14360o3.A0B(userSession, 2);
        this.A00 = application;
        this.A02 = userSession;
        this.A05 = str;
        this.A01 = trackOrOriginalSoundSchema;
        this.A03 = enumC39549HdL;
        this.A04 = str2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        HYD hyd = (HYD) userSession.A01(HYD.class, new J8Z(userSession, 34));
        C52678NSa A00 = CK4.A00(userSession);
        return new Gt5(this.A00, this.A01, userSession, A00, this.A03, hyd, this.A05, this.A04);
    }
}
