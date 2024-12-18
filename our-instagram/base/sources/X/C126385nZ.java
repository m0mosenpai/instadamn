package X;

import com.google.common.io.Closeables;
import java.io.InputStream;

/* renamed from: X.5nZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126385nZ implements InterfaceC26481Qd {
    public final long A00;
    public final InputStream A01;

    @Override // X.InterfaceC26481Qd
    public final void AIH() {
        Closeables.A01(this.A01);
    }

    @Override // X.InterfaceC26481Qd
    public final long AJp() {
        return this.A00;
    }

    @Override // X.InterfaceC26481Qd
    public final InputStream AjT() {
        return this.A01;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A01.close();
    }

    public C126385nZ(InputStream inputStream, long j) {
        this.A01 = inputStream;
        this.A00 = j;
    }
}
