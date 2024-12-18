package X;

/* loaded from: classes9.dex */
public final class PR0 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ N63 A01;

    public PR0(N63 n63, int i) {
        this.A01 = n63;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N63 n63 = this.A01;
        AbstractC31173DnH.A13(n63.getContext(), n63, this.A00);
    }
}
