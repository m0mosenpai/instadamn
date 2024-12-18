package X;

import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class XMB implements InterfaceC65425Tjw {
    public InterfaceC73609YNz A00;
    public final Object A01 = AbstractC58318PtA.A0b();
    public final Executor A02;

    @Override // X.InterfaceC65425Tjw
    public final void FG8(C5KS c5ks) {
        if (c5ks.A05) {
            synchronized (this.A01) {
            }
            this.A02.execute(new YGT(this));
        }
    }

    public XMB(InterfaceC73609YNz interfaceC73609YNz, Executor executor) {
        this.A02 = executor;
        this.A00 = interfaceC73609YNz;
    }
}
