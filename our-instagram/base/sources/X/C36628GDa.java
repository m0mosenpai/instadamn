package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36628GDa implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("monetization_type");
        String A12 = AbstractC31172DnG.A12(uri);
        String queryParameter2 = uri.getQueryParameter("upl_session_id");
        C140966Yy A0r = AbstractC25225BEi.A0r(this.A00, this.A01);
        A0r.A0B(null, AbstractC53973Ntk.A00(AbstractC104314mu.A00(queryParameter), AbstractC34279F9z.A00(A12), null, queryParameter2));
        A0r.A04();
    }

    public C36628GDa(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
