package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36618GCq implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("url");
        if (queryParameter != null) {
            C35265Fh0.A04(this.A00, this.A01, queryParameter, "feed_qp", null);
        }
    }

    public C36618GCq(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
