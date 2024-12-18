package X;

/* renamed from: X.Dp9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31287Dp9 {
    public final InterfaceC19630xq A00;

    public C31287Dp9(C1AU c1au) {
        C14360o3.A0B(c1au, 1);
        this.A00 = c1au.A03(C1AV.A1B);
    }

    public final synchronized void A00(java.util.Set set) {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7L("thread_restrict_warned_on", set);
        ARD.apply();
    }
}
