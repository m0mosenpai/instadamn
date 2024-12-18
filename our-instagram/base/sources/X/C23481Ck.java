package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.1Ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23481Ck {
    public final Context A00;
    public final UserSession A01;
    public final C1CM A02;

    public C23481Ck(Context context, UserSession userSession, C1CM c1cm) {
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        this.A02 = c1cm;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A00 = applicationContext;
    }
}
