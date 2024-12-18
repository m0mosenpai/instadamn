package X;

/* renamed from: X.BGc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25264BGc extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25264BGc(float f, float f2, float f3) {
        super(1);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
        C14360o3.A0B(interfaceC1129057z, 0);
        AnonymousClass585 A0C = AbstractC25233BEq.A0C(interfaceC1129057z);
        C114205Dh A00 = AbstractC119355as.A00(AbstractC25229BEm.A00(interfaceC1129057z), 0L);
        C5AN c5an = new C5AN();
        float f = this.A00;
        float f2 = this.A01;
        float f3 = this.A02;
        try {
            A0C.ELk(A00, c5an);
            interfaceC1129057z.AQf();
            float A002 = AbstractC25229BEm.A00(interfaceC1129057z);
            long j = C1132359l.A07;
            float A003 = AbstractC25226BEj.A00(interfaceC1129057z, f, A002 / 2.0f);
            long Amh = interfaceC1129057z.Amh();
            if (f2 >= 0.0f) {
                A002 = -A002;
            }
            interfaceC1129057z.AQe(null, C119815bf.A00, A003, 1.0f, 5, j, C119365at.A07(Amh, AbstractC119395aw.A00(AbstractC25226BEj.A00(interfaceC1129057z, f2, A002), interfaceC1129057z.EqT(f3))));
            A0C.EKS();
            return C0eB.A00;
        } catch (Throwable th) {
            A0C.EKS();
            throw th;
        }
    }
}
