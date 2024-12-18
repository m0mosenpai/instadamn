package X;

/* loaded from: classes7.dex */
public final class HH7 extends AbstractC60592pi {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ C62832tM A01;
    public final /* synthetic */ String A02;

    public HH7(AbstractC59962oe abstractC59962oe, C62832tM c62832tM, String str) {
        this.A01 = c62832tM;
        this.A02 = str;
        this.A00 = abstractC59962oe;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A01.A07(this.A02);
        this.A00.unregisterLifecycleListener(this);
    }
}
