package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.LvD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49559LvD implements GYB {
    public final Context A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        C44093JeI c44093JeI = new C44093JeI(context, 23);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("users/turn_off_message_requests/");
        C1ON A0e = AbstractC25227BEk.A0e(A0c, C52097N2x.class, OQ7.class);
        A0e.A00 = c44093JeI;
        C1GJ.A04(A0e, 1206419101);
    }

    public C49559LvD(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
