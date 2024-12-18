package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BLM implements InterfaceC31022DkL, InterfaceC30981Djc {
    public InterfaceC16660sJ A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC43589JPu A03;
    public final /* synthetic */ C25390BLh A04 = new Object();

    @Override // X.InterfaceC31022DkL
    public final void ER9(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 0);
        this.A04.A00 = interfaceC16610sE;
    }

    @Override // X.InterfaceC30981Djc
    public final void EXA(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00 = interfaceC16660sJ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BLh, java.lang.Object] */
    public BLM(UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu) {
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
        this.A03 = interfaceC43589JPu;
    }

    @Override // X.InterfaceC31022DkL
    public final void CJZ(C120985dq c120985dq, EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG) {
        AbstractC167017dG.A1O(enumC37860GlF, enumC37861GlG);
        this.A04.CJZ(c120985dq, enumC37860GlF, enumC37861GlG);
    }
}
