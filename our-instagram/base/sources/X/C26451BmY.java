package X;

/* renamed from: X.BmY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26451BmY extends AbstractC51572Yf {
    public final AbstractC50812Vc A00;
    public final C51722Yv A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final InterfaceC16820sZ A05;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        AbstractC50812Vc abstractC50812Vc = this.A00;
        C29472Cym c29472Cym = new C29472Cym(this.A03, this.A04, this.A02);
        InterfaceC16820sZ interfaceC16820sZ = this.A05;
        C51722Yv c51722Yv = this.A01;
        if (c51722Yv == null) {
            c51722Yv = C51722Yv.A02;
        }
        return new C26555BoE(abstractC50812Vc, c51722Yv, c29472Cym, interfaceC16820sZ, null);
    }

    public C26451BmY(AbstractC50812Vc abstractC50812Vc, C51722Yv c51722Yv, Integer num, Integer num2, Integer num3, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = abstractC50812Vc;
        this.A03 = num;
        this.A04 = num2;
        this.A02 = num3;
        this.A05 = interfaceC16820sZ;
        this.A01 = c51722Yv;
    }
}
