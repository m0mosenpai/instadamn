package X;

/* renamed from: X.J6t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43173J6t extends AbstractC23611Dp implements InterfaceC16590sC {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43173J6t(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(5, interfaceC23621Ds);
        this.A04 = i;
        this.A05 = obj;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2 = this.A04;
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj2);
        boolean A1a3 = AbstractC166987dD.A1a(obj4);
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj5;
        Object obj6 = this.A05;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C43173J6t c43173J6t = new C43173J6t(obj6, interfaceC23621Ds, i);
        c43173J6t.A01 = A1a;
        c43173J6t.A02 = A1a2;
        c43173J6t.A00 = obj3;
        c43173J6t.A03 = A1a3;
        return c43173J6t.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A04
            X.AbstractC09560e7.A00(r13)
            if (r0 == 0) goto L6f
            boolean r8 = r12.A01
            boolean r9 = r12.A02
            java.lang.Object r3 = r12.A00
            X.HDl r3 = (X.C38959HDl) r3
            boolean r11 = r12.A03
            r2 = 0
            if (r3 == 0) goto L56
            java.lang.String r6 = r3.A08
            X.3xD r5 = r3.A01()
            if (r5 != 0) goto L28
        L1c:
            java.lang.Object r0 = r12.A05
            X.GtV r0 = (X.C38335GtV) r0
            X.0do r0 = r0.A0F
            java.lang.Object r5 = r0.getValue()
            X.3xD r5 = (X.InterfaceC88553xD) r5
        L28:
            if (r3 == 0) goto L58
            boolean r10 = r3.A0E
            X.IGL r0 = r3.A05
            if (r0 == 0) goto L54
            X.3om r4 = r0.A02
        L32:
            java.util.List r0 = r3.A0C
            java.util.ArrayList r7 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r2 = r0.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = com.instagram.api.schemas.MusicPageTabType.A01
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L50
            com.instagram.api.schemas.MusicPageTabType r0 = com.instagram.api.schemas.MusicPageTabType.A06
        L50:
            r7.add(r0)
            goto L3c
        L54:
            r4 = 0
            goto L32
        L56:
            r6 = r2
            goto L1c
        L58:
            r10 = 0
            r4 = r2
            X.0sl r7 = X.C16930sl.A00
            goto L63
        L5d:
            X.MWo r2 = r3.A01
            X.MYx r3 = r3.A02
            if (r3 != 0) goto L69
        L63:
            java.lang.Object r0 = r12.A05
            X.GtV r0 = (X.C38335GtV) r0
            X.MYx r3 = r0.A00
        L69:
            X.Gyn r1 = new X.Gyn
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        L6f:
            boolean r4 = r12.A01
            boolean r1 = r12.A02
            java.lang.Object r0 = r12.A00
            X.88X r0 = (X.C88X) r0
            boolean r3 = r12.A03
            r2 = 1
            if (r4 == 0) goto L9b
            if (r1 == 0) goto L9b
            if (r0 == 0) goto L9b
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A00()
            if (r0 == 0) goto L9b
            java.util.Map r1 = r0.A0Z
            r0 = 1418(0x58a, float:1.987E-42)
            java.lang.String r0 = X.MSV.A00(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L9b
            if (r3 != 0) goto L9b
        L96:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            return r1
        L9b:
            r2 = 0
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43173J6t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
