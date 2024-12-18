package X;

import android.graphics.Bitmap;
import java.util.Vector;

/* loaded from: classes11.dex */
public final class W5O {
    public static final Vector A02 = new Vector();
    public int A00;
    public final Object[] A01;

    public final synchronized Object A00() {
        int i = this.A00;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.A01;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.A00 = i2;
        return obj;
    }

    public final synchronized void A01() {
        Object[] objArr = this.A01;
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj != null && (obj instanceof Bitmap)) {
                ((Bitmap) obj).recycle();
            }
            objArr[i] = null;
        }
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000f, code lost:
    
        r1 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0012, code lost:
    
        if (r2 >= r1.length) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0014, code lost:
    
        r1[r2] = r4;
        r3.A00 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A02(java.lang.Object r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r1 = 0
        L2:
            int r2 = r3.A00     // Catch: java.lang.Throwable -> L1c
            if (r1 >= r2) goto Lf
            java.lang.Object[] r0 = r3.A01     // Catch: java.lang.Throwable -> L1c
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L1c
            if (r0 == r4) goto L1a
            int r1 = r1 + 1
            goto L2
        Lf:
            java.lang.Object[] r1 = r3.A01     // Catch: java.lang.Throwable -> L1c
            int r0 = r1.length     // Catch: java.lang.Throwable -> L1c
            if (r2 >= r0) goto L1a
            r1[r2] = r4     // Catch: java.lang.Throwable -> L1c
            int r0 = r2 + 1
            r3.A00 = r0     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r3)
            return
        L1c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W5O.A02(java.lang.Object):void");
    }

    public W5O(int i) {
        this.A01 = new Object[i];
        A02.add(this);
    }
}
