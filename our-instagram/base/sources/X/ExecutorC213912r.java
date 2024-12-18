package X;

import java.util.concurrent.Executor;

/* renamed from: X.12r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC213912r extends C12S implements Executor {
    public static final C12T A00;
    public static final ExecutorC213912r A01 = new C12T();

    @Override // X.C12T
    public final String toString() {
        return "Dispatchers.IO";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12T, X.12r] */
    static {
        C214012s c214012s = C214012s.A00;
        int i = AbstractC213112i.A00;
        int i2 = 64;
        if (64 < i) {
            i2 = i;
        }
        A00 = c214012s.A03((int) AbstractC213012h.A00(i2, "kotlinx.coroutines.io.parallelism", 2147483647L));
    }

    @Override // X.C12T
    public final C12T A03(int i) {
        return C214012s.A00.A03(i);
    }

    @Override // X.C12T
    public final void A04(Runnable runnable, C12W c12w) {
        A00.A04(runnable, c12w);
    }

    @Override // X.C12T
    public final void A05(Runnable runnable, C12W c12w) {
        A00.A05(runnable, c12w);
    }

    @Override // X.C12S, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        A00.A05(runnable, AnonymousClass191.A00);
    }
}
