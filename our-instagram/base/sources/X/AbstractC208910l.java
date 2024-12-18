package X;

/* renamed from: X.10l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC208910l {
    public static final AnonymousClass059 A01(Object obj, C19L c19l, InterfaceC19390xP interfaceC19390xP, C10H c10h) {
        Integer num;
        C10J A03 = A03(interfaceC19390xP, 1);
        C008002u A00 = C10E.A00(obj);
        C12W c12w = A03.A02;
        InterfaceC19390xP interfaceC19390xP2 = A03.A03;
        if (C14360o3.A0K(c10h, C10I.A00)) {
            num = C05F.A00;
        } else {
            num = C05F.A0N;
        }
        return new AnonymousClass059(AbstractC23641Du.A03(num, c12w, new C0W7(obj, null, interfaceC19390xP2, A00, c10h), c19l), A00);
    }

    public static final AnonymousClass059 A02(C05A c05a) {
        return new AnonymousClass059(null, c05a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r2 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r8 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C10J A03(X.InterfaceC19390xP r7, int r8) {
        /*
            r6 = 1
            X.3JM r0 = X.InterfaceC24731Iq.A00
            int r0 = X.C3JM.A00()
            r5 = r8
            if (r8 >= r0) goto Lb
            r5 = r0
        Lb:
            int r5 = r5 - r8
            boolean r0 = r7 instanceof X.C0UG
            if (r0 == 0) goto L3c
            r4 = r7
            X.0UG r4 = (X.C0UG) r4
            X.0xP r3 = r4.A03()
            if (r3 == 0) goto L3c
            int r2 = r4.A00
            r0 = -3
            if (r2 == r0) goto L2e
            r0 = -2
            if (r2 == r0) goto L2e
            if (r2 == 0) goto L2e
            r6 = r2
        L24:
            java.lang.Integer r1 = r4.A01
            X.12W r0 = r4.A02
            X.10J r2 = new X.10J
            r2.<init>(r1, r0, r3, r6)
            return r2
        L2e:
            java.lang.Integer r1 = r4.A01
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L39
            r6 = r5
            if (r2 != 0) goto L24
        L37:
            r6 = 0
            goto L24
        L39:
            if (r8 != 0) goto L37
            goto L24
        L3c:
            java.lang.Integer r1 = X.C05F.A00
            X.191 r0 = X.AnonymousClass191.A00
            X.10J r2 = new X.10J
            r2.<init>(r1, r0, r7, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC208910l.A03(X.0xP, int):X.10J");
    }

    public static final void A04(C12W c12w, C73163Pr c73163Pr, C19L c19l, InterfaceC19390xP interfaceC19390xP) {
        AbstractC23641Du.A03(C05F.A00, c12w, new C06480Vq(null, c73163Pr, interfaceC19390xP), c19l);
    }

    public static final C06160Ug A00(C19L c19l, InterfaceC19390xP interfaceC19390xP, C10H c10h, int i) {
        Integer num;
        C10J A03 = A03(interfaceC19390xP, i);
        AnonymousClass057 A00 = C10M.A00(A03.A01, i, A03.A00);
        C12W c12w = A03.A02;
        InterfaceC19390xP interfaceC19390xP2 = A03.A03;
        C20730zt c20730zt = C10M.A00;
        if (C14360o3.A0K(c10h, C10I.A00)) {
            num = C05F.A00;
        } else {
            num = C05F.A0N;
        }
        return new C06160Ug(AbstractC23641Du.A03(num, c12w, new C0W7(c20730zt, null, interfaceC19390xP2, A00, c10h), c19l), A00);
    }
}
