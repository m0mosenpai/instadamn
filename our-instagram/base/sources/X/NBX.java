package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NBX extends AbstractC61132qb {
    public final UserSession A00;

    public NBX(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Bitmap.Config config;
        UserSession userSession = this.A00;
        OLC A02 = OYB.A02(userSession).A02();
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        boolean A06 = C18U.A06(A0U, userSession, 36325613619459278L);
        boolean A062 = C18U.A06(A0U, userSession, 36325613619328204L);
        long A01 = C18U.A01(A0U, userSession, 36607088595899944L);
        String A04 = C18U.A04(A0U, userSession, 36888563572540212L);
        switch (A04.hashCode()) {
            case -189895305:
                if (A04.equals("ALPHA_8")) {
                    config = Bitmap.Config.ALPHA_8;
                    break;
                }
                config = Bitmap.Config.ARGB_8888;
                break;
            case 223214739:
                if (A04.equals("ARGB_4444")) {
                    config = Bitmap.Config.ARGB_4444;
                    break;
                }
                config = Bitmap.Config.ARGB_8888;
                break;
            case 1857362722:
                if (A04.equals("RGB_565")) {
                    config = Bitmap.Config.RGB_565;
                    break;
                }
                config = Bitmap.Config.ARGB_8888;
                break;
            default:
                config = Bitmap.Config.ARGB_8888;
                break;
        }
        return new C50951MfK(config, A02, C18U.A00(A0U, userSession, 37170038549381637L), A01, A06, A062);
    }
}
