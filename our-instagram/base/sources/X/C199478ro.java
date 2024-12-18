package X;

/* renamed from: X.8ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199478ro implements InterfaceC179077xJ, InterfaceC179087xK {
    public C178907x2 A00;
    public final C178747wm A01;
    public final C81F A02;

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
    }

    @Override // X.InterfaceC179077xJ
    public final int AlT() {
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final boolean CLu() {
        return true;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ InterfaceC179467xw EGc(InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt, InterfaceC179037xF interfaceC179037xF, Long l) {
        return interfaceC179467xw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, X.B4J] */
    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ void EGd(InterfaceC179037xF interfaceC179037xF, Long l) {
        try {
            ((C179027xE) interfaceC179037xF).A07.A01((InterfaceC179467xw) interfaceC179037xF.BHy(0), null);
        } catch (Throwable th) {
            ((C179027xE) interfaceC179037xF).A05.A05(new RuntimeException("MediaGraph.render() failed.", th));
        }
    }

    @Override // X.InterfaceC179077xJ
    public final void FBm(int i, int i2, int i3, boolean z, int i4, int i5) {
    }

    @Override // X.InterfaceC179077xJ
    public final void FDL(int i, Object obj) {
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ int AwF() {
        return 0;
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        this.A00 = c178907x2;
        c178907x2.A03(this.A02);
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ boolean Cbr() {
        return false;
    }

    public C199478ro(C178747wm c178747wm) {
        c178747wm = c178747wm == null ? C178747wm.A01 : c178747wm;
        this.A01 = c178747wm;
        this.A02 = new C81F(c178747wm);
    }

    public C199478ro() {
        C178747wm c178747wm = C178747wm.A01;
        this.A01 = c178747wm;
        this.A02 = new C81F(c178747wm);
    }
}
