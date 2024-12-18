package X;

/* loaded from: classes7.dex */
public final class HH5 extends AbstractC60592pi {
    public final /* synthetic */ C79973hm A00;
    public final /* synthetic */ C62832tM A01;
    public final /* synthetic */ String A02;

    public HH5(C79973hm c79973hm, C62832tM c62832tM, String str) {
        this.A01 = c62832tM;
        this.A02 = str;
        this.A00 = c79973hm;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A01.A07(this.A02);
        ((InterfaceC59992oh) this.A00.A00).unregisterLifecycleListener(this);
    }
}
