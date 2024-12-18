package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class XPu extends C5GB {
    public int A00;
    public ArrayList A01;

    @Override // X.C5GB
    public final void A07() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A01;
            if (i < arrayList.size()) {
                ((C5GB) arrayList.get(i)).A07();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.C5GB
    public final void A08() {
        this.A06 = null;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((C5GB) it.next()).A08();
        }
    }

    @Override // X.C5GB
    public final long A05() {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = j + r2.A04.A00 + ((C5GB) arrayList.get(i)).A05() + r2.A03.A00;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    @Override // X.C5GB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            r10 = this;
            java.util.ArrayList r7 = r10.A01
            java.util.Iterator r1 = r7.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            X.5GB r0 = (X.C5GB) r0
            r0.A06()
            goto L6
        L16:
            int r0 = r7.size()
            r9 = 1
            if (r0 < r9) goto L85
            r8 = 0
            X.2hw r2 = A00(r7, r8)
            int r0 = r0 - r9
            X.2hw r1 = A00(r7, r0)
            int r0 = r10.A01
            if (r0 != 0) goto L89
            X.2hz r0 = r2.A0e
            X.2hz r6 = r1.A0f
            X.Y8R r5 = X.C5GB.A02(r0, r8)
            int r4 = r0.A01()
            r3 = 0
        L38:
            int r0 = r7.size()
            if (r3 >= r0) goto L4e
            X.2hw r2 = A00(r7, r3)
            int r1 = r2.A0R
            r0 = 8
            if (r1 == r0) goto L86
            X.2hz r0 = r2.A0e
            int r4 = r0.A01()
        L4e:
            if (r5 == 0) goto L55
            X.Y8R r0 = r10.A04
            X.C5GB.A03(r0, r5, r4)
        L55:
            X.Y8R r5 = X.C5GB.A02(r6, r8)
            int r4 = r6.A01()
            int r3 = r7.size()
        L61:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L75
            X.2hw r2 = A00(r7, r3)
            int r1 = r2.A0R
            r0 = 8
            if (r1 == r0) goto L61
            X.2hz r0 = r2.A0f
        L71:
            int r4 = r0.A01()
        L75:
            if (r5 == 0) goto L7d
            X.Y8R r1 = r10.A03
            int r0 = -r4
            X.C5GB.A03(r1, r5, r0)
        L7d:
            X.Y8R r0 = r10.A04
            r0.A03 = r10
            X.Y8R r0 = r10.A03
            r0.A03 = r10
        L85:
            return
        L86:
            int r3 = r3 + 1
            goto L38
        L89:
            X.2hz r0 = r2.A0g
            X.2hz r6 = r1.A0a
            X.Y8R r5 = X.C5GB.A02(r0, r9)
            int r4 = r0.A01()
            r3 = 0
        L96:
            int r0 = r7.size()
            if (r3 >= r0) goto Lac
            X.2hw r2 = A00(r7, r3)
            int r1 = r2.A0R
            r0 = 8
            if (r1 == r0) goto Ld0
            X.2hz r0 = r2.A0g
            int r4 = r0.A01()
        Lac:
            if (r5 == 0) goto Lb3
            X.Y8R r0 = r10.A04
            X.C5GB.A03(r0, r5, r4)
        Lb3:
            X.Y8R r5 = X.C5GB.A02(r6, r9)
            int r4 = r6.A01()
            int r3 = r7.size()
        Lbf:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L75
            X.2hw r2 = A00(r7, r3)
            int r1 = r2.A0R
            r0 = 8
            if (r1 == r0) goto Lbf
            X.2hz r0 = r2.A0a
            goto L71
        Ld0:
            int r3 = r3 + 1
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XPu.A06():void");
    }

    @Override // X.C5GB
    public final boolean A0B() {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((C5GB) arrayList.get(i)).A0B()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0165, code lost:
    
        r15 = java.lang.Math.min(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x016b, code lost:
    
        if (r15 == r23) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x016d, code lost:
    
        r16 = r16 + 1;
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0171, code lost:
    
        r0.A02(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0178, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x017b, code lost:
    
        r15 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017e, code lost:
    
        r0 = r15.A02;
        r14 = r0.A0I;
        r0 = r0.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0185, code lost:
    
        r23 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x018b, code lost:
    
        if (r16 <= 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x018d, code lost:
    
        r11 = r11 - r16;
        r13 = 0;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0191, code lost:
    
        if (r13 >= r6) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0193, code lost:
    
        r14 = (X.C5GB) r7.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x019d, code lost:
    
        if (r14.A02.A0R == 8) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x019f, code lost:
    
        if (r13 <= 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01a1, code lost:
    
        if (r13 < r5) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01a3, code lost:
    
        r1 = r1 + r14.A04.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01a8, code lost:
    
        r1 = r1 + r14.A05.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01af, code lost:
    
        if (r13 >= r20) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01b3, code lost:
    
        if (r13 >= r21) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01b5, code lost:
    
        r1 = r1 + (-r14.A03.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01bb, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c2, code lost:
    
        if (r26.A00 != 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c4, code lost:
    
        if (r16 != 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01c6, code lost:
    
        r26.A00 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c9, code lost:
    
        if (r1 <= r8) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01cb, code lost:
    
        r26.A00 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01cf, code lost:
    
        if (r2 <= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01d1, code lost:
    
        if (r11 != 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01d5, code lost:
    
        if (r5 != r21) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01d7, code lost:
    
        r26.A00 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01db, code lost:
    
        r13 = r26.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01dd, code lost:
    
        if (r13 != 1) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01df, code lost:
    
        if (r2 <= 1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01e1, code lost:
    
        r8 = r8 - r1;
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01e3, code lost:
    
        r8 = r8 / r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01e4, code lost:
    
        if (r11 <= 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01e6, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01e7, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01e8, code lost:
    
        if (r1 >= r6) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01ea, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01eb, code lost:
    
        if (r9 == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01ed, code lost:
    
        r0 = r6 - (r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01f1, code lost:
    
        r11 = (X.C5GB) r7.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01fb, code lost:
    
        if (r11.A02.A0R != 8) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01fd, code lost:
    
        r11.A04.A02(r10);
        r11.A03.A02(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0207, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x020a, code lost:
    
        if (r1 <= 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x020c, code lost:
    
        if (r9 == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x020e, code lost:
    
        r10 = r10 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x020f, code lost:
    
        if (r1 < r5) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0211, code lost:
    
        r0 = r11.A04.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0215, code lost:
    
        if (r9 == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0217, code lost:
    
        r10 = r10 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0218, code lost:
    
        r0 = r11.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x021a, code lost:
    
        r0.A02(r10);
        r13 = r11.A05;
        r12 = r13.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0225, code lost:
    
        if (r11.A07 != X.C05F.A0C) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0229, code lost:
    
        if (r11.A00 != 1) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x022b, code lost:
    
        r12 = r13.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x022d, code lost:
    
        if (r9 == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x022f, code lost:
    
        r10 = r10 - r12;
        r0 = r11.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0232, code lost:
    
        r0.A02(r10);
        r11.A09 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0239, code lost:
    
        if (r1 >= r20) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x023d, code lost:
    
        if (r1 >= r21) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x023f, code lost:
    
        r0 = -r11.A03.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0244, code lost:
    
        if (r9 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0246, code lost:
    
        r10 = r10 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0255, code lost:
    
        r10 = r10 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0248, code lost:
    
        r10 = r10 + r12;
        r0 = r11.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0251, code lost:
    
        r10 = r10 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0252, code lost:
    
        r0 = r11.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x024c, code lost:
    
        r10 = r10 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x024e, code lost:
    
        if (r9 == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0257, code lost:
    
        if (r2 != 1) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0259, code lost:
    
        r8 = r8 - r1;
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x025c, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x025e, code lost:
    
        if (r13 != 0) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0260, code lost:
    
        r8 = (r8 - r1) / (r2 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0264, code lost:
    
        if (r11 <= 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0266, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0267, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0268, code lost:
    
        if (r1 >= r6) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x026a, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x026b, code lost:
    
        if (r9 == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x026d, code lost:
    
        r0 = r6 - (r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0271, code lost:
    
        r2 = (X.C5GB) r7.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x027b, code lost:
    
        if (r2.A02.A0R != 8) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x027d, code lost:
    
        r2.A04.A02(r10);
        r2.A03.A02(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0287, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x028a, code lost:
    
        r12 = r10 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x028c, code lost:
    
        if (r9 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x028e, code lost:
    
        r12 = r10 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0290, code lost:
    
        if (r1 <= 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0292, code lost:
    
        if (r1 < r5) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0294, code lost:
    
        r0 = r2.A04.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0298, code lost:
    
        if (r9 == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x029a, code lost:
    
        r12 = r12 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x029b, code lost:
    
        r0 = r2.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x029d, code lost:
    
        r0.A02(r12);
        r13 = r2.A05;
        r11 = r13.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x02a8, code lost:
    
        if (r2.A07 != X.C05F.A0C) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02ac, code lost:
    
        if (r2.A00 != 1) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x02ae, code lost:
    
        r11 = java.lang.Math.min(r11, r13.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02b4, code lost:
    
        if (r9 == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x02b6, code lost:
    
        r10 = r12 - r11;
        r0 = r2.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x02ba, code lost:
    
        r0.A02(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x02bf, code lost:
    
        if (r1 >= r20) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x02c3, code lost:
    
        if (r1 >= r21) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x02c5, code lost:
    
        r0 = -r2.A03.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x02ca, code lost:
    
        if (r9 == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02cc, code lost:
    
        r10 = r10 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x02da, code lost:
    
        r10 = r10 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x02ce, code lost:
    
        r10 = r12 + r11;
        r0 = r2.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x02d6, code lost:
    
        r12 = r12 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x02d7, code lost:
    
        r0 = r2.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x02d3, code lost:
    
        if (r9 == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x02de, code lost:
    
        if (r13 != 2) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x02e0, code lost:
    
        r2 = r26.A01;
        r0 = r26.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x02e4, code lost:
    
        if (r2 != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x02e6, code lost:
    
        r2 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x02e8, code lost:
    
        if (r9 == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02ea, code lost:
    
        r2 = 1.0f - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x02ee, code lost:
    
        r0 = (int) (((r8 - r1) * r2) + 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02f5, code lost:
    
        if (r0 < 0) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x02f7, code lost:
    
        if (r11 <= 0) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02fa, code lost:
    
        r1 = r10 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x02fc, code lost:
    
        if (r9 == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x02fe, code lost:
    
        r1 = r10 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0300, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0301, code lost:
    
        if (r2 >= r6) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0303, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0304, code lost:
    
        if (r9 == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0306, code lost:
    
        r0 = r6 - (r2 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x030a, code lost:
    
        r11 = (X.C5GB) r7.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0314, code lost:
    
        if (r11.A02.A0R != 8) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0316, code lost:
    
        r11.A04.A02(r1);
        r11.A03.A02(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0320, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0323, code lost:
    
        if (r2 <= 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0325, code lost:
    
        if (r2 < r5) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0327, code lost:
    
        r0 = r11.A04.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x032b, code lost:
    
        if (r9 == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x032d, code lost:
    
        r1 = r1 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x032e, code lost:
    
        r0 = r11.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0330, code lost:
    
        r0.A02(r1);
        r12 = r11.A05;
        r10 = r12.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x033b, code lost:
    
        if (r11.A07 != X.C05F.A0C) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x033f, code lost:
    
        if (r11.A00 != 1) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0341, code lost:
    
        r10 = r12.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0343, code lost:
    
        if (r9 == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0345, code lost:
    
        r1 = r1 - r10;
        r0 = r11.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0348, code lost:
    
        r0.A02(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x034d, code lost:
    
        if (r2 >= r20) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0351, code lost:
    
        if (r2 >= r21) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0353, code lost:
    
        r0 = -r11.A03.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0358, code lost:
    
        if (r9 == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x035a, code lost:
    
        r1 = r1 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0367, code lost:
    
        r1 = r1 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x035c, code lost:
    
        r1 = r1 + r10;
        r0 = r11.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0363, code lost:
    
        r1 = r1 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0364, code lost:
    
        r0 = r11.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0360, code lost:
    
        if (r9 == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x02f9, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0369, code lost:
    
        r2 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ec, code lost:
    
        if (r9 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ee, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f2, code lost:
    
        if (r1 <= r8) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f4, code lost:
    
        r0 = (int) (((r1 - r8) / 2.0f) + 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fc, code lost:
    
        if (r9 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fe, code lost:
    
        r10 = r10 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0188, code lost:
    
        r10 = r10 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ff, code lost:
    
        if (r11 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0101, code lost:
    
        r0 = r8 - r1;
        r0 = (int) ((r0 / r11) + 0.5f);
        r13 = 0;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0110, code lost:
    
        if (r13 >= r6) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0112, code lost:
    
        r15 = (X.C5GB) r7.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011c, code lost:
    
        if (r15.A02.A0R == 8) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0122, code lost:
    
        if (r15.A07 != X.C05F.A0C) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0124, code lost:
    
        r0 = r15.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012a, code lost:
    
        if (r0.A0B != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012f, code lost:
    
        if (r18 <= 0.0f) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0131, code lost:
    
        r23 = (int) (((r15.A02.A0y[r26.A01] * r0) / r18) + 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0145, code lost:
    
        if (r26.A01 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0147, code lost:
    
        r0 = r15.A02;
        r14 = r0.A0J;
        r0 = r0.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014d, code lost:
    
        r22 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0151, code lost:
    
        if (r15.A00 != 1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0153, code lost:
    
        r15 = java.lang.Math.min(r23, r0.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x015d, code lost:
    
        r15 = java.lang.Math.max(r22, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0163, code lost:
    
        if (r14 <= 0) goto L93;
     */
    @Override // X.C5GB, X.C5GC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F9z(X.C5GC r27) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XPu.F9z(X.5GC):void");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (super.A01 == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            sb.append("<");
            sb.append(next);
            sb.append("> ");
        }
        return sb.toString();
    }

    public XPu(C56082hw c56082hw, int i) {
        super(c56082hw);
        C56112hz c56112hz;
        C5GC c5gc;
        C56112hz c56112hz2;
        int i2;
        C5GC c5gc2;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A01 = A1E;
        super.A01 = i;
        C56082hw c56082hw2 = this.A02;
        while (true) {
            if (i == 0) {
                c56112hz = c56082hw2.A0e;
            } else {
                c56112hz = c56082hw2.A0g;
            }
            C56112hz c56112hz3 = c56112hz.A04;
            if (c56112hz3 == null || c56112hz3.A04 != c56112hz) {
                break;
            } else {
                c56082hw2 = c56112hz3.A08;
            }
        }
        this.A02 = c56082hw2;
        if (i == 0) {
            c5gc = c56082hw2.A0k;
        } else {
            c5gc = c56082hw2.A0l;
        }
        A1E.add(c5gc);
        if (i == 0) {
            c56112hz2 = c56082hw2.A0f;
        } else {
            c56112hz2 = c56082hw2.A0a;
        }
        while (true) {
            C56112hz c56112hz4 = c56112hz2.A04;
            if (c56112hz4 == null || c56112hz4.A04 != c56112hz2) {
                break;
            }
            C56082hw c56082hw3 = c56112hz4.A08;
            if (i == 0) {
                c5gc2 = c56082hw3.A0k;
            } else {
                c5gc2 = c56082hw3.A0l;
            }
            A1E.add(c5gc2);
            if (i == 0) {
                c56112hz2 = c56082hw3.A0f;
            } else {
                c56112hz2 = c56082hw3.A0a;
            }
        }
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            C5GB c5gb = (C5GB) it.next();
            int i3 = super.A01;
            if (i3 == 0) {
                c5gb.A02.A0i = this;
            } else if (i3 == 1) {
                c5gb.A02.A0j = this;
            }
        }
        int i4 = super.A01;
        if (i4 == 0 && ((C56062hu) this.A02.A0h).A0H && A1E.size() > 1) {
            this.A02 = A00(A1E, A1E.size() - 1);
        }
        C56082hw c56082hw4 = this.A02;
        if (i4 == 0) {
            i2 = c56082hw4.A0C;
        } else {
            i2 = c56082hw4.A0P;
        }
        this.A00 = i2;
    }

    public static C56082hw A00(AbstractList abstractList, int i) {
        return ((C5GB) abstractList.get(i)).A02;
    }
}
