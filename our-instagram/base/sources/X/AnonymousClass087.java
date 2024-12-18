package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.087, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass087 {
    public static byte[] A04(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static void A01(OutputStream outputStream, int i, long j) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static byte[] A02(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new IllegalStateException(AnonymousClass001.A0O("Not enough bytes to read: ", i));
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r2.finished() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] A03(java.io.InputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>()
            byte[] r7 = new byte[r10]     // Catch: java.lang.Throwable -> L6a
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r0]     // Catch: java.lang.Throwable -> L6a
            r5 = 0
            r4 = 0
            r3 = 0
        Le:
            boolean r0 = r2.finished()     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L3e
            boolean r0 = r2.needsDictionary()     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L3e
            if (r4 >= r9) goto L3e
            int r1 = r8.read(r6)     // Catch: java.lang.Throwable -> L6a
            if (r1 < 0) goto L30
            r2.setInput(r6, r5, r1)     // Catch: java.lang.Throwable -> L6a
            int r0 = r10 - r3
            int r0 = r2.inflate(r7, r3, r0)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L6a
            int r3 = r3 + r0
            int r4 = r4 + r1
            goto Le
        L2e:
            r0 = move-exception
            goto L60
        L30:
            java.lang.String r1 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            java.lang.String r0 = " bytes"
            java.lang.String r0 = X.AnonymousClass001.A0c(r1, r0, r9)     // Catch: java.lang.Throwable -> L6a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            goto L69
        L3e:
            if (r4 != r9) goto L52
            boolean r0 = r2.finished()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L4a
            r2.end()
            return r7
        L4a:
            java.lang.String r0 = "Inflater did not finish"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            goto L69
        L52:
            java.lang.String r1 = "Didn't read enough bytes during decompression. expected="
            java.lang.String r0 = " actual="
            java.lang.String r0 = X.AnonymousClass001.A02(r9, r4, r1, r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            goto L69
        L60:
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L6a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6a
        L69:
            throw r1     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            r2.end()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass087.A03(java.io.InputStream, int, int):byte[]");
    }

    public static long A00(InputStream inputStream, int i) {
        byte[] A02 = A02(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (A02[i2] & 255) << (i2 * 8);
        }
        return j;
    }
}
