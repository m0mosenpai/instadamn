package X;

/* renamed from: X.04p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C012604p extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ C14850oz A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C012604p(C14850oz c14850oz) {
        super(2);
        this.A00 = c14850oz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r2 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r7 == r2) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r3 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        return java.lang.Integer.valueOf(r3);
     */
    @Override // X.InterfaceC16620sF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r6.intValue()
            X.12V r7 = (X.C12V) r7
            r3 = r4
            X.12b r1 = r7.getKey()
            X.0oz r0 = r5.A00
            X.12W r0 = r0.A03
            X.12V r2 = r0.get(r1)
            X.196 r0 = X.AnonymousClass195.A00
            if (r1 == r0) goto L24
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r2) goto L1f
        L1d:
            int r3 = r4 + 1
        L1f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L24:
            X.195 r7 = (X.AnonymousClass195) r7
        L26:
            if (r7 != 0) goto L2e
            r7 = 0
        L29:
            if (r7 != r2) goto L39
            if (r2 != 0) goto L1d
            goto L1f
        L2e:
            if (r7 == r2) goto L29
            boolean r0 = r7 instanceof X.C1UX
            if (r0 == 0) goto L29
            X.195 r7 = r7.BbF()
            goto L26
        L39:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", expected child of "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012604p.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
