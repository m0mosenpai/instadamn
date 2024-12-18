package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: X.0Kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04270Kt implements C0L3 {
    public final Context A02;
    public final Handler A03;
    public volatile boolean A04;
    public final BroadcastReceiver A01 = new BroadcastReceiver() { // from class: X.0OZ
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String str;
            C0AG c0ag;
            int A01 = C0f9.A01(-1282877687);
            C0fM.A01(this, context, intent);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                str = extras.getString("reason");
            } else {
                str = null;
            }
            C04270Kt c04270Kt = C04270Kt.this;
            if (c04270Kt.A00) {
                synchronized (C0AG.class) {
                    c0ag = C0AG.A09;
                    if (c0ag == null) {
                        c0ag = new C0AG();
                        C0AG.A09 = c0ag;
                    }
                }
                synchronized (c0ag.A06) {
                    C03J c03j = c0ag.A01;
                    if (c03j != null) {
                        final C005801x c005801x = c03j.A00;
                        C07960bG c07960bG = c005801x.A0F;
                        if (c07960bG != null) {
                            synchronized (c07960bG) {
                                try {
                                    C07960bG.A02(c07960bG, C05F.A0C, new byte[0]);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        C003801d c003801d = c005801x.A00;
                        if (c003801d != null) {
                            synchronized (c003801d.A02) {
                                try {
                                    c003801d.A01.A00.put(202, (byte) 49);
                                    C003801d.A02(c003801d);
                                } finally {
                                }
                            }
                            final C0LW c0lw = c005801x.A0C;
                            final C0M6 c0m6 = C0M6.CRITICAL_REPORT;
                            final C024209q c024209q = new C024209q(null);
                            final Integer num = C05F.A00;
                            if (c0lw.A08) {
                                C04590Mb.A04.execute(new Runnable() { // from class: X.0LU
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C0LW c0lw2 = c0lw;
                                        C0OO c0oo = c005801x;
                                        C0M6 c0m62 = c0m6;
                                        C024209q c024209q2 = c024209q;
                                        Integer num2 = num;
                                        c0lw2.A0E(c0m62, c0oo);
                                        c0lw2.A0A(c024209q2, c0m62, c0oo, c0oo.BNJ(), num2, 0);
                                        c0lw2.A0D(c0m62, c0oo);
                                    }
                                });
                            } else {
                                c0lw.A0E(c0m6, c005801x);
                                c0lw.A0A(c024209q, c0m6, c005801x, c005801x.A0I, num, 0);
                                c0lw.A0D(c0m6, c005801x);
                            }
                        }
                    }
                }
            }
            synchronized (c04270Kt) {
            }
            C0K8.A0A(C04270Kt.class, "CLOSE_SYSTEM_DIALOGS received, likely heading to background: %s", str);
            C0f9.A0E(1322274071, A01, intent);
        }
    };
    public final boolean A00 = true;

    public C04270Kt(Context context, Handler handler) {
        this.A02 = context;
        this.A03 = handler;
        C0L6.A03(this, true);
    }

    @Override // X.C0L3
    public final void Cwx() {
        if (!this.A04) {
            C0DJ.A02(this.A01, this.A02, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), this.A03, null, true);
            this.A04 = true;
        }
    }

    @Override // X.C0L3
    public final void Cx1() {
        try {
            if (this.A04) {
                this.A04 = false;
                this.A02.unregisterReceiver(this.A01);
            }
        } catch (IllegalArgumentException e) {
            C0PC.A00().DEh("HomeTaskSwitchUnregister", e, null);
        }
    }
}
