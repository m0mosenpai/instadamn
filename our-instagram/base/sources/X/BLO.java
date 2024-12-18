package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BLO implements InterfaceC31022DkL, InterfaceC31044Dki {
    public InterfaceC16620sF A00;
    public InterfaceC16590sC A01;
    public C0s8 A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C37604Ggz A05;
    public final IG5 A06;
    public final /* synthetic */ C25390BLh A07 = new Object();

    @Override // X.InterfaceC31022DkL
    public final void ER9(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 0);
        this.A07.A00 = interfaceC16610sE;
    }

    @Override // X.InterfaceC31044Dki
    public final void EXJ(InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 0);
        this.A00 = interfaceC16620sF;
    }

    @Override // X.InterfaceC31044Dki
    public final void EY0(InterfaceC16590sC interfaceC16590sC) {
        C14360o3.A0B(interfaceC16590sC, 0);
        this.A01 = interfaceC16590sC;
    }

    @Override // X.InterfaceC31044Dki
    public final void EY1(C0s8 c0s8) {
        C14360o3.A0B(c0s8, 0);
        this.A02 = c0s8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BLh, java.lang.Object] */
    public BLO(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C37604Ggz c37604Ggz, IG5 ig5) {
        this.A04 = interfaceC60442pS;
        this.A03 = userSession;
        this.A05 = c37604Ggz;
        this.A06 = ig5;
    }

    @Override // X.InterfaceC31022DkL
    public final void CJZ(C120985dq c120985dq, EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG) {
        AbstractC167017dG.A1O(enumC37860GlF, enumC37861GlG);
        this.A07.CJZ(c120985dq, enumC37860GlF, enumC37861GlG);
    }
}
