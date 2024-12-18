package X;

/* loaded from: classes5.dex */
public final /* synthetic */ class D5h extends C03E implements InterfaceC16570sA {
    public static final D5h A00 = new D5h();

    public D5h() {
        super(6, AbstractC47151Ksk.class, "convertViewModelStateToUiState", "convertViewModelStateToUiState(Ljava/util/List;Landroid/graphics/Bitmap;Lcom/instagram/creation/genai/contextualbackground/domain/SuccessfulGeneration;Lcom/instagram/creation/genai/contextualbackground/model/ContextualBackgroundSourceImage;ZLandroid/graphics/Bitmap;)Lcom/instagram/creation/genai/contextualbackground/domain/ContextualBackgroundUiState;", 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r12.isEmpty() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        r1 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (r1.hasNext() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if ((r1.next() instanceof X.C28122CaV) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x005e, code lost:
    
        if (r2 != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[LOOP:3: B:38:0x0083->B:40:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd A[LOOP:5: B:54:0x00b7->B:56:0x00bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    @Override // X.InterfaceC16570sA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r11 = this;
            r6 = r17
            r5 = r13
            java.util.List r12 = (java.util.List) r12
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            X.CQK r14 = (X.CQK) r14
            com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage r15 = (com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage) r15
            boolean r1 = X.AbstractC166987dD.A1a(r16)
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            r0 = 0
            X.C14360o3.A0B(r12, r0)
            if (r1 != 0) goto L2d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L73
            boolean r2 = r12 instanceof java.util.Collection
            if (r2 == 0) goto L49
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L49
        L27:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L61
        L2d:
            java.lang.Integer r8 = X.C05F.A0C
        L2f:
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r12.iterator()
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.CQK
            if (r0 == 0) goto L37
            r3.add(r1)
            goto L37
        L49:
            java.util.Iterator r1 = r12.iterator()
        L4d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.CQK
            if (r0 == 0) goto L4d
            java.lang.Integer r8 = X.C05F.A01
            goto L2f
        L5e:
            if (r2 == 0) goto L61
            goto L27
        L61:
            java.util.Iterator r1 = r12.iterator()
        L65:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C28122CaV
            if (r0 != 0) goto L65
        L73:
            java.lang.Integer r8 = X.C05F.A00
            goto L2f
        L76:
            r0 = 3
            java.util.List r0 = X.BJT.A00(r3, r0)
            java.util.ArrayList r3 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L83:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r1.next()
            X.CQK r0 = (X.CQK) r0
            X.CuY r0 = r0.A01
            r3.add(r0)
            goto L83
        L95:
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r12.iterator()
        L9d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C28123CaW
            if (r0 == 0) goto L9d
            r4.add(r1)
            goto L9d
        Laf:
            java.util.ArrayList r2 = X.AbstractC167007dF.A0i(r4)
            java.util.Iterator r1 = r4.iterator()
        Lb7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc6
            r1.next()
            X.CuZ r0 = X.C29230CuZ.A00
            r2.add(r0)
            goto Lb7
        Lc6:
            r7 = 0
            if (r15 == 0) goto Ld9
            java.lang.String r9 = r15.A02
        Lcb:
            java.util.ArrayList r10 = X.AbstractC001800i.A0S(r2, r3)
            if (r14 == 0) goto Ld3
            X.CuY r7 = r14.A01
        Ld3:
            X.MtM r4 = new X.MtM
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        Ld9:
            r9 = r7
            goto Lcb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D5h.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
