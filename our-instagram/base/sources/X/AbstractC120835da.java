package X;

/* renamed from: X.5da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC120835da {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        r7 = X.AbstractC114335Dx.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if (r7 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if ((r7.A01 & 8) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        if ((r7 instanceof X.C5AY) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        r3 = ((X.C5AY) r7).A00;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r3 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if ((r3.A01 & 8) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r2 != 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
    
        r3 = r3.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0009, code lost:
    
        if ((r6.A00 & 8) != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r0 = new X.C57S(new X.C58J[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        if (r7 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        r0.A09(r7);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
    
        r0.A09(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        if (r2 != 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0068, code lost:
    
        if ((r6.A00 & 8) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        r6 = r6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006c, code lost:
    
        if (r6 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0023, code lost:
    
        return (X.C58L) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if ((r6.A01 & 8) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r7 = r6;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if ((r7 instanceof X.C58L) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (((X.C58L) r7).BvB() == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C58L A01(X.AnonymousClass599 r7) {
        /*
            X.59S r0 = r7.A0W
            X.58J r6 = r0.A02
            int r0 = r6.A00
            r0 = r0 & 8
            r5 = 0
            if (r0 == 0) goto L21
        Lb:
            int r0 = r6.A01
            r0 = r0 & 8
            if (r0 == 0) goto L64
            r7 = r6
            r0 = r5
        L13:
            boolean r1 = r7 instanceof X.C58L
            if (r1 == 0) goto L24
            r1 = r7
            X.58L r1 = (X.C58L) r1
            boolean r1 = r1.BvB()
            if (r1 == 0) goto L5a
            r5 = r7
        L21:
            X.58L r5 = (X.C58L) r5
            return r5
        L24:
            int r1 = r7.A01
            r1 = r1 & 8
            r4 = 1
            if (r1 == 0) goto L5a
            boolean r1 = r7 instanceof X.C5AY
            if (r1 == 0) goto L5a
            r1 = r7
            X.5AY r1 = (X.C5AY) r1
            X.58J r3 = r1.A00
            r2 = 0
        L35:
            if (r3 == 0) goto L5f
            int r1 = r3.A01
            r1 = r1 & 8
            if (r1 == 0) goto L42
            int r2 = r2 + 1
            if (r2 != r4) goto L45
            r7 = r3
        L42:
            X.58J r3 = r3.A02
            goto L35
        L45:
            if (r0 != 0) goto L50
            r0 = 16
            X.58J[] r1 = new X.C58J[r0]
            X.57S r0 = new X.57S
            r0.<init>(r1)
        L50:
            if (r7 == 0) goto L56
            r0.A09(r7)
            r7 = r5
        L56:
            r0.A09(r3)
            goto L42
        L5a:
            X.58J r7 = X.AbstractC114335Dx.A00(r0)
            goto L61
        L5f:
            if (r2 != r4) goto L5a
        L61:
            if (r7 == 0) goto L64
            goto L13
        L64:
            int r0 = r6.A00
            r0 = r0 & 8
            if (r0 == 0) goto L21
            X.58J r6 = r6.A02
            if (r6 == 0) goto L21
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC120835da.A01(X.599):X.58L");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if ((r7 instanceof X.C5AY) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r3 = ((X.C5AY) r7).A00;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r3 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if ((r3.A01 & 8) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r2 != 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r3 = r3.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        r0 = new X.C57S(new X.C58J[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r7 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        r0.A09(r7);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r0.A09(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r2 != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0009, code lost:
    
        if ((r6.A00 & 8) != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r7 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        r7 = X.AbstractC114335Dx.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0017, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        if ((r6.A00 & 8) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
    
        r6 = r6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
    
        if (r6 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0018, code lost:
    
        X.C14360o3.A0A(r5);
        r2 = r5.A03;
        r1 = r8.A0C();
        X.C14360o3.A0A(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0029, code lost:
    
        return new X.C113525Ap(r2, r8, r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if ((r6.A01 & 8) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r7 = r6;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if ((r7 instanceof X.C58L) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if ((r7.A01 & 8) == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C113525Ap A02(X.AnonymousClass599 r8, boolean r9) {
        /*
            X.59S r0 = r8.A0W
            X.58J r6 = r0.A02
            int r0 = r6.A00
            r0 = r0 & 8
            r5 = 0
            if (r0 == 0) goto L18
        Lb:
            int r0 = r6.A01
            r0 = r0 & 8
            if (r0 == 0) goto L6a
            r7 = r6
            r0 = r5
        L13:
            boolean r1 = r7 instanceof X.C58L
            if (r1 == 0) goto L2a
            r5 = r7
        L18:
            X.C14360o3.A0A(r5)
            X.58J r2 = r5.A03
            X.5An r1 = r8.A0C()
            X.C14360o3.A0A(r1)
            X.5Ap r0 = new X.5Ap
            r0.<init>(r2, r8, r1, r9)
            return r0
        L2a:
            int r1 = r7.A01
            r1 = r1 & 8
            r4 = 1
            if (r1 == 0) goto L60
            boolean r1 = r7 instanceof X.C5AY
            if (r1 == 0) goto L60
            r1 = r7
            X.5AY r1 = (X.C5AY) r1
            X.58J r3 = r1.A00
            r2 = 0
        L3b:
            if (r3 == 0) goto L65
            int r1 = r3.A01
            r1 = r1 & 8
            if (r1 == 0) goto L48
            int r2 = r2 + 1
            if (r2 != r4) goto L4b
            r7 = r3
        L48:
            X.58J r3 = r3.A02
            goto L3b
        L4b:
            if (r0 != 0) goto L56
            r0 = 16
            X.58J[] r1 = new X.C58J[r0]
            X.57S r0 = new X.57S
            r0.<init>(r1)
        L56:
            if (r7 == 0) goto L5c
            r0.A09(r7)
            r7 = r5
        L5c:
            r0.A09(r3)
            goto L48
        L60:
            X.58J r7 = X.AbstractC114335Dx.A00(r0)
            goto L67
        L65:
            if (r2 != r4) goto L60
        L67:
            if (r7 == 0) goto L6a
            goto L13
        L6a:
            int r0 = r6.A00
            r0 = r0 & 8
            if (r0 == 0) goto L18
            X.58J r6 = r6.A02
            if (r6 == 0) goto L18
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC120835da.A02(X.599, boolean):X.5Ap");
    }

    public static final AnonymousClass599 A00(AnonymousClass599 anonymousClass599, InterfaceC16660sJ interfaceC16660sJ) {
        do {
            anonymousClass599 = anonymousClass599.A0B();
            if (anonymousClass599 == null) {
                return null;
            }
        } while (!((Boolean) interfaceC16660sJ.invoke(anonymousClass599)).booleanValue());
        return anonymousClass599;
    }
}
