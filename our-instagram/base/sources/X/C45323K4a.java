package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;

/* renamed from: X.K4a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45323K4a extends AbstractRunnableC94874Os {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttNetworkSessionPlugin A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45323K4a(MqttNetworkSessionPlugin mqttNetworkSessionPlugin, String str, int i) {
        super("onMqttPubError");
        this.A01 = mqttNetworkSessionPlugin;
        this.A02 = str;
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x001b, code lost:
    
        r4 = X.C05F.A03;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            java.lang.String r6 = r7.A02
            int r5 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L1e
            r0 = 16
            java.lang.Integer[] r3 = X.C05F.A00(r0)     // Catch: java.lang.NumberFormatException -> L1e
            int r2 = r3.length     // Catch: java.lang.NumberFormatException -> L1e
            r1 = 0
        Le:
            if (r1 >= r2) goto L1b
            r4 = r3[r1]     // Catch: java.lang.NumberFormatException -> L1e
            int r0 = X.AbstractC46569Kj8.A00(r4)     // Catch: java.lang.NumberFormatException -> L1e
            if (r0 == r5) goto L20
            int r1 = r1 + 1
            goto Le
        L1b:
            java.lang.Integer r4 = X.C05F.A03     // Catch: java.lang.NumberFormatException -> L1e
            goto L20
        L1e:
            java.lang.Integer r4 = X.C05F.A03
        L20:
            java.lang.Integer r3 = X.C05F.A03
            com.facebook.msys.mcd.MqttNetworkSessionPlugin r2 = r7.A01
            int r1 = r7.A00
            if (r4 == r3) goto L30
            int r0 = X.AbstractC46569Kj8.A00(r4)
        L2c:
            com.facebook.msys.mcd.MqttNetworkSessionPlugin.access$700(r2, r1, r6, r0)
            return
        L30:
            java.lang.Integer r0 = X.AbstractC62804SRy.A00(r6)
            if (r0 != 0) goto L38
            r0 = 0
            goto L2c
        L38:
            int r0 = r0.intValue()
            switch(r0) {
                case 8: goto L56;
                case 9: goto L59;
                case 10: goto L5c;
                case 11: goto L59;
                case 12: goto L5f;
                default: goto L3f;
            }
        L3f:
            switch(r0) {
                case 13: goto L56;
                case 14: goto L56;
                case 15: goto L56;
                case 16: goto L56;
                case 17: goto L50;
                case 18: goto L50;
                case 19: goto L50;
                case 20: goto L56;
                case 21: goto L56;
                case 22: goto L56;
                case 23: goto L56;
                case 24: goto L56;
                case 25: goto L56;
                case 26: goto L56;
                case 27: goto L59;
                case 28: goto L53;
                case 29: goto L53;
                case 30: goto L56;
                case 31: goto L56;
                case 32: goto L53;
                default: goto L42;
            }
        L42:
            switch(r0) {
                case 33: goto L59;
                case 34: goto L59;
                case 35: goto L56;
                case 36: goto L56;
                case 37: goto L59;
                case 38: goto L4d;
                case 39: goto L50;
                case 40: goto L59;
                case 41: goto L50;
                case 42: goto L59;
                case 43: goto L59;
                case 44: goto L53;
                case 45: goto L59;
                case 46: goto L59;
                case 47: goto L48;
                case 48: goto L50;
                case 49: goto L59;
                case 50: goto L59;
                case 51: goto L53;
                case 52: goto L59;
                case 53: goto L48;
                case 54: goto L48;
                case 55: goto L59;
                case 56: goto L5f;
                case 57: goto L59;
                case 58: goto L5c;
                case 59: goto L59;
                case 60: goto L53;
                case 61: goto L59;
                default: goto L45;
            }
        L45:
            switch(r0) {
                case 5: goto L53;
                case 6: goto L5c;
                case 7: goto L56;
                default: goto L48;
            }
        L48:
            int r0 = X.AbstractC46569Kj8.A00(r3)
            goto L2c
        L4d:
            java.lang.Integer r3 = X.C05F.A02
            goto L48
        L50:
            java.lang.Integer r3 = X.C05F.A01
            goto L48
        L53:
            java.lang.Integer r3 = X.C05F.A1F
            goto L48
        L56:
            java.lang.Integer r3 = X.C05F.A1I
            goto L48
        L59:
            java.lang.Integer r3 = X.C05F.A0C
            goto L48
        L5c:
            java.lang.Integer r3 = X.C05F.A00
            goto L48
        L5f:
            java.lang.Integer r3 = X.C05F.A0Y
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45323K4a.run():void");
    }
}
