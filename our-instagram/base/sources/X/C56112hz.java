package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56112hz {
    public int A00;
    public C56152i4 A03;
    public C56112hz A04;
    public boolean A06;
    public final EnumC56102hy A07;
    public final C56082hw A08;
    public HashSet A05 = null;
    public int A02 = 0;
    public int A01 = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
    
        if (r2 == X.EnumC56102hy.BOTTOM) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0056, code lost:
    
        if (r2 == X.EnumC56102hy.RIGHT) goto L42;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x001f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0067 A[PHI: r1
      0x0067: PHI (r1v7 boolean) = (r1v2 boolean), (r1v5 boolean), (r1v0 boolean), (r1v0 boolean), (r1v0 boolean) binds: [B:45:0x005d, B:33:0x0048, B:19:0x0029, B:6:0x000c, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09(X.C56112hz r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L1a
            X.2hy r2 = r6.A07
            X.2hy r3 = r5.A07
            r1 = 1
            if (r2 != r3) goto L1b
            X.2hy r0 = X.EnumC56102hy.BASELINE
            if (r3 != r0) goto L67
            X.2hw r0 = r6.A08
            boolean r0 = r0.A0q
            if (r0 == 0) goto L1a
            X.2hw r0 = r5.A08
            boolean r0 = r0.A0q
            if (r0 != 0) goto L67
        L1a:
            return r4
        L1b:
            int r0 = r3.ordinal()
            switch(r0) {
                case 1: goto L4f;
                case 2: goto L3a;
                case 3: goto L4f;
                case 4: goto L3a;
                case 5: goto L23;
                case 6: goto L2c;
                default: goto L22;
            }
        L22:
            return r4
        L23:
            X.2hy r0 = X.EnumC56102hy.LEFT
            if (r2 == r0) goto L1a
            X.2hy r0 = X.EnumC56102hy.RIGHT
            if (r2 != r0) goto L67
            return r4
        L2c:
            X.2hy r0 = X.EnumC56102hy.BASELINE
            if (r2 == r0) goto L1a
            X.2hy r0 = X.EnumC56102hy.CENTER_X
            if (r2 == r0) goto L1a
            X.2hy r0 = X.EnumC56102hy.CENTER_Y
            if (r2 == r0) goto L1a
            r4 = 1
            return r4
        L3a:
            X.2hy r0 = X.EnumC56102hy.TOP
            if (r2 == r0) goto L43
            X.2hy r0 = X.EnumC56102hy.BOTTOM
            r1 = 0
            if (r2 != r0) goto L44
        L43:
            r1 = 1
        L44:
            X.2hw r0 = r6.A08
            boolean r0 = r0 instanceof X.C3OH
            if (r0 == 0) goto L67
            if (r1 != 0) goto L65
            X.2hy r0 = X.EnumC56102hy.CENTER_Y
            goto L63
        L4f:
            X.2hy r0 = X.EnumC56102hy.LEFT
            if (r2 == r0) goto L58
            X.2hy r0 = X.EnumC56102hy.RIGHT
            r1 = 0
            if (r2 != r0) goto L59
        L58:
            r1 = 1
        L59:
            X.2hw r0 = r6.A08
            boolean r0 = r0 instanceof X.C3OH
            if (r0 == 0) goto L67
            if (r1 != 0) goto L65
            X.2hy r0 = X.EnumC56102hy.CENTER_X
        L63:
            if (r2 != r0) goto L66
        L65:
            r4 = 1
        L66:
            return r4
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56112hz.A09(X.2hz):boolean");
    }

    public final int A00() {
        if (!this.A06) {
            return 0;
        }
        return this.A00;
    }

    public final int A01() {
        C56112hz c56112hz;
        if (this.A08.A0R == 8) {
            return 0;
        }
        int i = this.A01;
        if (i != Integer.MIN_VALUE && (c56112hz = this.A04) != null && c56112hz.A08.A0R == 8) {
            return i;
        }
        return this.A02;
    }

    public final C56112hz A02() {
        switch (this.A07.ordinal()) {
            case 1:
                return this.A08.A0f;
            case 2:
                return this.A08.A0a;
            case 3:
                return this.A08.A0e;
            case 4:
                return this.A08.A0g;
            default:
                return null;
        }
    }

    public final void A03() {
        HashSet hashSet;
        C56112hz c56112hz = this.A04;
        if (c56112hz != null && (hashSet = c56112hz.A05) != null) {
            hashSet.remove(this);
            if (this.A04.A05.size() == 0) {
                this.A04.A05 = null;
            }
        }
        this.A05 = null;
        this.A04 = null;
        this.A02 = 0;
        this.A01 = Integer.MIN_VALUE;
        this.A06 = false;
        this.A00 = 0;
    }

    public final void A04() {
        C56152i4 c56152i4 = this.A03;
        if (c56152i4 == null) {
            this.A03 = new C56152i4(C05F.A00);
        } else {
            c56152i4.A00();
        }
    }

    public final void A05(C56112hz c56112hz, int i) {
        A06(c56112hz, i, Integer.MIN_VALUE, false);
    }

    public final void A06(C56112hz c56112hz, int i, int i2, boolean z) {
        if (c56112hz == null) {
            A03();
            return;
        }
        if (!z && !A09(c56112hz)) {
            return;
        }
        this.A04 = c56112hz;
        HashSet hashSet = c56112hz.A05;
        if (hashSet == null) {
            hashSet = new HashSet();
            c56112hz.A05 = hashSet;
        }
        hashSet.add(this);
        this.A02 = i;
        this.A01 = i2;
    }

    public final void A07(C72508XfN c72508XfN, ArrayList arrayList, int i) {
        HashSet hashSet = this.A05;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC72872Xq6.A00(((C56112hz) it.next()).A08, c72508XfN, arrayList, i);
            }
        }
    }

    public final boolean A08() {
        HashSet hashSet = this.A05;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C56112hz) it.next()).A02().A04 != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return AnonymousClass001.A0g(this.A08.A0n, ":", this.A07.toString());
    }

    public C56112hz(EnumC56102hy enumC56102hy, C56082hw c56082hw) {
        this.A08 = c56082hw;
        this.A07 = enumC56102hy;
    }
}
