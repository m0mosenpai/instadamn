package X;

/* renamed from: X.5Dx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114335Dx {
    public static final C59U A03(C58K c58k) {
        String str;
        if (!((C58J) c58k).A03.A08) {
            str = "Cannot get LayoutCoordinates, Modifier.Node is not attached.";
        } else {
            C59U A04 = A04(c58k, 2);
            if (!A04.A0T().A08) {
                str = "LayoutCoordinates is not attached.";
            } else {
                return A04;
            }
        }
        AbstractC28290Cdc.A01(str);
        throw C00O.createAndThrow();
    }

    public static final C59U A04(C58K c58k, int i) {
        C59U c59u = ((C58J) c58k).A03.A05;
        C14360o3.A0A(c59u);
        if (c59u.A0T() == c58k) {
            C18630vq c18630vq = AbstractC114275Dr.A00;
            if ((i & 128) != 0) {
                C59U c59u2 = c59u.A06;
                C14360o3.A0A(c59u2);
                return c59u2;
            }
            return c59u;
        }
        return c59u;
    }

    public static final C58J A00(C57S c57s) {
        int i;
        if (c57s != null && (i = c57s.A00) != 0) {
            return (C58J) c57s.A00(i - 1);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        r2 = ((X.C5AY) r2).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r2 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if ((r2 instanceof X.C5DW) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if ((r2 instanceof X.C5AY) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        if ((r2.A01 & 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        r2 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if ((r2 instanceof X.C5AY) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C5DW A01(X.C58J r2) {
        /*
            int r0 = r2.A01
            r1 = r0 & 2
            r0 = 0
            if (r1 == 0) goto L8
            r0 = 1
        L8:
            r1 = 0
            if (r0 == 0) goto L2e
            boolean r0 = r2 instanceof X.C5DW
            if (r0 != 0) goto L2b
            boolean r0 = r2 instanceof X.C5AY
            if (r0 == 0) goto L2e
        L13:
            X.5AY r2 = (X.C5AY) r2
            X.58J r2 = r2.A00
        L17:
            if (r2 == 0) goto L2e
            boolean r0 = r2 instanceof X.C5DW
            if (r0 != 0) goto L2b
            boolean r0 = r2 instanceof X.C5AY
            if (r0 == 0) goto L28
            int r0 = r2.A01
            r0 = r0 & 2
            if (r0 == 0) goto L28
            goto L13
        L28:
            X.58J r2 = r2.A02
            goto L17
        L2b:
            X.5DW r2 = (X.C5DW) r2
            return r2
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC114335Dx.A01(X.58J):X.5DW");
    }

    public static final AnonymousClass599 A02(C58K c58k) {
        C59U c59u = ((C58J) c58k).A03.A05;
        if (c59u != null) {
            return c59u.A0H;
        }
        AbstractC28290Cdc.A02("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw C00O.createAndThrow();
    }

    public static final InterfaceC1128457r A05(C58K c58k) {
        InterfaceC1128457r interfaceC1128457r = A02(c58k).A0A;
        if (interfaceC1128457r != null) {
            return interfaceC1128457r;
        }
        AbstractC28290Cdc.A02("This node does not have an owner.");
        throw C00O.createAndThrow();
    }

    public static final void A06(C57S c57s, C58J c58j) {
        C57S A0A = A02(c58j).A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = A0A.A02;
            do {
                c57s.A09(((AnonymousClass599) objArr[i2]).A0W.A02);
                i2--;
            } while (i2 >= 0);
        }
    }
}
