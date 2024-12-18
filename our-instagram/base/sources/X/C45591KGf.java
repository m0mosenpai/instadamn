package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45591KGf extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final KPU A02;
    public final Integer A03;
    public final InterfaceC16820sZ A04;

    public /* synthetic */ C45591KGf(Application application, UserSession userSession, KPU kpu, Integer num) {
        C50247MHc A01 = C50247MHc.A01(userSession, 42);
        AbstractC167017dG.A1Q(userSession, num);
        this.A01 = userSession;
        this.A00 = application;
        this.A03 = num;
        this.A02 = kpu;
        this.A04 = A01;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        Application application = this.A00;
        Integer num = this.A03;
        InterfaceC19390xP interfaceC19390xP = (InterfaceC19390xP) this.A04.invoke();
        return new C44462JlU(application, userSession, this.A02, AbstractC46742Klz.A00(userSession, num), num, interfaceC19390xP);
    }
}
