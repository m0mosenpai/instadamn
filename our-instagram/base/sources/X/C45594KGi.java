package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45594KGi extends AbstractC61132qb {
    public final Application A00;
    public final C12N A01;
    public final UserSession A02;
    public final InterfaceC58152PqH A03;
    public final Integer A04;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        C6CE.A00(userSession);
        C42221xC A00 = C43597JQd.A00(AbstractC47843LBl.A00(userSession, "EBApiProvider"), userSession, 1);
        Integer num = this.A04;
        C48519LdH A002 = AbstractC46742Klz.A00(userSession, num);
        return new C44460JlS(this.A00, this.A01, A00, userSession, AbstractC46737Klu.A00(userSession), A002, this.A03, num);
    }

    public C45594KGi(Application application, C12N c12n, UserSession userSession, InterfaceC58152PqH interfaceC58152PqH, Integer num) {
        AbstractC25234BEr.A1P(userSession, num, c12n);
        this.A02 = userSession;
        this.A04 = num;
        this.A03 = interfaceC58152PqH;
        this.A01 = c12n;
        this.A00 = application;
    }
}
