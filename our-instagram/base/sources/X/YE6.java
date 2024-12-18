package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class YE6 implements InterfaceC11230ie, InterfaceC11220id, InterfaceC11260ii {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C37431og A01;
    public final /* synthetic */ C37571ou A02;
    public final /* synthetic */ C37421of A03;
    public final /* synthetic */ C19310xF A04;

    public YE6(Context context, C37431og c37431og, C37571ou c37571ou, C37421of c37421of, C19310xF c19310xF) {
        this.A01 = c37431og;
        this.A02 = c37571ou;
        this.A04 = c19310xF;
        this.A00 = context;
        this.A03 = c37421of;
    }

    @Override // X.InterfaceC11230ie
    public final Object AXi() {
        return this.A02;
    }

    @Override // X.InterfaceC11230ie
    public final Object AXj() {
        return this.A01;
    }

    @Override // X.InterfaceC11220id
    public final InterfaceC11280ik Af6() {
        return this.A03;
    }

    @Override // X.InterfaceC11230ie
    public final InterfaceC11360iu BFT(InterfaceC11230ie interfaceC11230ie, AbstractC12990ll abstractC12990ll) {
        return AbstractC37641p1.A00(interfaceC11230ie, abstractC12990ll);
    }

    @Override // X.InterfaceC11230ie
    public final Context getContext() {
        return this.A00;
    }
}
