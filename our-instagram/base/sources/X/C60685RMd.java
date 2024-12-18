package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: X.RMd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60685RMd extends AbstractC60694RMm {
    public Future A00;
    public volatile String A01;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(X.C60685RMd r7) {
        /*
            java.lang.String r6 = "0"
            java.lang.String r1 = X.AbstractC166997dE.A0n()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r1.toLowerCase(r0)
            X.SX6 r0 = X.C63335Shm.A00(r7)     // Catch: java.lang.Exception -> L62
            android.content.Context r1 = r0.A01     // Catch: java.lang.Exception -> L62
            java.lang.String r4 = "Failed to close clientId writing stream"
            X.C3U5.A04(r5)     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = "ClientId should be saved from worker thread"
            X.C3U5.A05(r0)     // Catch: java.lang.Exception -> L62
            r3 = 0
            r2 = 0
            java.lang.String r0 = "Storing clientId"
            r7.A0D(r0, r5)     // Catch: java.io.IOException -> L39 java.io.FileNotFoundException -> L40 java.lang.Throwable -> L56
            java.lang.String r0 = "gaClientId"
            java.io.FileOutputStream r2 = r1.openFileOutput(r0, r3)     // Catch: java.io.IOException -> L39 java.io.FileNotFoundException -> L40 java.lang.Throwable -> L56
            byte[] r0 = r5.getBytes()     // Catch: java.io.IOException -> L39 java.io.FileNotFoundException -> L40 java.lang.Throwable -> L56
            r2.write(r0)     // Catch: java.io.IOException -> L39 java.io.FileNotFoundException -> L40 java.lang.Throwable -> L56
            r2.close()     // Catch: java.io.IOException -> L34 java.lang.Exception -> L62
            goto L51
        L34:
            r0 = move-exception
            r7.A0G(r4, r0)     // Catch: java.lang.Exception -> L62
            goto L51
        L39:
            r1 = move-exception
            java.lang.String r0 = "Error writing to clientId file"
            r7.A0G(r0, r1)     // Catch: java.lang.Throwable -> L56
            goto L46
        L40:
            r1 = move-exception
            java.lang.String r0 = "Error creating clientId file"
            r7.A0G(r0, r1)     // Catch: java.lang.Throwable -> L56
        L46:
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L62
            goto L52
        L4c:
            r0 = move-exception
            r7.A0G(r4, r0)     // Catch: java.lang.Exception -> L62
            goto L52
        L51:
            r3 = 1
        L52:
            if (r3 != 0) goto L55
            return r6
        L55:
            return r5
        L56:
            r1 = move-exception
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L5d java.lang.Exception -> L62
            goto L61
        L5d:
            r0 = move-exception
            r7.A0G(r4, r0)     // Catch: java.lang.Exception -> L62
        L61:
            throw r1     // Catch: java.lang.Exception -> L62
        L62:
            r1 = move-exception
            java.lang.String r0 = "Error saving clientId file"
            r7.A0G(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60685RMd.A00(X.RMd):java.lang.String");
    }

    public final String A0J() {
        String str;
        Future future;
        A0I();
        synchronized (this) {
            if (this.A01 == null) {
                SX6 A00 = C63335Shm.A00(this);
                CallableC64785TTx callableC64785TTx = new CallableC64785TTx(this);
                if (Thread.currentThread() instanceof C64870TXv) {
                    FutureTask futureTask = new FutureTask(callableC64785TTx);
                    futureTask.run();
                    future = futureTask;
                } else {
                    future = A00.A02.submit(callableC64785TTx);
                }
                this.A00 = future;
            }
            Future future2 = this.A00;
            if (future2 != null) {
                try {
                    this.A01 = (String) future2.get();
                } catch (InterruptedException e) {
                    A0F("ClientId loading or generation was interrupted", e);
                    this.A01 = "0";
                } catch (ExecutionException e2) {
                    A0G("Failed to load or generate client id", e2);
                    this.A01 = "0";
                }
                if (this.A01 == null) {
                    this.A01 = "0";
                }
                A0D("Loaded clientId", this.A01);
                this.A00 = null;
            }
            str = this.A01;
        }
        return str;
    }
}
