package X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* renamed from: X.XMl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72067XMl implements InterfaceC31140Dmf {
    public final int A00;
    public final int A01;
    public final C62L A02;
    public final InterfaceC30898DiB A03;

    @Override // X.C62F
    public final /* synthetic */ AbstractC118405Xc B2E(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        return this.A02.CEj(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc3, Azq(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc3));
    }

    @Override // X.C62F
    public final /* synthetic */ long Azq(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        return (this.A00 + this.A01) * 1000000;
    }

    @Override // X.C62F
    public final AbstractC118405Xc CEY(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, long j) {
        return this.A02.CEY(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc3, j);
    }

    @Override // X.C62F
    public final AbstractC118405Xc CEj(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, long j) {
        return this.A02.CEj(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc3, j);
    }

    public C72067XMl(InterfaceC30898DiB interfaceC30898DiB, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = interfaceC30898DiB;
        this.A02 = new C62L(new C72068XMm(new C72069XMn(interfaceC30898DiB, i, i2)));
    }

    @Override // X.InterfaceC31140Dmf
    public final int AwX() {
        return this.A00;
    }

    @Override // X.InterfaceC31140Dmf
    public final int Azk() {
        return this.A01;
    }

    @Override // X.C62F
    public final /* synthetic */ boolean CWV() {
        return false;
    }

    public C72067XMl() {
        this(AbstractC25328BIx.A01, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 0);
    }
}
