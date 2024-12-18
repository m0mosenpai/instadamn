package X;

/* loaded from: classes5.dex */
public final class DHR extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHR(String str, String str2, int i) {
        super(1);
        this.A00 = i;
        if (i != 0) {
            this.A02 = str;
            this.A01 = str2;
        } else {
            this.A01 = str;
            this.A02 = str2;
        }
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            OME ome = (OME) obj;
            C14360o3.A0B(ome, 0);
            ome.A03("action", "result_discarded");
            ome.A03("share_type", this.A02);
            ome.A03("error_message", this.A01);
        } else {
            C82713mZ c82713mZ = (C82713mZ) obj;
            C14360o3.A0B(c82713mZ, 0);
            C11520jB c11520jB = new C11520jB();
            String str = this.A01;
            String str2 = this.A02;
            c11520jB.A04(C5I8.A75, str);
            c11520jB.A04(C5I8.A76, str2);
            c82713mZ.A0p = c11520jB;
        }
        return C0eB.A00;
    }
}
