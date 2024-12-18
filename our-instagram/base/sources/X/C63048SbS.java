package X;

import java.io.File;
import java.util.Arrays;

/* renamed from: X.SbS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63048SbS {
    public static final void A01(File file, int... iArr) {
        int[] copyOf = Arrays.copyOf(iArr, 2);
        C14360o3.A0B(copyOf, 2);
        C0s6 A00 = AbstractC13190m5.A00(file.listFiles());
        while (A00.hasNext()) {
            File file2 = (File) A00.next();
            if (file2.isDirectory()) {
                try {
                    String name = file2.getName();
                    C14360o3.A07(name);
                    int parseInt = Integer.parseInt(name);
                    boolean z = true;
                    for (int i : copyOf) {
                        if (parseInt == i) {
                            z = false;
                        }
                    }
                    if (z) {
                        A00(file2);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r3.listFiles().length == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void A00(java.io.File r3) {
        /*
            java.lang.Class<X.SbS> r2 = X.C63048SbS.class
            monitor-enter(r2)
            r0 = 0
            X.C14360o3.A0B(r3, r0)     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L38
            boolean r0 = r3.isDirectory()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L35
            java.io.File[] r0 = r3.listFiles()     // Catch: java.lang.Throwable -> L3a
            X.0s6 r1 = X.AbstractC13190m5.A00(r0)     // Catch: java.lang.Throwable -> L3a
        L1b:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L3a
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L3a
            X.C14360o3.A0A(r0)     // Catch: java.lang.Throwable -> L3a
            A00(r0)     // Catch: java.lang.Throwable -> L3a
            goto L1b
        L2e:
            java.io.File[] r0 = r3.listFiles()     // Catch: java.lang.Throwable -> L3a
            int r0 = r0.length     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L38
        L35:
            r3.delete()     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r2)
            return
        L3a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63048SbS.A00(java.io.File):void");
    }
}
