package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.81k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1810881k extends AbstractC61132qb {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03;

    public C1810881k(Context context, UserSession userSession, boolean z, boolean z2) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Context applicationContext = this.A00.getApplicationContext();
        C14360o3.A07(applicationContext);
        UserSession userSession = this.A01;
        boolean z = this.A02;
        boolean z2 = this.A03;
        C14360o3.A0B(userSession, 1);
        C1811081m c1811081m = (C1811081m) userSession.A01(C1811081m.class, new C9HT(applicationContext, userSession, 0, z, z2));
        c1811081m.A00 = z;
        c1811081m.A01 = z2;
        return new C1810981l(userSession, c1811081m);
    }
}
