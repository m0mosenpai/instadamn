package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDT extends AbstractC61132qb {
    public final UserSession A00;
    public final C55622On7 A01;
    public final NNE A02;
    public final C23031Ai A03;
    public final InterfaceC16820sZ A04;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C23031Ai c23031Ai = this.A03;
        return new C50990Mfx(userSession, this.A01, this.A02, c23031Ai, this.A04);
    }

    public NDT(UserSession userSession, C55622On7 c55622On7, NNE nne, C23031Ai c23031Ai, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167027dH.A13(userSession, c23031Ai, nne);
        this.A00 = userSession;
        this.A03 = c23031Ai;
        this.A02 = nne;
        this.A01 = c55622On7;
        this.A04 = interfaceC16820sZ;
    }
}
