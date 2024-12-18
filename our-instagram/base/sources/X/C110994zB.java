package X;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

/* renamed from: X.4zB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110994zB extends AbstractC23681Dy implements BiFunction {
    public final CompletableFuture A00;

    public C110994zB(CompletableFuture completableFuture, C12W c12w) {
        super(c12w, true, true);
        this.A00 = completableFuture;
    }

    @Override // java.util.function.BiFunction
    public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        AGH(null);
        return C0eB.A00;
    }

    @Override // X.AbstractC23681Dy
    public final void A0Y(Object obj) {
        this.A00.complete(obj);
    }

    @Override // X.AbstractC23681Dy
    public final void A0Z(boolean z, Throwable th) {
        this.A00.completeExceptionally(th);
    }
}
