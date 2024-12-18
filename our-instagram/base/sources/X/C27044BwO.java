package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.BwO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27044BwO extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final String A03;
    public final String A04;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44463JlV(this.A00, this.A01, this.A02, this.A03, this.A04);
    }

    public C27044BwO(Application application, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        AbstractC167017dG.A1P(userSession, interfaceC60442pS);
        C14360o3.A0B(application, 5);
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = application;
    }
}
