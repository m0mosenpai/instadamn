package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45593KGh extends AbstractC61132qb {
    public final Application A00;
    public final C12N A01;
    public final UserSession A02;
    public final KPU A03;
    public final InterfaceC16820sZ A04;

    public /* synthetic */ C45593KGh(Application application, UserSession userSession, KPU kpu) {
        C12L c12l = C12L.A00;
        MHP mhp = new MHP(userSession, 42);
        AbstractC167007dF.A1F(userSession, 1, c12l);
        this.A02 = userSession;
        this.A00 = application;
        this.A03 = kpu;
        this.A01 = c12l;
        this.A04 = mhp;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        C42221xC c42221xC = (C42221xC) this.A04.invoke();
        EnumC132075xi enumC132075xi = EnumC132075xi.A0L;
        C14360o3.A0B(userSession, 0);
        C42201xA c42201xA = C1334460n.A00(userSession, enumC132075xi).A02;
        C14360o3.A07(c42201xA);
        C42221xC A0A = c42201xA.A0K(C48392Lb7.A00).A0A();
        KPU kpu = this.A03;
        return new C44457JlP(this.A00, this.A01, c42221xC, A0A, userSession, kpu);
    }
}
