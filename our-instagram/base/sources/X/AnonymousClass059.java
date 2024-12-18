package X;

import java.util.List;

/* renamed from: X.059, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass059 implements C0UO, InterfaceC14870p1, InterfaceC16480rt {
    public final AnonymousClass195 A00;
    public final /* synthetic */ C0UO A01;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0016, code lost:
    
        if (r5 == (-3)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        if (r5 < 2) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000a, code lost:
    
        if (r5 != 0) goto L9;
     */
    @Override // X.InterfaceC14870p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC19390xP AWl(java.lang.Integer r3, X.C12W r4, int r5) {
        /*
            r2 = this;
            r0 = r2
            if (r5 < 0) goto L12
            r1 = 2
            if (r5 >= r1) goto Lc
        L6:
            java.lang.Integer r1 = X.C05F.A01
            if (r3 == r1) goto L11
            if (r5 == 0) goto L18
        Lc:
            X.02t r0 = new X.02t
            r0.<init>(r3, r4, r2, r5)
        L11:
            return r0
        L12:
            r1 = -2
            if (r5 == r1) goto L6
            r1 = -3
            if (r5 != r1) goto Lc
        L18:
            java.lang.Integer r1 = X.C05F.A00
            if (r3 != r1) goto Lc
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass059.AWl(java.lang.Integer, X.12W, int):X.0xP");
    }

    @Override // X.InterfaceC15070pN
    public final List Bn0() {
        return this.A01.Bn0();
    }

    @Override // X.InterfaceC15070pN, X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return this.A01.collect(interfaceC19960yQ, interfaceC23621Ds);
    }

    @Override // X.C0UO
    public final Object getValue() {
        return this.A01.getValue();
    }

    public AnonymousClass059(AnonymousClass195 anonymousClass195, C0UO c0uo) {
        this.A00 = anonymousClass195;
        this.A01 = c0uo;
    }
}
