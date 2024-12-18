package X;

import java.io.Closeable;

/* renamed from: X.3QA, reason: invalid class name */
/* loaded from: classes2.dex */
public interface C3QA extends Closeable, C3QB, C3QD {
    C3QB BGj();

    C3QQ BjM();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    int getSizeInBytes();

    int getWidth();

    boolean isClosed();
}
