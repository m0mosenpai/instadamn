package androidx.paging;

import X.C05F;
import X.C0UO;
import X.C10M;
import X.C12W;
import X.C14360o3;
import X.C55581OmJ;
import X.C57514Pfo;
import X.InterfaceC06180Ui;
import X.InterfaceC57786PkD;
import X.InterfaceC57894Ply;
import X.InterfaceC58012Pnw;
import X.OLF;
import X.OZY;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public final class AsyncPagingDataDiffer$differBase$1 {
    public InterfaceC57894Ply A00;
    public C55581OmJ A01;
    public InterfaceC58012Pnw A02;
    public final InterfaceC57786PkD A03;
    public final OZY A04;
    public final OLF A05;
    public final SingleRunner A06;
    public final CopyOnWriteArrayList A07;
    public final C12W A08;
    public final InterfaceC06180Ui A09;
    public final C0UO A0A;
    public volatile int A0B;
    public volatile boolean A0C;
    public final /* synthetic */ AsyncPagingDataDiffer A0D;

    public AsyncPagingDataDiffer$differBase$1(AsyncPagingDataDiffer asyncPagingDataDiffer, InterfaceC57786PkD interfaceC57786PkD, C12W c12w) {
        this.A0D = asyncPagingDataDiffer;
        this.A03 = interfaceC57786PkD;
        this.A08 = c12w;
        C55581OmJ c55581OmJ = C55581OmJ.A04;
        C14360o3.A0C(c55581OmJ, "null cannot be cast to non-null type androidx.paging.PagePresenter<T of androidx.paging.PagePresenter.Companion.initial>");
        this.A01 = c55581OmJ;
        OZY ozy = new OZY();
        this.A04 = ozy;
        this.A07 = new CopyOnWriteArrayList();
        this.A06 = new SingleRunner(true);
        this.A05 = new OLF(this);
        this.A0A = ozy.A02;
        this.A09 = C10M.A00(C05F.A01, 0, 64);
        this.A07.add(new C57514Pfo(this, 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0oO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(androidx.paging.AsyncPagingDataDiffer$differBase$1 r15, X.InterfaceC57894Ply r16, X.OX8 r17, X.OX8 r18, java.util.List r19, X.InterfaceC23621Ds r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.AsyncPagingDataDiffer$differBase$1.A00(androidx.paging.AsyncPagingDataDiffer$differBase$1, X.Ply, X.OX8, X.OX8, java.util.List, X.1Ds, int, int, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC58162PqR r14, X.InterfaceC58162PqR r15, X.InterfaceC23621Ds r16, X.InterfaceC16820sZ r17, int r18) {
        /*
            r13 = this;
            r1 = r17
            r8 = r14
            r9 = r15
            r6 = r18
            r2 = 0
            r7 = r16
            boolean r0 = r7 instanceof X.PWW
            if (r0 == 0) goto Lb5
            r5 = r7
            X.PWW r5 = (X.PWW) r5
            int r0 = r5.A07
            if (r0 != r2) goto Lb5
            int r4 = r5.A01
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto Lb5
            int r4 = r4 - r3
            r5.A01 = r4
        L1f:
            java.lang.Object r7 = r5.A06
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A01
            r3 = 1
            r11 = 0
            if (r0 == 0) goto L57
            if (r0 != r3) goto Lbc
            int r6 = r5.A00
            java.lang.Object r1 = r5.A05
            X.0sZ r1 = (X.InterfaceC16820sZ) r1
            java.lang.Object r9 = r5.A04
            X.PqR r9 = (X.InterfaceC58162PqR) r9
            java.lang.Object r8 = r5.A03
            X.PqR r8 = (X.InterfaceC58162PqR) r8
            java.lang.Object r0 = r5.A02
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r0 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r0
            X.AbstractC09560e7.A00(r7)
        L40:
            X.O6Y r7 = (X.O6Y) r7
            r1.invoke()
            androidx.paging.AsyncPagingDataDiffer r1 = r0.A0D
            androidx.paging.AsyncPagingDataDiffer r0 = androidx.paging.AsyncPagingDataDiffer.$redex_init_class
            X.2xh r0 = r1.A04
            X.OXb.A02(r7, r8, r9, r0)
            int r0 = X.OXb.A00(r7, r8, r9, r6)
            java.lang.Integer r11 = X.AbstractC43592JPx.A0r(r0)
        L56:
            return r11
        L57:
            X.AbstractC09560e7.A00(r7)
            int r0 = r14.getSize()
            if (r0 != 0) goto L77
            r1.invoke()
            androidx.paging.AsyncPagingDataDiffer r0 = r13.A0D
            X.PkD r0 = r0.A02
            int r1 = r15.getSize()
            X.OmF r0 = (X.C55577OmF) r0
            if (r1 <= 0) goto L56
            androidx.paging.AsyncPagingDataDiffer r0 = r0.A00
            X.2xh r0 = r0.A04
            r0.DMJ(r2, r1)
            return r11
        L77:
            int r0 = r15.getSize()
            if (r0 != 0) goto L94
            r1.invoke()
            androidx.paging.AsyncPagingDataDiffer r0 = r13.A0D
            X.PkD r0 = r0.A02
            int r1 = r14.getSize()
            X.OmF r0 = (X.C55577OmF) r0
            if (r1 <= 0) goto L56
            androidx.paging.AsyncPagingDataDiffer r0 = r0.A00
            X.2xh r0 = r0.A04
            r0.DfC(r2, r1)
            return r11
        L94:
            androidx.paging.AsyncPagingDataDiffer r10 = r13.A0D
            androidx.paging.AsyncPagingDataDiffer r0 = androidx.paging.AsyncPagingDataDiffer.$redex_init_class
            X.12W r0 = r10.A06
            r12 = 2
            X.MC7 r7 = new X.MC7
            r7.<init>(r8, r9, r10, r11, r12)
            r5.A02 = r13
            r5.A03 = r14
            r5.A04 = r15
            r5.A05 = r1
            r5.A00 = r6
            r5.A01 = r3
            java.lang.Object r7 = X.AbstractC23641Du.A00(r5, r0, r7)
            if (r7 != r4) goto Lb3
            return r4
        Lb3:
            r0 = r13
            goto L40
        Lb5:
            X.PWW r5 = new X.PWW
            r5.<init>(r13, r7, r2)
            goto L1f
        Lbc:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.AsyncPagingDataDiffer$differBase$1.A01(X.PqR, X.PqR, X.1Ds, X.0sZ, int):java.lang.Object");
    }
}
