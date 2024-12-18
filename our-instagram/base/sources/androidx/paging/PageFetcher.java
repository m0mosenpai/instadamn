package androidx.paging;

import X.AbstractC141776au;
import X.AbstractC52922bZ;
import X.AbstractC53649Nnu;
import X.AbstractC53653Nny;
import X.C06160Ug;
import X.C29637D3x;
import X.C57172PZq;
import X.InterfaceC16660sJ;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.OVZ;

/* loaded from: classes9.dex */
public final class PageFetcher {
    public final PagingConfig A02;
    public final InterfaceC16660sJ A04;
    public final OVZ A00 = new OVZ(null);
    public final OVZ A01 = new OVZ(null);
    public final InterfaceC19390xP A03 = AbstractC53653Nny.A00(new C57172PZq(this, (Object) null, (InterfaceC23621Ds) null, 28, 42));

    public PageFetcher(PagingConfig pagingConfig, InterfaceC16660sJ interfaceC16660sJ) {
        this.A04 = interfaceC16660sJ;
        this.A02 = pagingConfig;
    }

    public static C06160Ug A01(AbstractC52922bZ abstractC52922bZ, PagingConfig pagingConfig, Object obj) {
        return AbstractC53649Nnu.A00(AbstractC141776au.A00(abstractC52922bZ), new PageFetcher(pagingConfig, new C29637D3x(obj, null, 1)).A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(androidx.paging.PageFetcher r6, androidx.paging.PagingSource r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 9
            boolean r0 = X.MAO.A02(r8, r3)
            if (r0 == 0) goto L5d
            r4 = r8
            X.MAO r4 = (X.MAO) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A03
            X.1JX r1 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L4e
            if (r0 != r2) goto L9f
            java.lang.Object r7 = r4.A02
            androidx.paging.PagingSource r7 = (androidx.paging.PagingSource) r7
            java.lang.Object r6 = r4.A01
            androidx.paging.PageFetcher r6 = (androidx.paging.PageFetcher) r6
            X.AbstractC09560e7.A00(r3)
        L2c:
            androidx.paging.PagingSource r3 = (androidx.paging.PagingSource) r3
            boolean r0 = r3 instanceof X.C51078MhZ
            if (r0 == 0) goto L65
            r5 = r3
            X.MhZ r5 = (X.C51078MhZ) r5
            androidx.paging.PagingConfig r0 = r6.A02
            int r1 = r0.A01
            int r4 = r5.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L63
            if (r1 == r4) goto L63
            java.lang.String r1 = "Page size is already set to "
            r0 = 46
            java.lang.String r0 = X.AnonymousClass001.A0I(r1, r0, r4)
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L4e:
            X.AbstractC09560e7.A00(r3)
            X.0sJ r0 = r6.A04
            X.MAO.A00(r6, r7, r4, r2)
            java.lang.Object r3 = r0.invoke(r4)
            if (r3 != r1) goto L2c
            return r1
        L5d:
            X.MAO r4 = new X.MAO
            r4.<init>(r6, r8, r3)
            goto L16
        L63:
            r5.A00 = r1
        L65:
            if (r3 == r7) goto L98
            X.MTX r1 = X.MSW.A1F(r6, r2)
            X.OLq r0 = r3.A00
            r0.A00(r1)
            if (r7 == 0) goto L7f
            r0 = 2
            X.MTX r1 = X.MSW.A1F(r6, r0)
            X.OLq r0 = r7.A00
            r0.A01(r1)
            r7.A06()
        L7f:
            X.PkG r0 = X.AbstractC53592Nmz.A00
            if (r0 == 0) goto L97
            r0 = 3
            boolean r0 = X.MSW.A1a(r0)
            if (r0 != r2) goto L97
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Generated new PagingSource "
            java.lang.String r0 = X.AbstractC167017dG.A0n(r3, r0, r1)
            X.C14360o3.A0B(r0, r2)
        L97:
            return r3
        L98:
            java.lang.String r0 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L9f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher.A00(androidx.paging.PageFetcher, androidx.paging.PagingSource, X.1Ds):java.lang.Object");
    }
}
