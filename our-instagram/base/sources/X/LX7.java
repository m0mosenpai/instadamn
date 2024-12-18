package X;

/* loaded from: classes8.dex */
public final class LX7 implements XCI {
    public final int A00;
    public final Object A01;

    public LX7(InterfaceC71543Iw interfaceC71543Iw, int i) {
        this.A00 = i;
        this.A01 = interfaceC71543Iw;
    }

    @Override // X.XCI
    public final void onError(Throwable th) {
    }

    @Override // X.XCI
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AbstractC129685tX.A00(obj, (InterfaceC24741Ir) this.A01);
    }
}
