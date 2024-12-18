package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4Bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92274Bh extends C91954Ab {
    public final VpsEventCallback A00;
    public final C2BZ A01;
    public final boolean A02;
    public final long A03;
    public final C2B4 A04;
    public final C2BB A05;
    public final HeroPlayerSetting A06;
    public final InterfaceC460429o A07;
    public final C4BB A08;
    public final AtomicReference A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003e, code lost:
    
        if (r18.A2p != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C92274Bh(X.C2B4 r11, X.C4AZ r12, com.facebook.exoplayer.monitor.VpsEventCallback r13, X.C2BB r14, X.C2BZ r15, X.C4AP r16, X.C5QS r17, com.facebook.video.heroplayer.setting.HeroPlayerSetting r18, X.InterfaceC460429o r19, X.C4BB r20, java.lang.String r21, java.lang.String r22, java.util.concurrent.atomic.AtomicReference r23, long r24, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            r10 = this;
            r9 = r26
            r5 = r16
            r3 = r10
            r4 = r12
            r6 = r17
            r7 = r21
            r8 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2 = r18
            r10.A06 = r2
            r10.A01 = r15
            r10.A04 = r11
            r10.A05 = r14
            r10.A00 = r13
            r0 = r19
            r10.A07 = r0
            r0 = r27
            r10.A0C = r0
            r0 = r28
            r10.A0A = r0
            r0 = r29
            r10.A0B = r0
            r0 = r24
            r10.A03 = r0
            r0 = r23
            r10.A09 = r0
            r0 = r20
            r10.A08 = r0
            boolean r0 = r2.A2n
            if (r0 != 0) goto L40
            boolean r1 = r2.A2p
            r0 = 0
            if (r1 == 0) goto L41
        L40:
            r0 = 1
        L41:
            r10.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92274Bh.<init>(X.2B4, X.4AZ, com.facebook.exoplayer.monitor.VpsEventCallback, X.2BB, X.2BZ, X.4AP, X.5QS, com.facebook.video.heroplayer.setting.HeroPlayerSetting, X.29o, X.4BB, java.lang.String, java.lang.String, java.util.concurrent.atomic.AtomicReference, long, boolean, boolean, boolean, boolean):void");
    }

    public static C4CG A00(C92274Bh c92274Bh, String str) {
        C4BB c4bb = c92274Bh.A08;
        if (c4bb != null) {
            C4B6 c4b6 = c4bb.A02;
            C4AP c4ap = ((C91954Ab) c92274Bh).A02;
            String str2 = c4b6.A0R;
            String str3 = "";
            String str4 = "";
            if (str2 != null) {
                str4 = str2;
            }
            String str5 = c4b6.A0S;
            if (str5 != null) {
                str3 = str5;
            }
            return new C4CG(c4ap, str, str4, str3, c4b6.A01, c4b6.A0A, c4b6.A0L, c4b6.A04, c4b6.A0D);
        }
        return new C4CG(((C91954Ab) c92274Bh).A02, str, "", "", -1.0f, -1, -1, -1, -1);
    }

    public static void A01(C92274Bh c92274Bh, String str) {
        VpsEventCallback vpsEventCallback;
        C4AP c4ap;
        C4AN c4an;
        String str2;
        if (c92274Bh.A02 && (vpsEventCallback = c92274Bh.A00) != null && (c4ap = ((C91954Ab) c92274Bh).A02) != null && (c4an = c4ap.A0D) != null && (str2 = c4an.A0G) != null) {
            vpsEventCallback.callback(new C138306Om(str2, String.valueOf(c4ap.A0L), str, true));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0126, code lost:
    
        if (r7 != null) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x084f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026a A[Catch: Exception -> 0x0823, TRY_ENTER, TryCatch #13 {Exception -> 0x0823, blocks: (B:3:0x0041, B:5:0x004d, B:7:0x0055, B:8:0x0059, B:10:0x00ca, B:20:0x0074, B:22:0x0078, B:24:0x007c, B:26:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0096, B:34:0x009a, B:36:0x00b9, B:37:0x00bf, B:38:0x00d1, B:40:0x00e1, B:41:0x00f1, B:43:0x00f9, B:45:0x0105, B:47:0x0114, B:49:0x011e, B:52:0x0157, B:55:0x0165, B:59:0x0128, B:62:0x0130, B:63:0x0137, B:69:0x0142, B:76:0x0232, B:78:0x0239, B:79:0x023c, B:82:0x0246, B:83:0x0248, B:445:0x0822, B:93:0x0285, B:95:0x02a2, B:96:0x02c2, B:157:0x026a, B:159:0x0271, B:160:0x0274, B:163:0x027e, B:164:0x0280, B:139:0x021d, B:142:0x0228, B:143:0x022a, B:182:0x07c6, B:184:0x07cd, B:185:0x07d0, B:188:0x07da, B:189:0x07dc, B:65:0x0152, B:66:0x0153, B:203:0x02d0, B:205:0x02d6, B:207:0x02da, B:209:0x02de, B:211:0x02e4, B:212:0x02f8, B:214:0x031e, B:215:0x0320, B:220:0x0328, B:226:0x033d, B:228:0x0355, B:230:0x035e, B:233:0x0365, B:234:0x036d, B:237:0x03c8, B:239:0x03e1, B:241:0x03e7, B:248:0x0568, B:250:0x056f, B:252:0x0575, B:253:0x057c, B:256:0x0586, B:257:0x0588, B:267:0x05d3, B:271:0x061e, B:273:0x0624, B:275:0x0630, B:277:0x063a, B:279:0x064a, B:281:0x067f, B:282:0x0687, B:286:0x0697, B:289:0x06e9, B:291:0x0713, B:294:0x0716, B:297:0x071f, B:300:0x0692, B:301:0x0643, B:302:0x0733, B:304:0x0752, B:306:0x0758, B:307:0x077a, B:309:0x077e, B:314:0x078d, B:316:0x07a0, B:317:0x07ac, B:399:0x05ae, B:401:0x05b5, B:403:0x05bb, B:404:0x05c2, B:407:0x05cc, B:408:0x05ce, B:381:0x0553, B:384:0x055e, B:385:0x0560, B:427:0x07fa, B:429:0x0801, B:431:0x0807, B:432:0x080e, B:435:0x0818, B:436:0x081a, B:451:0x035a, B:128:0x01f8, B:130:0x01ff, B:132:0x0214, B:370:0x0534, B:372:0x053b, B:374:0x054a), top: B:2:0x0041, inners: #16, #19, #26, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[Catch: all -> 0x07c5, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #17 {, blocks: (B:128:0x01f8, B:130:0x01ff, B:132:0x0214, B:155:0x0251, B:177:0x07c4), top: B:68:0x0142 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0589 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x064a A[Catch: Exception -> 0x0823, TryCatch #13 {Exception -> 0x0823, blocks: (B:3:0x0041, B:5:0x004d, B:7:0x0055, B:8:0x0059, B:10:0x00ca, B:20:0x0074, B:22:0x0078, B:24:0x007c, B:26:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0096, B:34:0x009a, B:36:0x00b9, B:37:0x00bf, B:38:0x00d1, B:40:0x00e1, B:41:0x00f1, B:43:0x00f9, B:45:0x0105, B:47:0x0114, B:49:0x011e, B:52:0x0157, B:55:0x0165, B:59:0x0128, B:62:0x0130, B:63:0x0137, B:69:0x0142, B:76:0x0232, B:78:0x0239, B:79:0x023c, B:82:0x0246, B:83:0x0248, B:445:0x0822, B:93:0x0285, B:95:0x02a2, B:96:0x02c2, B:157:0x026a, B:159:0x0271, B:160:0x0274, B:163:0x027e, B:164:0x0280, B:139:0x021d, B:142:0x0228, B:143:0x022a, B:182:0x07c6, B:184:0x07cd, B:185:0x07d0, B:188:0x07da, B:189:0x07dc, B:65:0x0152, B:66:0x0153, B:203:0x02d0, B:205:0x02d6, B:207:0x02da, B:209:0x02de, B:211:0x02e4, B:212:0x02f8, B:214:0x031e, B:215:0x0320, B:220:0x0328, B:226:0x033d, B:228:0x0355, B:230:0x035e, B:233:0x0365, B:234:0x036d, B:237:0x03c8, B:239:0x03e1, B:241:0x03e7, B:248:0x0568, B:250:0x056f, B:252:0x0575, B:253:0x057c, B:256:0x0586, B:257:0x0588, B:267:0x05d3, B:271:0x061e, B:273:0x0624, B:275:0x0630, B:277:0x063a, B:279:0x064a, B:281:0x067f, B:282:0x0687, B:286:0x0697, B:289:0x06e9, B:291:0x0713, B:294:0x0716, B:297:0x071f, B:300:0x0692, B:301:0x0643, B:302:0x0733, B:304:0x0752, B:306:0x0758, B:307:0x077a, B:309:0x077e, B:314:0x078d, B:316:0x07a0, B:317:0x07ac, B:399:0x05ae, B:401:0x05b5, B:403:0x05bb, B:404:0x05c2, B:407:0x05cc, B:408:0x05ce, B:381:0x0553, B:384:0x055e, B:385:0x0560, B:427:0x07fa, B:429:0x0801, B:431:0x0807, B:432:0x080e, B:435:0x0818, B:436:0x081a, B:451:0x035a, B:128:0x01f8, B:130:0x01ff, B:132:0x0214, B:370:0x0534, B:372:0x053b, B:374:0x054a), top: B:2:0x0041, inners: #16, #19, #26, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0752 A[Catch: Exception -> 0x0823, TryCatch #13 {Exception -> 0x0823, blocks: (B:3:0x0041, B:5:0x004d, B:7:0x0055, B:8:0x0059, B:10:0x00ca, B:20:0x0074, B:22:0x0078, B:24:0x007c, B:26:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0096, B:34:0x009a, B:36:0x00b9, B:37:0x00bf, B:38:0x00d1, B:40:0x00e1, B:41:0x00f1, B:43:0x00f9, B:45:0x0105, B:47:0x0114, B:49:0x011e, B:52:0x0157, B:55:0x0165, B:59:0x0128, B:62:0x0130, B:63:0x0137, B:69:0x0142, B:76:0x0232, B:78:0x0239, B:79:0x023c, B:82:0x0246, B:83:0x0248, B:445:0x0822, B:93:0x0285, B:95:0x02a2, B:96:0x02c2, B:157:0x026a, B:159:0x0271, B:160:0x0274, B:163:0x027e, B:164:0x0280, B:139:0x021d, B:142:0x0228, B:143:0x022a, B:182:0x07c6, B:184:0x07cd, B:185:0x07d0, B:188:0x07da, B:189:0x07dc, B:65:0x0152, B:66:0x0153, B:203:0x02d0, B:205:0x02d6, B:207:0x02da, B:209:0x02de, B:211:0x02e4, B:212:0x02f8, B:214:0x031e, B:215:0x0320, B:220:0x0328, B:226:0x033d, B:228:0x0355, B:230:0x035e, B:233:0x0365, B:234:0x036d, B:237:0x03c8, B:239:0x03e1, B:241:0x03e7, B:248:0x0568, B:250:0x056f, B:252:0x0575, B:253:0x057c, B:256:0x0586, B:257:0x0588, B:267:0x05d3, B:271:0x061e, B:273:0x0624, B:275:0x0630, B:277:0x063a, B:279:0x064a, B:281:0x067f, B:282:0x0687, B:286:0x0697, B:289:0x06e9, B:291:0x0713, B:294:0x0716, B:297:0x071f, B:300:0x0692, B:301:0x0643, B:302:0x0733, B:304:0x0752, B:306:0x0758, B:307:0x077a, B:309:0x077e, B:314:0x078d, B:316:0x07a0, B:317:0x07ac, B:399:0x05ae, B:401:0x05b5, B:403:0x05bb, B:404:0x05c2, B:407:0x05cc, B:408:0x05ce, B:381:0x0553, B:384:0x055e, B:385:0x0560, B:427:0x07fa, B:429:0x0801, B:431:0x0807, B:432:0x080e, B:435:0x0818, B:436:0x081a, B:451:0x035a, B:128:0x01f8, B:130:0x01ff, B:132:0x0214, B:370:0x0534, B:372:0x053b, B:374:0x054a), top: B:2:0x0041, inners: #16, #19, #26, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x077e A[Catch: Exception -> 0x0823, TryCatch #13 {Exception -> 0x0823, blocks: (B:3:0x0041, B:5:0x004d, B:7:0x0055, B:8:0x0059, B:10:0x00ca, B:20:0x0074, B:22:0x0078, B:24:0x007c, B:26:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0096, B:34:0x009a, B:36:0x00b9, B:37:0x00bf, B:38:0x00d1, B:40:0x00e1, B:41:0x00f1, B:43:0x00f9, B:45:0x0105, B:47:0x0114, B:49:0x011e, B:52:0x0157, B:55:0x0165, B:59:0x0128, B:62:0x0130, B:63:0x0137, B:69:0x0142, B:76:0x0232, B:78:0x0239, B:79:0x023c, B:82:0x0246, B:83:0x0248, B:445:0x0822, B:93:0x0285, B:95:0x02a2, B:96:0x02c2, B:157:0x026a, B:159:0x0271, B:160:0x0274, B:163:0x027e, B:164:0x0280, B:139:0x021d, B:142:0x0228, B:143:0x022a, B:182:0x07c6, B:184:0x07cd, B:185:0x07d0, B:188:0x07da, B:189:0x07dc, B:65:0x0152, B:66:0x0153, B:203:0x02d0, B:205:0x02d6, B:207:0x02da, B:209:0x02de, B:211:0x02e4, B:212:0x02f8, B:214:0x031e, B:215:0x0320, B:220:0x0328, B:226:0x033d, B:228:0x0355, B:230:0x035e, B:233:0x0365, B:234:0x036d, B:237:0x03c8, B:239:0x03e1, B:241:0x03e7, B:248:0x0568, B:250:0x056f, B:252:0x0575, B:253:0x057c, B:256:0x0586, B:257:0x0588, B:267:0x05d3, B:271:0x061e, B:273:0x0624, B:275:0x0630, B:277:0x063a, B:279:0x064a, B:281:0x067f, B:282:0x0687, B:286:0x0697, B:289:0x06e9, B:291:0x0713, B:294:0x0716, B:297:0x071f, B:300:0x0692, B:301:0x0643, B:302:0x0733, B:304:0x0752, B:306:0x0758, B:307:0x077a, B:309:0x077e, B:314:0x078d, B:316:0x07a0, B:317:0x07ac, B:399:0x05ae, B:401:0x05b5, B:403:0x05bb, B:404:0x05c2, B:407:0x05cc, B:408:0x05ce, B:381:0x0553, B:384:0x055e, B:385:0x0560, B:427:0x07fa, B:429:0x0801, B:431:0x0807, B:432:0x080e, B:435:0x0818, B:436:0x081a, B:451:0x035a, B:128:0x01f8, B:130:0x01ff, B:132:0x0214, B:370:0x0534, B:372:0x053b, B:374:0x054a), top: B:2:0x0041, inners: #16, #19, #26, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07a0 A[Catch: Exception -> 0x0823, TryCatch #13 {Exception -> 0x0823, blocks: (B:3:0x0041, B:5:0x004d, B:7:0x0055, B:8:0x0059, B:10:0x00ca, B:20:0x0074, B:22:0x0078, B:24:0x007c, B:26:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0096, B:34:0x009a, B:36:0x00b9, B:37:0x00bf, B:38:0x00d1, B:40:0x00e1, B:41:0x00f1, B:43:0x00f9, B:45:0x0105, B:47:0x0114, B:49:0x011e, B:52:0x0157, B:55:0x0165, B:59:0x0128, B:62:0x0130, B:63:0x0137, B:69:0x0142, B:76:0x0232, B:78:0x0239, B:79:0x023c, B:82:0x0246, B:83:0x0248, B:445:0x0822, B:93:0x0285, B:95:0x02a2, B:96:0x02c2, B:157:0x026a, B:159:0x0271, B:160:0x0274, B:163:0x027e, B:164:0x0280, B:139:0x021d, B:142:0x0228, B:143:0x022a, B:182:0x07c6, B:184:0x07cd, B:185:0x07d0, B:188:0x07da, B:189:0x07dc, B:65:0x0152, B:66:0x0153, B:203:0x02d0, B:205:0x02d6, B:207:0x02da, B:209:0x02de, B:211:0x02e4, B:212:0x02f8, B:214:0x031e, B:215:0x0320, B:220:0x0328, B:226:0x033d, B:228:0x0355, B:230:0x035e, B:233:0x0365, B:234:0x036d, B:237:0x03c8, B:239:0x03e1, B:241:0x03e7, B:248:0x0568, B:250:0x056f, B:252:0x0575, B:253:0x057c, B:256:0x0586, B:257:0x0588, B:267:0x05d3, B:271:0x061e, B:273:0x0624, B:275:0x0630, B:277:0x063a, B:279:0x064a, B:281:0x067f, B:282:0x0687, B:286:0x0697, B:289:0x06e9, B:291:0x0713, B:294:0x0716, B:297:0x071f, B:300:0x0692, B:301:0x0643, B:302:0x0733, B:304:0x0752, B:306:0x0758, B:307:0x077a, B:309:0x077e, B:314:0x078d, B:316:0x07a0, B:317:0x07ac, B:399:0x05ae, B:401:0x05b5, B:403:0x05bb, B:404:0x05c2, B:407:0x05cc, B:408:0x05ce, B:381:0x0553, B:384:0x055e, B:385:0x0560, B:427:0x07fa, B:429:0x0801, B:431:0x0807, B:432:0x080e, B:435:0x0818, B:436:0x081a, B:451:0x035a, B:128:0x01f8, B:130:0x01ff, B:132:0x0214, B:370:0x0534, B:372:0x053b, B:374:0x054a), top: B:2:0x0041, inners: #16, #19, #26, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x05ae A[Catch: Exception -> 0x0823, TRY_ENTER, TryCatch #13 {Exception -> 0x0823, blocks: (B:3:0x0041, B:5:0x004d, B:7:0x0055, B:8:0x0059, B:10:0x00ca, B:20:0x0074, B:22:0x0078, B:24:0x007c, B:26:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0096, B:34:0x009a, B:36:0x00b9, B:37:0x00bf, B:38:0x00d1, B:40:0x00e1, B:41:0x00f1, B:43:0x00f9, B:45:0x0105, B:47:0x0114, B:49:0x011e, B:52:0x0157, B:55:0x0165, B:59:0x0128, B:62:0x0130, B:63:0x0137, B:69:0x0142, B:76:0x0232, B:78:0x0239, B:79:0x023c, B:82:0x0246, B:83:0x0248, B:445:0x0822, B:93:0x0285, B:95:0x02a2, B:96:0x02c2, B:157:0x026a, B:159:0x0271, B:160:0x0274, B:163:0x027e, B:164:0x0280, B:139:0x021d, B:142:0x0228, B:143:0x022a, B:182:0x07c6, B:184:0x07cd, B:185:0x07d0, B:188:0x07da, B:189:0x07dc, B:65:0x0152, B:66:0x0153, B:203:0x02d0, B:205:0x02d6, B:207:0x02da, B:209:0x02de, B:211:0x02e4, B:212:0x02f8, B:214:0x031e, B:215:0x0320, B:220:0x0328, B:226:0x033d, B:228:0x0355, B:230:0x035e, B:233:0x0365, B:234:0x036d, B:237:0x03c8, B:239:0x03e1, B:241:0x03e7, B:248:0x0568, B:250:0x056f, B:252:0x0575, B:253:0x057c, B:256:0x0586, B:257:0x0588, B:267:0x05d3, B:271:0x061e, B:273:0x0624, B:275:0x0630, B:277:0x063a, B:279:0x064a, B:281:0x067f, B:282:0x0687, B:286:0x0697, B:289:0x06e9, B:291:0x0713, B:294:0x0716, B:297:0x071f, B:300:0x0692, B:301:0x0643, B:302:0x0733, B:304:0x0752, B:306:0x0758, B:307:0x077a, B:309:0x077e, B:314:0x078d, B:316:0x07a0, B:317:0x07ac, B:399:0x05ae, B:401:0x05b5, B:403:0x05bb, B:404:0x05c2, B:407:0x05cc, B:408:0x05ce, B:381:0x0553, B:384:0x055e, B:385:0x0560, B:427:0x07fa, B:429:0x0801, B:431:0x0807, B:432:0x080e, B:435:0x0818, B:436:0x081a, B:451:0x035a, B:128:0x01f8, B:130:0x01ff, B:132:0x0214, B:370:0x0534, B:372:0x053b, B:374:0x054a), top: B:2:0x0041, inners: #16, #19, #26, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:417:? A[Catch: all -> 0x07f9, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #11 {, blocks: (B:370:0x0534, B:372:0x053b, B:374:0x054a, B:397:0x0593, B:424:0x07f8), top: B:240:0x03e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0239 A[Catch: Exception -> 0x0823, TryCatch #13 {Exception -> 0x0823, blocks: (B:3:0x0041, B:5:0x004d, B:7:0x0055, B:8:0x0059, B:10:0x00ca, B:20:0x0074, B:22:0x0078, B:24:0x007c, B:26:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0096, B:34:0x009a, B:36:0x00b9, B:37:0x00bf, B:38:0x00d1, B:40:0x00e1, B:41:0x00f1, B:43:0x00f9, B:45:0x0105, B:47:0x0114, B:49:0x011e, B:52:0x0157, B:55:0x0165, B:59:0x0128, B:62:0x0130, B:63:0x0137, B:69:0x0142, B:76:0x0232, B:78:0x0239, B:79:0x023c, B:82:0x0246, B:83:0x0248, B:445:0x0822, B:93:0x0285, B:95:0x02a2, B:96:0x02c2, B:157:0x026a, B:159:0x0271, B:160:0x0274, B:163:0x027e, B:164:0x0280, B:139:0x021d, B:142:0x0228, B:143:0x022a, B:182:0x07c6, B:184:0x07cd, B:185:0x07d0, B:188:0x07da, B:189:0x07dc, B:65:0x0152, B:66:0x0153, B:203:0x02d0, B:205:0x02d6, B:207:0x02da, B:209:0x02de, B:211:0x02e4, B:212:0x02f8, B:214:0x031e, B:215:0x0320, B:220:0x0328, B:226:0x033d, B:228:0x0355, B:230:0x035e, B:233:0x0365, B:234:0x036d, B:237:0x03c8, B:239:0x03e1, B:241:0x03e7, B:248:0x0568, B:250:0x056f, B:252:0x0575, B:253:0x057c, B:256:0x0586, B:257:0x0588, B:267:0x05d3, B:271:0x061e, B:273:0x0624, B:275:0x0630, B:277:0x063a, B:279:0x064a, B:281:0x067f, B:282:0x0687, B:286:0x0697, B:289:0x06e9, B:291:0x0713, B:294:0x0716, B:297:0x071f, B:300:0x0692, B:301:0x0643, B:302:0x0733, B:304:0x0752, B:306:0x0758, B:307:0x077a, B:309:0x077e, B:314:0x078d, B:316:0x07a0, B:317:0x07ac, B:399:0x05ae, B:401:0x05b5, B:403:0x05bb, B:404:0x05c2, B:407:0x05cc, B:408:0x05ce, B:381:0x0553, B:384:0x055e, B:385:0x0560, B:427:0x07fa, B:429:0x0801, B:431:0x0807, B:432:0x080e, B:435:0x0818, B:436:0x081a, B:451:0x035a, B:128:0x01f8, B:130:0x01ff, B:132:0x0214, B:370:0x0534, B:372:0x053b, B:374:0x054a), top: B:2:0x0041, inners: #16, #19, #26, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a2 A[Catch: Exception -> 0x0823, TryCatch #13 {Exception -> 0x0823, blocks: (B:3:0x0041, B:5:0x004d, B:7:0x0055, B:8:0x0059, B:10:0x00ca, B:20:0x0074, B:22:0x0078, B:24:0x007c, B:26:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0096, B:34:0x009a, B:36:0x00b9, B:37:0x00bf, B:38:0x00d1, B:40:0x00e1, B:41:0x00f1, B:43:0x00f9, B:45:0x0105, B:47:0x0114, B:49:0x011e, B:52:0x0157, B:55:0x0165, B:59:0x0128, B:62:0x0130, B:63:0x0137, B:69:0x0142, B:76:0x0232, B:78:0x0239, B:79:0x023c, B:82:0x0246, B:83:0x0248, B:445:0x0822, B:93:0x0285, B:95:0x02a2, B:96:0x02c2, B:157:0x026a, B:159:0x0271, B:160:0x0274, B:163:0x027e, B:164:0x0280, B:139:0x021d, B:142:0x0228, B:143:0x022a, B:182:0x07c6, B:184:0x07cd, B:185:0x07d0, B:188:0x07da, B:189:0x07dc, B:65:0x0152, B:66:0x0153, B:203:0x02d0, B:205:0x02d6, B:207:0x02da, B:209:0x02de, B:211:0x02e4, B:212:0x02f8, B:214:0x031e, B:215:0x0320, B:220:0x0328, B:226:0x033d, B:228:0x0355, B:230:0x035e, B:233:0x0365, B:234:0x036d, B:237:0x03c8, B:239:0x03e1, B:241:0x03e7, B:248:0x0568, B:250:0x056f, B:252:0x0575, B:253:0x057c, B:256:0x0586, B:257:0x0588, B:267:0x05d3, B:271:0x061e, B:273:0x0624, B:275:0x0630, B:277:0x063a, B:279:0x064a, B:281:0x067f, B:282:0x0687, B:286:0x0697, B:289:0x06e9, B:291:0x0713, B:294:0x0716, B:297:0x071f, B:300:0x0692, B:301:0x0643, B:302:0x0733, B:304:0x0752, B:306:0x0758, B:307:0x077a, B:309:0x077e, B:314:0x078d, B:316:0x07a0, B:317:0x07ac, B:399:0x05ae, B:401:0x05b5, B:403:0x05bb, B:404:0x05c2, B:407:0x05cc, B:408:0x05ce, B:381:0x0553, B:384:0x055e, B:385:0x0560, B:427:0x07fa, B:429:0x0801, B:431:0x0807, B:432:0x080e, B:435:0x0818, B:436:0x081a, B:451:0x035a, B:128:0x01f8, B:130:0x01ff, B:132:0x0214, B:370:0x0534, B:372:0x053b, B:374:0x054a), top: B:2:0x0041, inners: #16, #19, #26, #25 }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.4Bq] */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.4Bq, X.4Bs, X.4Br, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2BZ] */
    /* JADX WARN: Type inference failed for: r4v10, types: [long] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v45, types: [int] */
    /* JADX WARN: Type inference failed for: r4v46, types: [long] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v89 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // X.C91954Ab, X.InterfaceC91964Ac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ5() {
        /*
            Method dump skipped, instructions count: 2140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92274Bh.AQ5():void");
    }

    @Override // X.C91954Ab, X.InterfaceC91964Ac
    public final void onComplete() {
        VpsEventCallback vpsEventCallback;
        super.onComplete();
        if (this.A02 && (vpsEventCallback = this.A00) != null && super.A02 != null) {
            vpsEventCallback.callback(A00(this, "SUCCESS"));
        }
    }
}
