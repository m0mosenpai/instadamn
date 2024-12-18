package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class YJ9 implements Future {
    public final InterfaceC41801wU A00;

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.A00.dispose();
        return false;
    }

    public YJ9(InterfaceC41801wU interfaceC41801wU) {
        this.A00 = interfaceC41801wU;
    }
}
