package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Bco, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25888Bco extends C53432cR {
    public final Application A00;
    public final FoaUserSession A01;
    public final C28421CgT A02;
    public final C7H A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    @Override // X.C53432cR, X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        Application application = this.A00;
        FoaUserSession foaUserSession = this.A01;
        C7H c7h = this.A03;
        boolean z = this.A06;
        return new C25811BbS(application, foaUserSession, this.A02, c7h, this.A04, this.A05, z, this.A07);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25888Bco(Application application, FoaUserSession foaUserSession, C28421CgT c28421CgT, C7H c7h, String str, String str2, boolean z, boolean z2) {
        super(application);
        AbstractC167027dH.A13(application, foaUserSession, c7h);
        C14360o3.A0B(c28421CgT, 7);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A03 = c7h;
        this.A06 = z;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = c28421CgT;
        this.A07 = z2;
    }
}
