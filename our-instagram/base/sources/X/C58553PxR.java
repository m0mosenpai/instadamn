package X;

/* renamed from: X.PxR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58553PxR extends PxQ implements InterfaceC65280ThD {
    public C58553PxR() {
        super(PxJ.DEFAULT_INSTANCE);
    }

    public final void A05(PxI value) {
        PxJ pxJ = (PxJ) PxQ.A00(this);
        int i = PxJ.KEY_FIELD_NUMBER;
        value.getClass();
        InterfaceC65690TsC interfaceC65690TsC = pxJ.key_;
        if (!((AbstractC58537Px5) interfaceC65690TsC).A00) {
            interfaceC65690TsC = interfaceC65690TsC.Cq4(AbstractC58320PtC.A01(interfaceC65690TsC));
            pxJ.key_ = interfaceC65690TsC;
        }
        interfaceC65690TsC.add(value);
    }

    @Override // X.T9B
    public final /* bridge */ /* synthetic */ Object clone() {
        return A01();
    }
}
