package X;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

/* loaded from: classes10.dex */
public final class THL implements Closeable {
    public C5KS A00;
    public final java.net.URL A01;
    public volatile InputStream A02;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.A02;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    C62845STs.A00.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e);
                } catch (IOException e2) {
                    throw AbstractC58318PtA.A0W(e2);
                }
            }
        }
    }

    public THL(java.net.URL url) {
        this.A01 = url;
    }
}
