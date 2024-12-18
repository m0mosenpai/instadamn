package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.G9d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36531G9d implements InterfaceC37132GXt {
    public final int A00;

    public C36531G9d(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC37132GXt
    public final void E4C(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession) {
        switch (this.A00) {
            case 0:
                android.net.Uri A03 = AbstractC08820cl.A03(bundle.getString("uri_string"));
                String A12 = AbstractC31172DnG.A12(A03);
                String queryParameter = A03.getQueryParameter("challenge_id");
                String queryParameter2 = A03.getQueryParameter("achievement_id");
                String queryParameter3 = A03.getQueryParameter("show_earned");
                C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
                A0r.A0E(F1B.A00(Boolean.valueOf(queryParameter3), A12, queryParameter, AbstractC16960so.A1O(queryParameter2)));
                A0r.A04();
                return;
            case 1:
                Object obj = bundle.get("bloks_screen_query_uri_key");
                obj.getClass();
                VR9.A00(fragmentActivity, (android.net.Uri) obj, userSession);
                return;
            case 2:
                AbstractC35275FhA.A0C(bundle, fragmentActivity, userSession);
                return;
            case 3:
                AbstractC35275FhA.A0B(bundle, fragmentActivity, userSession);
                return;
            default:
                LH7.A01(fragmentActivity, userSession, bundle.getLong("BUNDLE_OTC_NOTIF_START_TIME", -1L), true);
                return;
        }
    }
}
