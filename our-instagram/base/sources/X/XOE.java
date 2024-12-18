package X;

import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class XOE implements InterfaceC65425Tjw {
    public YO0 A00;
    public final Object A01 = AbstractC58318PtA.A0b();
    public final Executor A02;

    @Override // X.InterfaceC65425Tjw
    public final void FG8(C5KS c5ks) {
        synchronized (this.A01) {
        }
        this.A02.execute(new XOW(this, c5ks));
    }

    public XOE(YO0 yo0, Executor executor) {
        this.A02 = executor;
        this.A00 = yo0;
    }
}
