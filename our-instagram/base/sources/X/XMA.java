package X;

import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class XMA implements InterfaceC65425Tjw {
    public YO1 A00;
    public final Object A01 = AbstractC58318PtA.A0b();
    public final Executor A02;

    public XMA(YO1 yo1, Executor executor) {
        this.A02 = executor;
        this.A00 = yo1;
    }

    @Override // X.InterfaceC65425Tjw
    public final void FG8(C5KS c5ks) {
        if (c5ks.A0F()) {
            synchronized (this.A01) {
            }
            this.A02.execute(new XMF(this, c5ks));
        }
    }
}
