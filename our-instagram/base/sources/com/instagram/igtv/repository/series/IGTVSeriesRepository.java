package com.instagram.igtv.repository.series;

import X.C25671My;
import X.InterfaceC23621Ds;
import X.PXE;
import com.instagram.repository.common.MemoryCache;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class IGTVSeriesRepository {
    public static final long A03 = TimeUnit.MINUTES.toMillis(15);
    public final IGTVSeriesNetworkDataSource A00;
    public final C25671My A01;
    public final MemoryCache A02;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.lang.String r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = this;
            r3 = 4
            boolean r0 = X.PX6.A02(r8, r3)
            if (r0 == 0) goto L56
            r4 = r8
            X.PX6 r4 = (X.PX6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A04
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L45
            if (r0 != r1) goto L61
            java.lang.Object r7 = r4.A03
            java.lang.Object r6 = r4.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r4.A01
            com.instagram.igtv.repository.series.IGTVSeriesRepository r1 = (com.instagram.igtv.repository.series.IGTVSeriesRepository) r1
            X.AbstractC09560e7.A00(r3)
        L2d:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L5c
            com.instagram.repository.common.MemoryCache r0 = r1.A02
            r0.A03(r7)
            X.1My r2 = r1.A01
            java.lang.Integer r1 = X.C05F.A01
            X.LYM r0 = new X.LYM
            r0.<init>(r6, r1)
            r2.E4s(r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        L45:
            X.AbstractC09560e7.A00(r3)
            com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource r0 = r5.A00
            X.PX6.A00(r5, r6, r7, r4, r1)
            java.lang.Object r3 = r0.A04(r6, r4)
            if (r3 != r2) goto L54
            return r2
        L54:
            r1 = r5
            goto L2d
        L56:
            X.PX6 r4 = new X.PX6
            r4.<init>(r5, r8, r3)
            goto L15
        L5c:
            java.lang.Exception r0 = X.AbstractC50523MSb.A0P(r3)
            throw r0
        L61:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesRepository.A04(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.O39 r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, X.InterfaceC23621Ds r16) {
        /*
            r10 = this;
            r3 = 21
            r4 = r16
            boolean r0 = X.PX9.A03(r4, r3)
            if (r0 == 0) goto L44
            r9 = r4
            X.PX9 r9 = (X.PX9) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r9.A00 = r2
        L18:
            java.lang.Object r3 = r9.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r9.A00
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L4e
            X.AbstractC09560e7.A00(r3)
        L26:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L49
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            return r2
        L31:
            X.AbstractC09560e7.A00(r3)
            com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource r3 = r10.A00
            r9.A00 = r0
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.Object r3 = r3.A00(r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L26
            return r2
        L44:
            X.PX9 r9 = X.PX9.A01(r10, r4, r3)
            goto L18
        L49:
            java.lang.Exception r0 = X.AbstractC50523MSb.A0P(r3)
            throw r0
        L4e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesRepository.A00(X.O39, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.O39 r6, java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r5 = this;
            r3 = 22
            boolean r0 = X.PX9.A03(r9, r3)
            if (r0 == 0) goto L3d
            r4 = r9
            X.PX9 r4 = (X.PX9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L47
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L42
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            return r2
        L2f:
            X.AbstractC09560e7.A00(r3)
            com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource r0 = r5.A00
            r4.A00 = r1
            java.lang.Object r3 = r0.A01(r6, r7, r8, r4)
            if (r3 != r2) goto L24
            return r2
        L3d:
            X.PX9 r4 = X.PX9.A01(r5, r9, r3)
            goto L16
        L42:
            java.lang.Exception r0 = X.AbstractC50523MSb.A0P(r3)
            throw r0
        L47:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesRepository.A01(X.O39, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r5 = this;
            r3 = 41
            boolean r0 = X.MAK.A01(r10, r3)
            if (r0 == 0) goto L65
            r4 = r10
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A03
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L54
            if (r0 != r1) goto L84
            java.lang.Object r6 = r4.A02
            java.lang.Object r2 = r4.A01
            com.instagram.igtv.repository.series.IGTVSeriesRepository r2 = (com.instagram.igtv.repository.series.IGTVSeriesRepository) r2
            X.AbstractC09560e7.A00(r3)
        L2a:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L73
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r1 = r3.A00
            X.N2v r1 = (X.C52095N2v) r1
            com.instagram.repository.common.MemoryCache r0 = r2.A02
            r0.A03(r6)
            java.lang.String r4 = r1.A00
            java.lang.String r3 = r1.A01
            if (r4 == 0) goto L6b
            if (r3 == 0) goto L6b
            X.1My r2 = r2.A01
            java.lang.Integer r1 = X.C05F.A00
            X.LYM r0 = new X.LYM
            r0.<init>(r4, r1)
            r2.E4s(r0)
            X.0e4 r0 = X.AbstractC166987dD.A1L(r4, r3)
            return r0
        L54:
            X.AbstractC09560e7.A00(r3)
            com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource r0 = r5.A00
            X.AbstractC31172DnG.A1V(r5, r6, r4, r1)
            java.lang.Object r3 = r0.A02(r7, r8, r9, r4)
            if (r3 != r2) goto L63
            return r2
        L63:
            r2 = r5
            goto L2a
        L65:
            X.MAK r4 = new X.MAK
            r4.<init>(r5, r10, r3)
            goto L16
        L6b:
            java.lang.String r1 = "IGTVSeriesRepository network response is invalid"
            X.470 r0 = new X.470
            r0.<init>(r1)
            throw r0
        L73:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L7f
            java.lang.String r1 = "IGTVSeriesRepository network request failed"
            X.470 r0 = new X.470
            r0.<init>(r1)
            throw r0
        L7f:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L84:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesRepository.A02(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r5 = this;
            r3 = 42
            boolean r0 = X.MAK.A01(r10, r3)
            if (r0 == 0) goto L5d
            r4 = r10
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A03
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L4c
            if (r0 != r1) goto L7c
            java.lang.Object r7 = r4.A02
            java.lang.Object r2 = r4.A01
            com.instagram.igtv.repository.series.IGTVSeriesRepository r2 = (com.instagram.igtv.repository.series.IGTVSeriesRepository) r2
            X.AbstractC09560e7.A00(r3)
        L2a:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L6b
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r1 = r3.A00
            X.N2v r1 = (X.C52095N2v) r1
            com.instagram.repository.common.MemoryCache r0 = r2.A02
            r0.A03(r7)
            java.lang.String r3 = r1.A00
            if (r3 == 0) goto L63
            X.1My r2 = r2.A01
            java.lang.Integer r1 = X.C05F.A0C
            X.LYM r0 = new X.LYM
            r0.<init>(r3, r1)
            r2.E4s(r0)
            return r3
        L4c:
            X.AbstractC09560e7.A00(r3)
            com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource r0 = r5.A00
            X.AbstractC31172DnG.A1V(r5, r7, r4, r1)
            java.lang.Object r3 = r0.A03(r6, r8, r9, r4)
            if (r3 != r2) goto L5b
            return r2
        L5b:
            r2 = r5
            goto L2a
        L5d:
            X.MAK r4 = new X.MAK
            r4.<init>(r5, r10, r3)
            goto L16
        L63:
            java.lang.String r1 = "IGTVSeriesRepository network response is invalid"
            X.470 r0 = new X.470
            r0.<init>(r1)
            throw r0
        L6b:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L77
            java.lang.String r1 = "IGTVSeriesRepository network request failed"
            X.470 r0 = new X.470
            r0.<init>(r1)
            throw r0
        L77:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L7c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesRepository.A03(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public final Object A05(String str, InterfaceC23621Ds interfaceC23621Ds) {
        return this.A02.A02(str, interfaceC23621Ds, new PXE(this, str, null, 2));
    }

    public IGTVSeriesRepository(C25671My c25671My, IGTVSeriesNetworkDataSource iGTVSeriesNetworkDataSource, MemoryCache memoryCache) {
        this.A02 = memoryCache;
        this.A00 = iGTVSeriesNetworkDataSource;
        this.A01 = c25671My;
    }
}
