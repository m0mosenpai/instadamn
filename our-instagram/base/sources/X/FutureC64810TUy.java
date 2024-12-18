package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TUy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class FutureC64810TUy implements Future {
    public static final FutureC64810TUy A01 = new FutureC64810TUy(null);
    public final Object A00;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public FutureC64810TUy(Object obj) {
        this.A00 = obj;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return get();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.A00;
    }
}
