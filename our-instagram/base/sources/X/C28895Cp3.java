package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Cp3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28895Cp3 implements InterfaceC52932ba {
    public final Application A00;
    public final FoaUserSession A01;
    public final C28274CdJ A02;
    public final CVW A03;
    public final EnumC27387C6q A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C28895Cp3(Application application, FoaUserSession foaUserSession, C28274CdJ c28274CdJ, CVW cvw, EnumC27387C6q enumC27387C6q, String str, boolean z, boolean z2, boolean z3) {
        AbstractC25233BEq.A0w(1, application, enumC27387C6q, str);
        C14360o3.A0B(c28274CdJ, 7);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A04 = enumC27387C6q;
        this.A05 = str;
        this.A03 = cvw;
        this.A02 = c28274CdJ;
        this.A07 = z;
        this.A06 = z2;
        this.A08 = z3;
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        Application application = this.A00;
        FoaUserSession foaUserSession = this.A01;
        EnumC27387C6q enumC27387C6q = this.A04;
        String str = this.A05;
        return new C25874BcZ(application, foaUserSession, this.A02, this.A03, enumC27387C6q, str, this.A07, this.A06, this.A08);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }
}
