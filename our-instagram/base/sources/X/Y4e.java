package X;

/* loaded from: classes12.dex */
public final class Y4e {
    public final TIX A00;

    public static float A00(Y1j y1j, Y1j y1j2, Y4e y4e) {
        int i = (int) y1j.A00;
        int i2 = (int) y1j.A01;
        int i3 = (int) y1j2.A00;
        int i4 = (int) y1j2.A01;
        float A02 = A02(y4e, i, i2, i3, i4);
        float A022 = A02(y4e, i3, i4, i, i2);
        if (Float.isNaN(A02)) {
            return A022 / 7.0f;
        }
        if (Float.isNaN(A022)) {
            return A02 / 7.0f;
        }
        return (A02 + A022) / 14.0f;
    }

    public static float A01(Y4e y4e, int i, int i2, int i3, int i4) {
        double d;
        double d2;
        int i5 = i3;
        int i6 = i;
        boolean z = false;
        int i7 = i2;
        int i8 = i4;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
            i7 = i6;
            i6 = i2;
            i8 = i5;
            i5 = i4;
        }
        int abs = Math.abs(i5 - i6);
        int i9 = i8 - i7;
        int abs2 = Math.abs(i9);
        int i10 = (-abs) / 2;
        int i11 = -1;
        int i12 = -1;
        if (i6 < i5) {
            i12 = 1;
        }
        if (i7 < i8) {
            i11 = 1;
        }
        int i13 = i5 + i12;
        int i14 = i7;
        int i15 = 0;
        for (int i16 = i6; i16 != i13; i16 += i12) {
            int i17 = i16;
            int i18 = i14;
            if (z) {
                i17 = i14;
                i18 = i16;
            }
            if (AbstractC167007dF.A1P(i15, 1) == y4e.A00.A03(i17, i18)) {
                if (i15 == 2) {
                    d = i16 - i6;
                    d2 = i14 - i7;
                    break;
                }
                i15++;
            }
            i10 += abs2;
            if (i10 > 0) {
                if (i14 == i8) {
                    break;
                }
                i14 += i11;
                i10 -= abs;
            }
        }
        if (i15 == 2) {
            d = i13 - i6;
            d2 = i9;
            return (float) Math.sqrt((d * d) + (d2 * d2));
        }
        return Float.NaN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x023e, code lost:
    
