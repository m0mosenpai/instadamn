package X;

/* loaded from: classes12.dex */
public final class YGJ implements Runnable {
    public final /* synthetic */ Xnb A00;

    public YGJ(Xnb xnb) {
        this.A00 = xnb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b6, code lost:
    
        r0 = r6.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
    
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
    
        if (r0.hasRemaining() != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c0, code lost:
    
        r6.A06.onPlaybackPlayCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r5 = "mss:AndroidAudioEnhancementPlaybackImpl"
            r0 = -19
            android.os.Process.setThreadPriority(r0)
            X.Xnb r6 = r13.A00     // Catch: java.lang.InterruptedException -> Lce
            int r1 = r6.A00     // Catch: java.lang.InterruptedException -> Lce
            int r0 = r6.A01     // Catch: java.lang.InterruptedException -> Lce
            r7 = 2048000(0x1f4000, float:2.869859E-39)
            int r0 = r0 * 2
            int r0 = r0 * r1
            int r7 = r7 / r0
        L14:
            java.nio.ByteBuffer r0 = r6.A04     // Catch: java.lang.InterruptedException -> Lce
            java.lang.String r12 = "fileData"
            if (r0 == 0) goto Lc6
            boolean r0 = r0.hasRemaining()     // Catch: java.lang.InterruptedException -> Lce
            if (r0 == 0) goto Lb6
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A09     // Catch: java.lang.InterruptedException -> Lce
            boolean r0 = r0.get()     // Catch: java.lang.InterruptedException -> Lce
            if (r0 == 0) goto Lb6
            java.nio.ByteBuffer r8 = r6.A08     // Catch: java.lang.InterruptedException -> Lce
            r8.clear()     // Catch: java.lang.InterruptedException -> Lce
            X.0JO r4 = r6.A05     // Catch: java.lang.InterruptedException -> Lce
            long r10 = r4.now()     // Catch: java.lang.InterruptedException -> Lce
            r2 = 2048(0x800, float:2.87E-42)
            java.nio.ByteBuffer r0 = r6.A04     // Catch: java.lang.InterruptedException -> Lce
            if (r0 == 0) goto Lc6
            int r1 = r0.position()     // Catch: java.lang.InterruptedException -> Lce
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r6.A04     // Catch: java.lang.InterruptedException -> Lce
            if (r0 == 0) goto Lc6
            int r0 = r0.limit()     // Catch: java.lang.InterruptedException -> Lce
            if (r1 < r0) goto L59
            java.nio.ByteBuffer r0 = r6.A04     // Catch: java.lang.InterruptedException -> Lce
            if (r0 == 0) goto Lc6
            int r2 = r0.limit()     // Catch: java.lang.InterruptedException -> Lce
            java.nio.ByteBuffer r0 = r6.A04     // Catch: java.lang.InterruptedException -> Lce
            if (r0 == 0) goto Lc6
            int r0 = r0.position()     // Catch: java.lang.InterruptedException -> Lce
            int r2 = r2 - r0
        L59:
            r3 = 0
            r9 = 0
        L5b:
            if (r9 >= r2) goto L83
            java.nio.ByteBuffer r1 = r6.A04     // Catch: java.lang.IndexOutOfBoundsException -> L76 java.lang.InterruptedException -> Lce
            if (r1 != 0) goto L69
            X.C14360o3.A0F(r12)     // Catch: java.lang.IndexOutOfBoundsException -> L76 java.lang.InterruptedException -> Lce
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.IndexOutOfBoundsException -> L76 java.lang.InterruptedException -> Lce
            throw r0     // Catch: java.lang.IndexOutOfBoundsException -> L76 java.lang.InterruptedException -> Lce
        L69:
            int r0 = r1.position()     // Catch: java.lang.IndexOutOfBoundsException -> L76 java.lang.InterruptedException -> Lce
            int r0 = r0 + r9
            byte r0 = r1.get(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L76 java.lang.InterruptedException -> Lce
            r8.put(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L76 java.lang.InterruptedException -> Lce
            goto L80
        L76:
            r1 = move-exception
            r0 = 3651(0xe43, float:5.116E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)     // Catch: java.lang.InterruptedException -> Lce
            X.C0K8.A0G(r5, r0, r1)     // Catch: java.lang.InterruptedException -> Lce
        L80:
            int r9 = r9 + 1
            goto L5b
        L83:
            java.nio.ByteBuffer r1 = r6.A04     // Catch: java.lang.InterruptedException -> Lce
            if (r1 == 0) goto Lc6
            int r0 = r1.position()     // Catch: java.lang.InterruptedException -> Lce
            int r0 = r0 + r2
            r1.position(r0)     // Catch: java.lang.InterruptedException -> Lce
            r8.flip()     // Catch: java.lang.InterruptedException -> Lce
            com.facebook.mediastreaming.opt.audioenhancement.AndroidAudioEnhancementHybrid r2 = r6.A06     // Catch: java.lang.InterruptedException -> Lce
            int r1 = r8.limit()     // Catch: java.lang.InterruptedException -> Lce
            java.nio.ByteBuffer r0 = r6.A04     // Catch: java.lang.InterruptedException -> Lce
            if (r0 == 0) goto Lc6
            boolean r0 = r0.hasRemaining()     // Catch: java.lang.InterruptedException -> Lce
            if (r0 != 0) goto La3
            r3 = 1
        La3:
            r2.onPlaybackData(r8, r1, r3)     // Catch: java.lang.InterruptedException -> Lce
            long r3 = r4.now()     // Catch: java.lang.InterruptedException -> Lce
            long r3 = r3 - r10
            long r1 = (long) r7     // Catch: java.lang.InterruptedException -> Lce
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L14
            long r1 = r1 - r3
            java.lang.Thread.sleep(r1)     // Catch: java.lang.InterruptedException -> Lce
            goto L14
        Lb6:
            java.nio.ByteBuffer r0 = r6.A04     // Catch: java.lang.InterruptedException -> Lce
            if (r0 == 0) goto Lc6
            boolean r0 = r0.hasRemaining()     // Catch: java.lang.InterruptedException -> Lce
            if (r0 != 0) goto Ld4
            com.facebook.mediastreaming.opt.audioenhancement.AndroidAudioEnhancementHybrid r0 = r6.A06     // Catch: java.lang.InterruptedException -> Lce
            r0.onPlaybackPlayCompleted()     // Catch: java.lang.InterruptedException -> Lce
            return
        Lc6:
            X.C14360o3.A0F(r12)     // Catch: java.lang.InterruptedException -> Lce
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.InterruptedException -> Lce
            throw r0     // Catch: java.lang.InterruptedException -> Lce
        Lce:
            r1 = move-exception
            java.lang.String r0 = "Audio file reading thread interrupted"
            X.C0K8.A0G(r5, r0, r1)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YGJ.run():void");
    }
}
