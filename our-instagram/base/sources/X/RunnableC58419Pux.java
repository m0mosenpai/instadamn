package X;

/* renamed from: X.Pux, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class RunnableC58419Pux implements Runnable {
    public final ServiceConnectionC58416Puu A00;

    public RunnableC58419Pux(ServiceConnectionC58416Puu serviceConnectionC58416Puu) {
        this.A00 = serviceConnectionC58416Puu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            X.Puu r2 = r10.A00
        L2:
            monitor-enter(r2)
            int r0 = r2.A00     // Catch: java.lang.Throwable -> La7
            r3 = 2
            if (r0 != r3) goto L13
            java.util.Queue r1 = r2.A04     // Catch: java.lang.Throwable -> La7
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L16
            r2.A00()     // Catch: java.lang.Throwable -> La7
        L13:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            goto La6
        L16:
            java.lang.Object r7 = r1.poll()     // Catch: java.lang.Throwable -> La7
            X.Put r7 = (X.AbstractC58415Put) r7     // Catch: java.lang.Throwable -> La7
            android.util.SparseArray r0 = r2.A03     // Catch: java.lang.Throwable -> La7
            int r8 = r7.A01     // Catch: java.lang.Throwable -> La7
            r0.put(r8, r7)     // Catch: java.lang.Throwable -> La7
            X.Pus r9 = r2.A05     // Catch: java.lang.Throwable -> La7
            java.util.concurrent.ScheduledExecutorService r6 = r9.A03     // Catch: java.lang.Throwable -> La7
            X.Puz r5 = new X.Puz     // Catch: java.lang.Throwable -> La7
            r5.<init>(r2, r7)     // Catch: java.lang.Throwable -> La7
            r0 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> La7
            r6.schedule(r5, r0, r4)     // Catch: java.lang.Throwable -> La7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = "MessengerIpcClient"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L44
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String.valueOf(r0)
        L44:
            android.content.Context r6 = r9.A02
            android.os.Messenger r1 = r2.A02
            android.os.Message r5 = android.os.Message.obtain()
            int r0 = r7.A00
            r5.what = r0
            r5.arg1 = r8
            r5.replyTo = r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r1 = "oneWay"
            boolean r0 = r7 instanceof X.RVS
            if (r0 == 0) goto L77
            r0 = 1
        L60:
            r4.putBoolean(r1, r0)
            java.lang.String r1 = "pkg"
            java.lang.String r0 = r6.getPackageName()
            r4.putString(r1, r0)
            java.lang.String r1 = "data"
            android.os.Bundle r0 = r7.A02
            r4.putBundle(r1, r0)
            r5.setData(r4)
            goto L79
        L77:
            r0 = 0
            goto L60
        L79:
            X.Puy r1 = r2.A01     // Catch: android.os.RemoteException -> L9c
            android.os.Messenger r0 = r1.A00     // Catch: android.os.RemoteException -> L9c
            if (r0 != 0) goto L97
            com.google.firebase.iid.zzm r0 = r1.A01     // Catch: android.os.RemoteException -> L9c
            if (r0 == 0) goto L8f
            android.os.Messenger r0 = r0.A00     // Catch: android.os.RemoteException -> L9c
            if (r0 != 0) goto L97
            java.lang.String r0 = "send"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: android.os.RemoteException -> L9c
            r1.<init>(r0)     // Catch: android.os.RemoteException -> L9c
        L8e:
            throw r1     // Catch: android.os.RemoteException -> L9c
        L8f:
            java.lang.String r0 = "Both messengers are null"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: android.os.RemoteException -> L9c
            r1.<init>(r0)     // Catch: android.os.RemoteException -> L9c
            goto L8e
        L97:
            r0.send(r5)     // Catch: android.os.RemoteException -> L9c
            goto L2
        L9c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.A01(r3, r0)
            goto L2
        La6:
            return
        La7:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC58419Pux.run():void");
    }
}