        if (r0 != 3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r0 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04f1, code lost:
    
        if (r9[1] <= r14) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04f4, code lost:
    
        if (r13 >= r10) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04fc, code lost:
    
        if (r0.A03(r0, r13) != false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x04fe, code lost:
    
        r0 = r9[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0500, code lost:
    
        if (r0 > r14) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0502, code lost:
    
        r9[2] = r0 + 1;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0509, code lost:
    
        r15 = r9[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x050b, code lost:
    
        if (r15 > r14) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x050d, code lost:
    
        r0 = r9[0];
        r1 = r9[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x051d, code lost:
    
        if ((java.lang.Math.abs(((r0 + r1) + r15) - r18) * 5) >= (r18 * 2)) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x051f, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0526, code lost:
    
        if (X.AbstractC72048XLo.A00(r9, r12, r0) >= r20) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0528, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x052a, code lost:
    
        if (r0 < 3) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x052c, code lost:
    
        r16 = (r13 - r15) - (r1 / 2.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0380, code lost:
    
        r21 = 2.0f;
        r17 = r12 / 2.0f;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x038b, code lost:
    
        if (X.AbstractC72048XLo.A00(r6, r12, r0) >= r17) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x038d, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x038f, code lost:
    
        if (r0 < 3) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0391, code lost:
    
        r16 = r6[0];
        r1 = r6[1];
        r16 = (r16 + r1) + r6[2];
        r14 = (r11 - r0) - (r1 / 2.0f);
        r13 = (int) r14;
        r3 = r1 * 2;
        r9[0] = 0;
        r9[1] = 0;
        r9[2] = 0;
        r15 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x03ac, code lost:
    
        if (r15 < 0) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x03b4, code lost:
    
        if (r0.A03(r13, r15) == false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x03b6, code lost:
    
        r0 = r9[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x03b8, code lost:
    
        if (r0 > r3) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03ba, code lost:
    
        r9[1] = r0 + 1;
        r15 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x03c1, code lost:
    
        r1 = Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x03c3, code lost:
    
        if (r15 < 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x03c7, code lost:
    
        if (r9[1] <= r3) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0405, code lost:
    
        if (r0.A03(r13, r15) != false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0407, code lost:
    
        r0 = r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0409, code lost:
    
        if (r0 > r3) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x040b, code lost:
    
        r9[0] = r0 + 1;
        r15 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0411, code lost:
    
        if (r15 < 0) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0416, code lost:
    
        if (r9[0] <= r3) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0419, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x041b, code lost:
    
        if (r4 >= r10) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0423, code lost:
    
        if (r0.A03(r13, r4) == false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0425, code lost:
    
        r0 = r9[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0427, code lost:
    
        if (r0 > r3) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0429, code lost:
    
        r9[1] = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x042e, code lost:
    
        if (r4 == r10) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0432, code lost:
    
        if (r9[1] <= r3) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0435, code lost:
    
        if (r4 >= r10) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x043d, code lost:
    
        if (r0.A03(r13, r4) != false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x043f, code lost:
    
        r0 = r9[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0441, code lost:
    
        if (r0 > r3) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0443, code lost:
    
        r9[2] = r0 + 1;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x044a, code lost:
    
        r13 = r9[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x044c, code lost:
    
        if (r13 > r3) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x044e, code lost:
    
        r0 = r9[0];
        r3 = r9[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x045e, code lost:
    
        if ((java.lang.Math.abs(((r0 + r3) + r13) - r16) * 5) >= (r16 * 2)) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0460, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0467, code lost:
    
        if (X.AbstractC72048XLo.A00(r9, r12, r0) >= r17) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0469, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x046b, code lost:
    
        if (r0 < 3) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x046d, code lost:
    
        r1 = (r4 - r13) - (r3 / 2.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x03cd, code lost:
    
        if (java.lang.Float.isNaN(r1) != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x03cf, code lost:
    
        r13 = ((r6[0] + r6[1]) + r6[2]) / 3.0f;
        r3 = r28.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x03e2, code lost:
    
        if (r3.hasNext() == false) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x03e4, code lost:
    
        r4 = (X.C72217XYn) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x03ee, code lost:
    
        if (r4.A00(r13, r1, r14) == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03f0, code lost:
    
        r3 = (((X.Y1j) r4).A00 + r14) / 2.0f;
        r0 = (r4.A01 + r1) / 2.0f;
        r4 = r4.A00 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0552, code lost:
    
        r28.add(new X.C72217XYn(r14, r1, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x055c, code lost:
    
        r22 = r22 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x055c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0254, code lost:
    
        if (r1 < r11) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r40.containsKey(X.EnumC72361Xbx.TRY_HARDER) == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x074d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C62512SEo A03(java.util.Map r40) {
        /*
            Method dump skipped, instructions count: 1999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y4e.A03(java.util.Map):X.SEo");
    }

    public Y4e(TIX tix) {
        this.A00 = tix;
    }

    public static float A02(Y4e y4e, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float A01 = A01(y4e, i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = y4e.A00.A02;
            if (i5 >= i7) {
                f = (r1 - i) / (i5 - i);
                i5 = i7 - 1;
            } else {
                f = 1.0f;
            }
        }
        float f4 = i2;
        int i8 = (int) (f4 - ((i4 - i2) * f));
        if (i8 < 0) {
            f3 = i2 - i8;
        } else {
            int i9 = y4e.A00.A00;
            if (i8 >= i9) {
                i6 = i9 - 1;
                f4 = i6 - i2;
                f3 = i8 - i2;
            } else {
                i6 = i8;
                f2 = 1.0f;
                return (A01 + A01(y4e, i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
            }
        }
        f2 = f4 / f3;
        return (A01 + A01(y4e, i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
    }
}
