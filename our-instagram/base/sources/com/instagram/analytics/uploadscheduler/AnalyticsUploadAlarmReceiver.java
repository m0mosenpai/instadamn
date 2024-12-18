package com.instagram.analytics.uploadscheduler;

import android.content.BroadcastReceiver;

/* loaded from: classes2.dex */
public final class AnalyticsUploadAlarmReceiver extends BroadcastReceiver {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r3 != null) goto L12;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            r0 = -1934231635(0xffffffff8cb5f7ad, float:-2.803653E-31)
            int r2 = X.C0f9.A01(r0)
            X.C0fM.A01(r7, r8, r9)
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            r0 = 1
            X.C14360o3.A0B(r9, r0)
            java.lang.String r6 = r9.getAction()
            X.3Tl[] r5 = X.EnumC73993Tl.values()
            int r4 = r5.length
            r1 = 0
        L1c:
            if (r1 >= r4) goto L2b
            r3 = r5[r1]
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r0, r6)
            if (r0 != 0) goto L2c
            int r1 = r1 + 1
            goto L1c
        L2b:
            r3 = 0
        L2c:
            X.3Tl r0 = X.EnumC73993Tl.A07
            if (r3 != r0) goto L63
            X.0vz r0 = X.AbstractC12960li.A00
            X.18s r1 = X.C226218q.A01(r0)
            java.lang.Integer r0 = X.C05F.A07
        L38:
            r1.A0L(r9, r0)
        L3b:
            r0 = 0
            r3.A02 = r0
        L3e:
            X.09Y r0 = X.C023409i.A0A
            X.0vv r0 = r0.A05(r7)
            X.0xH r1 = X.AbstractC11060iN.A00(r0)
            boolean r0 = r1 instanceof X.InterfaceC19300xE
            if (r0 == 0) goto L5c
            X.0iX r1 = (X.InterfaceC11160iX) r1
            X.1t1 r1 = (X.C39771t1) r1
            X.1t0 r1 = r1.A00
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 5
            android.os.Message r0 = r1.obtainMessage(r0)
            r1.sendMessage(r0)
        L5c:
            r0 = 843667725(0x3249590d, float:1.1719988E-8)
            X.C0f9.A0E(r0, r2, r9)
            return
        L63:
            X.3Tl r0 = X.EnumC73993Tl.A06
            if (r3 != r0) goto L70
            X.0vz r0 = X.AbstractC12960li.A00
            X.18s r1 = X.C226218q.A01(r0)
            java.lang.Integer r0 = X.C05F.A06
            goto L38
        L70:
            if (r3 == 0) goto L3e
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.analytics.uploadscheduler.AnalyticsUploadAlarmReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
