package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.NDb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52312NDb extends AbstractC61132qb {
    public final int A00;
    public final Application A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final String A04;
    public final boolean A05;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A03;
        String str = this.A04;
        int i = this.A00;
        boolean z = this.A05;
        return new C50862Mdt(this.A01, this.A02, userSession, str, i, z);
    }

    public C52312NDb(Application application, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i, boolean z) {
        AbstractC167027dH.A13(userSession, application, str);
        this.A03 = userSession;
        this.A01 = application;
        this.A04 = str;
        this.A00 = i;
        this.A05 = z;
        this.A02 = interfaceC11380iw;
    }
}
