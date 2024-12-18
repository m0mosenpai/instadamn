package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36620GCs implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        new C684436h(this.A00, this.A01).Cgk(EnumC33409Epg.DIRECT_INBOX_FILTER_QP, false, false);
    }

    public C36620GCs(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
