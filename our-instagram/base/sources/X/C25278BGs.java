package X;

/* renamed from: X.BGs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25278BGs implements InterfaceC31050Dko {
    public final /* synthetic */ C6NM A00;
    public final /* synthetic */ Object A01;

    public C25278BGs(C6NM c6nm, Object obj) {
        this.A00 = c6nm;
        this.A01 = obj;
    }

    @Override // X.InterfaceC31050Dko
    public final int Bda() {
        AnonymousClass599 anonymousClass599 = (AnonymousClass599) this.A00.A0B.get(this.A01);
        if (anonymousClass599 != null) {
            return anonymousClass599.A0F().size();
        }
        return 0;
    }

    @Override // X.InterfaceC31050Dko
    public final void E5N(int i, long j) {
        C6NM c6nm = this.A00;
        AnonymousClass599 anonymousClass599 = (AnonymousClass599) c6nm.A0B.get(this.A01);
        if (anonymousClass599 != null && anonymousClass599.A0A != null) {
            int size = anonymousClass599.A0F().size();
            if (i >= 0 && i < size) {
                if (!anonymousClass599.A0U.A0J.A0F) {
                    AnonymousClass599 anonymousClass5992 = c6nm.A09;
                    anonymousClass5992.A0J = true;
                    C59M.A00(anonymousClass599).CpH((AnonymousClass599) anonymousClass599.A0F().get(i), j);
                    anonymousClass5992.A0J = false;
                    return;
                }
                throw AbstractC166987dD.A12("Pre-measure called on node that is not placed");
            }
            throw new IndexOutOfBoundsException(AnonymousClass001.A0X("Index (", AbstractC58317Pt9.A00(415), ')', i, size));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0sJ] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00b7 -> B:15:0x003e). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC31050Dko
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F8a(X.InterfaceC16660sJ r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.lang.String r9 = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"
            X.6NM r0 = r13.A00
            java.util.HashMap r1 = r0.A0B
            java.lang.Object r0 = r13.A01
            java.lang.Object r0 = r1.get(r0)
            X.599 r0 = (X.AnonymousClass599) r0
            if (r0 == 0) goto Lbb
            X.59S r0 = r0.A0W
            if (r0 == 0) goto Lbb
            X.58J r0 = r0.A02
            if (r0 == 0) goto Lbb
            r12 = 262144(0x40000, float:3.67342E-40)
            X.58J r8 = r0.A03
            boolean r0 = r8.A08
            if (r0 != 0) goto L2e
            r0 = 3308(0xcec, float:4.635E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.AbstractC28290Cdc.A01(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L2e:
            r7 = 16
            X.58J[] r0 = new X.C58J[r7]
            X.57S r6 = new X.57S
            r6.<init>(r0)
            X.58J r0 = r8.A02
            if (r0 == 0) goto Lb7
            r6.A09(r0)
        L3e:
            int r0 = r6.A00
            if (r0 == 0) goto Lbb
            r5 = 1
            int r0 = r0 - r5
            java.lang.Object r8 = r6.A00(r0)
            X.58J r8 = (X.C58J) r8
            int r0 = r8.A00
            r0 = r0 & r12
            if (r0 == 0) goto Lb7
            r0 = r8
        L50:
            int r1 = r0.A01
            r1 = r1 & r12
            if (r1 == 0) goto Lb2
            r11 = 0
            r10 = r0
            r4 = r11
        L58:
            boolean r1 = r10 instanceof X.InterfaceC1130758u
            if (r1 == 0) goto L7e
            X.58u r10 = (X.InterfaceC1130758u) r10
            java.lang.Object r1 = r10.CAp()
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L7b
            java.lang.Object r2 = r14.invoke(r10)
        L6c:
            X.BHM r1 = X.BHM.CancelTraversal
            if (r2 == r1) goto Lbb
            X.BHM r1 = X.BHM.SkipSubtreeAndContinueTraversal
            if (r2 == r1) goto L3e
        L74:
            X.58J r10 = X.AbstractC114335Dx.A00(r4)
        L78:
            if (r10 == 0) goto Lb2
            goto L58
        L7b:
            X.BHM r2 = X.BHM.ContinueTraversal
            goto L6c
        L7e:
            int r1 = r10.A01
            r1 = r1 & r12
            if (r1 == 0) goto L74
            boolean r1 = r10 instanceof X.C5AY
            if (r1 == 0) goto L74
            r1 = r10
            X.5AY r1 = (X.C5AY) r1
            X.58J r3 = r1.A00
            r2 = 0
        L8d:
            if (r3 == 0) goto Laf
            int r1 = r3.A01
            r1 = r1 & r12
            if (r1 == 0) goto L99
            int r2 = r2 + 1
            if (r2 != r5) goto L9c
            r10 = r3
        L99:
            X.58J r3 = r3.A02
            goto L8d
        L9c:
            if (r4 != 0) goto La5
            X.58J[] r1 = new X.C58J[r7]
            X.57S r4 = new X.57S
            r4.<init>(r1)
        La5:
            if (r10 == 0) goto Lab
            r4.A09(r10)
            r10 = r11
        Lab:
            r4.A09(r3)
            goto L99
        Laf:
            if (r2 != r5) goto L74
            goto L78
        Lb2:
            X.58J r0 = r0.A02
            if (r0 == 0) goto Lb7
            goto L50
        Lb7:
            X.AbstractC114335Dx.A06(r6, r8)
            goto L3e
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25278BGs.F8a(X.0sJ, java.lang.Object):void");
    }

    @Override // X.InterfaceC31050Dko
    public final void dispose() {
        C6NM c6nm = this.A00;
        c6nm.A05();
        Object remove = c6nm.A0B.remove(this.A01);
        if (remove != null) {
            if (c6nm.A02 > 0) {
                AnonymousClass599 anonymousClass599 = c6nm.A09;
                int indexOf = anonymousClass599.A0G().indexOf(remove);
                int size = anonymousClass599.A0G().size();
                int i = c6nm.A02;
                if (indexOf >= size - i) {
                    c6nm.A03++;
                    c6nm.A02 = i - 1;
                    int size2 = (anonymousClass599.A0G().size() - c6nm.A02) - c6nm.A03;
                    C6NM.A01(c6nm, indexOf, size2);
                    c6nm.A06(size2);
                    return;
                }
                throw AbstractC166987dD.A14("Item is not in pre-composed item range");
            }
            throw AbstractC166987dD.A14("No pre-composed items to dispose");
        }
    }
}
