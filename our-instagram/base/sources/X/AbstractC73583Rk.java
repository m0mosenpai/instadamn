package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.3Rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC73583Rk {
    public static long A00(File file) {
        int length;
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        File[] A04 = A04(file);
        if (A04 == null || (length = A04.length) == 0) {
            return 0L;
        }
        int i = 0;
        do {
            j += A00(A04[i]);
            i++;
        } while (i < length);
        return j;
    }

    public static C62673SLl A01(File file) {
        int length;
        if (file.exists() && !A03(file)) {
            if (file.isDirectory()) {
                C62673SLl A02 = A02(file, true);
                File[] A04 = A04(file);
                if (A04 != null && (length = A04.length) != 0) {
                    long j = A02.A00;
                    long j2 = A02.A02;
                    int i = 0;
                    long j3 = 1;
                    do {
                        C62673SLl A01 = A01(A04[i]);
                        j += A01.A00;
                        j2 += A01.A02;
                        j3 += A01.A01;
                        i++;
                    } while (i < length);
                    return new C62673SLl(j, j2, j3);
                }
                return A02;
            }
            return A02(file, false);
        }
        return new C62673SLl(0L, 0L, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C62673SLl A02(java.io.File r13, boolean r14) {
        /*
            long r9 = r13.length()
            java.lang.String r4 = "BigFoot"
            r5 = 0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L22
            java.lang.String r1 = "The size for the file (-1) possibly caused by casting issue on the OS. File = "
            java.lang.String r0 = r13.getAbsolutePath()
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            X.C0I2.A04(r4, r0)
            r9 = 1
            X.SLl r4 = new X.SLl
            r7 = r5
            r4.<init>(r5, r7, r9)
            return r4
        L22:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L40
            java.lang.String r1 = "The size for the file (> 2GB) possibly caused by casting issue on the OS. File = "
            java.lang.String r0 = r13.getAbsolutePath()
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            X.C0I2.A04(r4, r0)
            r11 = 1
            X.SLl r4 = new X.SLl
            r6 = r4
            r9 = r7
            r6.<init>(r7, r9, r11)
            return r4
        L40:
            r2 = -1
            java.lang.String r0 = r13.getCanonicalPath()     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L61
            goto L4b
        L47:
            java.lang.String r0 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L61
        L4b:
            android.system.StructStat r0 = android.system.Os.lstat(r0)     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L61
            long r11 = r0.st_blocks     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L61
            r0 = 512(0x200, double:2.53E-321)
            long r11 = r11 * r0
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L67
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L77
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 == 0) goto L77
            goto L67
        L61:
            r1 = move-exception
            java.lang.String r0 = "The lstat method failed to return a valid response"
            X.C0I2.A06(r4, r0, r1)
        L67:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r9
            float r1 = r1 * r0
            r0 = 1166016512(0x45800000, float:4096.0)
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            long r11 = (long) r0
            r0 = 4096(0x1000, double:2.0237E-320)
            long r11 = r11 * r0
        L77:
            if (r14 == 0) goto L7b
            r9 = 0
        L7b:
            r13 = 1
            X.SLl r4 = new X.SLl
            r8 = r4
            r8.<init>(r9, r11, r13)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC73583Rk.A02(java.io.File, boolean):X.SLl");
    }

    public static boolean A03(File file) {
        try {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        } catch (IOException unused) {
            return false;
        }
    }

    public static File[] A04(File file) {
        File[] fileArr = null;
        if (!file.isDirectory()) {
            return null;
        }
        try {
            fileArr = file.listFiles();
            return fileArr;
        } catch (Exception e) {
            C0I2.A07("BigFoot", AnonymousClass001.A0R("The path is invalid: ", file.getAbsolutePath()), e);
            return fileArr;
        }
    }
}
