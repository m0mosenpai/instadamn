package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class OEM {
    public String A00;
    public final C51739MtM A01;
    public final InterfaceC41501vz A02;
    public final UserSession A03;
    public final List A04;
    public final C05A A05;
    public final C05A A06;

    public /* synthetic */ OEM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        C01L A1I = C0eM.A1I();
        for (EnumC53223NgL enumC53223NgL : EnumC53223NgL.values()) {
            if ((enumC53223NgL != EnumC53223NgL.A05 || AbstractC166997dE.A0Y(userSession).A1a()) && ((enumC53223NgL != EnumC53223NgL.A03 || (AbstractC166997dE.A0Y(userSession).A2I() && C18U.A06(C06090Tz.A05, userSession, 36315911287934660L))) && enumC53223NgL != EnumC53223NgL.A06)) {
                A1I.add(AbstractC53920Nst.A00(userSession, enumC53223NgL));
            }
        }
        C01L A1J = C0eM.A1J(A1I);
        this.A04 = A1J;
        C51739MtM A00 = AbstractC53920Nst.A00(userSession, EnumC53223NgL.A04);
        this.A01 = A00;
        this.A00 = AbstractC54949ORz.A00;
        this.A02 = C56035Ou7.A00(this, 25);
        this.A06 = C10E.A00(A00);
        this.A05 = C10E.A00(A1J);
        AbstractC25651Mw.A00(this.A03).A01(this.A02, C56008Otf.class);
    }
}
