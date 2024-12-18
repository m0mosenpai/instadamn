package X;

/* loaded from: classes8.dex */
public final class KFC extends AbstractC60592pi {
    public final InterfaceC1119353f A00;

    public static void A00(KFC kfc) {
        InterfaceC1119353f interfaceC1119353f = kfc.A00;
        interfaceC1119353f.B8R().registerLifecycleListener(kfc);
        interfaceC1119353f.CA1().COs(new ViewOnTouchListenerC44256Jh0(1));
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        InterfaceC1119353f interfaceC1119353f = this.A00;
        interfaceC1119353f.B8R().unregisterLifecycleListener(this);
        interfaceC1119353f.CA1().COs(null);
        interfaceC1119353f.EK1();
    }

    public KFC(InterfaceC1119353f interfaceC1119353f) {
        this.A00 = interfaceC1119353f;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        A00(this);
    }
}
