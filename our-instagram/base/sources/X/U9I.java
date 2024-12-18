package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.video.DummySurface;

/* loaded from: classes11.dex */
public final class U9I extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public RunnableC71644Wxr A01;
    public DummySurface A02;
    public Error A03;
    public RuntimeException A04;

    public U9I() {
        super("dummySurface");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:60:0x0074
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            int r1 = r5.what
            r3 = 1
            if (r1 == r3) goto L24
            r0 = 2
            if (r1 != r0) goto L69
            X.Wxr r0 = r4.A01     // Catch: java.lang.Throwable -> L13
            r0.getClass()     // Catch: java.lang.Throwable -> L13
            X.Wxr r0 = r4.A01     // Catch: java.lang.Throwable -> L13
            r0.A00()     // Catch: java.lang.Throwable -> L13
            goto L1b
        L13:
            r2 = move-exception
            java.lang.String r1 = "DummySurface"
            java.lang.String r0 = "Failed to release dummy surface"
            X.AbstractC46512Bo.A05(r1, r0, r2)     // Catch: java.lang.Throwable -> L1f
        L1b:
            r4.quit()
            return r3
        L1f:
            r0 = move-exception
            r4.quit()
            throw r0
        L24:
            int r1 = r5.arg1     // Catch: java.lang.Error -> L47 java.lang.RuntimeException -> L5a java.lang.Throwable -> L6d
            X.Wxr r0 = r4.A01     // Catch: java.lang.Error -> L47 java.lang.RuntimeException -> L5a java.lang.Throwable -> L6d
            r0.getClass()     // Catch: java.lang.Error -> L47 java.lang.RuntimeException -> L5a java.lang.Throwable -> L6d
            X.Wxr r0 = r4.A01     // Catch: java.lang.Error -> L47 java.lang.RuntimeException -> L5a java.lang.Throwable -> L6d
            r0.A01(r1)     // Catch: java.lang.Error -> L47 java.lang.RuntimeException -> L5a java.lang.Throwable -> L6d
            X.Wxr r0 = r4.A01     // Catch: java.lang.Error -> L47 java.lang.RuntimeException -> L5a java.lang.Throwable -> L6d
            android.graphics.SurfaceTexture r1 = r0.A00     // Catch: java.lang.Error -> L47 java.lang.RuntimeException -> L5a java.lang.Throwable -> L6d
            r1.getClass()     // Catch: java.lang.Error -> L47 java.lang.RuntimeException -> L5a java.lang.Throwable -> L6d
            com.google.android.exoplayer2.video.DummySurface r0 = new com.google.android.exoplayer2.video.DummySurface     // Catch: java.lang.Error -> L47 java.lang.RuntimeException -> L5a java.lang.Throwable -> L6d
            r0.<init>(r1, r4)     // Catch: java.lang.Error -> L47 java.lang.RuntimeException -> L5a java.lang.Throwable -> L6d
            r4.A02 = r0     // Catch: java.lang.Error -> L47 java.lang.RuntimeException -> L5a java.lang.Throwable -> L6d
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L44
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L44
            return r3
        L44:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L44
            throw r0
        L47:
            r2 = move-exception
            java.lang.String r1 = "DummySurface"
            java.lang.String r0 = "Failed to initialize dummy surface"
            X.AbstractC46512Bo.A05(r1, r0, r2)     // Catch: java.lang.Throwable -> L6d
            r4.A03 = r2     // Catch: java.lang.Throwable -> L6d
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L57
            return r3
        L57:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L57
            throw r0
        L5a:
            r2 = move-exception
            java.lang.String r1 = "DummySurface"
            java.lang.String r0 = "Failed to initialize dummy surface"
            X.AbstractC46512Bo.A05(r1, r0, r2)     // Catch: java.lang.Throwable -> L6d
            r4.A04 = r2     // Catch: java.lang.Throwable -> L6d
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6a
        L69:
            return r3
        L6a:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6a
            throw r0
        L6d:
            r0 = move-exception
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L74
        L72:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L74
            goto L76
        L74:
            r0 = move-exception
            goto L72
        L76:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U9I.handleMessage(android.os.Message):boolean");
    }
}
