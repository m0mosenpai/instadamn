package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P7K implements GYB {
    public final Context A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        EgZ.A04.A02(this.A00, this.A01, null, true, true);
    }

    public P7K(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
