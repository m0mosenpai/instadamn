package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$2;
import androidx.compose.ui.focus.FocusPropertiesElement;

/* renamed from: X.58W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58W implements C58X {
    public C18650vs A00;
    public final C1129658f A03;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16620sF A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;
    public final InterfaceC16660sJ A09;
    public C58Z A01 = new C58J();
    public final C1129758g A04 = new C1129758g();
    public final Modifier A02 = new FocusPropertiesElement(new C1129958i(C1129858h.A00)).Eq3(new FocusOwnerImpl$modifier$2(this));

    @Override // X.C58Y
    public final void AHm(boolean z) {
        AHo(8, z, true, true);
    }

    @Override // X.C58X
    public final boolean AHo(int i, boolean z, boolean z2, boolean z3) {
        boolean A07;
        int intValue;
        C1129758g c1129758g = this.A04;
        B6C b6c = B6C.A00;
        try {
            if (c1129758g.A00) {
                C1129758g.A00(c1129758g);
            }
            c1129758g.A00 = true;
            c1129758g.A02.A09(b6c);
            if (z || ((intValue = AbstractC28485Chd.A01(this.A01, i).intValue()) != 2 && intValue != 1 && intValue != 3)) {
                A07 = AbstractC28485Chd.A07(this.A01, z);
            } else {
                A07 = false;
            }
            if (A07 && z3) {
                this.A05.invoke();
            }
            return A07;
        } finally {
            C1129758g.A01(c1129758g);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x04b1, code lost:
    
        r0 = r4.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x04b7, code lost:
    
        if (r0 < 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x04b9, code lost:
    
        r2 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x04c7, code lost:
    
        if (((X.InterfaceC114285Ds) r4.get(r0)).Da7(r44) != false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04c9, code lost:
    
        if (r2 < 0) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x04cb, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x04e0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04cd, code lost:
    
        r7 = r5.A03;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04d0, code lost:
    
        if (r7 == 0) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04d4, code lost:
    
        if ((r7 instanceof X.InterfaceC114285Ds) == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04e4, code lost:
    
        if ((r7.A01 & 8192) == 0) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04e8, code lost:
    
        if ((r7 instanceof X.C5AY) == false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04ea, code lost:
    
        r2 = r7.A00;
        r1 = 0;
        r6 = r6;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04f0, code lost:
    
        if (r2 == null) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04f5, code lost:
    
        if ((r2.A01 & 8192) == 0) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04f7, code lost:
    
        r1 = r1 + 1;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x04f9, code lost:
    
        if (r1 != 1) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x04fb, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04fc, code lost:
    
        r2 = r2.A02;
        r6 = r6;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04ff, code lost:
    
        if (r6 != 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0501, code lost:
    
        r6 = new X.C57S(new X.C58J[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0508, code lost:
    
        if (r7 == 0) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x050a, code lost:
    
        r6.A09(r7);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x050e, code lost:
    
        r6.A09(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0512, code lost:
    
        if (r1 != 1) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0515, code lost:
    
        r7 = X.AbstractC114335Dx.A00(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x04de, code lost:
    
        if (((X.InterfaceC114285Ds) r7).Da7(r44) == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0524, code lost:
    
        if (((java.lang.Boolean) r45.invoke()).booleanValue() != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0526, code lost:
    
        r6 = r5.A03;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0529, code lost:
    
        if (r6 == 0) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x052d, code lost:
    
        if ((r6 instanceof X.InterfaceC114285Ds) == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x053d, code lost:
    
        if ((r6.A01 & 8192) == 0) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0541, code lost:
    
        if ((r6 instanceof X.C5AY) == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0543, code lost:
    
        r2 = r6.A00;
        r1 = 0;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0549, code lost:
    
        if (r2 == null) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x054e, code lost:
    
        if ((r2.A01 & 8192) == 0) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0550, code lost:
    
        r1 = r1 + 1;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0552, code lost:
    
        if (r1 != 1) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0554, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0555, code lost:
    
        r2 = r2.A02;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0558, code lost:
    
        if (r5 != 0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x055a, code lost:
    
        r5 = new X.C57S(new X.C58J[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0561, code lost:
    
        if (r6 == 0) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0563, code lost:
    
        r5.A09(r6);
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0567, code lost:
    
        r5.A09(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x056b, code lost:
    
        if (r1 != 1) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x056e, code lost:
    
        r6 = X.AbstractC114335Dx.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0537, code lost:
    
        if (((X.InterfaceC114285Ds) r6).DOF(r44) == false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0539, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0573, code lost:
    
        if (r4 == null) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0575, code lost:
    
        r3 = r4.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x057a, code lost:
    
        if (r2 >= r3) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0588, code lost:
    
        if (((X.InterfaceC114285Ds) r4.get(r2)).DOF(r44) != false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x058a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0592, code lost:
    
        throw new java.lang.IllegalStateException("visitAncestors called on an unattached node");
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x038f, code lost:
    
        if (r5 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0156, code lost:
    
        if (((r21 & ((r21 ^ (-1)) << 6)) & (-9187201950435737472L)) == 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0158, code lost:
    
        r20 = X.C18650vs.A00(r8, r39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0162, code lost:
    
        if (r8.A00 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0173, code lost:
    
        if (((r6[r20 >> 3] >> ((r20 & 7) << 3)) & 255) == 254) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0177, code lost:
    
        if (r7 <= 8) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0189, code lost:
    
        if (((r8.A01 * 32) ^ Long.MIN_VALUE) > ((r7 * 25) ^ Long.MIN_VALUE)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x018b, code lost:
    
        r5 = r8.A02;
        X.AbstractC004701m.A01(r6, r7);
        r4 = 0;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0194, code lost:
    
        r33 = r4 >> 3;
        r32 = (r4 & 7) << 3;
        r14 = (r6[r33] >> r32) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x01a4, code lost:
    
        if (r14 != 128) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x01a6, code lost:
    
        r10 = r4;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x01aa, code lost:
    
        if (r4 != r7) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x01ac, code lost:
    
        r4 = ((X.C01Y) r8).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x01af, code lost:
    
        if (r4 != 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x01b1, code lost:
    
        r1 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x01b2, code lost:
    
        r8.A00 = r1 - r8.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x01b7, code lost:
    
        r20 = X.C18650vs.A00(r8, r39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x021e, code lost:
    
        r1 = r4 - (r4 / 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0225, code lost:
    
        if (r14 != 254) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0227, code lost:
    
        r0 = r5[r4];
        r14 = ((int) (r0 ^ (r0 >>> 32))) * (-862048943);
        r14 = r14 ^ (r14 << 16);
        r0 = r14 >>> 7;
        r29 = X.C18650vs.A00(r8, r0);
        r0 = r0 & r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x024a, code lost:
    
        if ((((r29 - r0) & r7) / 8) != (((r4 - r0) & r7) / 8)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x024c, code lost:
    
        r6[r33] = ((r14 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT) << r32) | (((255 << r32) ^ (-1)) & r6[r33]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x025c, code lost:
    
        r6[r6.length - 1] = (r6[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x026b, code lost:
    
        r20 = r29 >> 3;
        r18 = r6[r20];
        r17 = (r29 & 7) << 3;
        r15 = (r18 >> r17) & 255;
        r0 = r14 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x027b, code lost:
    
        if (r15 != 128) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x027d, code lost:
    
        r6[r20] = (r18 & ((255 << r17) ^ (-1))) | (r0 << r17);
        r6[r33] = (r6[r33] & ((255 << r32) ^ (-1))) | (128 << r32);
        r5[r29] = r5[r4];
        r5[r4] = 0;
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x029f, code lost:
    
        r6[r20] = (r0 << r17) | (r18 & ((255 << r17) ^ (-1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x02ad, code lost:
    
        if (r10 != (-1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x02af, code lost:
    
        r10 = X.AbstractC004701m.A00(r6, r4 + 1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x02b5, code lost:
    
        r5[r10] = r5[r29];
        r5[r29] = r5[r4];
        r5[r4] = r5[r10];
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0267, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x02c4, code lost:
    
        r0 = X.AbstractC004701m.A00;
        r1 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x02c7, code lost:
    
        if (r7 == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x02c9, code lost:
    
        r1 = (r7 * 2) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x02cd, code lost:
    
        r0 = r8.A02;
        X.C18650vs.A01(r8, r1);
        r10 = r8.A03;
        r14 = r8.A02;
        r4 = ((X.C01Y) r8).A00;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x02db, code lost:
    
        if (r5 >= r7) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x02ed, code lost:
    
        if (((r6[r5 >> 3] >> ((r5 & 7) << 3)) & 255) >= 128) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x02ef, code lost:
    
        r22 = r0[r5];
        r15 = ((int) (r22 ^ (r22 >>> 32))) * (-862048943);
        r21 = X.C18650vs.A00(r8, (r15 ^ (r15 << 16)) >>> 7);
        r20 = r21 >> 3;
        r19 = (r21 & 7) << 3;
        r0 = ((r15 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT) << r19) | (r10[r20] & ((255 << r19) ^ (-1)));
        r10[r20] = r0;
        r10[(((r21 - 7) & r4) + (r4 & 7)) >> 3] = r0;
        r14[r21] = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0326, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x01bd, code lost:
    
        r8.A01++;
        r6 = r8.A00;
        r5 = r8.A03;
        r10 = r20 >> 3;
        r18 = r5[r10];
        r7 = (r20 & 7) << 3;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x01d8, code lost:
    
        if (((r18 >> r7) & 255) != 128) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x01da, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x01db, code lost:
    
        r8.A00 = r6 - r0;
        r27 = (((255 << r7) ^ (-1)) & r18) | (r11 << r7);
        r5[r10] = r27;
        r5[(((r20 - 7) & r4) + (r4 & 7)) >> 3] = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x013f, code lost:
    
        if (((r19 & ((r19 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x036f, code lost:
    
        if (r5 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0391, code lost:
    
        r1 = r5.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0395, code lost:
    
        if (r1.A08 == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0397, code lost:
    
        r10 = r1.A04;
        r8 = X.AbstractC114335Dx.A02(r5);
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x039e, code lost:
    
        if (r8 == null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03a7, code lost:
    
        if ((r8.A0W.A02.A00 & 8192) == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x03a9, code lost:
    
        if (r10 == null) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03ae, code lost:
    
        if ((r10.A01 & 8192) == 0) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x03b0, code lost:
    
        r6 = r10;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03b4, code lost:
    
        if ((r6 instanceof X.InterfaceC114285Ds) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03b6, code lost:
    
        if (r4 != null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x03b8, code lost:
    
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x03bd, code lost:
    
        r4.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x03c0, code lost:
    
        r6 = X.AbstractC114335Dx.A00(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x03c4, code lost:
    
        if (r6 == null) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03fb, code lost:
    
        r10 = r10.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03ca, code lost:
    
        if ((r6.A01 & 8192) == 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x03ce, code lost:
    
        if ((r6 instanceof X.C5AY) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x03d0, code lost:
    
        r2 = ((X.C5AY) r6).A00;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03d6, code lost:
    
        if (r2 == null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03db, code lost:
    
        if ((r2.A01 & 8192) == 0) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03dd, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03df, code lost:
    
        if (r1 != 1) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x03e1, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x03e2, code lost:
    
        r2 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x03e5, code lost:
    
        if (r7 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x03e7, code lost:
    
        r7 = new X.C57S(new X.C58J[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03ee, code lost:
    
        if (r6 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x03f0, code lost:
    
        r7.A09(r6);
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x03f4, code lost:
    
        r7.A09(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03f8, code lost:
    
        if (r1 != 1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03fe, code lost:
    
        r8 = r8.A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0402, code lost:
    
        if (r8 == null) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0404, code lost:
    
        r0 = r8.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0406, code lost:
    
        if (r0 == null) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x040b, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0408, code lost:
    
        r10 = r0.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x04af, code lost:
    
        if (r4 == null) goto L237;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[LOOP:15: B:208:0x0389->B:236:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[LOOP:19: B:266:0x0368->B:294:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r6v12, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v5, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r8v20, types: [X.0vs, X.01Y] */
    @Override // X.C58X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean APp(android.view.KeyEvent r44, X.InterfaceC16820sZ r45) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58W.APp(android.view.KeyEvent, X.0sZ):boolean");
    }

    @Override // X.C58X
    public final Boolean AWI(C114205Dh c114205Dh, InterfaceC16660sJ interfaceC16660sJ, int i) {
        boolean z;
        InterfaceC16660sJ interfaceC16660sJ2;
        C25338BJh c25338BJh;
        C58Z c58z = this.A01;
        C58Z A00 = BJZ.A00(c58z);
        if (A00 != null) {
            AnonymousClass583 anonymousClass583 = (AnonymousClass583) this.A08.invoke();
            C25333BJc A0F = A00.A0F();
            if (i == 1) {
                c25338BJh = A0F.A03;
            } else if (i == 2) {
                c25338BJh = A0F.A04;
            } else if (i == 5) {
                c25338BJh = A0F.A07;
            } else if (i == 6) {
                c25338BJh = A0F.A00;
            } else {
                boolean z2 = false;
                if (i == 3) {
                    z2 = true;
                }
                if (z2) {
                    int ordinal = anonymousClass583.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            c25338BJh = A0F.A01;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        c25338BJh = A0F.A06;
                    }
                    if (c25338BJh == C25338BJh.A02) {
                        c25338BJh = A0F.A02;
                    }
                } else if (i == 4) {
                    int ordinal2 = anonymousClass583.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            c25338BJh = A0F.A06;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        c25338BJh = A0F.A01;
                    }
                    if (c25338BJh == C25338BJh.A02) {
                        c25338BJh = A0F.A05;
                    }
                } else {
                    if (i == 7) {
                        interfaceC16660sJ2 = A0F.A08;
                    } else if (i == 8) {
                        interfaceC16660sJ2 = A0F.A09;
                    } else {
                        throw new IllegalStateException("invalid FocusDirection");
                    }
                    c25338BJh = (C25338BJh) interfaceC16660sJ2.invoke(new BJY(i));
                }
            }
            if (C14360o3.A0K(c25338BJh, C25338BJh.A01)) {
                return null;
            }
            if (!C14360o3.A0K(c25338BJh, C25338BJh.A02)) {
                z = c25338BJh.A02(interfaceC16660sJ);
                return Boolean.valueOf(z);
            }
        } else {
            A00 = null;
        }
        AnonymousClass583 anonymousClass5832 = (AnonymousClass583) this.A08.invoke();
        C9FO c9fo = new C9FO(4, this, interfaceC16660sJ, A00);
        if (i == 1) {
            z = AbstractC28430Cgd.A03(c58z, c9fo);
        } else if (i == 2) {
            z = AbstractC28430Cgd.A02(c58z, c9fo);
        } else {
            if (i != 3 && i != 4 && i != 5 && i != 6) {
                if (i == 7) {
                    int ordinal3 = anonymousClass5832.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 == 1) {
                            i = 3;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        i = 4;
                    }
                    c58z = BJZ.A00(c58z);
                    if (c58z == null) {
                        return null;
                    }
                } else if (i == 8) {
                    C58Z A002 = BJZ.A00(c58z);
                    if (A002 != null) {
                        C58J c58j = A002.A03;
                        if (c58j.A08) {
                            C58J c58j2 = c58j.A04;
                            AnonymousClass599 A02 = AbstractC114335Dx.A02(A002);
                            while (true) {
                                if (A02 == null) {
                                    break;
                                }
                                if ((A02.A0W.A02.A00 & 1024) != 0) {
                                    while (c58j2 != null) {
                                        if ((c58j2.A01 & 1024) != 0) {
                                            C58J c58j3 = c58j2;
                                            C57S c57s = null;
                                            do {
                                                if (c58j3 instanceof C58Z) {
                                                    C58Z c58z2 = (C58Z) c58j3;
                                                    if (c58z2.A0F().A0A) {
                                                        if (!c58z2.equals(c58z)) {
                                                            z = ((Boolean) c9fo.invoke(c58z2)).booleanValue();
                                                        }
                                                    }
                                                } else if ((c58j3.A01 & 1024) != 0 && (c58j3 instanceof C5AY)) {
                                                    int i2 = 0;
                                                    for (C58J c58j4 = ((C5AY) c58j3).A00; c58j4 != null; c58j4 = c58j4.A02) {
                                                        if ((c58j4.A01 & 1024) != 0) {
                                                            i2++;
                                                            if (i2 == 1) {
                                                                c58j3 = c58j4;
                                                            } else {
                                                                if (c57s == null) {
                                                                    c57s = new C57S(new C58J[16]);
                                                                }
                                                                if (c58j3 != null) {
                                                                    c57s.A09(c58j3);
                                                                    c58j3 = null;
                                                                }
                                                                c57s.A09(c58j4);
                                                            }
                                                        }
                                                    }
                                                    if (i2 == 1) {
                                                    }
                                                }
                                                c58j3 = AbstractC114335Dx.A00(c57s);
                                            } while (c58j3 != null);
                                        }
                                        c58j2 = c58j2.A04;
                                    }
                                }
                                A02 = A02.A0B();
                                if (A02 == null) {
                                    break;
                                }
                                C59S c59s = A02.A0W;
                                if (c59s != null) {
                                    c58j2 = c59s.A05;
                                } else {
                                    c58j2 = null;
                                }
                            }
                        } else {
                            throw new IllegalStateException("visitAncestors called on an unattached node");
                        }
                    }
                    z = false;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Focus search invoked with invalid FocusDirection ");
                    sb.append((Object) BJY.A00(i));
                    throw new IllegalStateException(sb.toString());
                }
            }
            return AbstractC25331BJa.A02(c58z, c114205Dh, c9fo, i);
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0ps, java.lang.Object] */
    @Override // X.C58Y
    public final boolean Cpu(int i) {
        Boolean AWI;
        ?? obj = new Object();
        obj.A00 = false;
        Boolean AWI2 = AWI((C114205Dh) this.A07.invoke(), new DHO(i, 2, obj), i);
        if (AWI2 == null || obj.A00 == null) {
            return false;
        }
        if (AWI2.equals(true) && C14360o3.A0K(obj.A00, true)) {
            return true;
        }
        if (i != 1 && i != 2) {
            return ((Boolean) this.A09.invoke(new BJY(i))).booleanValue();
        }
        if (!AHo(i, false, true, false) || (AWI = AWI(null, new C25512BQa(i, 2), i)) == null || !AWI.booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.58J, X.58Z] */
    public C58W(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF) {
        this.A06 = interfaceC16620sF;
        this.A09 = interfaceC16660sJ2;
        this.A05 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
        this.A08 = interfaceC16820sZ3;
        this.A03 = new C1129658f(new C1129558e(this), interfaceC16660sJ);
    }
}
