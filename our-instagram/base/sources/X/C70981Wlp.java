package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;

/* renamed from: X.Wlp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70981Wlp implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        W6l.A00(uri, this.A00, this.A01, MapEntryPoint.A0D, AbstractC166997dE.A0n());
    }

    public C70981Wlp(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
