package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Bcn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25887Bcn extends C53432cR {
    public final Application A00;
    public final FoaUserSession A01;
    public final C28426CgY A02;
    public final C28362CfM A03;
    public final C28283CdV A04;
    public final CWR A05;
    public final InterfaceC19390xP A06;

    @Override // X.C53432cR, X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        Application application = this.A00;
        FoaUserSession foaUserSession = this.A01;
        CWR cwr = this.A05;
        return new C25812BbT(application, foaUserSession, this.A02, this.A03, this.A04, cwr, this.A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25887Bcn(Application application, FoaUserSession foaUserSession, C28426CgY c28426CgY, C28362CfM c28362CfM, C28283CdV c28283CdV, CWR cwr, InterfaceC19390xP interfaceC19390xP) {
        super(application);
        AbstractC167017dG.A1Q(application, cwr);
        AbstractC25234BEr.A0k(4, c28426CgY, c28283CdV, c28362CfM, interfaceC19390xP);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A05 = cwr;
        this.A02 = c28426CgY;
        this.A04 = c28283CdV;
        this.A03 = c28362CfM;
        this.A06 = interfaceC19390xP;
    }
}
