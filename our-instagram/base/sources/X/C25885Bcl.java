package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Bcl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25885Bcl extends C53432cR {
    public final Application A00;
    public final FoaUserSession A01;
    public final C28421CgT A02;
    public final CWL A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25885Bcl(Application application, FoaUserSession foaUserSession, C28421CgT c28421CgT, CWL cwl, boolean z) {
        super(application);
        AbstractC167027dH.A0a(1, application, foaUserSession, cwl, c28421CgT);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A03 = cwl;
        this.A02 = c28421CgT;
        this.A04 = z;
    }

    @Override // X.C53432cR, X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        return new C25806BbN(this.A00, this.A01, this.A02, this.A03);
    }
}
