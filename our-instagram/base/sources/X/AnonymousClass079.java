package X;

import android.content.Context;
import android.os.BatteryManager;

/* renamed from: X.079, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass079 implements C0LR {
    public Context A00;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A13;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        BatteryManager batteryManager = (BatteryManager) this.A00.getSystemService("batterymanager");
        if (batteryManager != null) {
            c024209q.A01(C0LK.A1N, batteryManager.getIntProperty(4));
            c024209q.A01(C0LK.A1O, batteryManager.getIntProperty(1));
            c024209q.A01(C0LK.A1P, batteryManager.getIntProperty(3));
            c024209q.A01(C0LK.A1Q, batteryManager.getIntProperty(2));
            c024209q.A02(C0LK.A1R, Long.valueOf(batteryManager.getLongProperty(5)));
            c024209q.A01(C0LK.A1S, batteryManager.getIntProperty(6));
        }
    }
}
