package X;

import com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache;
import com.instagram.screentime.IGScreenTimeApi;

/* renamed from: X.9Cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206499Cg extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206499Cg(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A06 = i;
        this.A07 = obj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A05 = obj;
        this.A00 |= Integer.MIN_VALUE;
        if (i != 0) {
            return ((IGScreenTimeApi) this.A07).A01(null, this, 0L);
        }
        return OnDemandSurfaceTriggerCache.A00(null, (OnDemandSurfaceTriggerCache) this.A07, null, this, false);
    }
}
