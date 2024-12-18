package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;

/* renamed from: X.Wlo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70980Wlo implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        UserSession userSession = this.A01;
        if (!C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36330939378320472L)) {
            String queryParameter = uri.getQueryParameter("query");
            if (queryParameter == null) {
                queryParameter = "";
            }
            C140966Yy c140966Yy = new C140966Yy(this.A00.requireActivity(), userSession);
            U04.A00();
            c140966Yy.A0B(null, U29.A01(new Keyword(queryParameter, queryParameter), "quick_promotion", AbstractC167017dG.A0j(), queryParameter, null));
            c140966Yy.A04();
        }
    }

    public C70980Wlo(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
