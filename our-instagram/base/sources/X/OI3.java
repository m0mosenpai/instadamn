package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class OI3 {
    public final UserSession A00;
    public final C47Z A01;

    public OI3(UserSession userSession, C47Z c47z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c47z;
    }

    public final LinkedHashMap A00(boolean z) {
        UserSession userSession = this.A00;
        C47Z c47z = this.A01;
        C20030yX A00 = C55230Of1.A00(userSession, c47z, c47z.A3t);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        C14360o3.A0C(A00, AbstractC43591JPw.A00(48));
        A1I.put("X-Instagram-Rupload-Params", AbstractC31175DnJ.A0d(A00));
        if (z && C18U.A06(C06090Tz.A05, userSession, 36315082359049209L) && c47z.A3O != null) {
            A1I.put("x-fb-product-log", AnonymousClass001.A0j("xpv_carousel_upload_ig4a", AbstractC25231BEo.A0p(), c47z.A3t, ':', ':'));
        }
        return A1I;
    }
}
