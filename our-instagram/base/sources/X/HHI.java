package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HHI extends AbstractC60592pi implements InterfaceC43404JFu {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C128025qW A02;
    public final java.util.Set A03 = AbstractC166987dD.A1H();
    public final AbstractC38087GpG A04;
    public final JPS A05;

    @Override // X.InterfaceC43404JFu
    public final void Dwz() {
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        String moduleName = interfaceC11380iw.getModuleName();
        AbstractC167017dG.A1P(userSession, moduleName);
        C3AX c3ax = new C3AX(userSession, null, moduleName);
        C42411xV.A00(userSession).A07(new C3AR(userSession, interfaceC11380iw.getModuleName()), c3ax, interfaceC11380iw.getModuleName());
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        C42411xV.A00(this.A01).A08(this.A00.getModuleName());
    }

    public HHI(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C128025qW c128025qW, AbstractC38087GpG abstractC38087GpG, JPS jps) {
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        this.A02 = c128025qW;
        this.A05 = jps;
        this.A04 = abstractC38087GpG;
        abstractC38087GpG.A00.add(this);
    }
}
