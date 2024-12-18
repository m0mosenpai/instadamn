package X;

/* renamed from: X.9Jy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208399Jy extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public int A01;
    public final int A02 = 0;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208399Jy(C8B7 c8b7, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(1, interfaceC23621Ds);
        this.A05 = z;
        this.A03 = c8b7;
        this.A04 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A02 != 0) {
            return new C208399Jy((C221219pj) this.A03, this.A04, interfaceC23621Ds, this.A00, this.A05);
        }
        return new C208399Jy((C8B7) this.A03, this.A04, interfaceC23621Ds, this.A05);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C208399Jy) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:302:0x0593, code lost:
    
        if (r6.isEmpty() != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0595, code lost:
    
        r24 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0597, code lost:
    
        if (r2 == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x059d, code lost:
    
        if (r6.isEmpty() == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x059f, code lost:
    
        r25 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05a1, code lost:
    
        r8 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x05a9, code lost:
    
        if (r8.hasNext() == false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x05ab, code lost:
    
        r2 = r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05b8, code lost:
    
        if (((X.C195108kC) r2).A0F() != X.EnumC195148kG.A08) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05ba, code lost:
    
        r2 = (X.C195108kC) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x05bc, code lost:
    
        if (r2 == null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05be, code lost:
    
        r2 = r2.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05c2, code lost:
    
        if (r2 == null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05c4, code lost:
    
        r8 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05cc, code lost:
    
        if (r8.hasNext() == false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x05ce, code lost:
    
        r2 = r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05db, code lost:
    
        if (((X.C195118kD) r2).A0E() != X.EnumC195158kH.VIDEO_MIN_LENGTH_IN_MS) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x05dd, code lost:
    
        r2 = (X.C195118kD) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x05df, code lost:
    
        if (r2 == null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05e1, code lost:
    
        r2 = r2.A0F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x05e5, code lost:
    
        if (r2 == null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x05e7, code lost:
    
        r2 = r2.getOptionalStringField(0, "property_string_value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x05ed, code lost:
    
        if (r2 == null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x05ef, code lost:
    
        r11 = X.AbstractC003100w.A0i(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x05f3, code lost:
    
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x05fb, code lost:
    
        if (r6.hasNext() == false) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05fd, code lost:
    
        r2 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x060a, code lost:
    
        if (((X.C195108kC) r2).A0F() != X.EnumC195148kG.A08) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x060c, code lost:
    
        r2 = (X.C195108kC) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x060e, code lost:
    
        if (r2 == null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0610, code lost:
    
        r2 = r2.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0614, code lost:
    
        if (r2 == null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0616, code lost:
    
        r6 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x061e, code lost:
    
        if (r6.hasNext() == false) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0620, code lost:
    
        r2 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x062d, code lost:
    
        if (((X.C195118kD) r2).A0E() != X.EnumC195158kH.VIDEO_MAX_LENGTH_IN_MS) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x062f, code lost:
    
        r2 = (X.C195118kD) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0631, code lost:
    
        if (r2 == null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0633, code lost:
    
        r2 = r2.A0F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0637, code lost:
    
        if (r2 == null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0639, code lost:
    
        r2 = r2.getOptionalStringField(0, "property_string_value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x063f, code lost:
    
        if (r2 == null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0641, code lost:
    
        r12 = X.AbstractC003100w.A0i(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x06a9, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0645, code lost:
    
        r9 = new X.C173637oF(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r0, r24, r25, false, false);
        X.AbstractC173097nN.A02(r5, 2);
        r3 = r1.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0663, code lost:
    
        if (r3.AIi(r3.getValue(), new X.C3NX(r9)) == false) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x06ab, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x06ae, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x06b1, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x06b4, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x06b7, code lost:
    
        r4 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x06bf, code lost:
    
        if (r4.hasNext() == false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x06cd, code lost:
    
        if (((X.C195108kC) r4.next()).A0F() != X.EnumC195148kG.A06) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x06cf, code lost:
    
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x06f0, code lost:
    
        r8 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x06f8, code lost:
    
        if (r8.hasNext() == false) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0706, code lost:
    
        if (((X.C195108kC) r8.next()).A0F() != X.EnumC195148kG.A03) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0708, code lost:
    
        r24 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x06ec, code lost:
    
        if (r2 == false) goto L345;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06ec A[EDGE_INSN: B:414:0x06ec->B:412:0x06ec BREAK  A[LOOP:21: B:406:0x06d7->B:413:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x07d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x07db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x07fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0803 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0825 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x082b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v44, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 2218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208399Jy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208399Jy(C221219pj c221219pj, String str, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(1, interfaceC23621Ds);
        this.A03 = c221219pj;
        this.A05 = z;
        this.A04 = str;
        this.A00 = i;
    }
}
