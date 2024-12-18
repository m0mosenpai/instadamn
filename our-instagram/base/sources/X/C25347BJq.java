package X;

/* renamed from: X.BJq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25347BJq implements InterfaceC61522rF {
    public final java.util.Set A00 = AbstractC166987dD.A1H();
    public final boolean A01;

    @Override // X.InterfaceC61522rF
    public final void A8m(InterfaceC673231x interfaceC673231x) {
        C14360o3.A0B(interfaceC673231x, 0);
        if (this.A01) {
            this.A00.add(interfaceC673231x);
        }
    }

    @Override // X.InterfaceC61522rF
    public final void EFQ(InterfaceC673231x interfaceC673231x) {
        C14360o3.A0B(interfaceC673231x, 0);
        if (this.A01) {
            this.A00.remove(interfaceC673231x);
        }
    }

    public C25347BJq(boolean z) {
        this.A01 = z;
    }
}
