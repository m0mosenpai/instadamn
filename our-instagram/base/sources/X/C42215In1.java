package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.In1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42215In1 implements InterfaceC24551Hy {
    public boolean A00 = true;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C5R3 A02;

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DVR() {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DgK() {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    public C42215In1(UserSession userSession, C5R3 c5r3) {
        this.A01 = userSession;
        this.A02 = c5r3;
    }

    @Override // X.InterfaceC24551Hy
    public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
        C37787Gk2.A05(this.A02.A02, EnumC74603Ws.A04, true);
    }

    @Override // X.InterfaceC24551Hy
    public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        InterfaceC124295jj interfaceC124295jj = (InterfaceC124295jj) interfaceC40801un;
        C14360o3.A0B(interfaceC124295jj, 2);
        C5RA A00 = C5R9.A00(this.A01);
        if (this.A00) {
            A00.A03.clear();
        }
        C5R3 c5r3 = this.A02;
        A00.A03.addAll(C5R3.A01(interfaceC124295jj));
        this.A00 = false;
        C37787Gk2.A05(c5r3.A02, EnumC74603Ws.A05, true);
    }

    @Override // X.InterfaceC24551Hy
    public final void Dg4() {
        C5R3.A04(this.A01, this.A02);
    }
}
