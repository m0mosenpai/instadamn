package X;

import com.facebook.tigon.tigonmns.TigonMNSTokenBindingCallbacks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes11.dex */
public final class UtQ extends TigonMNSTokenBindingCallbacks {
    public final AbstractC12990ll A00;
    public final ABA A01;
    public final C69559VrO A02;

    public UtQ(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = abstractC12990ll;
        C18720vz deviceSession = abstractC12990ll.getDeviceSession();
        C14360o3.A0B(deviceSession, 0);
        this.A02 = (C69559VrO) deviceSession.A01(C69559VrO.class, C71780X4h.A00);
        C18720vz deviceSession2 = abstractC12990ll.getDeviceSession();
        C14360o3.A0B(deviceSession2, 0);
        this.A01 = (ABA) deviceSession2.A01(ABA.class, new X2z(deviceSession2, 27));
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0409, code lost:
    
        if (r1 >= 65536) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0469, code lost:
    
        if (r13 >= 65536) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04fa A[Catch: VHq -> 0x0542, TryCatch #1 {VHq -> 0x0542, blocks: (B:19:0x0077, B:22:0x00a2, B:24:0x00b2, B:25:0x00b7, B:27:0x00c4, B:29:0x00cc, B:31:0x00d1, B:35:0x00e7, B:38:0x0101, B:39:0x0105, B:41:0x0223, B:43:0x0231, B:45:0x0249, B:46:0x024e, B:48:0x0259, B:50:0x0261, B:54:0x026a, B:63:0x029f, B:64:0x02ae, B:66:0x02c9, B:74:0x02fc, B:76:0x0318, B:77:0x031a, B:79:0x0324, B:82:0x032e, B:85:0x033b, B:87:0x0343, B:88:0x0348, B:92:0x0353, B:94:0x0365, B:96:0x036d, B:97:0x0372, B:100:0x0379, B:101:0x0396, B:102:0x039b, B:103:0x0384, B:105:0x038a, B:107:0x0390, B:109:0x039c, B:110:0x03b0, B:71:0x03c7, B:72:0x03d9, B:114:0x03b2, B:115:0x03c6, B:116:0x03da, B:120:0x03ef, B:125:0x040e, B:127:0x043b, B:129:0x0447, B:131:0x0461, B:136:0x046e, B:138:0x0480, B:139:0x048d, B:142:0x048e, B:144:0x0498, B:145:0x04a3, B:147:0x04a4, B:148:0x04af, B:149:0x02da, B:151:0x02de, B:152:0x04b0, B:153:0x04c6, B:156:0x04c8, B:157:0x04cf, B:158:0x04d0, B:159:0x04e4, B:160:0x0299, B:161:0x029c, B:162:0x028e, B:163:0x04e5, B:164:0x04f9, B:168:0x04fa, B:169:0x0508, B:170:0x0154, B:171:0x0158, B:175:0x0171, B:176:0x0185, B:177:0x0186, B:179:0x018e, B:180:0x019d, B:182:0x01aa, B:183:0x01ba, B:188:0x01e6, B:189:0x0509, B:190:0x0514, B:191:0x01c6, B:193:0x01ca, B:194:0x0515, B:195:0x0538, B:198:0x053a, B:199:0x0541, B:200:0x0189, B:201:0x018c, B:206:0x0099), top: B:18:0x0077, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0231 A[Catch: VHq -> 0x0542, TryCatch #1 {VHq -> 0x0542, blocks: (B:19:0x0077, B:22:0x00a2, B:24:0x00b2, B:25:0x00b7, B:27:0x00c4, B:29:0x00cc, B:31:0x00d1, B:35:0x00e7, B:38:0x0101, B:39:0x0105, B:41:0x0223, B:43:0x0231, B:45:0x0249, B:46:0x024e, B:48:0x0259, B:50:0x0261, B:54:0x026a, B:63:0x029f, B:64:0x02ae, B:66:0x02c9, B:74:0x02fc, B:76:0x0318, B:77:0x031a, B:79:0x0324, B:82:0x032e, B:85:0x033b, B:87:0x0343, B:88:0x0348, B:92:0x0353, B:94:0x0365, B:96:0x036d, B:97:0x0372, B:100:0x0379, B:101:0x0396, B:102:0x039b, B:103:0x0384, B:105:0x038a, B:107:0x0390, B:109:0x039c, B:110:0x03b0, B:71:0x03c7, B:72:0x03d9, B:114:0x03b2, B:115:0x03c6, B:116:0x03da, B:120:0x03ef, B:125:0x040e, B:127:0x043b, B:129:0x0447, B:131:0x0461, B:136:0x046e, B:138:0x0480, B:139:0x048d, B:142:0x048e, B:144:0x0498, B:145:0x04a3, B:147:0x04a4, B:148:0x04af, B:149:0x02da, B:151:0x02de, B:152:0x04b0, B:153:0x04c6, B:156:0x04c8, B:157:0x04cf, B:158:0x04d0, B:159:0x04e4, B:160:0x0299, B:161:0x029c, B:162:0x028e, B:163:0x04e5, B:164:0x04f9, B:168:0x04fa, B:169:0x0508, B:170:0x0154, B:171:0x0158, B:175:0x0171, B:176:0x0185, B:177:0x0186, B:179:0x018e, B:180:0x019d, B:182:0x01aa, B:183:0x01ba, B:188:0x01e6, B:189:0x0509, B:190:0x0514, B:191:0x01c6, B:193:0x01ca, B:194:0x0515, B:195:0x0538, B:198:0x053a, B:199:0x0541, B:200:0x0189, B:201:0x018c, B:206:0x0099), top: B:18:0x0077, inners: #0, #2, #3 }] */
    /* JADX WARN: Type inference failed for: r1v36, types: [X.XpM, java.lang.Object] */
    @Override // com.facebook.tigon.tigonmns.TigonMNSTokenBindingCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getHeaderValue(java.lang.String r27, byte[] r28) {
        /*
            Method dump skipped, instructions count: 1359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UtQ.getHeaderValue(java.lang.String, byte[]):java.lang.String");
    }

    @Override // com.facebook.tigon.tigonmns.TigonMNSTokenBindingCallbacks
    public final ScheduledExecutorService getScheduledExecutorService() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
        C14360o3.A07(scheduledThreadPoolExecutor);
        return scheduledThreadPoolExecutor;
    }

    @Override // com.facebook.tigon.tigonmns.TigonMNSTokenBindingCallbacks
    public final String getAllowedHosts() {
        return C20150ym.A03(AbstractC20070ye.A00(18873245939991314L));
    }
}
