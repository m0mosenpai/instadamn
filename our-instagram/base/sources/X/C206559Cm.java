package X;

import com.instagram.mainfeed.network.flashfeed.FlashFeedCache;

/* renamed from: X.9Cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206559Cm extends C1Dq {
    public int A00;
    public int A01;
    public long A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final Object A0E;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A0D;
        this.A09 = obj;
        this.A01 |= Integer.MIN_VALUE;
        FlashFeedCache flashFeedCache = (FlashFeedCache) this.A0E;
        if (i != 0) {
            return flashFeedCache.A03(null, null, null, this, 0, 0L, false, false);
        }
        return flashFeedCache.A04(null, null, null, null, this, 0, 0L, false, false, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206559Cm(FlashFeedCache flashFeedCache, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A0D = i;
        this.A0E = flashFeedCache;
    }
}
