package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45602KGq extends AbstractC61132qb {
    public final Application A00;
    public final C12N A01;
    public final UserSession A02;
    public final InterfaceC58152PqH A03;
    public final Integer A04;
    public final InterfaceC16820sZ A05;

    public /* synthetic */ C45602KGq(Application application, UserSession userSession, InterfaceC58152PqH interfaceC58152PqH, Integer num) {
        C12L c12l = C12L.A00;
        MHT mht = new MHT(userSession, 39);
        AbstractC167017dG.A1Q(userSession, num);
        C14360o3.A0B(c12l, 5);
        this.A02 = userSession;
        this.A00 = application;
        this.A04 = num;
        this.A03 = interfaceC58152PqH;
        this.A01 = c12l;
        this.A05 = mht;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        C6CE.A00(userSession);
        C42221xC A00 = C43597JQd.A00(AbstractC47843LBl.A00(userSession, "EBApiProvider"), userSession, 1);
        C42221xC c42221xC = (C42221xC) this.A05.invoke();
        Application application = this.A00;
        Integer num = this.A04;
        C48519LdH A002 = AbstractC46742Klz.A00(userSession, num);
        KPI A003 = AbstractC46739Klw.A00(userSession);
        return new C44464JlW(application, this.A01, c42221xC, A00, userSession, (KPF) userSession.A01(KPF.class, C50247MHc.A01(userSession, 48)), A003, A002, this.A03, num);
    }
}
