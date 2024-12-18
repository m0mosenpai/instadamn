package X;

/* renamed from: X.Blp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26406Blp extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;
    public final long A01;
    public final C51722Yv A02;
    public final InterfaceC16820sZ A03;

    public C26406Blp(C51722Yv c51722Yv, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, long j) {
        C14360o3.A0B(c51722Yv, 2);
        this.A01 = j;
        this.A02 = c51722Yv;
        this.A00 = interfaceC16820sZ;
        this.A03 = interfaceC16820sZ2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C26365BlA c26365BlA = new C26365BlA(this.A02, this.A03, this.A01);
        if (this.A00 != null) {
            return new C26555BoE(c26365BlA, C51722Yv.A02, new C29472Cym(C05F.A01, C05F.A00, C05F.A0C), C29905DGt.A01(this, 3), null);
        }
        return c26365BlA;
    }
}
