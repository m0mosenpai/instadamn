package X;

/* loaded from: classes9.dex */
public final class PST implements Runnable {
    public final /* synthetic */ P0G A00;
    public final /* synthetic */ N5K A01;
    public final /* synthetic */ C189478aR A02;

    public PST(P0G p0g, N5K n5k, C189478aR c189478aR) {
        this.A02 = c189478aR;
        this.A00 = p0g;
        this.A01 = n5k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A02(this.A00.A05.requireActivity(), this.A01);
    }
}
