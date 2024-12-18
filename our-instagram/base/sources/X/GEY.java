package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class GEY implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final Context A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        String str;
        List list;
        C14360o3.A0B(uri, 0);
        String A12 = AbstractC31172DnG.A12(uri);
        if (A12 == null) {
            Locale locale = Locale.US;
            C14360o3.A08(locale);
            A12 = AbstractC31172DnG.A16(locale, "IGPC_BLOCKING_INTERSTITIAL");
        }
        C36783GJg c36783GJg = new C36783GJg(this, 6);
        UserSession userSession = this.A01;
        AccountFamily A0H = AbstractC31176DnK.A0H(C2049995m.A01(userSession), userSession);
        if (A0H != null && (list = A0H.A04) != null && list.get(0) != null) {
            str = AbstractC31171DnF.A0g(A0H.A04.get(0));
        } else {
            str = "";
        }
        AbstractC34215F7n.A00(userSession, A12, str);
        C35191Ffj.A00(userSession, "linking_flow_initiated", A12);
        AbstractC34213F7l.A00().A00(this.A00, userSession, c36783GJg).A04(A12);
    }

    public GEY(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        this.A02 = context;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
