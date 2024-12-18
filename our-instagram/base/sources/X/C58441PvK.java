package X;

import java.util.concurrent.Executor;

/* renamed from: X.PvK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58441PvK implements InterfaceC65425Tjw {
    public InterfaceC65424Tjv A00;
    public final Object A01 = AbstractC58318PtA.A0b();
    public final Executor A02;

    public C58441PvK(InterfaceC65424Tjv interfaceC65424Tjv, Executor executor) {
        this.A02 = executor;
        this.A00 = interfaceC65424Tjv;
    }

    @Override // X.InterfaceC65425Tjw
    public final void FG8(C5KS c5ks) {
        if (!c5ks.A0F() && !c5ks.A05) {
            synchronized (this.A01) {
            }
            this.A02.execute(new RunnableC64649TOg(this, c5ks));
        }
    }
}
