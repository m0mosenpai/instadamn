package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.KLj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45706KLj extends AbstractRunnableC14200nk {
    public final /* synthetic */ C45325K4d A00;
    public final /* synthetic */ SettableFuture A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45706KLj(C45325K4d c45325K4d, SettableFuture settableFuture) {
        super(1891369907, 2, false, true);
        this.A00 = c45325K4d;
        this.A01 = settableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.set(this.A00.A00.A01());
    }
}
