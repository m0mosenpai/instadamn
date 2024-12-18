package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36666GEm implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;

    public C36666GEm(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(str, 3);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        AbstractC41776Ies.A09(this.A00, this.A01, C2Fb.A36, AbstractC166987dD.A19(uri), this.A02);
    }
}
