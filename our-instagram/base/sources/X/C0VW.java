package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.0VW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VW extends AbstractC02970Bv {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;
    public final Context A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Bu, java.lang.Object] */
    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03() {
        return new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.content.Intent] */
    @Override // X.AbstractC02970Bv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean A04(X.AbstractC02960Bu r8) {
        /*
            r7 = this;
            X.0Va r8 = (X.C06340Va) r8
            r6 = r7
            X.AbstractC03000By.A00(r8)
            r3 = 0
            android.content.Context r2 = r7.A04     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Exception -> L30
            r0.<init>(r1)     // Catch: java.lang.Exception -> L30
            android.content.Intent r3 = r2.registerReceiver(r3, r0)     // Catch: java.lang.Exception -> L30
            if (r3 == 0) goto L37
            java.lang.String r0 = "level"
            r2 = -1
            int r1 = r3.getIntExtra(r0, r2)
            java.lang.String r0 = "scale"
            int r0 = r3.getIntExtra(r0, r2)
            if (r1 < 0) goto L37
            if (r0 <= 0) goto L37
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            goto L39
        L30:
            java.lang.String r1 = "DeviceBatteryMetricsCollector"
            java.lang.String r0 = "Exception registering receiver for ACTION_BATTERY_CHANGED"
            android.util.Log.e(r1, r0, r3)
        L37:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L39:
            r8.A00 = r1
            long r4 = android.os.SystemClock.elapsedRealtime()
            monitor-enter(r6)
            boolean r0 = r7.A03     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L52
            long r2 = r7.A01     // Catch: java.lang.Throwable -> L5f
            long r0 = r7.A02     // Catch: java.lang.Throwable -> L5f
            long r4 = r4 - r0
            long r2 = r2 + r4
            r8.A02 = r2     // Catch: java.lang.Throwable -> L5f
            long r2 = r7.A00     // Catch: java.lang.Throwable -> L5f
        L4e:
            r8.A01 = r2     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5f
            goto L5d
        L52:
            long r0 = r7.A01     // Catch: java.lang.Throwable -> L5f
            r8.A02 = r0     // Catch: java.lang.Throwable -> L5f
            long r2 = r7.A00     // Catch: java.lang.Throwable -> L5f
            long r0 = r7.A02     // Catch: java.lang.Throwable -> L5f
            long r4 = r4 - r0
            long r2 = r2 + r4
            goto L4e
        L5d:
            r0 = 1
            return r0
        L5f:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VW.A04(X.0Bu):boolean");
    }

    public final void A05(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Consecutive ");
        sb.append(str);
        sb.append("broadcasts: (");
        sb.append(this.A02);
        sb.append(", ");
        sb.append(j);
        sb.append(")");
        android.util.Log.e("DeviceBatteryMetricsCollector", sb.toString(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.Intent] */
    public C0VW(Context context) {
        boolean z;
        int intExtra;
        this.A04 = context;
        ?? r2 = 0;
        try {
            r2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception unused) {
            android.util.Log.e("DeviceBatteryMetricsCollector", "Exception registering receiver for ACTION_BATTERY_CHANGED", r2);
        }
        if (r2 != 0 && ((intExtra = r2.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1)) == 2 || intExtra == 5)) {
            z = true;
            this.A03 = z;
            this.A02 = SystemClock.elapsedRealtime();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            context.registerReceiver(new BroadcastReceiver() { // from class: X.0C3
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    int A01 = C0f9.A01(621189799);
                    C0fM.A01(this, context2, intent);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C0VW c0vw = C0VW.this;
                    synchronized (c0vw) {
                        try {
                            String action = intent.getAction();
                            int hashCode = action.hashCode();
                            if (hashCode != -1886648615) {
                                if (hashCode == 1019184907 && action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    if (!c0vw.A03) {
                                        c0vw.A00 += elapsedRealtime - c0vw.A02;
                                    } else {
                                        c0vw.A01 += elapsedRealtime - c0vw.A02;
                                        c0vw.A05("CONNECTED", elapsedRealtime);
                                    }
                                    c0vw.A03 = true;
                                }
                            } else if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                if (c0vw.A03) {
                                    c0vw.A01 += elapsedRealtime - c0vw.A02;
                                } else {
                                    c0vw.A00 += elapsedRealtime - c0vw.A02;
                                    c0vw.A05("DISCONNECTED", elapsedRealtime);
                                }
                                c0vw.A03 = false;
                            }
                            c0vw.A02 = elapsedRealtime;
                        } catch (Throwable th) {
                            C0f9.A0E(-1142889552, A01, intent);
                            throw th;
                        }
                    }
                    C0f9.A0E(1905358243, A01, intent);
                }
            }, intentFilter);
        }
        z = false;
        this.A03 = z;
        this.A02 = SystemClock.elapsedRealtime();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter2.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        context.registerReceiver(new BroadcastReceiver() { // from class: X.0C3
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                int A01 = C0f9.A01(621189799);
                C0fM.A01(this, context2, intent);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C0VW c0vw = C0VW.this;
                synchronized (c0vw) {
                    try {
                        String action = intent.getAction();
                        int hashCode = action.hashCode();
                        if (hashCode != -1886648615) {
                            if (hashCode == 1019184907 && action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                if (!c0vw.A03) {
                                    c0vw.A00 += elapsedRealtime - c0vw.A02;
                                } else {
                                    c0vw.A01 += elapsedRealtime - c0vw.A02;
                                    c0vw.A05("CONNECTED", elapsedRealtime);
                                }
                                c0vw.A03 = true;
                            }
                        } else if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                            if (c0vw.A03) {
                                c0vw.A01 += elapsedRealtime - c0vw.A02;
                            } else {
                                c0vw.A00 += elapsedRealtime - c0vw.A02;
                                c0vw.A05("DISCONNECTED", elapsedRealtime);
                            }
                            c0vw.A03 = false;
                        }
                        c0vw.A02 = elapsedRealtime;
                    } catch (Throwable th) {
                        C0f9.A0E(-1142889552, A01, intent);
                        throw th;
                    }
                }
                C0f9.A0E(1905358243, A01, intent);
            }
        }, intentFilter2);
    }
}
