package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8g9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192678g9 implements C3R9 {
    public static final C192678g9 A00 = new Object();
    public static final SerialDescriptor A01 = new C3RH("X.36J", C3RE.A00);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (X.AbstractC001900j.A0W(r7, '-') == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r5 == '-') goto L9;
     */
    @Override // X.C3RB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r17) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192678g9.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r16 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r14.append(r0);
        r14.append('H');
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r14.append(r9);
        r14.append('M');
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r2 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r4 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        r0 = r14.toString();
        X.C14360o3.A07(r0);
        r20.ASK(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        X.C36J.A08("S", r14, r15, r16, 9, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        if (r3 != false) goto L24;
     */
    @Override // X.C3RA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.serialization.encoding.Encoder r20, java.lang.Object r21) {
        /*
            r19 = this;
            r0 = r21
            X.36J r0 = (X.C36J) r0
            long r4 = r0.A00
            r0 = 0
            r8 = r20
            X.C14360o3.A0B(r8, r0)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r12 = 0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L1c
            r0 = 45
            r14.append(r0)
        L1c:
            java.lang.String r0 = "PT"
            r14.append(r0)
            r2 = r4
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L30
            r6 = 1
            long r0 = r4 >> r6
            long r2 = -r0
            int r0 = (int) r4
            r0 = r0 & 1
            long r2 = r2 << r6
            long r0 = (long) r0
            long r2 = r2 + r0
        L30:
            X.36G r0 = X.C36G.A04
            long r0 = X.C36J.A06(r0, r2)
            boolean r6 = X.C36J.A09(r2)
            if (r6 == 0) goto L90
            r9 = 0
            r15 = 0
        L3e:
            int r16 = X.C36J.A01(r2)
            boolean r2 = X.C36J.A09(r4)
            if (r2 == 0) goto L4d
            r0 = 9999999999999(0x9184e729fff, double:4.940656458412E-311)
        L4d:
            r4 = 1
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L54
            r3 = 1
        L54:
            if (r15 != 0) goto L59
            r2 = 0
            if (r16 == 0) goto L5a
        L59:
            r2 = 1
        L5a:
            if (r9 != 0) goto L8d
            if (r2 == 0) goto L8c
            if (r3 == 0) goto L78
        L60:
            r14.append(r0)
            r0 = 72
            r14.append(r0)
        L68:
            if (r4 == 0) goto L72
            r14.append(r9)
            r0 = 77
            r14.append(r0)
        L72:
            if (r2 != 0) goto L78
            if (r3 != 0) goto L81
            if (r4 != 0) goto L81
        L78:
            java.lang.String r13 = "S"
            r17 = 9
            r18 = 1
            X.C36J.A08(r13, r14, r15, r16, r17, r18)
        L81:
            java.lang.String r0 = r14.toString()
            X.C14360o3.A07(r0)
            r8.ASK(r0)
            return
        L8c:
            r4 = 0
        L8d:
            if (r3 == 0) goto L68
            goto L60
        L90:
            X.36G r6 = X.C36G.A07
            long r6 = X.C36J.A06(r6, r2)
            r10 = 60
            long r6 = r6 % r10
            int r9 = (int) r6
            X.36G r6 = X.C36G.A09
            long r6 = X.C36J.A06(r6, r2)
            long r6 = r6 % r10
            int r15 = (int) r6
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192678g9.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }
}
