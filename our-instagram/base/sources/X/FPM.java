package X;

/* loaded from: classes6.dex */
public final class FPM {
    public final InterfaceC19630xq A00;

    public FPM(C1AU c1au) {
        C14360o3.A0B(c1au, 1);
        this.A00 = c1au.A03(C1AV.A17);
    }

    public final synchronized void A00(java.util.Set set) {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7L("thread_blocks_warned_on", set);
        ARD.apply();
    }
}
