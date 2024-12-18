package X;

import java.util.concurrent.Callable;

/* renamed from: X.TTx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC64785TTx implements Callable {
    public final /* synthetic */ C60685RMd A00;

    public CallableC64785TTx(C60685RMd c60685RMd) {
        this.A00 = c60685RMd;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0073 -> B:11:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0075 -> B:11:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x007a -> B:11:0x009b). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object call() {
        /*
            r11 = this;
            X.RMd r3 = r11.A00
            X.SX6 r0 = X.C63335Shm.A00(r3)
            android.content.Context r6 = r0.A01
            java.lang.String r5 = "gaClientId"
            java.lang.String r2 = "Failed to close client id reading stream"
            java.lang.String r0 = "ClientId should be loaded from worker thread"
            X.C3U5.A05(r0)
            r10 = 0
            java.io.FileInputStream r4 = r6.openFileInput(r5)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69 java.io.FileNotFoundException -> L8b
            r0 = 36
            byte[] r9 = new byte[r0]     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            r8 = 0
            int r7 = r4.read(r9, r8, r0)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            int r0 = r4.available()     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            if (r0 <= 0) goto L35
            java.lang.String r1 = "clientId file seems corrupted, deleting it."
            r0 = 5
            X.AbstractC63371Sic.A09(r3, r1, r0)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            r4.close()     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            r6.deleteFile(r5)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            r4.close()     // Catch: java.io.IOException -> L97
            goto L9b
        L35:
            r0 = 14
            if (r7 >= r0) goto L4e
            java.lang.String r1 = "clientId file is empty, deleting it."
            r0 = 5
            X.AbstractC63371Sic.A09(r3, r1, r0)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            r4.close()     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            r6.deleteFile(r5)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            r4.close()     // Catch: java.io.IOException -> L49
            goto L9b
        L49:
            r0 = move-exception
            r3.A0G(r2, r0)
            goto L9b
        L4e:
            r4.close()     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            java.lang.String r1 = new java.lang.String     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            r1.<init>(r9, r8, r7)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            java.lang.String r0 = "Read client id from disk"
            r3.A0D(r0, r1)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L7e java.io.FileNotFoundException -> L8c
            r4.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r3.A0G(r2, r0)
        L63:
            r10 = r1
            goto L9b
        L65:
            r1 = move-exception
            goto L6b
        L67:
            r1 = move-exception
            goto L80
        L69:
            r1 = move-exception
            r4 = r10
        L6b:
            java.lang.String r0 = "Error reading client id file, deleting it"
            r3.A0G(r0, r1)     // Catch: java.lang.Throwable -> L7e
            r6.deleteFile(r5)     // Catch: java.lang.Throwable -> L7e
            if (r4 == 0) goto L9b
            r4.close()     // Catch: java.io.IOException -> L79
            goto L9b
        L79:
            r0 = move-exception
            r3.A0G(r2, r0)
            goto L9b
        L7e:
            r1 = move-exception
            r10 = r4
        L80:
            if (r10 == 0) goto L8a
            r10.close()     // Catch: java.io.IOException -> L86
            throw r1
        L86:
            r0 = move-exception
            r3.A0G(r2, r0)
        L8a:
            throw r1
        L8b:
            r4 = r10
        L8c:
            if (r4 == 0) goto L9b
            r4.close()     // Catch: java.io.IOException -> L92
            goto L9b
        L92:
            r0 = move-exception
            r3.A0G(r2, r0)
            goto L9b
        L97:
            r0 = move-exception
            r3.A0G(r2, r0)
        L9b:
            if (r10 != 0) goto La1
            java.lang.String r10 = X.C60685RMd.A00(r3)
        La1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CallableC64785TTx.call():java.lang.Object");
    }
}
