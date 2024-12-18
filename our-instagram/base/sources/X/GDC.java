package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDC implements GYB {
    public final Context A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14J A00;
        C14360o3.A0B(uri, 0);
        Context context = this.A00;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (!C63357SiE.A03(context, userSession, obj, "ExternalUrlActionHandler") && (A00 = C14J.A04.A00()) != null && A00.A00(userSession, uri.toString()) != null) {
            C12260kU.A0C(context, AbstractC31172DnG.A0l().A04(context, uri));
        }
    }

    public GDC(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
