package X;

/* renamed from: X.Cm6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28714Cm6 implements C62F {
    public final int A00;
    public final long A01;
    public final long A02;
    public final InterfaceC31140Dmf A03;

    @Override // X.C62F
    public final /* synthetic */ AbstractC118405Xc B2E(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        return CEj(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc3, (this.A00 * this.A01) - this.A02);
    }

    @Override // X.C62F
    public final /* synthetic */ boolean CWV() {
        return false;
    }

    @Override // X.C62F
    public final long Azq(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        return (this.A00 * this.A01) - this.A02;
    }

    @Override // X.C62F
    public final AbstractC118405Xc CEY(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, long j) {
        AbstractC118405Xc abstractC118405Xc4 = abstractC118405Xc3;
        InterfaceC31140Dmf interfaceC31140Dmf = this.A03;
        long j2 = this.A02;
        long j3 = j + j2;
        long j4 = 0;
        if (j3 > 0) {
            long j5 = this.A01;
            j4 = j3 - (Math.min(j3 / j5, this.A00 - 1) * j5);
        }
        long j6 = this.A01;
        if (j3 > j6) {
            abstractC118405Xc4 = CEj(abstractC118405Xc, abstractC118405Xc4, abstractC118405Xc2, j6 - j2);
        }
        return interfaceC31140Dmf.CEY(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc4, j4);
    }

    @Override // X.C62F
    public final AbstractC118405Xc CEj(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, long j) {
        AbstractC118405Xc abstractC118405Xc4 = abstractC118405Xc3;
        InterfaceC31140Dmf interfaceC31140Dmf = this.A03;
        long j2 = this.A02;
        long j3 = j + j2;
        long j4 = 0;
        if (j3 > 0) {
            long j5 = this.A01;
            j4 = j3 - (Math.min(j3 / j5, this.A00 - 1) * j5);
        }
        long j6 = this.A01;
        if (j3 > j6) {
            abstractC118405Xc4 = CEj(abstractC118405Xc, abstractC118405Xc4, abstractC118405Xc2, j6 - j2);
        }
        return interfaceC31140Dmf.CEj(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc4, j4);
    }

    public C28714Cm6(InterfaceC31140Dmf interfaceC31140Dmf, int i, long j) {
        this.A00 = i;
        this.A03 = interfaceC31140Dmf;
        if (i >= 1) {
            this.A01 = (interfaceC31140Dmf.AwX() + interfaceC31140Dmf.Azk()) * 1000000;
            this.A02 = j * 1000000;
            return;
        }
        throw AbstractC166987dD.A12("Iterations count can't be less than 1");
    }
}
