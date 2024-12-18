package X;

/* loaded from: classes10.dex */
public final /* synthetic */ class TQk implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC61582Rq6 A01;
    public final /* synthetic */ SJH A02;
    public final /* synthetic */ Runnable A03;

    public /* synthetic */ TQk(AbstractC61582Rq6 abstractC61582Rq6, SJH sjh, Runnable runnable, int i) {
        this.A02 = sjh;
        this.A01 = abstractC61582Rq6;
        this.A00 = i;
        this.A03 = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x09bf, code lost:
    
        r0 = r0.A03();
        X.T49.A02(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0ad0, code lost:
    
        if (r22.iterator().hasNext() == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0ad2, code lost:
    
        r4 = X.AnonymousClass001.A0R("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ", X.T49.A01(r22));
        r6 = r0.A03();
        X.C0fW.A01(r6, -1684447961);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0ae7, code lost:
    
        r4 = r6.compileStatement(r4);
        X.C0fW.A00(357671100);
        r4.execute();
        X.C0fW.A00(-1013668204);
        r8 = r6.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0b04, code lost:
    
        if (r8.moveToNext() == false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0b06, code lost:
    
        r0.ECW(X.Rj4.MAX_RETRIES_REACHED, r8.getString(1), r8.getInt(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0b19, code lost:
    
        r8.close();
        r2 = r6.compileStatement("DELETE FROM events WHERE num_attempts >= 16");
        X.C0fW.A00(257621068);
        r2.execute();
        X.C0fW.A00(1793396735);
        r6.setTransactionSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0b3a, code lost:
    
        X.C0fW.A03(r6, 1571926387);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0b35, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0b39, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0b98, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0b9f, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0b3f, code lost:
    
        r0.ECZ(r0, r0.A06.C8K() + r16);
        r0.setTransactionSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0b53, code lost:
    
        X.C0fW.A03(r0, 1896311136);
        r0.A02.EM2(r0, r0 + 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0942, code lost:
    
        throw X.MSW.A0y("Response is missing nextRequestWaitMillis field.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0a94, code lost:
    
        throw X.AbstractC166987dD.A15("Null transportName");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x09ca A[Catch: TXH -> 0x0c14, all -> 0x0c26, TRY_LEAVE, TryCatch #30 {TXH -> 0x0c14, blocks: (B:3:0x0012, B:15:0x0095, B:18:0x00af, B:20:0x00b5, B:21:0x00c7, B:29:0x0112, B:31:0x011d, B:136:0x0350, B:140:0x09a7, B:141:0x09b2, B:142:0x09b9, B:191:0x09bf, B:212:0x0b53, B:144:0x09ca, B:150:0x0a01, B:184:0x0a0a, B:153:0x0a14, B:156:0x0a18, B:157:0x0a20, B:159:0x0a26, B:161:0x0a3a, B:163:0x0a3e, B:164:0x0a42, B:167:0x0a51, B:175:0x0a82, B:180:0x0c0d, B:181:0x0c13, B:188:0x0b68, B:215:0x0363, B:216:0x036b, B:218:0x0371, B:220:0x037f, B:222:0x0385, B:266:0x0495, B:268:0x04c5, B:270:0x04de, B:282:0x04e2, B:283:0x04f1, B:271:0x04f2, B:273:0x04fd, B:275:0x0505, B:276:0x050b, B:278:0x0511, B:280:0x0b78, B:367:0x0b85, B:303:0x0525, B:305:0x052d, B:306:0x053b, B:308:0x0541, B:315:0x0552, B:311:0x055a, B:318:0x0562, B:319:0x056a, B:321:0x0570, B:324:0x05b7, B:326:0x0609, B:327:0x0616, B:328:0x0622, B:330:0x0628, B:372:0x0641, B:340:0x064a, B:343:0x0670, B:346:0x0688, B:349:0x06a2, B:351:0x06b5, B:352:0x06b7, B:354:0x06bc, B:355:0x06c2, B:357:0x06c6, B:358:0x06cc, B:360:0x06d0, B:361:0x06d6, B:363:0x06dc, B:366:0x0b7f, B:368:0x069a, B:369:0x0680, B:370:0x0668, B:332:0x0702, B:339:0x070f, B:335:0x0722, B:376:0x073c, B:378:0x0744, B:379:0x074a, B:381:0x0750, B:383:0x0ac0, B:386:0x0612, B:387:0x05af, B:389:0x0760, B:507:0x076c, B:509:0x077c, B:511:0x078e, B:513:0x0796, B:517:0x079f, B:520:0x07a6, B:521:0x07b1, B:523:0x07c0, B:524:0x07c6, B:526:0x07b2, B:529:0x07b9, B:392:0x07cb, B:393:0x07d1, B:395:0x0824, B:398:0x082e, B:404:0x084d, B:405:0x0850, B:413:0x086a, B:433:0x08d2, B:434:0x091f, B:436:0x0923, B:440:0x095c, B:442:0x0962, B:449:0x0978, B:450:0x0982, B:451:0x098c, B:475:0x095b, B:478:0x0958, B:479:0x0907, B:480:0x090f, B:494:0x08e9, B:499:0x08e6, B:501:0x08eb, B:503:0x08fa, B:505:0x0997, B:531:0x07c7, B:533:0x0b70, B:544:0x0ba1, B:547:0x0ba8, B:550:0x0be9, B:566:0x0bf0, B:563:0x0bd0, B:576:0x0c05), top: B:2:0x0012, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x09bf A[EDGE_INSN: B:190:0x09bf->B:191:0x09bf BREAK  A[LOOP:1: B:21:0x00c7->B:177:0x00c7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03fb A[Catch: all -> 0x0ab2, TryCatch #9 {all -> 0x0ab2, blocks: (B:227:0x03b2, B:229:0x03b8, B:231:0x03c6, B:233:0x03ca, B:235:0x03cf, B:237:0x03d3, B:239:0x03d8, B:241:0x03dd, B:243:0x03e2, B:244:0x03f0, B:246:0x03fb, B:248:0x0402, B:252:0x040f, B:253:0x0413, B:255:0x0419, B:257:0x0434, B:263:0x045d, B:293:0x0aab, B:294:0x0ab1, B:259:0x0443, B:262:0x0457, B:289:0x0aa6, B:290:0x0aa9, B:261:0x044b), top: B:226:0x03b2, outer: #12, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v151, types: [java.lang.Object, X.SJ2] */
    /* JADX WARN: Type inference failed for: r0v159, types: [java.lang.Object, X.SJ2] */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r4v66, types: [X.Rj4] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 3115
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TQk.run():void");
    }
}
