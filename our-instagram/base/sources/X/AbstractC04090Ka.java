package X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: X.0Ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04090Ka {
    public static final FileFilter A00 = new C14920p6(0);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006e, code lost:
    
        if (r1 == 10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        if (r2 >= 1024) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        r1 = r6[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
    
        if (r1 == 10) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (java.lang.Character.isDigit(r1) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009c, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
    
        r1 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:
    
        if (r1 >= 1024) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        if (java.lang.Character.isDigit(r6[r1]) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ab, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ae, code lost:
    
        r0 = java.lang.Integer.parseInt(new java.lang.String(r6, 0, r2, r1 - r2)) * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ba, code lost:
    
        if (r0 <= r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bc, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00() {
        /*
            r7 = 0
            r4 = -1
            r8 = 0
            r5 = -1
        L4:
            int r0 = A01()     // Catch: java.io.IOException -> Lc7
            if (r8 >= r0) goto L4f
            java.lang.String r1 = "/sys/devices/system/cpu/cpu"
            java.lang.String r0 = "/cpufreq/cpuinfo_max_freq"
            java.lang.String r0 = X.AnonymousClass001.A0c(r1, r0, r8)     // Catch: java.io.IOException -> Lc7
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> Lc7
            r1.<init>(r0)     // Catch: java.io.IOException -> Lc7
            boolean r0 = r1.exists()     // Catch: java.io.IOException -> Lc7
            if (r0 == 0) goto L4c
            boolean r0 = r1.canRead()     // Catch: java.io.IOException -> Lc7
            if (r0 == 0) goto L4c
            r6 = 128(0x80, float:1.8E-43)
            byte[] r2 = new byte[r6]     // Catch: java.io.IOException -> Lc7
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> Lc7
            r3.<init>(r1)     // Catch: java.io.IOException -> Lc7
            r3.read(r2)     // Catch: java.lang.NumberFormatException -> L49 java.lang.Throwable -> Lc1
            r1 = 0
        L30:
            r0 = r2[r1]     // Catch: java.lang.NumberFormatException -> L49 java.lang.Throwable -> Lc1
            boolean r0 = java.lang.Character.isDigit(r0)     // Catch: java.lang.NumberFormatException -> L49 java.lang.Throwable -> Lc1
            if (r0 == 0) goto L3d
            if (r1 >= r6) goto L3d
            int r1 = r1 + 1
            goto L30
        L3d:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.NumberFormatException -> L49 java.lang.Throwable -> Lc1
            r0.<init>(r2, r7, r1)     // Catch: java.lang.NumberFormatException -> L49 java.lang.Throwable -> Lc1
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L49 java.lang.Throwable -> Lc1
            if (r0 <= r5) goto L49
            r5 = r0
        L49:
            r3.close()     // Catch: java.io.IOException -> Lc7
        L4c:
            int r8 = r8 + 1
            goto L4
        L4f:
            if (r5 != r4) goto Lc6
            java.lang.String r0 = "/proc/cpuinfo"
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> Lc7
            r3.<init>(r0)     // Catch: java.io.IOException -> Lc7
            java.lang.String r12 = "cpu MHz"
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r8]     // Catch: java.lang.Throwable -> Lc1
            int r11 = r3.read(r6)     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lc1
            r10 = 0
        L64:
            if (r10 >= r11) goto Lbd
            r1 = r6[r10]     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lc1
            r0 = 10
            if (r1 == r0) goto L70
            if (r10 != 0) goto L8a
            if (r1 != r0) goto L72
        L70:
            int r10 = r10 + 1
        L72:
            r2 = r10
        L73:
            if (r2 >= r11) goto L8a
            int r9 = r2 - r10
            r1 = r6[r2]     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lc1
            char r0 = r12.charAt(r9)     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lc1
            if (r1 != r0) goto L8a
            int r0 = r12.length()     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lc1
            int r0 = r0 + (-1)
            if (r9 == r0) goto L8d
            int r2 = r2 + 1
            goto L73
        L8a:
            int r10 = r10 + 1
            goto L64
        L8d:
            if (r2 >= r8) goto Lbd
            r1 = r6[r2]     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lc1
            r0 = 10
            if (r1 == r0) goto Lbd
            boolean r0 = java.lang.Character.isDigit(r1)     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lc1
            if (r0 == 0) goto L9c
            goto L9f
        L9c:
            int r2 = r2 + 1
            goto L8d
        L9f:
            int r1 = r2 + 1
        La1:
            if (r1 >= r8) goto Lae
            r0 = r6[r1]     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lc1
            boolean r0 = java.lang.Character.isDigit(r0)     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lc1
            if (r0 == 0) goto Lae
            int r1 = r1 + 1
            goto La1
        Lae:
            int r1 = r1 - r2
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lc1
            r0.<init>(r6, r7, r2, r1)     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lc1
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lc1
            int r0 = r0 * 1000
            if (r0 <= r5) goto Lbd
            r5 = r0
        Lbd:
            r3.close()     // Catch: java.io.IOException -> Lc7
            return r5
        Lc1:
            r0 = move-exception
            r3.close()     // Catch: java.io.IOException -> Lc7
            throw r0     // Catch: java.io.IOException -> Lc7
        Lc6:
            return r5
        Lc7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC04090Ka.A00():int");
    }

    public static int A01() {
        try {
            int A02 = A02("/sys/devices/system/cpu/possible");
            if (A02 == -1) {
                A02 = A02("/sys/devices/system/cpu/present");
            }
            if (A02 == -1) {
                return new File("/sys/devices/system/cpu/").listFiles(A00).length;
            }
            return A02;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static int A02(String str) {
        FileInputStream fileInputStream;
        int i;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (IOException unused) {
                return -1;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                if (readLine != null && readLine.matches("0-[\\d]+$")) {
                    i = Integer.valueOf(readLine.substring(2)).intValue() + 1;
                } else {
                    i = -1;
                }
                fileInputStream.close();
                return i;
            } catch (IOException unused2) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                return -1;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (IOException unused3) {
                    throw th;
                }
            }
        } catch (IOException unused4) {
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
