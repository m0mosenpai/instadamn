package X;

import java.util.concurrent.Executor;

/* renamed from: X.ULv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66540ULv extends WUC {
    public final WUC A00;
    public final Executor A01;

    public C66540ULv(WUC wuc, Executor executor) {
        this.A01 = executor;
        this.A00 = wuc;
    }

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        throw C00O.createAndThrow();
    }
}
