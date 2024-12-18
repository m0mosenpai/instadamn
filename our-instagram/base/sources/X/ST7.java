package X;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes10.dex */
public abstract class ST7 {
    public static final String A00;

    static {
        String A01 = C48442Kl.A01("WakeLocks");
        C14360o3.A07(A01);
        A00 = A01;
    }

    public static final PowerManager.WakeLock A00(Context context, String str) {
        boolean A1a = AbstractC167017dG.A1a(context, str);
        PowerManager A0G = AbstractC50522MSa.A0G(context.getApplicationContext());
        String A0R = AnonymousClass001.A0R("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = A0G.newWakeLock(A1a ? 1 : 0, A0R);
        C0BX.A02(newWakeLock, A0R);
        synchronized (SUQ.A00) {
            SUQ.A01.put(newWakeLock, A0R);
        }
        C14360o3.A07(newWakeLock);
        return newWakeLock;
    }
}
