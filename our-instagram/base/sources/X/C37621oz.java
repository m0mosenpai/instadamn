package X;

import android.content.Context;

/* renamed from: X.1oz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37621oz implements InterfaceC11230ie, InterfaceC11220id, InterfaceC11250ih, InterfaceC11260ii {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C37431og A01;
    public final /* synthetic */ C37571ou A02;
    public final /* synthetic */ C37421of A03;
    public final /* synthetic */ C19310xF A04;
    public final /* synthetic */ boolean A05;

    public C37621oz(Context context, C37431og c37431og, C37571ou c37571ou, C37421of c37421of, C19310xF c19310xF, boolean z) {
        this.A04 = c19310xF;
        this.A01 = c37431og;
        this.A00 = context;
        this.A05 = z;
        this.A03 = c37421of;
        this.A02 = c37571ou;
    }

    @Override // X.InterfaceC11230ie
    public final /* bridge */ /* synthetic */ Object AXi() {
        return this.A02;
    }

    @Override // X.InterfaceC11230ie
    public final /* bridge */ /* synthetic */ Object AXj() {
        return this.A01;
    }

    @Override // X.InterfaceC11220id
    public final InterfaceC11280ik Af6() {
        return this.A03;
    }

    @Override // X.InterfaceC11230ie
    public final Context getContext() {
        return this.A00;
    }

    @Override // X.InterfaceC11230ie
    public final InterfaceC11360iu BFT(InterfaceC11230ie interfaceC11230ie, AbstractC12990ll abstractC12990ll) {
        return AbstractC37641p1.A00(interfaceC11230ie, abstractC12990ll);
    }
}
