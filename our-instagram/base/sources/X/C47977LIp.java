package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.LIp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47977LIp {
    public final UserSession A00;
    public final C7O1 A01;
    public final C47810L9s A02;
    public final LAA A03;

    public C47977LIp(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = AbstractC46927Kp8.A00(userSession);
        this.A02 = (C47810L9s) userSession.A01(C47810L9s.class, new MHR(userSession, 44));
        this.A01 = C7O0.A00(userSession);
    }

    public static final int A00(C2EC c2ec, C1OW c1ow, boolean z, boolean z2) {
        EnumC46242KdI enumC46242KdI;
        if (!z || !c2ec.Ay8()) {
            if (z2) {
                return 3;
            }
            L1W l1w = c1ow.A02.A00;
            if (l1w != null && (enumC46242KdI = l1w.A00) != null) {
                int ordinal = enumC46242KdI.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        return 0;
                    }
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        }
        return 2;
    }

    public final void A02(TransportPayload transportPayload, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, DirectThreadKey directThreadKey, int i) {
        A03(transportPayload, interfaceC37261GbE, c1ow, directThreadKey, i, false, false);
    }

    public static final String A01(C2EC c2ec, C1OW c1ow, C47977LIp c47977LIp) {
        C114675Fx c114675Fx;
        UserSession userSession = c47977LIp.A00;
        if (c2ec.CWj(userSession) && (c114675Fx = c1ow.A03) != null && c114675Fx.A01 == EnumC46247KdO.A0E && C14360o3.A0K(c114675Fx.A03, RealtimeSubscription.GRAPHQL_MQTT_VERSION) && C18U.A06(C06090Tz.A05, userSession, 36327748217617239L)) {
            String A0w = AbstractC43593JPy.A0w();
            String A00 = c47977LIp.A03.A00(c1ow.A05);
            if (A00 != null) {
                C120005by.A02(0, A00, A0w);
            }
            return A0w;
        }
        return c1ow.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x03ad, code lost:
    
        if (r11 != 5) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0458, code lost:
    
        if (r7 != 2) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0381 A[Catch: all -> 0x04dd, TryCatch #0 {all -> 0x04dd, blocks: (B:53:0x01ea, B:55:0x01f4, B:57:0x01fa, B:59:0x0200, B:63:0x020d, B:65:0x0213, B:66:0x0221, B:67:0x022f, B:69:0x0235, B:72:0x024d, B:74:0x0257, B:77:0x025f, B:79:0x0278, B:82:0x028c, B:84:0x0296, B:86:0x02a0, B:88:0x02a4, B:90:0x02b1, B:92:0x02e2, B:94:0x02ec, B:96:0x02fb, B:97:0x0325, B:98:0x0329, B:100:0x032d, B:102:0x0342, B:103:0x0345, B:105:0x0381, B:107:0x039a, B:115:0x03b6, B:121:0x03c0, B:123:0x03d3, B:124:0x03d5, B:128:0x03de, B:130:0x03e2, B:132:0x03ec, B:135:0x03f4, B:137:0x0406, B:139:0x040e, B:140:0x0446, B:143:0x0401, B:144:0x0413, B:145:0x0427, B:147:0x042d, B:148:0x042f, B:151:0x0435, B:153:0x0442, B:154:0x044c, B:158:0x045c, B:163:0x031f, B:164:0x0305, B:166:0x030b, B:167:0x0312, B:169:0x0318, B:170:0x0242, B:172:0x0265), top: B:52:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d3 A[Catch: all -> 0x04dd, TryCatch #0 {all -> 0x04dd, blocks: (B:53:0x01ea, B:55:0x01f4, B:57:0x01fa, B:59:0x0200, B:63:0x020d, B:65:0x0213, B:66:0x0221, B:67:0x022f, B:69:0x0235, B:72:0x024d, B:74:0x0257, B:77:0x025f, B:79:0x0278, B:82:0x028c, B:84:0x0296, B:86:0x02a0, B:88:0x02a4, B:90:0x02b1, B:92:0x02e2, B:94:0x02ec, B:96:0x02fb, B:97:0x0325, B:98:0x0329, B:100:0x032d, B:102:0x0342, B:103:0x0345, B:105:0x0381, B:107:0x039a, B:115:0x03b6, B:121:0x03c0, B:123:0x03d3, B:124:0x03d5, B:128:0x03de, B:130:0x03e2, B:132:0x03ec, B:135:0x03f4, B:137:0x0406, B:139:0x040e, B:140:0x0446, B:143:0x0401, B:144:0x0413, B:145:0x0427, B:147:0x042d, B:148:0x042f, B:151:0x0435, B:153:0x0442, B:154:0x044c, B:158:0x045c, B:163:0x031f, B:164:0x0305, B:166:0x030b, B:167:0x0312, B:169:0x0318, B:170:0x0242, B:172:0x0265), top: B:52:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x042d A[Catch: all -> 0x04dd, TryCatch #0 {all -> 0x04dd, blocks: (B:53:0x01ea, B:55:0x01f4, B:57:0x01fa, B:59:0x0200, B:63:0x020d, B:65:0x0213, B:66:0x0221, B:67:0x022f, B:69:0x0235, B:72:0x024d, B:74:0x0257, B:77:0x025f, B:79:0x0278, B:82:0x028c, B:84:0x0296, B:86:0x02a0, B:88:0x02a4, B:90:0x02b1, B:92:0x02e2, B:94:0x02ec, B:96:0x02fb, B:97:0x0325, B:98:0x0329, B:100:0x032d, B:102:0x0342, B:103:0x0345, B:105:0x0381, B:107:0x039a, B:115:0x03b6, B:121:0x03c0, B:123:0x03d3, B:124:0x03d5, B:128:0x03de, B:130:0x03e2, B:132:0x03ec, B:135:0x03f4, B:137:0x0406, B:139:0x040e, B:140:0x0446, B:143:0x0401, B:144:0x0413, B:145:0x0427, B:147:0x042d, B:148:0x042f, B:151:0x0435, B:153:0x0442, B:154:0x044c, B:158:0x045c, B:163:0x031f, B:164:0x0305, B:166:0x030b, B:167:0x0312, B:169:0x0318, B:170:0x0242, B:172:0x0265), top: B:52:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0242 A[Catch: all -> 0x04dd, TryCatch #0 {all -> 0x04dd, blocks: (B:53:0x01ea, B:55:0x01f4, B:57:0x01fa, B:59:0x0200, B:63:0x020d, B:65:0x0213, B:66:0x0221, B:67:0x022f, B:69:0x0235, B:72:0x024d, B:74:0x0257, B:77:0x025f, B:79:0x0278, B:82:0x028c, B:84:0x0296, B:86:0x02a0, B:88:0x02a4, B:90:0x02b1, B:92:0x02e2, B:94:0x02ec, B:96:0x02fb, B:97:0x0325, B:98:0x0329, B:100:0x032d, B:102:0x0342, B:103:0x0345, B:105:0x0381, B:107:0x039a, B:115:0x03b6, B:121:0x03c0, B:123:0x03d3, B:124:0x03d5, B:128:0x03de, B:130:0x03e2, B:132:0x03ec, B:135:0x03f4, B:137:0x0406, B:139:0x040e, B:140:0x0446, B:143:0x0401, B:144:0x0413, B:145:0x0427, B:147:0x042d, B:148:0x042f, B:151:0x0435, B:153:0x0442, B:154:0x044c, B:158:0x045c, B:163:0x031f, B:164:0x0305, B:166:0x030b, B:167:0x0312, B:169:0x0318, B:170:0x0242, B:172:0x0265), top: B:52:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0213 A[Catch: all -> 0x04dd, TryCatch #0 {all -> 0x04dd, blocks: (B:53:0x01ea, B:55:0x01f4, B:57:0x01fa, B:59:0x0200, B:63:0x020d, B:65:0x0213, B:66:0x0221, B:67:0x022f, B:69:0x0235, B:72:0x024d, B:74:0x0257, B:77:0x025f, B:79:0x0278, B:82:0x028c, B:84:0x0296, B:86:0x02a0, B:88:0x02a4, B:90:0x02b1, B:92:0x02e2, B:94:0x02ec, B:96:0x02fb, B:97:0x0325, B:98:0x0329, B:100:0x032d, B:102:0x0342, B:103:0x0345, B:105:0x0381, B:107:0x039a, B:115:0x03b6, B:121:0x03c0, B:123:0x03d3, B:124:0x03d5, B:128:0x03de, B:130:0x03e2, B:132:0x03ec, B:135:0x03f4, B:137:0x0406, B:139:0x040e, B:140:0x0446, B:143:0x0401, B:144:0x0413, B:145:0x0427, B:147:0x042d, B:148:0x042f, B:151:0x0435, B:153:0x0442, B:154:0x044c, B:158:0x045c, B:163:0x031f, B:164:0x0305, B:166:0x030b, B:167:0x0312, B:169:0x0318, B:170:0x0242, B:172:0x0265), top: B:52:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0235 A[Catch: all -> 0x04dd, LOOP:0: B:67:0x022f->B:69:0x0235, LOOP_END, TryCatch #0 {all -> 0x04dd, blocks: (B:53:0x01ea, B:55:0x01f4, B:57:0x01fa, B:59:0x0200, B:63:0x020d, B:65:0x0213, B:66:0x0221, B:67:0x022f, B:69:0x0235, B:72:0x024d, B:74:0x0257, B:77:0x025f, B:79:0x0278, B:82:0x028c, B:84:0x0296, B:86:0x02a0, B:88:0x02a4, B:90:0x02b1, B:92:0x02e2, B:94:0x02ec, B:96:0x02fb, B:97:0x0325, B:98:0x0329, B:100:0x032d, B:102:0x0342, B:103:0x0345, B:105:0x0381, B:107:0x039a, B:115:0x03b6, B:121:0x03c0, B:123:0x03d3, B:124:0x03d5, B:128:0x03de, B:130:0x03e2, B:132:0x03ec, B:135:0x03f4, B:137:0x0406, B:139:0x040e, B:140:0x0446, B:143:0x0401, B:144:0x0413, B:145:0x0427, B:147:0x042d, B:148:0x042f, B:151:0x0435, B:153:0x0442, B:154:0x044c, B:158:0x045c, B:163:0x031f, B:164:0x0305, B:166:0x030b, B:167:0x0312, B:169:0x0318, B:170:0x0242, B:172:0x0265), top: B:52:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024d A[Catch: all -> 0x04dd, TryCatch #0 {all -> 0x04dd, blocks: (B:53:0x01ea, B:55:0x01f4, B:57:0x01fa, B:59:0x0200, B:63:0x020d, B:65:0x0213, B:66:0x0221, B:67:0x022f, B:69:0x0235, B:72:0x024d, B:74:0x0257, B:77:0x025f, B:79:0x0278, B:82:0x028c, B:84:0x0296, B:86:0x02a0, B:88:0x02a4, B:90:0x02b1, B:92:0x02e2, B:94:0x02ec, B:96:0x02fb, B:97:0x0325, B:98:0x0329, B:100:0x032d, B:102:0x0342, B:103:0x0345, B:105:0x0381, B:107:0x039a, B:115:0x03b6, B:121:0x03c0, B:123:0x03d3, B:124:0x03d5, B:128:0x03de, B:130:0x03e2, B:132:0x03ec, B:135:0x03f4, B:137:0x0406, B:139:0x040e, B:140:0x0446, B:143:0x0401, B:144:0x0413, B:145:0x0427, B:147:0x042d, B:148:0x042f, B:151:0x0435, B:153:0x0442, B:154:0x044c, B:158:0x045c, B:163:0x031f, B:164:0x0305, B:166:0x030b, B:167:0x0312, B:169:0x0318, B:170:0x0242, B:172:0x0265), top: B:52:0x01ea }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r72, X.InterfaceC37261GbE r73, X.C1OW r74, com.instagram.model.direct.DirectThreadKey r75, int r76, boolean r77, boolean r78) {
        /*
            Method dump skipped, instructions count: 1253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47977LIp.A03(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload, X.GbE, X.1OW, com.instagram.model.direct.DirectThreadKey, int, boolean, boolean):void");
    }
}
