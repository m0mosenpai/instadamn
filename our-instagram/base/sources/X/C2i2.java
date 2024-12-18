package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2i2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2i2 {
    public C56062hu A00;
    public C56062hu A01;
    public boolean A05 = true;
    public boolean A06 = true;
    public ArrayList A04 = new ArrayList();
    public ArrayList A08 = new ArrayList();
    public InterfaceC56272iG A02 = null;
    public C56132i1 A07 = new Object();
    public ArrayList A03 = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r1 = r0.A04;
        r3 = r0.A03;
        r13 = r11.A04;
        r1 = r13.A08.contains(r1);
        r10 = r11.A03;
        r0 = r10.A08.contains(r3);
        r17 = r11.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r0 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        r8 = X.C73304Xzv.A01(r13, r2, 0);
        r15 = X.C73304Xzv.A00(r10, r2, 0);
        r8 = r8 - r17;
        r2 = r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r8 < (-r2)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        r8 = r8 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r0 = r13.A00;
        r2 = ((-r15) - r17) - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (r2 < r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r2 = r2 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r11 = r11.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r23 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        r11 = r11.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r11 <= 0.0f) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r4 = (((float) r2) / r11) + (((float) r8) / (1.0f - r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        r8 = (float) r4;
        r4 = (((r8 * r11) + 0.5f) + r17) + ((r8 * (1.0f - r11)) + 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        r0 = (r0 + r4) - r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        r11 = r11.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        r3 = X.C73304Xzv.A01(r13, r2, r13.A00);
        r8 = r13.A00 + r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        r0 = java.lang.Math.max(r3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r0 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        r8 = (-r10.A00) + r17;
        r3 = -X.C73304Xzv.A00(r10, r2, r10.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r0 = r13.A00;
        r4 = r11.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        r0 = r21.A0l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
    
        if ((r11 instanceof X.C5GA) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
    
        if ((r11 instanceof X.C5GD) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r23 == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r0 = r21.A0k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.C56062hu r21, X.C2i2 r22, int r23) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2i2.A00(X.2hu, X.2i2, int):int");
    }

    private void A01(C56082hw c56082hw, Integer num, Integer num2, int i, int i2) {
        C56132i1 c56132i1 = this.A07;
        c56132i1.A06 = num;
        c56132i1.A07 = num2;
        c56132i1.A00 = i;
        c56132i1.A05 = i2;
        this.A02.Cp9(c56082hw, c56132i1);
        c56082hw.A0I(c56132i1.A04);
        c56082hw.A0H(c56132i1.A03);
        c56082hw.A0q = c56132i1.A08;
        c56082hw.A0G(c56132i1.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x022f, code lost:
    
        if (r3.A0G == 0) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C56062hu r23, X.C2i2 r24) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2i2.A02(X.2hu, X.2i2):void");
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [X.Xzv, java.lang.Object] */
    private void A03(Y8R y8r, Y8R y8r2, C73304Xzv c73304Xzv, ArrayList arrayList, int i) {
        C73304Xzv c73304Xzv2 = c73304Xzv;
        C5GB c5gb = y8r.A05;
        if (c5gb.A06 == null) {
            C56062hu c56062hu = this.A00;
            if (c5gb != c56062hu.A0k && c5gb != c56062hu.A0l) {
                if (c73304Xzv == null) {
                    ?? obj = new Object();
                    obj.A01 = null;
                    obj.A02 = new ArrayList();
                    C73304Xzv.A03++;
                    obj.A00 = c5gb;
                    obj.A01 = c5gb;
                    arrayList.add(obj);
                    c73304Xzv2 = obj;
                }
                c5gb.A06 = c73304Xzv2;
                c73304Xzv2.A02.add(c5gb);
                c73304Xzv2.A01 = c5gb;
                Y8R y8r3 = c5gb.A04;
                for (C5GC c5gc : y8r3.A07) {
                    if (c5gc instanceof Y8R) {
                        A03((Y8R) c5gc, y8r2, c73304Xzv2, arrayList, i);
                    }
                }
                Y8R y8r4 = c5gb.A03;
                for (C5GC c5gc2 : y8r4.A07) {
                    if (c5gc2 instanceof Y8R) {
                        A03((Y8R) c5gc2, y8r2, c73304Xzv2, arrayList, i);
                    }
                }
                if (i == 1 && (c5gb instanceof C5GD)) {
                    for (C5GC c5gc3 : ((C5GD) c5gb).A00.A07) {
                        if (c5gc3 instanceof Y8R) {
                            A03((Y8R) c5gc3, y8r2, c73304Xzv2, arrayList, 1);
                        }
                    }
                }
                Iterator it = y8r3.A08.iterator();
                while (it.hasNext()) {
                    A03((Y8R) it.next(), y8r2, c73304Xzv2, arrayList, i);
                }
                Iterator it2 = y8r4.A08.iterator();
                while (it2.hasNext()) {
                    A03((Y8R) it2.next(), y8r2, c73304Xzv2, arrayList, i);
                }
                if (i == 1 && (c5gb instanceof C5GD)) {
                    Iterator it3 = ((C5GD) c5gb).A00.A08.iterator();
                    while (it3.hasNext()) {
                        A03((Y8R) it3.next(), y8r2, c73304Xzv2, arrayList, 1);
                    }
                }
            }
        }
    }

    private void A04(C5GB c5gb, ArrayList arrayList, int i) {
        Y8R y8r;
        Y8R y8r2;
        Y8R y8r3 = c5gb.A04;
        for (C5GC c5gc : y8r3.A07) {
            if (c5gc instanceof Y8R) {
                y8r2 = (Y8R) c5gc;
            } else if (c5gc instanceof C5GB) {
                y8r2 = ((C5GB) c5gc).A04;
            }
            A03(y8r2, c5gb.A03, null, arrayList, i);
        }
        for (C5GC c5gc2 : c5gb.A03.A07) {
            if (c5gc2 instanceof Y8R) {
                y8r = (Y8R) c5gc2;
            } else if (c5gc2 instanceof C5GB) {
                y8r = ((C5GB) c5gc2).A03;
            }
            A03(y8r, y8r3, null, arrayList, i);
        }
        if (i == 1) {
            for (C5GC c5gc3 : ((C5GD) c5gb).A00.A07) {
                if (c5gc3 instanceof Y8R) {
                    A03((Y8R) c5gc3, null, null, arrayList, 1);
                }
            }
        }
    }

    public final void A05() {
        C5GB c5gb;
        ArrayList arrayList = this.A04;
        arrayList.clear();
        C56062hu c56062hu = this.A01;
        c56062hu.A0k.A08();
        c56062hu.A0l.A08();
        arrayList.add(c56062hu.A0k);
        arrayList.add(c56062hu.A0l);
        Iterator it = ((AbstractC56072hv) c56062hu).A00.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C56082hw c56082hw = (C56082hw) it.next();
            if (c56082hw instanceof C3OH) {
                c5gb = new C5GB(c56082hw);
                c56082hw.A0k.A08();
                c56082hw.A0l.A08();
                c5gb.A01 = ((C3OH) c56082hw).A01;
            } else {
                if (c56082hw.A0Y()) {
                    XPu xPu = c56082hw.A0i;
                    if (xPu == null) {
                        xPu = new XPu(c56082hw, 0);
                        c56082hw.A0i = xPu;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(xPu);
                } else {
                    arrayList.add(c56082hw.A0k);
                }
                if (c56082hw.A0Z()) {
                    XPu xPu2 = c56082hw.A0j;
                    if (xPu2 == null) {
                        xPu2 = new XPu(c56082hw, 1);
                        c56082hw.A0j = xPu2;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(xPu2);
                } else {
                    arrayList.add(c56082hw.A0l);
                }
                if (c56082hw instanceof C3O7) {
                    c5gb = new C5GB(c56082hw);
                }
            }
            arrayList.add(c5gb);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C5GB) it2.next()).A08();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C5GB c5gb2 = (C5GB) it3.next();
            if (c5gb2.A02 != c56062hu) {
                c5gb2.A06();
            }
        }
        ArrayList arrayList2 = this.A03;
        arrayList2.clear();
        C73304Xzv.A03 = 0;
        C56062hu c56062hu2 = this.A00;
        A04(c56062hu2.A0k, arrayList2, 0);
        A04(c56062hu2.A0l, arrayList2, 1);
        this.A05 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r4 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        r3.A00 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        r3.A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        if (r5 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x000a A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            r19 = this;
            r10 = r19
            X.2hu r0 = r10.A00
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r9 = r0.iterator()
        La:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r11 = r9.next()
            X.2hw r11 = (X.C56082hw) r11
            boolean r0 = r11.A0u
            if (r0 != 0) goto La
            java.lang.Integer[] r0 = r11.A14
            r8 = 0
            r5 = r0[r8]
            r2 = 1
            r4 = r0[r2]
            int r3 = r11.A0H
            int r1 = r11.A0G
            java.lang.Integer r12 = X.C05F.A01
            if (r5 == r12) goto L30
            java.lang.Integer r0 = X.C05F.A0C
            if (r5 != r0) goto La6
            if (r3 != r2) goto La6
        L30:
            r7 = 1
        L31:
            if (r4 == r12) goto L39
            java.lang.Integer r0 = X.C05F.A0C
            if (r4 != r0) goto L3a
            if (r1 != r2) goto L3a
        L39:
            r8 = 1
        L3a:
            X.5GA r0 = r11.A0k
            X.XPr r6 = r0.A05
            boolean r1 = r6.A0B
            X.5GD r0 = r11.A0l
            X.XPr r3 = r0.A05
            boolean r0 = r3.A0B
            if (r1 == 0) goto L66
            if (r0 == 0) goto L80
            java.lang.Integer r12 = X.C05F.A00
            int r14 = r6.A02
            int r15 = r3.A02
            r13 = r12
            r10.A01(r11, r12, r13, r14, r15)
        L54:
            r11.A0u = r2
        L56:
            boolean r0 = r11.A0u
            if (r0 == 0) goto La
            X.5GD r0 = r11.A0l
            X.XPr r1 = r0.A01
            if (r1 == 0) goto La
            int r0 = r11.A08
            r1.A02(r0)
            goto La
        L66:
            if (r0 == 0) goto L56
            if (r7 == 0) goto L56
            int r14 = r6.A02
            java.lang.Integer r13 = X.C05F.A00
            int r15 = r3.A02
            r10.A01(r11, r12, r13, r14, r15)
            java.lang.Integer r1 = X.C05F.A0C
            X.5GA r0 = r11.A0k
            X.XPr r3 = r0.A05
            int r0 = r11.A07()
            if (r5 != r1) goto La2
            goto L9f
        L80:
            if (r8 == 0) goto L56
            java.lang.Integer r15 = X.C05F.A00
            int r1 = r6.A02
            int r0 = r3.A02
            r13 = r10
            r14 = r11
            r16 = r12
            r17 = r1
            r18 = r0
            r13.A01(r14, r15, r16, r17, r18)
            java.lang.Integer r1 = X.C05F.A0C
            X.5GD r0 = r11.A0l
            X.XPr r3 = r0.A05
            int r0 = r11.A06()
            if (r4 != r1) goto La2
        L9f:
            r3.A00 = r0
            goto L56
        La2:
            r3.A02(r0)
            goto L54
        La6:
            r7 = 0
            goto L31
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2i2.A06():void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2i1, java.lang.Object] */
    public C2i2(C56062hu c56062hu) {
        this.A00 = c56062hu;
        this.A01 = c56062hu;
    }
}
