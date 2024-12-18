package X;

/* renamed from: X.T1m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64160T1m implements InterfaceC65500TlP {
    public final EnumC61137Rfr A00;
    public final /* synthetic */ C63196Sey A01;

    public C64160T1m(EnumC61137Rfr enumC61137Rfr, C63196Sey c63196Sey) {
        this.A01 = c63196Sey;
        this.A00 = enumC61137Rfr;
    }

    @Override // X.InterfaceC65500TlP
    public final void DBk() {
        C63196Sey c63196Sey = this.A01;
        Object obj = c63196Sey.A06.get();
        if (c63196Sey.A00 != null && obj != null) {
            synchronized (c63196Sey) {
                c63196Sey.A08.put(this.A00, EnumC61113RfT.A03);
                C63196Sey.A01(c63196Sey);
            }
        }
    }

    @Override // X.InterfaceC65500TlP
    public final /* bridge */ /* synthetic */ void DBm(Object obj) {
        C63196Sey c63196Sey = this.A01;
        synchronized (c63196Sey) {
            c63196Sey.A08.put(this.A00, EnumC61113RfT.A02);
            C63196Sey.A00(c63196Sey);
        }
    }
}
