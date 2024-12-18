package X;

/* loaded from: classes10.dex */
public final class TON implements Runnable {
    public final /* synthetic */ C62678SLr A00;
    public final /* synthetic */ Q8J A01;

    public TON(C62678SLr c62678SLr, Q8J q8j) {
        this.A01 = q8j;
        this.A00 = c62678SLr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x02cc, code lost:
    
        if (r9.getCoercedBooleanField(5, "should_order_new_options_first") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02e0, code lost:
    
        if (r9.getCoercedBooleanField(6, "should_de_prioritize_credit_cards") == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04fc, code lost:
    
        if (r7 != false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0951, code lost:
    
        if (r8 != null) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0953, code lost:
    
        r6 = r8.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x09f8, code lost:
    
        if (r8 != null) goto L475;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e8 A[Catch: Exception -> 0x0332, TRY_ENTER, TryCatch #8 {Exception -> 0x0332, blocks: (B:199:0x01c0, B:201:0x01c6, B:203:0x01cc, B:205:0x01d4, B:127:0x01e8, B:128:0x01fc, B:130:0x0202, B:133:0x0215, B:138:0x0219, B:139:0x0231, B:141:0x0237, B:144:0x024a, B:149:0x024e, B:150:0x0266, B:152:0x026c, B:155:0x0274, B:160:0x0278, B:161:0x028c, B:163:0x0292, B:166:0x029a, B:171:0x029e, B:173:0x02ae, B:175:0x02c5, B:177:0x02d0, B:179:0x02d9, B:181:0x02e4, B:183:0x0309, B:185:0x031c, B:186:0x0322, B:187:0x030c, B:189:0x0314, B:191:0x0318, B:194:0x0328, B:195:0x032c, B:196:0x032d, B:197:0x0331), top: B:198:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x032d A[Catch: Exception -> 0x0332, TryCatch #8 {Exception -> 0x0332, blocks: (B:199:0x01c0, B:201:0x01c6, B:203:0x01cc, B:205:0x01d4, B:127:0x01e8, B:128:0x01fc, B:130:0x0202, B:133:0x0215, B:138:0x0219, B:139:0x0231, B:141:0x0237, B:144:0x024a, B:149:0x024e, B:150:0x0266, B:152:0x026c, B:155:0x0274, B:160:0x0278, B:161:0x028c, B:163:0x0292, B:166:0x029a, B:171:0x029e, B:173:0x02ae, B:175:0x02c5, B:177:0x02d0, B:179:0x02d9, B:181:0x02e4, B:183:0x0309, B:185:0x031c, B:186:0x0322, B:187:0x030c, B:189:0x0314, B:191:0x0318, B:194:0x0328, B:195:0x032c, B:196:0x032d, B:197:0x0331), top: B:198:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03e5 A[Catch: Exception -> 0x0444, LOOP:5: B:249:0x03df->B:251:0x03e5, LOOP_END, TryCatch #7 {Exception -> 0x0444, blocks: (B:255:0x036b, B:257:0x0371, B:259:0x0377, B:261:0x037f, B:222:0x038d, B:226:0x03a0, B:228:0x03af, B:230:0x03bc, B:233:0x0401, B:235:0x0407, B:237:0x0416, B:239:0x042f, B:241:0x0433, B:242:0x0439, B:243:0x043f, B:244:0x0443, B:246:0x03c9, B:248:0x03d7, B:249:0x03df, B:251:0x03e5, B:253:0x03fe), top: B:254:0x036b }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0667 A[Catch: Exception -> 0x06df, TRY_ENTER, TryCatch #0 {Exception -> 0x06df, blocks: (B:380:0x063f, B:382:0x0645, B:384:0x064b, B:386:0x0653, B:352:0x0667, B:354:0x0673, B:356:0x0683, B:358:0x0693, B:360:0x06a3, B:362:0x06ad, B:364:0x06b6, B:365:0x06bc, B:366:0x06c0, B:367:0x06c1, B:368:0x06c5, B:369:0x06c6, B:370:0x06ca, B:371:0x06cb, B:372:0x06cf, B:373:0x06d0, B:374:0x06d4, B:375:0x06d5, B:376:0x06d9, B:377:0x06da, B:378:0x06de), top: B:379:0x063f }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x06da A[Catch: Exception -> 0x06df, TryCatch #0 {Exception -> 0x06df, blocks: (B:380:0x063f, B:382:0x0645, B:384:0x064b, B:386:0x0653, B:352:0x0667, B:354:0x0673, B:356:0x0683, B:358:0x0693, B:360:0x06a3, B:362:0x06ad, B:364:0x06b6, B:365:0x06bc, B:366:0x06c0, B:367:0x06c1, B:368:0x06c5, B:369:0x06c6, B:370:0x06ca, B:371:0x06cb, B:372:0x06cf, B:373:0x06d0, B:374:0x06d4, B:375:0x06d5, B:376:0x06d9, B:377:0x06da, B:378:0x06de), top: B:379:0x063f }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x08da  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TON.run():void");
    }
}
