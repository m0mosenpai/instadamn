package X;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.SVs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62888SVs {
    public static final S56 A01 = new Object();
    public static volatile C62888SVs A02;
    public final PowerManager A00;

    public C62888SVs(Context context) {
        PowerManager powerManager;
        Object systemService = context.getSystemService("power");
        if (systemService instanceof PowerManager) {
            powerManager = (PowerManager) systemService;
        } else {
            powerManager = null;
        }
        this.A00 = powerManager;
    }
}
