package X;

import androidx.paging.PageEvent$Insert;
import androidx.paging.PageFetcherSnapshot;

/* renamed from: X.PWw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57144PWw extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public final int A0E = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57144PWw(PageEvent$Insert pageEvent$Insert, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = pageEvent$Insert;
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, C57144PWw c57144PWw) {
        c57144PWw.A09 = obj;
        c57144PWw.A0A = obj2;
        c57144PWw.A0B = obj3;
        c57144PWw.A0C = obj4;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.A0E != 0) {
            this.A02 = obj;
            this.A00 |= Integer.MIN_VALUE;
            return PageFetcherSnapshot.A00(null, null, (PageFetcherSnapshot) this.A01, this);
        }
        this.A04 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return ((AbstractC53628NnZ) this.A05).A01(this, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57144PWw(PageFetcherSnapshot pageFetcherSnapshot, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A01 = pageFetcherSnapshot;
    }
}
