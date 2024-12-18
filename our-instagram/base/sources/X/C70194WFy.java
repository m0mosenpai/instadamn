package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ca.psiphon.PsiphonTunnel;

/* renamed from: X.WFy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70194WFy {
    public static C70194WFy A04;
    public C69083VhZ A00;
    public C69083VhZ A01;
    public final Object A03 = new Object();
    public final Handler A02 = new Handler(Looper.getMainLooper(), new WIZ(this, 1));

    public static C70194WFy A00() {
        C70194WFy c70194WFy = A04;
        if (c70194WFy == null) {
            C70194WFy c70194WFy2 = new C70194WFy();
            A04 = c70194WFy2;
            return c70194WFy2;
        }
        return c70194WFy;
    }

    public static void A01(C69083VhZ c69083VhZ, C70194WFy c70194WFy) {
        int i = c69083VhZ.A00;
        if (i != -2) {
            int i2 = 2750;
            if (i > 0) {
                i2 = i;
            } else if (i == -1) {
                i2 = PsiphonTunnel.VPN_INTERFACE_MTU;
            }
            Handler handler = c70194WFy.A02;
            handler.removeCallbacksAndMessages(c69083VhZ);
            handler.sendMessageDelayed(Message.obtain(handler, 0, c69083VhZ), i2);
        }
    }

    public static void A02(C70194WFy c70194WFy) {
        C69083VhZ c69083VhZ = c70194WFy.A01;
        if (c69083VhZ != null) {
            c70194WFy.A00 = c69083VhZ;
            c70194WFy.A01 = null;
            X87 x87 = (X87) c69083VhZ.A02.get();
            if (x87 != null) {
                AbstractC166997dE.A1H(AbstractC70175WEx.A0D, ((WcV) x87).A00, 0);
            } else {
                c70194WFy.A00 = null;
            }
        }
    }

    public static boolean A03(X87 x87, C70194WFy c70194WFy) {
        C69083VhZ c69083VhZ = c70194WFy.A00;
        if (c69083VhZ != null && x87 != null && c69083VhZ.A02.get() == x87) {
            return true;
        }
        return false;
    }

    public static boolean A04(C69083VhZ c69083VhZ, C70194WFy c70194WFy, int i) {
        X87 x87 = (X87) c69083VhZ.A02.get();
        if (x87 != null) {
            c70194WFy.A02.removeCallbacksAndMessages(c69083VhZ);
            Handler handler = AbstractC70175WEx.A0D;
            handler.sendMessage(handler.obtainMessage(1, i, 0, ((WcV) x87).A00));
            return true;
        }
        return false;
    }

    public final void A05(X87 x87) {
        synchronized (this.A03) {
            if (A03(x87, this)) {
                C69083VhZ c69083VhZ = this.A00;
                if (!c69083VhZ.A01) {
                    c69083VhZ.A01 = true;
                    this.A02.removeCallbacksAndMessages(c69083VhZ);
                }
            }
        }
    }

    public final void A06(X87 x87) {
        synchronized (this.A03) {
            if (A03(x87, this)) {
                C69083VhZ c69083VhZ = this.A00;
                if (c69083VhZ.A01) {
                    c69083VhZ.A01 = false;
                    A01(c69083VhZ, this);
                }
            }
        }
    }
}
