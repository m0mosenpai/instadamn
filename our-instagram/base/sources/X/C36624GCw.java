package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36624GCw implements GYB {
    public final Activity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        InterfaceC02900Bo A00 = C0BQ.A00(userSession);
        Activity activity = this.A00;
        C0BO AEY = A00.AEY(activity, null, userSession, null, true);
        if (AEY.A01) {
            AbstractC35178FfV.A00().A01(activity, AEY.A00, userSession, false);
        }
    }

    public C36624GCw(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
