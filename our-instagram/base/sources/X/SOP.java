package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes10.dex */
public abstract class SOP {
    public BroadcastReceiver A00;
    public final /* synthetic */ LayoutInflaterFactory2C52042a4 A01;

    public SOP(LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4) {
        this.A01 = layoutInflaterFactory2C52042a4;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.SM6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SOP.A00():int");
    }

    public final void A01() {
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            try {
                this.A01.A0l.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.A00 = null;
        }
    }

    public final void A02() {
        IntentFilter intentFilter;
        String str;
        A01();
        if (this instanceof C58724Q5a) {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            str = "android.intent.action.TIME_TICK";
        } else {
            intentFilter = new IntentFilter();
            str = "android.os.action.POWER_SAVE_MODE_CHANGED";
        }
        intentFilter.addAction(str);
        if (intentFilter.countActions() != 0) {
            BroadcastReceiver broadcastReceiver = this.A00;
            if (broadcastReceiver == null) {
                broadcastReceiver = new Q1k(this, 0);
                this.A00 = broadcastReceiver;
            }
            this.A01.A0l.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
