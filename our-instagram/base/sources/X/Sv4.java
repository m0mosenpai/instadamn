package X;

/* loaded from: classes10.dex */
public final class Sv4 implements InterfaceC65538TmA {
    public final /* synthetic */ C07T A00;
    public final /* synthetic */ SDI A01;

    @Override // X.InterfaceC65538TmA
    public final void onStart() {
    }

    @Override // X.InterfaceC65538TmA
    public final void onStop() {
    }

    public Sv4(C07T c07t, SDI sdi) {
        this.A01 = sdi;
        this.A00 = c07t;
    }

    @Override // X.InterfaceC65538TmA
    public final void onDestroy() {
        this.A01.A00.remove(this.A00);
    }
}
