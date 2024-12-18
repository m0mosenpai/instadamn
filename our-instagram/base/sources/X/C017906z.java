package X;

import java.io.Writer;

/* renamed from: X.06z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C017906z extends Writer {
    public StringBuilder A00 = new StringBuilder(128);

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                StringBuilder sb = this.A00;
                if (sb.length() > 0) {
                    sb.delete(0, sb.length());
                }
            } else {
                this.A00.append(c);
            }
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StringBuilder sb = this.A00;
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        StringBuilder sb = this.A00;
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
    }
}
