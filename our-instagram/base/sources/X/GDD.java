package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDD implements GYB {
    public final Context A00;
    public final UserSession A01;

    public GDD(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        FVI.A01().A01(this.A00, this.A01, C05F.A0N, C37070GVf.A00);
    }
}
