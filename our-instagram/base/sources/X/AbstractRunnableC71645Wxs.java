package X;

import android.os.SystemClock;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wxs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractRunnableC71645Wxs implements Runnable, Delayed {
    public long A00;
    public long A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractRunnableC71645Wxs)) {
            return false;
        }
        AbstractRunnableC71645Wxs abstractRunnableC71645Wxs = (AbstractRunnableC71645Wxs) obj;
        if (this.A00 == abstractRunnableC71645Wxs.A00) {
            String str = this.A02;
            String str2 = abstractRunnableC71645Wxs.A02;
            if (str != null ? str.equals(str2) : str2 == null) {
                if (this.A01 == abstractRunnableC71645Wxs.A01) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r1 == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r1 < 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r1 > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        return -1;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed r9) {
        /*
            r8 = this;
            java.util.concurrent.Delayed r9 = (java.util.concurrent.Delayed) r9
            boolean r0 = r9 instanceof X.AbstractRunnableC71645Wxs
            if (r0 == 0) goto L2a
            X.Wxs r9 = (X.AbstractRunnableC71645Wxs) r9
            long r1 = r8.A01
            long r3 = r9.A01
            r7 = 0
            r5 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L1e
            long r1 = r8.A00
            long r3 = r9.A00
            long r1 = r1 - r3
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L24
        L1c:
            r7 = -1
        L1d:
            return r7
        L1e:
            long r1 = r1 - r3
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L24
            goto L1c
        L24:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L1d
            r7 = 1
            return r7
        L2a:
            java.lang.String r1 = "Comparing a Dispatchable to a non-Dispatchable."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractRunnableC71645Wxs.compareTo(java.lang.Object):int");
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01 - SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v100, types: [X.2TB[][]] */
    /* JADX WARN: Type inference failed for: r0v95, types: [X.2TB[][]] */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v98, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.2TB, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractRunnableC71645Wxs.run():void");
    }
}
