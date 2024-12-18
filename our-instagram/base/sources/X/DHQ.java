package X;

/* loaded from: classes5.dex */
public final class DHQ extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHQ(long j, String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A02 = str;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
            AbstractC25230BEn.A19(interfaceC1129057z);
            String str = this.A02;
            if (str == null || str.length() == 0) {
                interfaceC1129057z.AR4(null, C119815bf.A00, 1.0f, 3, this.A01, 0L, AbstractC25228BEl.A0H(interfaceC1129057z), AbstractC137646Lk.A00);
            }
            return C0eB.A00;
        }
        C0f5 c0f5 = (C0f5) obj;
        C14360o3.A0B(c0f5, 0);
        c0f5.ABV("sizeInBytes", this.A01);
        c0f5.ABW("fileExtension", this.A02);
        return c0f5;
    }
}
