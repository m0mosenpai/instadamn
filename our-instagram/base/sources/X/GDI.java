package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.api.schemas.HasPasswordState;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GDI implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        User user;
        UserSession userSession = this.A01;
        AccountFamily A0H = AbstractC31176DnK.A0H(C2049995m.A01(userSession), userSession);
        if (A0H != null && (user = A0H.A01) != null && user.A03.BCL() == HasPasswordState.A04) {
            Bundle A05 = AbstractC31178DnM.A05(userSession);
            A05.putBoolean("is_interstitial", true);
            EL7 el7 = new EL7();
            el7.setArguments(A05);
            AbstractC31178DnM.A0t(null, el7, this.A00, userSession);
            return;
        }
        FQ8 fq8 = new FQ8(userSession);
        if (A0H != null && A0H.A04.size() != 0) {
            String A0g = AbstractC31171DnF.A0g(A0H.A04.get(0));
            UserSession userSession2 = fq8.A04;
            C25621Ms A0M = AbstractC31173DnH.A0M(userSession2);
            A0M.A0B("multiple_accounts/unlink_from_main_accounts/");
            A0M.A0S(C40781ul.class, C55702hA.class);
            C1GJ.A04(AbstractC31172DnG.A0T(A0M, "main_account_ids", A0g), 245);
            C95P.A00(userSession2, fq8.getClass().getName()).A01();
        }
        AbstractC25225BEi.A0r(this.A00, userSession).A0G(null, 0);
    }

    public GDI(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
