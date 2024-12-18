package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P7J implements GYB {
    public final Context A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        Context context = this.A00;
        if (C1C0.A00(this.A01)) {
            AbstractC41776Ies.A03(context, AbstractC166987dD.A19(uri));
        }
    }

    public P7J(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
