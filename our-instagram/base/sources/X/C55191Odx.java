package X;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Map;

/* renamed from: X.Odx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55191Odx {
    public static final C63049SbT A06 = new Object();
    public long A00;
    public final File A01;
    public final InputStream A02;
    public final String A03;
    public final String A04;
    public final Map A05;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0051, code lost:
    
        r3 = r9.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C54508O6l A01(java.lang.String r21, int r22) {
        /*
            r20 = this;
            r2 = r20
            java.util.Map r7 = r2.A05
            r8 = r21
            boolean r0 = r7.containsKey(r8)
            if (r0 == 0) goto L13
            java.lang.Object r0 = r7.get(r8)
            X.O6l r0 = (X.C54508O6l) r0
            return r0
        L13:
            r19 = 0
            java.io.File r0 = r2.A01     // Catch: java.lang.Throwable -> L7f java.io.FileNotFoundException -> L81
            if (r0 == 0) goto L7a
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7f java.io.FileNotFoundException -> L81
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L7f java.io.FileNotFoundException -> L81
            long r17 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            r0 = 0
            long r4 = r2.A00     // Catch: java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            r10 = 0
            r3 = 0
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r8)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            X.C14360o3.A07(r9)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            r11 = r22
            byte[] r2 = new byte[r11]     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            r6.skip(r0)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            r15 = 0
        L38:
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 >= 0) goto L51
            long r0 = (long) r11     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            long r13 = r4 - r15
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 <= 0) goto L44
            r0 = r13
        L44:
            int r12 = (int) r0     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            int r0 = r6.read(r2, r10, r12)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            if (r0 <= 0) goto L55
            r9.update(r2, r10, r0)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            long r0 = (long) r0     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            long r15 = r15 + r0
            goto L38
        L51:
            byte[] r3 = r9.digest()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
        L55:
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            long r1 = r1 - r17
            if (r3 == 0) goto L67
            X.O6l r0 = new X.O6l     // Catch: java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L6d java.io.FileNotFoundException -> L72
            r7.put(r8, r0)     // Catch: java.lang.Throwable -> L6d java.io.FileNotFoundException -> L74
            r19 = r0
        L67:
            r6.close()     // Catch: java.io.IOException -> L6b
            goto L6c
        L6b:
            return r19
        L6c:
            return r19
        L6d:
            r0 = move-exception
            r6.close()     // Catch: java.io.IOException -> L80
            throw r0
        L72:
            r0 = r19
        L74:
            r6.close()     // Catch: java.io.IOException -> L78
            goto L79
        L78:
            return r0
        L79:
            return r0
        L7a:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.Throwable -> L7f java.io.FileNotFoundException -> L81
            throw r0     // Catch: java.lang.Throwable -> L7f java.io.FileNotFoundException -> L81
        L7f:
            r0 = move-exception
        L80:
            throw r0
        L81:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55191Odx.A01(java.lang.String, int):X.O6l");
    }

    public C55191Odx(File file, String str, long j) {
        this.A05 = AbstractC166987dD.A1G();
        this.A01 = file;
        this.A02 = null;
        String absolutePath = file.getAbsolutePath();
        String A00 = A00(file);
        this.A00 = j;
        this.A04 = str;
        this.A03 = C63049SbT.A00(AnonymousClass001.A0R(absolutePath, ""), str, A00, j);
    }

    private final String A00(File file) {
        long j;
        BasicFileAttributes readAttributes;
        try {
            Path path = file.toPath();
            C14360o3.A07(path);
            readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, new LinkOption[0]);
        } catch (Exception unused) {
            j = 0;
        }
        if (readAttributes != null) {
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                j = creationTime.toMillis();
                String valueOf = String.valueOf(j);
                File file2 = this.A01;
                if (file2 != null) {
                    long lastModified = file2.lastModified();
                    StringBuilder A11 = AbstractC166997dE.A11(valueOf);
                    A11.append('-');
                    A11.append(lastModified);
                    return A11.toString();
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public C55191Odx(File file, String str) {
        C14360o3.A0B(file, 1);
        this.A05 = AbstractC166987dD.A1G();
        this.A01 = file;
        this.A02 = null;
        String absolutePath = file.getAbsolutePath();
        this.A00 = file.length();
        this.A04 = str;
        this.A03 = C63049SbT.A00(absolutePath, str, A00(file), this.A00);
    }

    public C55191Odx(InputStream inputStream) {
        this.A05 = AbstractC166987dD.A1G();
        this.A01 = null;
        this.A02 = inputStream;
        String A0O = AnonymousClass001.A0O("stream-", inputStream.hashCode());
        this.A00 = -1L;
        this.A04 = "application/json";
        this.A03 = C63049SbT.A00(AnonymousClass001.A0R(A0O, ""), "application/json", "stream", -1L);
    }

    public C55191Odx(File file, String str, String str2) {
        this.A05 = AbstractC166987dD.A1G();
        this.A01 = file;
        this.A02 = null;
        file.getAbsolutePath();
        this.A00 = file.length();
        this.A04 = str;
        this.A03 = str2;
    }
}
