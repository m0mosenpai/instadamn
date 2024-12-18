package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.video.PlaceholderSurface;

/* loaded from: classes11.dex */
public final class U9J extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public RunnableC71644Wxr A01;
    public PlaceholderSurface A02;
    public Error A03;
    public RuntimeException A04;

    public U9J() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:73:0x0090
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
            if (r1 != r0) goto L85
            X.Wxr r0 = r4.A01     // Catch: java.lang.Throwable -> L13
            r0.getClass()     // Catch: java.lang.Throwable -> L13
            X.Wxr r0 = r4.A01     // Catch: java.lang.Throwable -> L13
            r0.A00()     // Catch: java.lang.Throwable -> L13
            goto L1b
        L13:
            r2 = move-exception
            java.lang.String r1 = "PlaceholderSurface"
            java.lang.String r0 = "Failed to release placeholder surface"
            X.AbstractC46512Bo.A05(r1, r0, r2)     // Catch: java.lang.Throwable -> L1f
        L1b:
            r4.quit()
            return r3
        L1f:
            r0 = move-exception
            r4.quit()
            throw r0
        L24:
            int r1 = r5.arg1     // Catch: java.lang.Error -> L4b X.AbstractC68216VHy -> L5e java.lang.RuntimeException -> L76 java.lang.Throwable -> L89
            X.Wxr r0 = r4.A01     // Catch: java.lang.Error -> L4b X.AbstractC68216VHy -> L5e java.lang.RuntimeException -> L76 java.lang.Throwable -> L89
            r0.getClass()     // Catch: java.lang.Error -> L4b X.AbstractC68216VHy -> L5e java.lang.RuntimeException -> L76 java.lang.Throwable -> L89
            X.Wxr r0 = r4.A01     // Catch: java.lang.Error -> L4b X.AbstractC68216VHy -> L5e java.lang.RuntimeException -> L76 java.lang.Throwable -> L89
            r0.A01(r1)     // Catch: java.lang.Error -> L4b X.AbstractC68216VHy -> L5e java.lang.RuntimeException -> L76 java.lang.Throwable -> L89
            X.Wxr r0 = r4.A01     // Catch: java.lang.Error -> L4b X.AbstractC68216VHy -> L5e java.lang.RuntimeException -> L76 java.lang.Throwable -> L89
            android.graphics.SurfaceTexture r2 = r0.A00     // Catch: java.lang.Error -> L4b X.AbstractC68216VHy -> L5e java.lang.RuntimeException -> L76 java.lang.Throwable -> L89
            r2.getClass()     // Catch: java.lang.Error -> L4b X.AbstractC68216VHy -> L5e java.lang.RuntimeException -> L76 java.lang.Throwable -> L89
            boolean r1 = X.AbstractC167007dF.A1M(r1)
            com.google.android.exoplayer2.video.PlaceholderSurface r0 = new com.google.android.exoplayer2.video.PlaceholderSurface     // Catch: java.lang.Error -> L4b X.AbstractC68216VHy -> L5e java.lang.RuntimeException -> L76 java.lang.Throwable -> L89
            r0.<init>(r2, r4, r1)     // Catch: java.lang.Error -> L4b X.AbstractC68216VHy -> L5e java.lang.RuntimeException -> L76 java.lang.Throwable -> L89
            r4.A02 = r0     // Catch: java.lang.Error -> L4b X.AbstractC68216VHy -> L5e java.lang.RuntimeException -> L76 java.lang.Throwable -> L89
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L48
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L48
            return r3
        L48:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L48
            throw r0
        L4b:
            r2 = move-exception
            java.lang.String r1 = "PlaceholderSurface"
            java.lang.String r0 = "Failed to initialize placeholder surface"
            X.AbstractC46512Bo.A05(r1, r0, r2)     // Catch: java.lang.Throwable -> L89
            r4.A03 = r2     // Catch: java.lang.Throwable -> L89
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5b
            return r3
        L5b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5b
            throw r0
        L5e:
            r2 = move-exception
            java.lang.String r1 = "PlaceholderSurface"
            java.lang.String r0 = "Failed to initialize placeholder surface"
            X.AbstractC46512Bo.A05(r1, r0, r2)     // Catch: java.lang.Throwable -> L89
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L89
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L89
            r4.A04 = r0     // Catch: java.lang.Throwable -> L89
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L73
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L73
            return r3
        L73:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L73
            throw r0
        L76:
            r2 = move-exception
            java.lang.String r1 = "PlaceholderSurface"
            java.lang.String r0 = "Failed to initialize placeholder surface"
            X.AbstractC46512Bo.A05(r1, r0, r2)     // Catch: java.lang.Throwable -> L89
            r4.A04 = r2     // Catch: java.lang.Throwable -> L89
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L86
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L86
        L85:
            return r3
        L86:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L86
            throw r0
        L89:
            r0 = move-exception
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L90
        L8e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L90
            goto L92
        L90:
            r0 = move-exception
            goto L8e
        L92:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U9J.handleMessage(android.os.Message):boolean");
    }
}
