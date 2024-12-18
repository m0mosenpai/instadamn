package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36616GCo implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        AbstractC31178DnM.A0y(new C68096VAq(), this.A00, this.A01);
    }

    public C36616GCo(FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167017dG.A1P(fragmentActivity, userSession);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
