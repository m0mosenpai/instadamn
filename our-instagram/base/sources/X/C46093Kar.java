package X;

/* renamed from: X.Kar, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46093Kar extends JXK {
    public final /* synthetic */ L86 A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public C46093Kar(L86 l86, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
        this.A00 = l86;
    }

    @Override // X.JXK, X.C6C3
    public final void Dza(C4S7 c4s7) {
        this.A01.invoke();
    }

    @Override // X.JXK, X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        AbstractC25227BEk.A18(this.A00.A01, i / i2);
    }

    @Override // X.JXK, X.C6C3
    public final void onVideoStartedPlaying(C4S7 c4s7) {
        this.A02.invoke();
    }
}
