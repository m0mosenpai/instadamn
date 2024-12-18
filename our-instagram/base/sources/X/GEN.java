package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class GEN implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        UserSession userSession = this.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36312960645400128L)) {
            C140966Yy A0P = AbstractC31173DnH.A0P(this.A00, userSession);
            String str = "QP";
            A0P.A0A = "QP";
            FRP A00 = FVI.A00();
            String queryParameter = uri.getQueryParameter("origin");
            if (queryParameter != null) {
                str = AbstractC166997dE.A10(Locale.ROOT, queryParameter);
            }
            A0P.A0D(A00.A02(str));
            A0P.A04();
        }
    }

    public GEN(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
