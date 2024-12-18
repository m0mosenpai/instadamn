package X;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.OKl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54812OKl {
    public Boolean A00;
    public final PowerManager A01;
    public final InterfaceC09390do A02 = J8Z.A00(this, 3);

    public final void A00(int i) {
        Boolean bool = this.A00;
        if (bool == null) {
            boolean z = false;
            try {
                PowerManager powerManager = this.A01;
                if (powerManager.isWakeLockLevelSupported(32)) {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("ProximitySensorManager:DetectProximitySensor", new Object[0]);
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(32, formatStrLocaleSafe);
                    C0BX.A02(newWakeLock, formatStrLocaleSafe);
                    if (newWakeLock.isHeld()) {
                        AbstractC09820fg.A01(newWakeLock);
                    }
                    z = true;
                }
            } catch (Exception unused) {
            }
            bool = Boolean.valueOf(z);
            this.A00 = bool;
        }
        if (AbstractC166997dE.A1Z(bool, true)) {
            InterfaceC09390do interfaceC09390do = this.A02;
            AbstractC09820fg.A02((PowerManager.WakeLock) interfaceC09390do.getValue());
            if (!((PowerManager.WakeLock) interfaceC09390do.getValue()).isHeld()) {
                try {
                    if (i > 0) {
                        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) interfaceC09390do.getValue();
                        long j = i;
                        wakeLock.acquire(j);
                        C0BX.A01(wakeLock, j);
                        return;
                    }
                    AbstractC09820fg.A00((PowerManager.WakeLock) interfaceC09390do.getValue());
                } catch (IllegalArgumentException unused2) {
                    this.A00 = false;
                    A01(true);
                }
            }
        }
    }

    public final void A01(boolean z) {
        InterfaceC09390do interfaceC09390do = this.A02;
        if (interfaceC09390do.CWa() && ((PowerManager.WakeLock) interfaceC09390do.getValue()).isHeld()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) interfaceC09390do.getValue();
            if (z) {
                AbstractC09820fg.A01(wakeLock);
            } else {
                wakeLock.release(1);
                C0BX.A00(wakeLock);
            }
        }
    }

    public C54812OKl(Context context) {
        this.A01 = AbstractC50522MSa.A0G(context);
    }
}
