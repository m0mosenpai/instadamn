package X;

/* renamed from: X.SMc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62688SMc {
    public Integer A00 = C05F.A00;
    public final long A01;
    public final long A02;
    public final C63140Sdm A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0176, code lost:
    
        if (r13 == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0178, code lost:
    
        r0 = (short) (((r8[0] << 8) & 65280) | (r8[1] & 255));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x018c, code lost:
    
        r26 = X.AbstractC167007dF.A1M(r8[2] & 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0192, code lost:
    
        r2 = (byte) (r8[3] & 15);
        r4 = (short) (((r8[4] << 8) & 65280) | (r8[5] & 255));
        r7 = (short) (((r8[6] << 8) & 65280) | (r8[7] & 255));
        r15 = r2;
        r13 = 12;
        r6 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b9, code lost:
    
        if (r3 >= r4) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01bb, code lost:
    
        r2 = X.C62935SYd.A00(r8, r13).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c7, code lost:
    
        if (512 < ((r13 + r2) + 4)) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c9, code lost:
    
        r13 = r13 + (r2 + 4);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        throw X.AbstractC166987dD.A12("insufficient data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d7, code lost:
    
        r0 = new X.C62689SMd[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01db, code lost:
    
        if (r6 >= r7) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01dd, code lost:
    
        r5 = X.C62935SYd.A00(r8, r13);
        r4 = r5.A00;
        r24 = r13 + r4;
        r2 = r24 + 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ed, code lost:
    
        if (512 < r2) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01ef, code lost:
    
        r0 = (short) (((r8[r24] << 8) & 65280) | (r8[r24 + 1] & 255));
        r0 = r24 + 2;
        r0 = (short) (((r8[r0] << 8) & 65280) | (r8[r0 + 1] & 255));
        r22 = r24 + 4;
        r31 = ((((r8[r22] << 24) & (-16777216)) | ((r8[r22 + 1] << 16) & 16711680)) | ((r8[r22 + 2] << 8) & 65280)) | (r8[r22 + 3] & 255);
        r0 = r24 + 8;
        r1 = (short) (((r8[r0] << 8) & 65280) | (r8[r0 + 1] & 255));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x024b, code lost:
    
        if (512 < (r2 + r1)) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024d, code lost:
    
        r0 = new byte[r1];
        java.lang.System.arraycopy(r8, r2, r0, 0, r1);
        r2 = new X.C62689SMd(r5, r0, r31, r1 + (r4 + 10), r0, r0);
        r0[r6] = r2;
        r13 = r13 + r2.A00;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
    
        throw X.AbstractC166987dD.A12("Insufficient data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:?, code lost:
    
        throw X.AbstractC166987dD.A12("Insufficient data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0279, code lost:
    
        if (r0 != r14) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027b, code lost:
    
        if (r26 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x027d, code lost:
    
        if (r15 != 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x027f, code lost:
    
        if (r7 == 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0281, code lost:
    
        r21 = java.lang.System.currentTimeMillis();
        r2 = X.AbstractC166987dD.A1G();
        r20 = X.AbstractC166987dD.A1E();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x028e, code lost:
    
        if (r4 >= r7) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0290, code lost:
    
        r3 = r0[r4];
        r5 = r3.A02;
        r13 = X.AbstractC166987dD.A1C();
        r1 = r5.A02;
        r0 = r1.length;
        r14 = 0;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02a3, code lost:
    
        if (r15 >= r0) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a5, code lost:
    
        r13.append(r1[r15]);
        r13.append('.');
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02b0, code lost:
    
        r0 = r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02b2, code lost:
    
        if (r0 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02b4, code lost:
    
        r5 = X.C62935SYd.A00(r8, r0).A02;
        r1 = r5.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02bb, code lost:
    
        if (r14 >= r1) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02bd, code lost:
    
        r13.append(r5[r14]);
        r13.append('.');
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02cc, code lost:
    
        if (r13.length() <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02ce, code lost:
    
        r13.setLength(r13.length() - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02d7, code lost:
    
        r13 = r13.toString();
        r5 = X.C63140Sdm.A02;
        r4 = r4 + 1;
        r1 = r3.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02e1, code lost:
    
        if (r1 != 1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e3, code lost:
    
        r6 = r3.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e6, code lost:
    
        if (r6 == 5) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02e8, code lost:
    
        if (r6 != 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02ea, code lost:
    
        r6 = (short) r3.A05.length;
        r0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02fa, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02fb, code lost:
    
        if (r6 == r0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02fe, code lost:
    
        if (r14 == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x031a, code lost:
    
        if (r1 != 1) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x031c, code lost:
    
        r1 = r3.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x031e, code lost:
    
        if (r1 == 1) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0322, code lost:
    
        if (r1 == 28) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0324, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0326, code lost:
    
        if (r1 == 5) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0329, code lost:
    
        if (r6 == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0353, code lost:
    
        X.C0K8.A0P(r5, "Unexpected DNS record skipped: %s", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x032b, code lost:
    
        r6 = X.C62935SYd.A00(r3.A05, 0).A02;
        r3 = X.AbstractC166987dD.A1C();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x033b, code lost:
    
        if (r1 >= r6.length) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x033d, code lost:
    
        if (r1 <= 0) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x033f, code lost:
    
        r3.append(".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0342, code lost:
    
        r3.append(r6[r1]);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x034a, code lost:
    
        r2.put(r3.toString(), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0328, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0300, code lost:
    
        r20.add(new X.SL9(java.net.InetAddress.getByAddress(r13, r3.A05), (r3.A01 * 1000) + r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02f2, code lost:
    
        if (r6 != 28) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02f4, code lost:
    
        r6 = (short) r3.A05.length;
        r0 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02fd, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x035e, code lost:
    
        r5 = X.AbstractC166987dD.A1E();
        r7 = r20.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x036a, code lost:
    
        if (r7.hasNext() == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x036c, code lost:
    
        r6 = (X.SL9) r7.next();
        r3 = r6.A01;
        r1 = r3.getHostName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x037c, code lost:
    
        if (r37.equals(r1) == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0382, code lost:
    
        if (r1 == null) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0388, code lost:
    
        if (r37.equals(r1) != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x038a, code lost:
    
        r1 = X.AbstractC31171DnF.A0h(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x038f, code lost:
    
        r5.add(new X.SL9(java.net.InetAddress.getByAddress(r1, r3.getAddress()), r6.A00));
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x037e, code lost:
    
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03a2, code lost:
    
        r5.size();
        r3 = X.AbstractC58319PtB.A11(r5);
        r1 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03b1, code lost:
    
        if (r1.hasNext() == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03b3, code lost:
    
        r3.add(((X.SL9) r1.next()).A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:?, code lost:
    
        throw new java.net.UnknownHostException(X.AnonymousClass001.A0R("No answers received in response while trying to resolve ", r37));
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:?, code lost:
    
        throw new java.net.UnknownHostException(X.AnonymousClass001.A0R("Error code was set in response while trying to resolve ", r37));
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:?, code lost:
    
        throw new java.net.UnknownHostException(X.AnonymousClass001.A0R("Received truncated DNS response while trying to resolve ", r37));
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:?, code lost:
    
        throw new java.net.UnknownHostException(X.AnonymousClass001.A0R("Received DNS response with unexpected id while trying to resolve ", r37));
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:?, code lost:
    
        throw new java.net.UnknownHostException(X.AnonymousClass001.A0R("Failed to resolve ", r37));
     */
    /* JADX WARN: Type inference failed for: r0v155, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A00(java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 1105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62688SMc.A00(java.lang.String):java.util.ArrayList");
    }

    public C62688SMc(long j, long j2, long j3, boolean z, boolean z2) {
        this.A04 = z;
        this.A05 = z2;
        this.A03 = new C63140Sdm((int) j);
        this.A01 = j2;
        this.A02 = j3;
    }
}
