package X;

import java.util.List;

/* renamed from: X.5GB, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5GB implements C5GC {
    public int A00;
    public int A01;
    public C56082hw A02;
    public Y8R A03;
    public Y8R A04;
    public XPr A05;
    public C73304Xzv A06;
    public Integer A07;
    public Integer A08;
    public boolean A09;

    public static final Y8R A01(C56112hz c56112hz) {
        C56112hz c56112hz2 = c56112hz.A04;
        if (c56112hz2 == null) {
            return null;
        }
        C56082hw c56082hw = c56112hz2.A08;
        int ordinal = c56112hz2.A07.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                if (ordinal != 2) {
                    if (ordinal != 5) {
                        if (ordinal != 4) {
                            return null;
                        }
                        return c56082hw.A0l.A03;
                    }
                    return c56082hw.A0l.A00;
                }
                return c56082hw.A0l.A04;
            }
            return c56082hw.A0k.A03;
        }
        return c56082hw.A0k.A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r1 != 4) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.Y8R A02(X.C56112hz r3, int r4) {
        /*
            X.2hz r1 = r3.A04
            r3 = 0
            if (r1 == 0) goto L1d
            X.2hw r0 = r1.A08
            if (r4 != 0) goto L1e
            X.5GA r2 = r0.A0k
        Lb:
            X.2hy r0 = r1.A07
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L24
            r0 = 3
            if (r1 == r0) goto L21
            r0 = 2
            if (r1 == r0) goto L24
            r0 = 4
            if (r1 == r0) goto L21
        L1d:
            return r3
        L1e:
            X.5GD r2 = r0.A0l
            goto Lb
        L21:
            X.Y8R r3 = r2.A03
            return r3
        L24:
            X.Y8R r3 = r2.A04
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5GB.A02(X.2hz, int):X.Y8R");
    }

    public static final void A03(Y8R y8r, Y8R y8r2, int i) {
        y8r.A08.add(y8r2);
        y8r.A00 = i;
        y8r2.A07.add(y8r);
    }

    public final int A04(int i, int i2) {
        int i3;
        int i4;
        C56082hw c56082hw = this.A02;
        if (i2 == 0) {
            i3 = c56082hw.A0J;
            i4 = c56082hw.A0L;
        } else {
            i3 = c56082hw.A0I;
            i4 = c56082hw.A0K;
        }
        int max = Math.max(i4, i);
        if (i3 > 0) {
            max = Math.min(i3, i);
        }
        if (max != i) {
            return max;
        }
        return i;
    }

    public long A05() {
        if (this.A05.A0B) {
            return r1.A02;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0204  */
    /* JADX WARN: Type inference failed for: r1v85, types: [X.Y8R, X.XPr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A06() {
        /*
            Method dump skipped, instructions count: 1399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5GB.A06():void");
    }

    public void A07() {
        boolean z = this instanceof C5GD;
        Y8R y8r = this.A04;
        boolean z2 = y8r.A0B;
        if (z) {
            if (z2) {
                this.A02.A0W = y8r.A02;
                return;
            }
            return;
        }
        if (!z2) {
            return;
        }
        this.A02.A0V = y8r.A02;
    }

    public void A08() {
        if (this instanceof C5GD) {
            C5GD c5gd = (C5GD) this;
            c5gd.A06 = null;
            c5gd.A04.A01();
            c5gd.A03.A01();
            c5gd.A00.A01();
            c5gd.A05.A01();
            c5gd.A09 = false;
            return;
        }
        this.A06 = null;
        this.A04.A01();
        this.A03.A01();
        this.A05.A01();
        this.A09 = false;
    }

    public final void A0A(Y8R y8r, Y8R y8r2, XPr xPr, int i) {
        List list = y8r.A08;
        list.add(y8r2);
        list.add(this.A05);
        y8r.A01 = i;
        y8r.A04 = xPr;
        y8r2.A07.add(y8r);
        xPr.A07.add(y8r);
    }

    public boolean A0B() {
        int i;
        boolean z = this instanceof C5GD;
        Integer num = this.A07;
        Integer num2 = C05F.A0C;
        if (z) {
            if (num != num2) {
                return true;
            }
            i = this.A02.A0G;
        } else {
            if (num != num2) {
                return true;
            }
            i = this.A02.A0H;
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x0238, code lost:
    
        if (r9 != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x028c, code lost:
    
        if (r11 != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0313, code lost:
    
        if (r1.A0Y() == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x032a, code lost:
    
        if (r1.A0Z() == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x032c, code lost:
    
        r2 = (X.Y8R) r8.A08.get(r4);
        r1 = (X.Y8R) r7.A08.get(r4);
        r2 = r2.A02 + r8.A00;
        r1 = r1.A02 + r7.A00;
        r8.A02(r2);
        r7.A02(r1);
        r6.A02(r1 - r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0351, code lost:
    
        return;
     */
    @Override // X.C5GC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F9z(X.C5GC r22) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5GB.F9z(X.5GC):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Y8R, X.XPr] */
    public C5GB(C56082hw c56082hw) {
        Integer num;
        ?? y8r = new Y8R(this);
        if (this instanceof C5GA) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        y8r.A06 = num;
        this.A05 = y8r;
        this.A01 = 0;
        this.A09 = false;
        this.A04 = new Y8R(this);
        this.A03 = new Y8R(this);
        this.A08 = C05F.A00;
        this.A02 = c56082hw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (((X.C5GB) r1).A00 == 3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(X.C56112hz r16, X.C56112hz r17, int r18) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5GB.A09(X.2hz, X.2hz, int):void");
    }
}
