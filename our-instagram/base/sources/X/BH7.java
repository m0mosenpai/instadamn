package X;

/* loaded from: classes5.dex */
public final class BH7 implements C62F {
    public final long A00;
    public final InterfaceC31140Dmf A01;
    public final Integer A02;

    @Override // X.C62F
    public final long Azq(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        return Long.MAX_VALUE;
    }

    @Override // X.C62F
    public final boolean CWV() {
        return true;
    }

    @Override // X.C62F
    public final AbstractC118405Xc CEY(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, long j) {
        long j2;
        AbstractC118405Xc abstractC118405Xc4 = abstractC118405Xc3;
        InterfaceC31140Dmf interfaceC31140Dmf = this.A01;
        if (j <= 0) {
            j2 = 0;
        } else {
            long j3 = this.A00;
            long j4 = j / j3;
            if (this.A02 != C05F.A00 && j4 % 2 != 0) {
                j2 = ((j4 + 1) * j3) - j;
            } else {
                j2 = j - (j4 * j3);
            }
        }
        long j5 = this.A00;
        if (j > j5) {
            abstractC118405Xc4 = interfaceC31140Dmf.CEj(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc4, j5);
        }
        return interfaceC31140Dmf.CEY(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc4, j2);
    }

    @Override // X.C62F
    public final AbstractC118405Xc CEj(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, long j) {
        long j2;
        AbstractC118405Xc abstractC118405Xc4 = abstractC118405Xc3;
        InterfaceC31140Dmf interfaceC31140Dmf = this.A01;
        if (j <= 0) {
            j2 = 0;
        } else {
            long j3 = this.A00;
            long j4 = j / j3;
            if (this.A02 != C05F.A00 && j4 % 2 != 0) {
                j2 = ((j4 + 1) * j3) - j;
            } else {
                j2 = j - (j4 * j3);
            }
        }
        long j5 = this.A00;
        if (j > j5) {
            abstractC118405Xc4 = interfaceC31140Dmf.CEj(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc4, j5);
        }
        return interfaceC31140Dmf.CEj(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc4, j2);
    }

    public BH7(InterfaceC31140Dmf interfaceC31140Dmf, Integer num) {
        this.A01 = interfaceC31140Dmf;
        this.A02 = num;
        this.A00 = (interfaceC31140Dmf.AwX() + interfaceC31140Dmf.Azk()) * 1000000;
    }

    @Override // X.C62F
    public final /* synthetic */ AbstractC118405Xc B2E(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        return CEj(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc3, Long.MAX_VALUE);
    }
}
