package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.1CK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CK {
    public final UserSession A00;
    public final C23491Cl A01;
    public final C1CL A02;

    public /* synthetic */ C1CK(UserSession userSession) {
        C1CL c1cl = new C1CL(userSession);
        Context context = AbstractC12290kX.A00;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        C23491Cl c23491Cl = new C23491Cl(context, userSession, new C1CM(applicationContext));
        this.A00 = userSession;
        this.A02 = c1cl;
        this.A01 = c23491Cl;
    }
}
