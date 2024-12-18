package X;

/* renamed from: X.0ST, reason: invalid class name */
/* loaded from: classes.dex */
public abstract /* synthetic */ class C0ST {
    public static final InterfaceC16660sJ A00 = C05G.A00;
    public static final InterfaceC16620sF A01 = C05H.A00;

    public static final InterfaceC19390xP A00(InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        InterfaceC16660sJ interfaceC16660sJ = A00;
        C14360o3.A0C(interfaceC16620sF, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        C15500q5.A06(interfaceC16620sF, 2);
        if (interfaceC19390xP instanceof C16460rr) {
            C16460rr c16460rr = (C16460rr) interfaceC19390xP;
            if (c16460rr.A00 == interfaceC16660sJ && c16460rr.A01 == interfaceC16620sF) {
                return interfaceC19390xP;
            }
        }
        return new C16460rr(interfaceC16660sJ, interfaceC16620sF, interfaceC19390xP);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r1.A01 == r2) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC19390xP A01(X.InterfaceC19390xP r4) {
        /*
            boolean r0 = r4 instanceof X.C0UO
            if (r0 != 0) goto L17
            X.0sJ r3 = X.C0ST.A00
            X.0sF r2 = X.C0ST.A01
            boolean r0 = r4 instanceof X.C16460rr
            if (r0 == 0) goto L18
            r1 = r4
            X.0rr r1 = (X.C16460rr) r1
            X.0sJ r0 = r1.A00
            if (r0 != r3) goto L18
            X.0sF r0 = r1.A01
            if (r0 != r2) goto L18
        L17:
            return r4
        L18:
            X.0rr r0 = new X.0rr
            r0.<init>(r3, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ST.A01(X.0xP):X.0xP");
    }
}
