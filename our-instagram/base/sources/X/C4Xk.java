package X;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.4Xk, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Xk implements InterfaceC97014Xm {
    public PowerManager.WakeLock A00;
    public boolean A01;
    public boolean A02;
    public final PowerManager A03;

    @Override // X.InterfaceC97014Xm
    public final void Eeo(boolean z) {
        this.A02 = z;
        PowerManager.WakeLock wakeLock = this.A00;
        if (wakeLock != null) {
            if (this.A01 && z) {
                AbstractC09820fg.A00(wakeLock);
            } else {
                AbstractC09820fg.A01(wakeLock);
            }
        }
    }

    @Override // X.InterfaceC97014Xm
    public final void setEnabled(boolean z) {
        if (z && this.A00 == null) {
            PowerManager powerManager = this.A03;
            if (powerManager == null) {
                AbstractC46512Bo.A04("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            C0BX.A02(newWakeLock, "ExoPlayer:WakeLockManager");
            this.A00 = newWakeLock;
            AbstractC09820fg.A02(newWakeLock);
        }
        this.A01 = z;
        PowerManager.WakeLock wakeLock = this.A00;
        if (wakeLock == null) {
            return;
        }
        if (z && this.A02) {
            AbstractC09820fg.A00(wakeLock);
        } else {
            AbstractC09820fg.A01(wakeLock);
        }
    }

    public C4Xk(Context context) {
        this.A03 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
