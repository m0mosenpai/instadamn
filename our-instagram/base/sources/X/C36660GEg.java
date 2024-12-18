package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36660GEg implements GYB {
    public final Context A00;
    public final AbstractC018607g A01;
    public final UserSession A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("email");
        UserSession userSession = this.A02;
        Integer num = C05F.A01;
        Context context = this.A00;
        C1ON A03 = AbstractC152476ta.A03(context, userSession, num, queryParameter, null, null);
        C31702Dw7.A01(A03, this, 27);
        C1GJ.A00(context, this.A01, A03);
    }

    public C36660GEg(Context context, AbstractC018607g abstractC018607g, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = abstractC018607g;
    }
}
