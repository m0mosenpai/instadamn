package androidx.datastore.core;

import X.AnonymousClass139;
import X.C14510oO;
import X.C15370ps;
import X.InterfaceC30919DiW;

/* loaded from: classes9.dex */
public final class SingleProcessDataStore$readAndInit$api$1 implements InterfaceC30919DiW {
    public final /* synthetic */ SingleProcessDataStore A00;
    public final /* synthetic */ C14510oO A01;
    public final /* synthetic */ C15370ps A02;
    public final /* synthetic */ AnonymousClass139 A03;

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #0 {all -> 0x00b2, blocks: (B:27:0x008f, B:28:0x0092, B:30:0x009a), top: B:26:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f A[Catch: all -> 0x00bb, TryCatch #1 {all -> 0x00bb, blocks: (B:35:0x007b, B:37:0x007f, B:40:0x00b4, B:41:0x00ba), top: B:34:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4 A[Catch: all -> 0x00bb, TRY_ENTER, TryCatch #1 {all -> 0x00bb, blocks: (B:35:0x007b, B:37:0x007f, B:40:0x00b4, B:41:0x00ba), top: B:34:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // X.InterfaceC30919DiW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object FAf(X.InterfaceC23621Ds r12, X.InterfaceC16620sF r13) {
        /*
            r11 = this;
            r3 = 0
            boolean r0 = X.PX7.A02(r12, r3)
            if (r0 == 0) goto L32
            r7 = r12
            X.PX7 r7 = (X.PX7) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L32
            int r2 = r2 - r1
            r7.A00 = r2
        L15:
            java.lang.Object r1 = r7.A06
            X.1JX r10 = X.C1JX.A02
            int r2 = r7.A00
            r8 = 3
            r9 = 2
            r0 = 1
            r6 = 0
            if (r2 == 0) goto L62
            if (r2 == r0) goto L4a
            if (r2 == r9) goto L3d
            if (r2 != r8) goto L38
            java.lang.Object r0 = r7.A03
            java.lang.Object r5 = r7.A02
            X.0ps r5 = (X.C15370ps) r5
            java.lang.Object r2 = r7.A01
            X.139 r2 = (X.AnonymousClass139) r2
            goto La7
        L32:
            X.PX7 r7 = new X.PX7
            r7.<init>(r11, r12, r3)
            goto L15
        L38:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L3d:
            java.lang.Object r4 = r7.A03
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            java.lang.Object r5 = r7.A02
            X.0ps r5 = (X.C15370ps) r5
            java.lang.Object r2 = r7.A01
            X.139 r2 = (X.AnonymousClass139) r2
            goto L8f
        L4a:
            java.lang.Object r4 = r7.A05
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            java.lang.Object r5 = r7.A04
            X.0ps r5 = (X.C15370ps) r5
            java.lang.Object r3 = r7.A03
            X.0oO r3 = (X.C14510oO) r3
            java.lang.Object r2 = r7.A02
            X.139 r2 = (X.AnonymousClass139) r2
            java.lang.Object r13 = r7.A01
            X.0sF r13 = (X.InterfaceC16620sF) r13
            X.AbstractC09560e7.A00(r1)
            goto L7b
        L62:
            X.AbstractC09560e7.A00(r1)
            X.139 r2 = r11.A03
            X.0oO r3 = r11.A01
            X.0ps r5 = r11.A02
            androidx.datastore.core.SingleProcessDataStore r4 = r11.A00
            X.PX7.A00(r13, r2, r3, r5, r7)
            r7.A05 = r4
            r7.A00 = r0
            java.lang.Object r0 = X.AnonymousClass139.A00(r7, r2)
            if (r0 != r10) goto L7b
            return r10
        L7b:
            boolean r0 = r3.A00     // Catch: java.lang.Throwable -> Lbb
            if (r0 != 0) goto Lb4
            java.lang.Object r0 = r5.A00     // Catch: java.lang.Throwable -> Lbb
            X.PX7.A00(r2, r5, r4, r6, r7)     // Catch: java.lang.Throwable -> Lbb
            r7.A05 = r6     // Catch: java.lang.Throwable -> Lbb
            r7.A00 = r9     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r1 = r13.invoke(r0, r7)     // Catch: java.lang.Throwable -> Lbb
            if (r1 != r10) goto L92
            return r10
        L8f:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> Lb2
        L92:
            java.lang.Object r0 = r5.A00     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = X.C14360o3.A0K(r1, r0)     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto Lac
            r7.A01 = r2     // Catch: java.lang.Throwable -> Lb2
            r7.A02 = r5     // Catch: java.lang.Throwable -> Lb2
            r7.A03 = r1     // Catch: java.lang.Throwable -> Lb2
            r7.A00 = r8     // Catch: java.lang.Throwable -> Lb2
            r4.A07(r1, r7)     // Catch: java.lang.Throwable -> Lb2
            r0 = r1
            goto Laa
        La7:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> Lbd
        Laa:
            r5.A00 = r0     // Catch: java.lang.Throwable -> Lbd
        Lac:
            java.lang.Object r0 = r5.A00     // Catch: java.lang.Throwable -> Lbd
            r2.A04(r6)
            return r0
        Lb2:
            r0 = move-exception
            goto Lbe
        Lb4:
            java.lang.String r0 = "InitializerApi.updateData should not be called after initialization is complete."
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)     // Catch: java.lang.Throwable -> Lbb
            throw r0     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r0 = move-exception
            goto Lbe
        Lbd:
            r0 = move-exception
        Lbe:
            r2.A04(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1.FAf(X.1Ds, X.0sF):java.lang.Object");
    }

    public SingleProcessDataStore$readAndInit$api$1(SingleProcessDataStore singleProcessDataStore, C14510oO c14510oO, C15370ps c15370ps, AnonymousClass139 anonymousClass139) {
        this.A03 = anonymousClass139;
        this.A01 = c14510oO;
        this.A02 = c15370ps;
        this.A00 = singleProcessDataStore;
    }
}
