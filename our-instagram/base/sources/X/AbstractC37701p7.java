package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: X.1p7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37701p7 {
    public static final OutputStream A00 = new OutputStream() { // from class: X.1p9
        public final String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int b) {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] b) {
            b.getClass();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] b, int off, int len) {
            b.getClass();
            C18C.A03(off, len + off, b.length);
        }
    };

    public static void A00(InputStream from, OutputStream to) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = from.read(bArr);
            if (read == -1) {
                return;
            } else {
                to.write(bArr, 0, read);
            }
        }
    }

    public static byte[] A01(InputStream in, Queue bufs, int totalLen) {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(totalLen) * 2));
        while (totalLen < 2147483639) {
            int min2 = Math.min(min, 2147483639 - totalLen);
            byte[] bArr = new byte[min2];
            bufs.add(bArr);
            int i = 0;
            while (i < min2) {
                int read = in.read(bArr, i, min2 - i);
                if (read == -1) {
                    return A02(bufs, totalLen);
                }
                i += read;
                totalLen += read;
            }
            int i2 = 2;
            if (min < 4096) {
                i2 = 4;
            }
            min = AbstractC38301qK.A02(min * i2);
        }
        if (in.read() == -1) {
            return A02(bufs, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static byte[] A02(Queue bufs, int totalLen) {
        if (bufs.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) bufs.remove();
        int length = bArr.length;
        if (length == totalLen) {
            return bArr;
        }
        int i = totalLen - length;
        byte[] copyOf = Arrays.copyOf(bArr, totalLen);
        while (i > 0) {
            byte[] bArr2 = (byte[]) bufs.remove();
            int min = Math.min(i, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, totalLen - i, min);
            i -= min;
        }
        return copyOf;
    }
}
