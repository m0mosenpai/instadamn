package X;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import java.util.List;

/* renamed from: X.1TI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1TI extends C0R8 {
    public static final IntentFilter A03;
    public final Handler A00;
    public final List A01;
    public final boolean A02;

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "AsyncActivityOperation";
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        A03 = intentFilter;
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.intent.action.HDMI_PLUGGED");
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (this.A01.isEmpty() && !this.A02) {
            return;
        }
        C0HU.A03(new QFX(this));
        if (Build.VERSION.SDK_INT >= 31) {
            C0HU.A05("activity_client_controller");
        }
        C0HU.A05("activity_task");
        C0HU.A05("activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103113189846L)) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1TI(X.C0Rw r4) {
        /*
            r3 = this;
            r3.<init>(r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.A01 = r2
            android.os.Handler r0 = r4.Aex()
            r3.A00 = r0
            java.lang.Class<X.0hA> r0 = X.C10420hA.class
            X.0Rw r0 = r3.A05(r0)
            if (r0 == 0) goto L52
            r0 = 36314103113058772(0x81037c006409d4, double:3.0285232616302005E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            if (r0 == 0) goto L2d
            java.lang.String r0 = "setTaskDescription"
            r2.add(r0)
        L2d:
            r0 = 36314103110896067(0x81037c004309c3, double:3.028523260262497E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            if (r0 == 0) goto L42
            java.lang.String r0 = "unregisterReceiver"
            r2.add(r0)
        L42:
            r0 = 36314103113189846(0x81037c006609d6, double:3.028523261713092E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L53
        L52:
            r0 = 0
        L53:
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1TI.<init>(X.0Rw):void");
    }
}
