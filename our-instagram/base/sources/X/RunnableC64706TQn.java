package X;

import android.os.PowerManager;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.TQn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64706TQn implements Runnable {
    public final FirebaseInstanceId A00;
    public final long A01;
    public final PowerManager.WakeLock A02;
    public final SWO A03;

    /* JADX WARN: Code restructure failed: missing block: B:120:0x010a, code lost:
    
        android.util.Log.isLoggable("FirebaseInstanceId", 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x024c, code lost:
    
        throw X.MSW.A0y("token not available");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v69, types: [X.Tju, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [X.Tju, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.Q1P, android.content.BroadcastReceiver] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC64706TQn.run():void");
    }

    public RunnableC64706TQn(FirebaseInstanceId firebaseInstanceId, SWO swo, long j) {
        this.A00 = firebaseInstanceId;
        this.A03 = swo;
        this.A01 = j;
        C63342Shx c63342Shx = firebaseInstanceId.A02;
        C63342Shx.A01(c63342Shx);
        PowerManager.WakeLock newWakeLock = ((PowerManager) c63342Shx.A00.getSystemService("power")).newWakeLock(1, "fiid-sync");
        C0BX.A02(newWakeLock, "fiid-sync");
        this.A02 = newWakeLock;
        AbstractC09820fg.A02(newWakeLock);
    }
}
