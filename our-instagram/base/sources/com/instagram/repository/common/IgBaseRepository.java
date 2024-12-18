package com.instagram.repository.common;

import X.AbstractC166177bl;
import X.AbstractC25225BEi;
import X.AnonymousClass194;
import X.C05A;
import X.C19L;
import X.C52681NSl;
import X.C92674Dc;
import X.C92694De;
import X.InterfaceC58291Psj;
import java.io.Closeable;

/* loaded from: classes9.dex */
public abstract class IgBaseRepository implements Closeable {
    public final C92694De A00;
    public final MemoryCache A01;
    public final InterfaceC58291Psj A02;
    public final C19L A03;
    public final C05A A04;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.repository.common.IgBaseRepository r7, X.InterfaceC1566671o r8, X.InterfaceC57984PnU r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 5
            boolean r0 = X.PX8.A03(r10, r3)
            if (r0 == 0) goto L8c
            r6 = r10
            X.PX8 r6 = (X.PX8) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r2 = r6.A08
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L44
            if (r0 == r1) goto L59
            if (r0 != r3) goto L92
            java.lang.Object r5 = r6.A07
            X.0ps r5 = (X.C15370ps) r5
            java.lang.Object r1 = r6.A06
            java.lang.Object r4 = r6.A05
            java.lang.Object r3 = r6.A04
            X.0ps r3 = (X.C15370ps) r3
            java.lang.Object r8 = r6.A02
            java.lang.Object r7 = r6.A01
            com.instagram.repository.common.IgBaseRepository r7 = (com.instagram.repository.common.IgBaseRepository) r7
            X.AbstractC09560e7.A00(r2)
        L38:
            com.instagram.repository.common.MemoryCache r0 = r7.A01
            if (r0 == 0) goto L3f
            r0.A01(r8, r1)
        L3f:
            r5.A00 = r4
        L41:
            java.lang.Object r4 = r3.A00
        L43:
            return r4
        L44:
            X.AbstractC09560e7.A00(r2)
            X.0ps r5 = X.AbstractC25225BEi.A1F()
            X.Psj r0 = r7.A02
            X.PX8.A00(r7, r8, r9, r5, r6)
            r6.A00 = r1
            java.lang.Object r2 = r0.AXS(r8, r6)
            if (r2 != r4) goto L68
            return r4
        L59:
            java.lang.Object r5 = r6.A04
            X.0ps r5 = (X.C15370ps) r5
            java.lang.Object r9 = r6.A03
            java.lang.Object r8 = r6.A02
            java.lang.Object r7 = r6.A01
            com.instagram.repository.common.IgBaseRepository r7 = (com.instagram.repository.common.IgBaseRepository) r7
            X.AbstractC09560e7.A00(r2)
        L68:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L86
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r1 = r2.A00
            X.PX8.A00(r7, r8, r9, r5, r6)
            r6.A05 = r1
            r6.A06 = r1
            r6.A07 = r5
            r6.A00 = r3
            java.lang.Object r0 = A01(r7, r1, r6)
            if (r0 == r4) goto L43
            r4 = r1
            r3 = r5
            goto L38
        L86:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L97
            r3 = r5
            goto L41
        L8c:
            X.PX8 r6 = new X.PX8
            r6.<init>(r7, r10, r3)
            goto L15
        L92:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L97:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.common.IgBaseRepository.A00(com.instagram.repository.common.IgBaseRepository, X.71o, X.PnU, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.repository.common.IgBaseRepository r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = 0
            r4 = 25
            boolean r0 = X.PXD.A03(r7, r4)
            if (r0 == 0) goto L2e
            r3 = r7
            X.PXD r3 = (X.PXD) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r3.A00 = r2
        L17:
            java.lang.Object r2 = r3.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L42
            if (r1 != r0) goto L3d
            X.AbstractC09560e7.A00(r2)
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L34
            java.lang.String r0 = "updateToMemoryCache"
            java.lang.NullPointerException r0 = X.AbstractC166987dD.A15(r0)
            throw r0
        L2e:
            X.PXD r3 = new X.PXD
            r3.<init>(r6, r7, r4)
            goto L17
        L34:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L45
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L3d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L42:
            X.AbstractC09560e7.A00(r2)
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.common.IgBaseRepository.A02(com.instagram.repository.common.IgBaseRepository, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ IgBaseRepository(MemoryCache memoryCache, InterfaceC58291Psj interfaceC58291Psj, C19L c19l) {
        C52681NSl c52681NSl = new C52681NSl();
        this.A03 = c19l;
        this.A01 = memoryCache;
        this.A02 = interfaceC58291Psj;
        this.A04 = AbstractC25225BEi.A1H(c52681NSl);
        this.A00 = AbstractC166177bl.A00(C92674Dc.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.repository.common.IgBaseRepository r5, java.lang.Object r6, X.InterfaceC23621Ds r7) {
        /*
            r4 = 27
            boolean r0 = X.PXD.A03(r7, r4)
            if (r0 == 0) goto L2d
            r3 = r7
            X.PXD r3 = (X.PXD) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r2 = r3.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L49
            if (r1 != r0) goto L44
            X.AbstractC09560e7.A00(r2)
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L33
            java.lang.String r0 = "element"
            java.lang.NullPointerException r1 = X.AbstractC166987dD.A15(r0)
            throw r1
        L2d:
            X.PXD r3 = new X.PXD
            r3.<init>(r5, r7, r4)
            goto L16
        L33:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L3f
            java.lang.String r0 = "Update exception from Local Data Source"
            X.PW5 r1 = new X.PW5
            r1.<init>(r0)
            throw r1
        L3f:
            X.B4Z r1 = X.B4Z.A00()
            throw r1
        L44:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A13()
            throw r1
        L49:
            X.AbstractC09560e7.A00(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.common.IgBaseRepository.A01(com.instagram.repository.common.IgBaseRepository, java.lang.Object, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC1566671o r12, X.InterfaceC57984PnU r13, X.InterfaceC23621Ds r14) {
        /*
            r11 = this;
            r3 = 24
            boolean r0 = X.PXD.A03(r14, r3)
            r7 = r11
            if (r0 == 0) goto L48
            r4 = r14
            X.PXD r4 = (X.PXD) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L4e
            X.AbstractC09560e7.A00(r3)
        L25:
            X.5ud r3 = (X.AbstractC130335ud) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.mvvm.SingleFlightResult.Result<M of com.instagram.repository.common.IgBaseRepository?>"
            X.C14360o3.A0C(r3, r0)
            X.5uc r3 = (X.C130325uc) r3
            java.lang.Object r0 = r3.A00
            return r0
        L31:
            X.AbstractC09560e7.A00(r3)
            X.4De r0 = r11.A00
            r9 = 0
            r10 = 3
            X.PXN r5 = new X.PXN
            r8 = r12
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A00 = r1
            java.lang.Object r3 = r0.A00(r12, r4, r5)
            if (r3 != r2) goto L25
            return r2
        L48:
            X.PXD r4 = new X.PXD
            r4.<init>(r11, r14, r3)
            goto L17
        L4e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.common.IgBaseRepository.A03(X.71o, X.PnU, X.1Ds):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AnonymousClass194.A05(null, this.A03);
    }
}
