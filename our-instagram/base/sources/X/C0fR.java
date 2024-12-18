package X;

import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import java.io.InputStream;

/* renamed from: X.0fR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0fR extends InputStream {
    public int A00;
    public InputStream A01;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.A01.mark(i);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.A01.reset();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.A01.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A01.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.A01.markSupported();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        ExternalProvider.MultiBufferLoggerLike A07 = externalProvider.A07();
        int i = this.A00;
        int A00 = A07.A00(6, 11, i, 0L, 0);
        try {
            return this.A01.read(bArr);
        } finally {
            externalProvider.A07().A00(6, 8, i, 0L, A00);
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.A01.skip(j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InputStreamWrapper for ");
        sb.append(this.A01);
        return sb.toString();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        ExternalProvider.MultiBufferLoggerLike A07 = externalProvider.A07();
        int i3 = this.A00;
        int A00 = A07.A00(6, 11, i3, 0L, 0);
        try {
            return this.A01.read(bArr, i, i2);
        } finally {
            externalProvider.A07().A00(6, 8, i3, 0L, A00);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        ExternalProvider externalProvider = ExternalProviders.A07;
        ExternalProvider.MultiBufferLoggerLike A07 = externalProvider.A07();
        int i = this.A00;
        int A00 = A07.A00(6, 11, i, 0L, 0);
        try {
            return this.A01.read();
        } finally {
            externalProvider.A07().A00(6, 8, i, 0L, A00);
        }
    }
}
