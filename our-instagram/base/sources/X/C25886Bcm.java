package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Bcm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25886Bcm extends C53432cR {
    public final Application A00;
    public final FoaUserSession A01;
    public final C28283CdV A02;
    public final CWR A03;
    public final InterfaceC16660sJ A04;
    public final InterfaceC19390xP A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25886Bcm(Application application, FoaUserSession foaUserSession, C28283CdV c28283CdV, CWR cwr, InterfaceC16660sJ interfaceC16660sJ, InterfaceC19390xP interfaceC19390xP) {
        super(application);
        AbstractC25234BEr.A0j(1, application, cwr, c28283CdV, interfaceC19390xP);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A03 = cwr;
        this.A02 = c28283CdV;
        this.A05 = interfaceC19390xP;
        this.A04 = interfaceC16660sJ;
    }

    @Override // X.C53432cR, X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        Application application = this.A00;
        FoaUserSession foaUserSession = this.A01;
        CWR cwr = this.A03;
        return new C25809BbQ(application, foaUserSession, this.A02, cwr, this.A04, this.A05);
    }
}
