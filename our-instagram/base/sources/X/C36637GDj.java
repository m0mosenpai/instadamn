package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36637GDj implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        AbstractC31178DnM.A0y(new RecentAdActivityFragment(), this.A00, this.A01);
    }

    public C36637GDj(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
