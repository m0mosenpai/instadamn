package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class Y4g {
    public static final YJ0 A04 = new Object();
    public boolean A00;
    public final TIX A01;
    public final ArrayList A02 = AbstractC166987dD.A1E();
    public final int[] A03 = new int[5];

    public static boolean A01(int[] iArr) {
        int i = 0;
        int i2 = 0;
        do {
            int i3 = iArr[i];
            if (i3 == 0) {
                return false;
            }
            i2 += i3;
            i++;
        } while (i < 5);
        if (i2 < 7) {
            return false;
        }
        float f = i2 / 7.0f;
        float f2 = f / 2.0f;
        return AbstractC72048XLo.A00(iArr, f, 0) < f2 && AbstractC72048XLo.A00(iArr, f, 1) < f2 && AbstractC72048XLo.A00(iArr, f * 3.0f, 2) < 3.0f * f2 && AbstractC72048XLo.A00(iArr, f, 3) < f2 && AbstractC72048XLo.A00(iArr, f, 4) < f2;
    }

    public static boolean A00(Y4g y4g) {
        ArrayList arrayList = y4g.A02;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (it.hasNext()) {
            C72216XYm c72216XYm = (C72216XYm) it.next();
            if (c72216XYm.A01 >= 2) {
                i++;
                f2 += c72216XYm.A00;
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / size;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            f += AbstractC166987dD.A01(((C72216XYm) it2.next()).A00, f3);
        }
        if (f > f2 * 0.05f) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0289, code lost:
    
        r10 = (X.C72216XYm) r7.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0299, code lost:
    
        if (X.AbstractC166987dD.A01(r18, ((X.Y1j) r10).A01) > r8) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02a3, code lost:
    
        if (X.AbstractC166987dD.A01(r1, ((X.Y1j) r10).A00) > r8) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a5, code lost:
    
        r3 = r10.A00;
        r2 = X.AbstractC166987dD.A01(r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02af, code lost:
    
        if (r2 <= 1.0f) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02b3, code lost:
    
        if (r2 > r3) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b5, code lost:
    
        r0 = r10.A01;
        r5 = r0 + 1;
        r4 = r0;
        r2 = r5;
        r7.set(r9, new X.C72216XYm(((r4 * ((X.Y1j) r10).A00) + r1) / r2, ((r4 * ((X.Y1j) r10).A01) + r18) / r2, ((r4 * r10.A00) + r8) / r2, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (java.lang.Float.isNaN(r18) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02d5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02d6, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02d9, code lost:
    
        r7.add(new X.C72216XYm(r1, r18, r8, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02e3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        r12 = (int) r18;
        r15 = r22[2];
        r13 = r10.A02;
        java.util.Arrays.fill(r2, 0);
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if (r14 < 0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0123, code lost:
    
        if (r10.A03(r14, r12) != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0125, code lost:
    
        r0 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0127, code lost:
    
        if (r0 > r15) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0129, code lost:
    
        r2[1] = r0 + 1;
        r14 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x011d, code lost:
    
        if (r14 < 0) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0132, code lost:
    
        if (r2[1] <= r15) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x013b, code lost:
    
        if (r10.A03(r14, r12) == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x013d, code lost:
    
        r0 = r2[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x013f, code lost:
    
        if (r0 > r15) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0141, code lost:
    
        r2[0] = r0 + 1;
        r14 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0135, code lost:
    
        if (r14 < 0) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r10.A03(r14, r12) == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x014a, code lost:
    
        if (r2[0] <= r15) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x014d, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x014f, code lost:
    
        if (r11 >= r13) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0155, code lost:
    
        if (r10.A03(r11, r12) == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0157, code lost:
    
        X.AbstractC72048XLo.A1Z(r2, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x015b, code lost:
    
        if (r11 != r13) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        X.AbstractC72048XLo.A1Z(r2, 2);
        r14 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x015e, code lost:
    
        if (r11 >= r13) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0164, code lost:
    
        if (r10.A03(r11, r12) != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0166, code lost:
    
        r0 = r2[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0168, code lost:
    
        if (r0 >= r15) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x016a, code lost:
    
        r2[3] = r0 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0171, code lost:
    
        if (r11 == r13) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0175, code lost:
    
        if (r2[3] < r15) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0178, code lost:
    
        if (r11 >= r13) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x017e, code lost:
    
        if (r10.A03(r11, r12) == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0180, code lost:
    
        r0 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0182, code lost:
    
        if (r0 >= r15) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0184, code lost:
    
        r2[4] = r0 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x018b, code lost:
    
        r14 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x018d, code lost:
    
        if (r14 >= r15) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x018f, code lost:
    
        r17 = r2[0] + r2[1];
        r15 = r2[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fa, code lost:
    
        r1 = Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01a7, code lost:
    
        if ((java.lang.Math.abs((((r17 + r15) + r2[3]) + r14) - r8) * 5) >= r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01ad, code lost:
    
        if (A01(r2) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01af, code lost:
    
        r1 = ((r11 - r14) - r16) - (r15 / 2.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fc, code lost:
    
        if (r14 >= 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01bd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0065, code lost:
    
        if (r10.A03(r11, r13) != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0067, code lost:
    
        r0 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0069, code lost:
    
        if (r0 > r1) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x006b, code lost:
    
        r2[1] = r0 + 1;
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x005f, code lost:
    
        if (r13 < 0) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0074, code lost:
    
        if (r2[1] <= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x007d, code lost:
    
        if (r10.A03(r11, r13) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x007f, code lost:
    
        r0 = r2[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0081, code lost:
    
        if (r0 > r1) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0102, code lost:
    
        if (java.lang.Float.isNaN(r1) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0083, code lost:
    
        r2[0] = r0 + 1;
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0077, code lost:
    
        if (r13 < 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x008c, code lost:
    
        if (r2[0] <= r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x008f, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0091, code lost:
    
        if (r12 >= r3) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0097, code lost:
    
        if (r10.A03(r11, r12) == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0099, code lost:
    
        X.AbstractC72048XLo.A1Z(r2, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0104, code lost:
    
        r14 = (int) r1;
        java.util.Arrays.fill(r2, 0);
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x009d, code lost:
    
        if (r12 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x00a0, code lost:
    
        if (r12 >= r3) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x00a6, code lost:
    
        if (r10.A03(r11, r12) != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x00a8, code lost:
    
        r0 = r2[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x00aa, code lost:
    
        if (r0 >= r1) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x00ac, code lost:
    
        r2[3] = r0 + 1;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x00b3, code lost:
    
        if (r12 == r3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0109, code lost:
    
        if (r12 < r11) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x00b7, code lost:
    
        if (r2[3] < r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x00ba, code lost:
    
        if (r12 >= r3) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x00c0, code lost:
    
        if (r10.A03(r11, r12) == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x00c2, code lost:
    
        r0 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x00c4, code lost:
    
        if (r0 >= r1) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x00c6, code lost:
    
        r2[4] = r0 + 1;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x00cd, code lost:
    
        r14 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010b, code lost:
    
        if (r14 < r11) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x00cf, code lost:
    
        if (r14 >= r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x00d1, code lost:
    
        r1 = r2[0] + r2[1];
        r13 = r2[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x00e6, code lost:
    
        if ((java.lang.Math.abs((((r1 + r13) + r2[3]) + r14) - r8) * 5) >= (r8 * 2)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x00ec, code lost:
    
        if (A01(r2) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x00ee, code lost:
    
        r18 = ((r12 - r14) - r15) - (r13 / 2.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0115, code lost:
    
        if (r10.A03(r14 - r11, r12 - r11) == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0117, code lost:
    
        X.AbstractC72048XLo.A1Z(r2, 2);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01bb, code lost:
    
        if (r2[2] != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01be, code lost:
    
        if (r12 < r11) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c0, code lost:
    
        if (r14 < r11) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01ca, code lost:
    
        if (r10.A03(r14 - r11, r12 - r11) != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01cc, code lost:
    
        X.AbstractC72048XLo.A1Z(r2, 1);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01d4, code lost:
    
        if (r2[1] != 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01d7, code lost:
    
        if (r12 < r11) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d9, code lost:
    
        if (r14 < r11) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e3, code lost:
    
        if (r10.A03(r14 - r11, r12 - r11) == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e5, code lost:
    
        X.AbstractC72048XLo.A1Z(r2, 0);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ed, code lost:
    
        if (r2[0] == 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ef, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01f0, code lost:
    
        r11 = r12 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f2, code lost:
    
        if (r11 >= r3) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f4, code lost:
    
        r0 = r14 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f6, code lost:
    
        if (r0 >= r13) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01fc, code lost:
    
        if (r10.A03(r0, r11) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01fe, code lost:
    
        X.AbstractC72048XLo.A1Z(r2, 2);
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0204, code lost:
    
        r11 = r12 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0206, code lost:
    
        if (r11 >= r3) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0208, code lost:
    
        r0 = r14 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020a, code lost:
    
        if (r0 >= r13) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0210, code lost:
    
        if (r10.A03(r0, r11) != false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0212, code lost:
    
        X.AbstractC72048XLo.A1Z(r2, 3);
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x021a, code lost:
    
        if (r2[3] != 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x021d, code lost:
    
        r11 = r12 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x021f, code lost:
    
        if (r11 >= r3) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0221, code lost:
    
        r0 = r14 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0223, code lost:
    
        if (r0 >= r13) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0229, code lost:
    
        if (r10.A03(r0, r11) == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x022b, code lost:
    
        X.AbstractC72048XLo.A1Z(r2, 4);
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0231, code lost:
    
        r10 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0233, code lost:
    
        if (r10 == 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0235, code lost:
    
        r4 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0237, code lost:
    
        r0 = r2[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0239, code lost:
    
        if (r0 == 0) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x023b, code lost:
    
        r3 = r3 + r0;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x023f, code lost:
    
        if (r4 < 5) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0242, code lost:
    
        if (r3 < 7) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0244, code lost:
    
        r4 = r3 / 7.0f;
        r11 = r4 / 1.333f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0253, code lost:
    
        if (X.AbstractC72048XLo.A00(r2, r4, 0) >= r11) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r13 < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x025b, code lost:
    
        if (X.AbstractC72048XLo.A00(r2, r4, 1) >= r11) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0268, code lost:
    
        if (X.AbstractC72048XLo.A00(r2, r4 * 3.0f, 2) >= (3.0f * r11)) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0270, code lost:
    
        if (X.AbstractC72048XLo.A00(r2, r4, 3) >= r11) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0279, code lost:
    
        if (X.AbstractC166987dD.A01(r4, r10) >= r11) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x027b, code lost:
    
        r8 = r8 / 7.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x027f, code lost:
    
        r7 = r21.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0287, code lost:
    
        if (r9 >= r7.size()) goto L227;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(int[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y4g.A02(int[], int, int):boolean");
    }

    public Y4g(TIX tix) {
        this.A01 = tix;
    }
}
