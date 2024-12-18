package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36638GDk implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C36638GDk(FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167017dG.A1P(fragmentActivity, userSession);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Bundle A0C = AbstractC31177DnL.A0C(uri);
        AbstractC31173DnH.A1A(uri, A0C, "media_id");
        AbstractC35275FhA.A0B(A0C, this.A00, this.A01);
    }
}
