package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.List;

/* renamed from: X.PwO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58496PwO implements Runnable {
    public final /* synthetic */ C56I A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ List A02;

    public RunnableC58496PwO(C56I c56i, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, List list) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A02 = list;
        this.A00 = c56i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r1 != 5) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.56I] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            java.util.List r0 = r8.A02
            java.util.Iterator r7 = r0.iterator()
        L6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r5 = r7.next()
            X.XMy r5 = (X.C72080XMy) r5
            java.util.Set r0 = r5.A0F
            if (r0 == 0) goto L6
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r3 = r8.A01
            androidx.core.graphics.drawable.IconCompat r2 = r5.A09
            r4 = 0
            if (r2 == 0) goto L39
            int r1 = r2.A02
            r0 = -1
            if (r1 != r0) goto L30
            java.lang.Object r0 = r2.A06
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            int r1 = r0.getType()
        L30:
            r0 = 1
            if (r1 == r0) goto La0
            r0 = 2
            if (r1 == r0) goto L90
            r0 = 5
            if (r1 == r0) goto La0
        L39:
            r6 = r4
            r0 = r4
        L3b:
            X.XMz r2 = new X.XMz
            r2.<init>(r5)
            X.XMy r1 = r2.A00
            r1.A09 = r4
            X.XMy r1 = r2.A00()
            X.PwN r4 = new X.PwN
            r4.<init>(r1, r6, r0)
            androidx.core.graphics.drawable.IconCompat r0 = r5.A09
            java.lang.String r2 = r4.A01
            if (r2 == 0) goto L8e
            android.graphics.Bitmap r1 = r0.A05()
        L57:
            java.lang.String r5 = r5.A0D
            java.util.Map r0 = r3.A04
            r0.put(r5, r4)
            if (r1 == 0) goto L6
            X.PwG r4 = new X.PwG
            r4.<init>(r1, r3, r2)
            X.56I r2 = new X.56I
            r2.<init>()
            java.util.concurrent.ExecutorService r1 = r3.A06
            X.PwE r0 = new X.PwE
            r0.<init>(r2, r3, r4)
            r1.submit(r0)
            java.util.Map r0 = r3.A03
            java.lang.Object r1 = r0.put(r5, r2)
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            if (r1 == 0) goto L82
            r0 = 0
            r1.cancel(r0)
        L82:
            X.PwF r1 = new X.PwF
            r1.<init>(r8, r2, r5)
            java.util.concurrent.ExecutorService r0 = r3.A05
            r2.addListener(r1, r0)
            goto L6
        L8e:
            r1 = 0
            goto L57
        L90:
            android.content.Context r0 = r3.A00
            android.content.res.Resources r1 = r0.getResources()
            int r0 = r2.A04()
            java.lang.String r6 = r1.getResourceName(r0)
            r0 = r4
            goto L3b
        La0:
            java.io.File r2 = r3.A01
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            java.lang.String r0 = r0.getAbsolutePath()
            r6 = r4
            goto L3b
        Lb5:
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r1 = r8.A01
            X.56I r0 = r8.A00
            r1.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC58496PwO.run():void");
    }
}
