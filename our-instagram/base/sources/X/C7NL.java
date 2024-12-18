package X;

import java.io.Closeable;

/* renamed from: X.7NL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7NL implements Closeable {
    public final /* synthetic */ C7NK A00;

    public C7NL(C7NK c7nk) {
        this.A00 = c7nk;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.A01.writeLock().unlock();
    }
}
