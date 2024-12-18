package X;

/* renamed from: X.5DT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DT {
    public boolean A00;
    public final C57S A01 = new C57S(new C5DU[16]);
    public final C57S A02 = new C57S(new C114175De[16]);
    public final C57S A03 = new C57S(new AnonymousClass599[16]);
    public final C57S A04 = new C57S(new C114175De[16]);
    public final InterfaceC1128457r A05;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.58J] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00a9 -> B:9:0x0020). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C58J r10, X.C114175De r11, java.util.Set r12) {
        /*
            X.58J r9 = r10.A03
            boolean r0 = r9.A08
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitSubtreeIf called on an unattached node"
            X.AbstractC28290Cdc.A01(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L10:
            r8 = 16
            X.58J[] r0 = new X.C58J[r8]
            X.57S r7 = new X.57S
            r7.<init>(r0)
            X.58J r0 = r9.A02
            if (r0 == 0) goto La9
            r7.A09(r0)
        L20:
            int r0 = r7.A00
            if (r0 == 0) goto Lae
            r6 = 1
            int r0 = r0 - r6
            java.lang.Object r9 = r7.A00(r0)
            X.58J r9 = (X.C58J) r9
            int r0 = r9.A00
            r0 = r0 & 32
            if (r0 == 0) goto La9
            r0 = r9
        L33:
            int r1 = r0.A01
            r1 = r1 & 32
            if (r1 == 0) goto La4
            r10 = 0
            r5 = r0
            r4 = r10
        L3c:
            boolean r1 = r5 instanceof X.InterfaceC1129158a
            if (r1 == 0) goto L67
            X.58a r5 = (X.InterfaceC1129158a) r5
            boolean r1 = r5 instanceof X.C5DU
            if (r1 == 0) goto L5a
            r2 = r5
            X.5DU r2 = (X.C5DU) r2
            X.58O r1 = r2.A00
            boolean r1 = r1 instanceof X.InterfaceC118885a5
            if (r1 == 0) goto L5a
            java.util.HashSet r1 = r2.A02
            boolean r1 = r1.contains(r11)
            if (r1 == 0) goto L5a
            r12.add(r5)
        L5a:
            X.6Nk r1 = r5.Biu()
            boolean r1 = r1.A01(r11)
            r1 = r1 ^ 1
            if (r1 != 0) goto L9a
            goto L20
        L67:
            int r1 = r5.A01
            r1 = r1 & 32
            if (r1 == 0) goto L9a
            boolean r1 = r5 instanceof X.C5AY
            if (r1 == 0) goto L9a
            r1 = r5
            X.5AY r1 = (X.C5AY) r1
            X.58J r3 = r1.A00
            r2 = 0
        L77:
            if (r3 == 0) goto L9f
            int r1 = r3.A01
            r1 = r1 & 32
            if (r1 == 0) goto L84
            int r2 = r2 + 1
            if (r2 != r6) goto L87
            r5 = r3
        L84:
            X.58J r3 = r3.A02
            goto L77
        L87:
            if (r4 != 0) goto L90
            X.58J[] r1 = new X.C58J[r8]
            X.57S r4 = new X.57S
            r4.<init>(r1)
        L90:
            if (r5 == 0) goto L96
            r4.A09(r5)
            r5 = r10
        L96:
            r4.A09(r3)
            goto L84
        L9a:
            X.58J r5 = X.AbstractC114335Dx.A00(r4)
            goto La1
        L9f:
            if (r2 != r6) goto L9a
        La1:
            if (r5 == 0) goto La4
            goto L3c
        La4:
            X.58J r0 = r0.A02
            if (r0 == 0) goto La9
            goto L33
        La9:
            X.AbstractC114335Dx.A06(r7, r9)
            goto L20
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5DT.A00(X.58J, X.5De, java.util.Set):void");
    }

    public C5DT(InterfaceC1128457r interfaceC1128457r) {
        this.A05 = interfaceC1128457r;
    }
}
