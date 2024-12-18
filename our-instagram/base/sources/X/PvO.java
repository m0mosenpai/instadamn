package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

@Deprecated
/* loaded from: classes10.dex */
public abstract class PvO extends BroadcastReceiver {
    public static int A00 = 1;
    public static final SparseArray A01 = AbstractC58318PtA.A0G();

    public static ComponentName A00(Context context, Intent intent) {
        ComponentName startService;
        SparseArray sparseArray = A01;
        synchronized (sparseArray) {
            int i = A00;
            int i2 = i + 1;
            A00 = i2;
            if (i2 <= 0) {
                A00 = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            startService = context.startService(intent);
            if (startService == null) {
                startService = null;
            } else {
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                String A0R = AnonymousClass001.A0R("androidx.core:wake:", startService.flattenToShortString());
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, A0R);
                C0BX.A02(newWakeLock, A0R);
                AbstractC09820fg.A02(newWakeLock);
                newWakeLock.acquire(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                C0BX.A01(newWakeLock, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                sparseArray.put(i, newWakeLock);
            }
        }
        return startService;
    }

    public static void A01(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray sparseArray = A01;
            synchronized (sparseArray) {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    AbstractC09820fg.A01(wakeLock);
                    sparseArray.remove(intExtra);
                } else {
                    android.util.Log.w("WakefulBroadcastReceiv.", AnonymousClass001.A0O("No active wake lock id #", intExtra));
                }
            }
        }
    }
}
