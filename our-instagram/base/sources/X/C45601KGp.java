package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45601KGp extends AbstractC61132qb {
    public final Application A00;
    public final C12N A01;
    public final UserSession A02;
    public final KPU A03;
    public final Integer A04;
    public final InterfaceC16820sZ A05;

    public /* synthetic */ C45601KGp(Application application, UserSession userSession, KPU kpu, Integer num) {
        C12L c12l = C12L.A00;
        MHP mhp = new MHP(userSession, 29);
        AbstractC167017dG.A1P(userSession, num);
        C14360o3.A0B(c12l, 5);
        this.A02 = userSession;
        this.A04 = num;
        this.A00 = application;
        this.A03 = kpu;
        this.A01 = c12l;
        this.A05 = mhp;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        KPU kpu = this.A03;
        Integer num = this.A04;
        C42221xC c42221xC = (C42221xC) this.A05.invoke();
        C48519LdH A00 = AbstractC46742Klz.A00(userSession, num);
        return new C44458JlQ(this.A00, this.A01, c42221xC, userSession, kpu, A00, num);
    }
}
