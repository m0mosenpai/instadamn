package X;

import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import java.io.OutputStream;

/* renamed from: X.0fU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0fU extends OutputStream {
    public int A00;
    public OutputStream A01;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A01.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.A01.flush();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OutpuStreamWrapper for ");
        sb.append(this.A01);
        return sb.toString();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        ExternalProvider.MultiBufferLoggerLike A07 = externalProvider.A07();
        int i2 = this.A00;
        int A00 = A07.A00(6, 11, i2, 0L, 0);
        try {
            this.A01.write(i);
        } finally {
            externalProvider.A07().A00(6, 8, i2, 0L, A00);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        ExternalProvider.MultiBufferLoggerLike A07 = externalProvider.A07();
        int i3 = this.A00;
        int A00 = A07.A00(6, 11, i3, 0L, 0);
        try {
            this.A01.write(bArr, i, i2);
        } finally {
            externalProvider.A07().A00(6, 8, i3, 0L, A00);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        ExternalProvider.MultiBufferLoggerLike A07 = externalProvider.A07();
        int i = this.A00;
        int A00 = A07.A00(6, 11, i, 0L, 0);
        try {
            this.A01.write(bArr);
        } finally {
            externalProvider.A07().A00(6, 8, i, 0L, A00);
        }
    }
}
