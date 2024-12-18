package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gg0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37544Gg0 extends AbstractC61132qb {
    public final int A00;
    public final Application A01;
    public final AbstractC018607g A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C37641Gha(this.A01, this.A02, this.A03, this.A04, this.A00);
    }

    public C37544Gg0(Application application, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC60442pS interfaceC60442pS, int i) {
        AbstractC167017dG.A1R(userSession, interfaceC60442pS);
        this.A01 = application;
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A00 = i;
        this.A02 = abstractC018607g;
    }
}
