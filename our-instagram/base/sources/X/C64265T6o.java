package X;

import java.util.concurrent.Executor;

/* renamed from: X.T6o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64265T6o implements InterfaceC73609YNz, InterfaceC65424Tjv, YO1, InterfaceC65425Tjw {
    public final InterfaceC65267Tgx A00;
    public final C5KS A01;
    public final Executor A02;

    public C64265T6o(InterfaceC65267Tgx interfaceC65267Tgx, C5KS c5ks, Executor executor) {
        this.A02 = executor;
        this.A00 = interfaceC65267Tgx;
        this.A01 = c5ks;
    }

    @Override // X.InterfaceC73609YNz
    public final void D1x() {
        this.A01.A07();
    }

    @Override // X.InterfaceC65425Tjw
    public final void FG8(C5KS c5ks) {
        this.A02.execute(new RunnableC64650TOh(this, c5ks));
    }

    @Override // X.InterfaceC65424Tjv
    public final void onFailure(Exception exc) {
        this.A01.A0C(exc);
    }

    @Override // X.YO1
    public final void onSuccess(Object obj) {
        this.A01.A0D(obj);
    }
}
