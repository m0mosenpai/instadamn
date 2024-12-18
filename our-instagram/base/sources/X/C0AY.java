package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0AY, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0AY {
    public static final AtomicInteger A00 = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        r1 = r1.split(":");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r1.length <= 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = r1[1].trim().split(" ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r1.length <= 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        r2 = java.lang.Integer.parseInt(r1[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r1[1].equals("kB") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        r5.compareAndSet(0, r2 * 1024);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00() {
        /*
            java.util.concurrent.atomic.AtomicInteger r5 = X.C0AY.A00
            int r0 = r5.get()
            if (r0 != 0) goto L74
            java.lang.String r1 = "/proc/self/smaps"
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.io.IOException -> L66
            r0.<init>(r1)     // Catch: java.io.IOException -> L66
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.io.IOException -> L66
            r6.<init>(r0)     // Catch: java.io.IOException -> L66
            java.lang.String r1 = r6.readLine()     // Catch: java.lang.Throwable -> L5c
        L18:
            if (r1 == 0) goto L58
            java.lang.String r0 = "KernelPageSize:"
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L53
            java.lang.String r0 = ":"
            java.lang.String[] r1 = r1.split(r0)     // Catch: java.lang.Throwable -> L5c
            int r0 = r1.length     // Catch: java.lang.Throwable -> L5c
            r4 = 1
            if (r0 <= r4) goto L58
            r0 = r1[r4]     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = " "
            java.lang.String[] r1 = r1.split(r0)     // Catch: java.lang.Throwable -> L5c
            int r0 = r1.length     // Catch: java.lang.Throwable -> L5c
            if (r0 <= r4) goto L58
            r3 = 0
            r0 = r1[r3]     // Catch: java.lang.Throwable -> L5c
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L5c
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "kB"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L58
            int r0 = r2 * 1024
            r5.compareAndSet(r3, r0)     // Catch: java.lang.Throwable -> L5c
            goto L58
        L53:
            java.lang.String r1 = r6.readLine()     // Catch: java.lang.Throwable -> L5c
            goto L18
        L58:
            r6.close()     // Catch: java.io.IOException -> L66
            goto L66
        L5c:
            r1 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L61
            goto L65
        L61:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)     // Catch: java.io.IOException -> L66
        L65:
            throw r1     // Catch: java.io.IOException -> L66
        L66:
            int r0 = r5.get()
            if (r0 != 0) goto L74
            java.lang.String r1 = "Could not get page size"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0AY.A00():int");
    }
}
