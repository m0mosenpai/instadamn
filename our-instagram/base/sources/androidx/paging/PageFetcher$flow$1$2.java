package androidx.paging;

import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", i = {0, 1, 1}, l = {73, 77}, m = "invokeSuspend", n = {"previousGeneration", "previousGeneration", "pagingSource"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
public final class PageFetcher$flow$1$2 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ PageFetcher A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$2(PageFetcher pageFetcher, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A03 = pageFetcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r7.A01 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r1 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r1.A01 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        if (r7 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        r2.A00.A07.AGH(null);
        r2.A02.AGH(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        r5 = r6.A05(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (X.AbstractC53592Nmz.A00 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (X.MSW.A1a(3) != true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        r1 = X.AbstractC166987dD.A1C();
        r1.append("Refresh key ");
        r1.append(r5);
        X.C14360o3.A0B(X.AbstractC167017dG.A0n(r6, " returned from PagingSource ", r1), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r7 == null) goto L18;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            X.1JX r6 = X.C1JX.A02
            int r0 = r10.A00
            r5 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L96
            if (r0 == r4) goto Lb2
            java.lang.Object r6 = r10.A01
            androidx.paging.PagingSource r6 = (androidx.paging.PagingSource) r6
            java.lang.Object r2 = r10.A02
            X.O9a r2 = (X.C54574O9a) r2
            X.AbstractC09560e7.A00(r11)
        L17:
            X.OLm r7 = (X.C54827OLm) r7
            if (r7 == 0) goto L23
            java.util.List r0 = r7.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
        L23:
            if (r2 == 0) goto L93
            X.OLm r1 = r2.A01
            if (r1 == 0) goto L93
            java.util.List r0 = r1.A02
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 != r4) goto L93
            r7 = r1
        L32:
            java.lang.Integer r0 = r7.A01
            if (r0 != 0) goto L41
        L36:
            if (r2 == 0) goto L90
            X.OLm r1 = r2.A01
            if (r1 == 0) goto L90
            java.lang.Integer r0 = r1.A01
            if (r0 == 0) goto L90
            r7 = r1
        L41:
            java.lang.Object r5 = r6.A05(r7)
            X.PkG r0 = X.AbstractC53592Nmz.A00
            if (r0 == 0) goto L65
            r0 = 3
            boolean r0 = X.MSW.A1a(r0)
            if (r0 != r4) goto L65
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Refresh key "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " returned from PagingSource "
            java.lang.String r0 = X.AbstractC167017dG.A0n(r6, r0, r1)
            X.C14360o3.A0B(r0, r4)
        L65:
            if (r2 == 0) goto L73
            androidx.paging.PageFetcherSnapshot r0 = r2.A00
            X.197 r0 = r0.A07
            r0.AGH(r3)
            X.195 r0 = r2.A02
            r0.AGH(r3)
        L73:
            androidx.paging.PageFetcher r1 = r10.A03
            androidx.paging.PagingConfig r5 = r1.A02
            X.OVZ r0 = r1.A01
            X.0xP r9 = r0.A00
            r0 = 0
            X.MTX r8 = X.MSW.A1F(r1, r0)
            androidx.paging.PageFetcherSnapshot r4 = new androidx.paging.PageFetcherSnapshot
            r4.<init>(r5, r6, r7, r8, r9)
            X.197 r0 = new X.197
            r0.<init>(r3)
            X.O9a r6 = new X.O9a
            r6.<init>(r4, r7, r0)
        L8f:
            return r6
        L90:
            if (r7 != 0) goto L41
            goto L65
        L93:
            if (r7 == 0) goto L36
            goto L32
        L96:
            X.AbstractC09560e7.A00(r11)
            java.lang.Object r2 = r10.A02
            X.O9a r2 = (X.C54574O9a) r2
            androidx.paging.PageFetcher r1 = r10.A03
            if (r2 == 0) goto Lb0
            androidx.paging.PageFetcherSnapshot r0 = r2.A00
            androidx.paging.PagingSource r0 = r0.A03
        La5:
            r10.A02 = r2
            r10.A00 = r4
            java.lang.Object r7 = androidx.paging.PageFetcher.A00(r1, r0, r10)
            if (r7 != r6) goto Lb9
            return r6
        Lb0:
            r0 = r3
            goto La5
        Lb2:
            java.lang.Object r2 = r10.A02
            X.O9a r2 = (X.C54574O9a) r2
            X.AbstractC09560e7.A00(r11)
        Lb9:
            androidx.paging.PagingSource r7 = (androidx.paging.PagingSource) r7
            if (r2 == 0) goto Lcf
            androidx.paging.PageFetcherSnapshot r0 = r2.A00
            r10.A02 = r2
            r10.A01 = r7
            r10.A00 = r5
            java.lang.Object r0 = r0.A08(r10)
            if (r0 == r6) goto L8f
            r6 = r7
            r7 = r0
            goto L17
        Lcf:
            r6 = r7
            r7 = r3
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        PageFetcher$flow$1$2 pageFetcher$flow$1$2 = new PageFetcher$flow$1$2(this.A03, (InterfaceC23621Ds) obj3);
        pageFetcher$flow$1$2.A02 = obj;
        return pageFetcher$flow$1$2.invokeSuspend(C0eB.A00);
    }
}
