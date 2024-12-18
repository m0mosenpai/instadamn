package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45592KGg extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final Integer A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;

    public /* synthetic */ C45592KGg(Application application, UserSession userSession, Integer num) {
        C50247MHc A01 = C50247MHc.A01(userSession, 43);
        C50247MHc A012 = C50247MHc.A01(userSession, 44);
        AbstractC167017dG.A1Q(userSession, num);
        this.A01 = userSession;
        this.A00 = application;
        this.A02 = num;
        this.A03 = A01;
        this.A04 = A012;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C42221xC c42221xC = (C42221xC) this.A04.invoke();
        Application application = this.A00;
        Integer num = this.A02;
        return new C44456JlO(application, c42221xC, userSession, (KPI) this.A03.invoke(), AbstractC46742Klz.A00(userSession, num), num);
    }
}
