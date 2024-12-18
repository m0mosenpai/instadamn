package X;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.0q1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15460q1 {
    public static MappedByteBuffer A01(Context context, android.net.Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static File A00(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            String A0n = AnonymousClass001.A0n(".font", "-", "-", Process.myPid(), Process.myTid());
            for (int i = 0; i < 100; i++) {
                File file = new File(cacheDir, AnonymousClass001.A0O(A0n, i));
                if (file.createNewFile()) {
                    return file;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004c, code lost:
    
        if (r4 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A02(android.content.res.Resources r7, java.io.File r8, int r9) {
        /*
            java.io.InputStream r5 = r7.openRawResource(r9)     // Catch: java.lang.Throwable -> L5c
            android.os.StrictMode$ThreadPolicy r7 = android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L55
            r6 = 0
            r4 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L2c java.lang.Throwable -> L4b
            r3.<init>(r8, r6)     // Catch: java.io.IOException -> L2c java.lang.Throwable -> L4b
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L29
        L13:
            int r1 = r5.read(r2)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L29
            r0 = -1
            if (r1 == r0) goto L1e
            r3.write(r2, r6, r1)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L29
            goto L13
        L1e:
            r3.close()     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L55
        L21:
            android.os.StrictMode.setThreadPolicy(r7)     // Catch: java.lang.Throwable -> L55
            r0 = 1
            goto L47
        L26:
            r0 = move-exception
            r4 = r3
            goto L4e
        L29:
            r0 = move-exception
            r4 = r3
            goto L2d
        L2c:
            r0 = move-exception
        L2d:
            java.lang.String r2 = "TypefaceCompatUtil"
            java.lang.String r1 = "Error copying resource contents to temp file: "
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)     // Catch: java.lang.Throwable -> L4b
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L41
            r4.close()     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L55
        L41:
            android.os.StrictMode.setThreadPolicy(r7)     // Catch: java.lang.Throwable -> L55
            r0 = 0
            if (r5 == 0) goto L4a
        L47:
            r5.close()     // Catch: java.io.IOException -> L4a
        L4a:
            return r0
        L4b:
            r0 = move-exception
            if (r4 == 0) goto L51
        L4e:
            r4.close()     // Catch: java.io.IOException -> L51 java.lang.Throwable -> L55
        L51:
            android.os.StrictMode.setThreadPolicy(r7)     // Catch: java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Throwable -> L55
        L55:
            r0 = move-exception
            if (r5 == 0) goto L5d
            r5.close()     // Catch: java.io.IOException -> L5d
            throw r0
        L5c:
            r0 = move-exception
        L5d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC15460q1.A02(android.content.res.Resources, java.io.File, int):boolean");
    }
}
