package X;

import java.io.Closeable;

/* renamed from: X.0SJ, reason: invalid class name */
/* loaded from: classes.dex */
public interface C0SJ extends Closeable {
    long BP6(long j, int i, int i2);

    @Deprecated
    Object BYU(int i, int i2);

    boolean CLk(C0SJ c0sj);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getTag();

    int getType();
}
