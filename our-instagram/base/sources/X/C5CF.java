package X;

/* renamed from: X.5CF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CF extends C0YY implements InterfaceC16660sJ {
    public static final C5CF A00 = new C5CF();

    public C5CF() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r0 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00be, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        r0 = r1.EKR(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0049. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
            X.C14360o3.A0C(r8, r0)
            java.util.List r8 = (java.util.List) r8
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r2 = r8.get(r1)
            r6 = 0
            if (r2 == 0) goto L58
            X.C71 r2 = (X.C71) r2
        L15:
            X.C14360o3.A0A(r2)
            r1 = 2
            java.lang.Object r1 = r8.get(r1)
            if (r1 == 0) goto L56
            java.lang.Number r1 = (java.lang.Number) r1
        L21:
            X.C14360o3.A0A(r1)
            int r5 = r1.intValue()
            r1 = 3
            java.lang.Object r1 = r8.get(r1)
            if (r1 == 0) goto L54
            java.lang.Number r1 = (java.lang.Number) r1
        L31:
            X.C14360o3.A0A(r1)
            int r4 = r1.intValue()
            r1 = 4
            java.lang.Object r3 = r8.get(r1)
            if (r3 == 0) goto L52
            java.lang.String r3 = (java.lang.String) r3
        L41:
            X.C14360o3.A0A(r3)
            int r2 = r2.ordinal()
            r1 = 1
            switch(r2) {
                case 0: goto Lac;
                case 1: goto L9d;
                case 2: goto L8e;
                case 3: goto L7f;
                case 4: goto L70;
                case 5: goto L61;
                case 6: goto L5a;
                default: goto L4c;
            }
        L4c:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L52:
            r3 = r6
            goto L41
        L54:
            r1 = r6
            goto L31
        L56:
            r1 = r6
            goto L21
        L58:
            r2 = r6
            goto L15
        L5a:
            java.lang.Object r0 = r8.get(r1)
            if (r0 == 0) goto Lbf
            goto Lbe
        L61:
            java.lang.Object r2 = r8.get(r1)
            X.5C7 r1 = X.C5C9.A04
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto Lbf
            if (r2 == 0) goto Lbf
            goto Lba
        L70:
            java.lang.Object r2 = r8.get(r1)
            X.5C7 r1 = X.C5C9.A06
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto Lbf
            if (r2 == 0) goto Lbf
            goto Lba
        L7f:
            java.lang.Object r2 = r8.get(r1)
            X.5C7 r1 = X.C5C9.A0H
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto Lbf
            if (r2 == 0) goto Lbf
            goto Lba
        L8e:
            java.lang.Object r2 = r8.get(r1)
            X.5C7 r1 = X.C5C9.A0I
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto Lbf
            if (r2 == 0) goto Lbf
            goto Lba
        L9d:
            java.lang.Object r2 = r8.get(r1)
            X.5C7 r1 = X.C5C9.A0B
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto Lbf
            if (r2 == 0) goto Lbf
            goto Lba
        Lac:
            java.lang.Object r2 = r8.get(r1)
            X.5C7 r1 = X.C5C9.A09
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto Lbf
            if (r2 == 0) goto Lbf
        Lba:
            java.lang.Object r0 = r1.EKR(r2)
        Lbe:
            r6 = r0
        Lbf:
            X.C14360o3.A0A(r6)
            X.5of r0 = new X.5of
            r0.<init>(r6, r3, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5CF.invoke(java.lang.Object):java.lang.Object");
    }
}
