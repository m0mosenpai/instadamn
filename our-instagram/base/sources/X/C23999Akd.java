package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Akd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23999Akd implements GYB {
    public final Activity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        AbstractC23115AHe.A00(this.A00, C22P.A24, userSession);
    }

    public C23999Akd(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
