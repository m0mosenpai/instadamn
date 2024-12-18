package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: X.15V, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C15V {
    public static byte[] A00(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        inputStream.getClass();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, X.VCG] */
    public static byte[] A01(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int read = inputStream.read(bArr, i3, i2);
            if (read == -1) {
                return Arrays.copyOf(bArr, i3);
            }
            i2 -= read;
        }
        int read2 = inputStream.read();
        if (read2 == -1) {
            return bArr;
        }
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(read2);
        byte[] bArr2 = new byte[4096];
        while (true) {
            int read3 = inputStream.read(bArr2);
            if (read3 == -1) {
                byte[] bArr3 = new byte[byteArrayOutputStream.size() + i];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                byteArrayOutputStream.A00(bArr3, i);
                return bArr3;
            }
            byteArrayOutputStream.write(bArr2, 0, read3);
        }
    }
}
