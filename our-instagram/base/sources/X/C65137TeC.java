package X;

import java.util.concurrent.Future;

/* renamed from: X.TeC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65137TeC extends C2QT {
    public final Future A00;

    @Override // X.C2QU
    public final void A05(Throwable th) {
        if (th != null) {
            this.A00.cancel(false);
        }
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return C0eB.A00;
    }

    public C65137TeC(Future future) {
        this.A00 = future;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CancelFutureOnCancel[");
        A1C.append(this.A00);
        return AbstractC58320PtC.A14(A1C);
    }
}
