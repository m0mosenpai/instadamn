package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BHT extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BHT(Object obj, float f, int i, int i2) {
        super(1);
        this.A01 = i2;
        this.A00 = f;
        this.A03 = obj;
        this.A02 = i;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A01 != 0) {
            COV cov = (COV) obj;
            C14360o3.A0B(cov, 0);
            C26104Bgo c26104Bgo = (C26104Bgo) this.A03;
            C14360o3.A0B(c26104Bgo, 0);
            ((List) cov.A00.A01).add(new C26094Bge(null, new C26103Bgn(this.A02), c26104Bgo, null, this.A00, 4.0f, 0.0f, 3, 1, 0));
        } else {
            C6OU c6ou = C6OU.A03;
            Float valueOf = Float.valueOf(this.A00);
            InterfaceC58315Pt7 interfaceC58315Pt7 = (InterfaceC58315Pt7) this.A03;
            ((InterfaceC113515Ao) obj).EOx(AbstractC113545Ar.A0L, new C6OU(interfaceC58315Pt7, AbstractC166987dD.A09(C17s.A09(valueOf, interfaceC58315Pt7)), this.A02));
        }
        return C0eB.A00;
    }
}
