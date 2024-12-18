package X;

import android.content.IntentFilter;

/* renamed from: X.2MG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2MG extends C2MH {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.C2MH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(android.content.Intent r5) {
        /*
            r4 = this;
            r3 = 0
            java.lang.String r2 = r5.getAction()
            if (r2 == 0) goto L12
            X.C48442Kl.A00()
            int r0 = r2.hashCode()
            r1 = 1
            switch(r0) {
                case -1886648615: goto L26;
                case -54942926: goto L23;
                case 948344062: goto L16;
                case 1019184907: goto L13;
                default: goto L12;
            }
        L12:
            return
        L13:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            goto L18
        L16:
            java.lang.String r0 = "android.os.action.CHARGING"
        L18:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L32
        L23:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            goto L28
        L26:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
        L28:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
        L32:
            r4.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2MG.A05(android.content.Intent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r1 != 5) goto L5;
     */
    @Override // X.C2MJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A00() {
        /*
            r4 = this;
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>(r0)
            android.content.Context r1 = r4.A01
            r0 = 0
            android.content.Intent r3 = r1.registerReceiver(r0, r2)
            if (r3 != 0) goto L21
            X.C48442Kl.A00()
            java.lang.String r1 = X.AbstractC62298S5t.A00
            java.lang.String r0 = "getInitialState - null intent received"
            android.util.Log.e(r1, r0)
        L1b:
            r2 = 0
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L21:
            r2 = 1
            r1 = -1
            java.lang.String r0 = "status"
            int r1 = r3.getIntExtra(r0, r1)
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 5
            if (r1 != r0) goto L1b
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2MG.A00():java.lang.Object");
    }

    @Override // X.C2MH
    public final IntentFilter A04() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }
}
