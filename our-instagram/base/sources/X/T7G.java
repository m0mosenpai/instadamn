package X;

import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class T7G implements InterfaceC65425Tjw {
    public final InterfaceC65423Tju A00;
    public final C5KS A01;
    public final Executor A02;

    public T7G(InterfaceC65423Tju interfaceC65423Tju, C5KS c5ks, Executor executor) {
        this.A02 = executor;
        this.A00 = interfaceC65423Tju;
        this.A01 = c5ks;
    }

    @Override // X.InterfaceC65425Tjw
    public final void FG8(C5KS c5ks) {
        this.A02.execute(new RunnableC64647TOe(this, c5ks));
    }
}
