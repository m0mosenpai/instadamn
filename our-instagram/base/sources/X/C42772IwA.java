package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IwA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42772IwA implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("should_hide_like_and_view_count", false);
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("accounts/set_like_and_view_counts/");
        A0c.A0J(AbstractC111324zv.A00(4567), booleanQueryParameter);
        C1ON A0Q = AbstractC31177DnL.A0Q(A0c);
        A0Q.A00 = new C39020HFw(userSession, fragmentActivity, booleanQueryParameter);
        C1GJ.A03(A0Q);
    }

    public C42772IwA(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
