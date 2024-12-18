package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGK extends AbstractC61132qb {
    public final UserSession A00;
    public final KPU A01;
    public final InterfaceC16820sZ A02;

    public /* synthetic */ KGK(UserSession userSession, KPU kpu) {
        MHK mhk = new MHK(userSession, 46);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = kpu;
        this.A02 = mhk;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44541Jml((C42221xC) this.A02.invoke(), this.A00, this.A01);
    }
}
