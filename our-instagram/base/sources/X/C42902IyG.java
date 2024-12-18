package X;

import com.instagram.user.model.Product;

/* renamed from: X.IyG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42902IyG implements InterfaceC43415JGf {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C41646Ibe A02;

    public C42902IyG(C41646Ibe c41646Ibe, int i, int i2) {
        this.A02 = c41646Ibe;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC43415JGf
    public final void DdE(Product product) {
        C41646Ibe c41646Ibe = this.A02;
        C64952wt c64952wt = c41646Ibe.A07;
        C14360o3.A0A(product);
        c64952wt.A04(product, c41646Ibe.A05.toString(), this.A01, this.A00);
        InterfaceC43415JGf interfaceC43415JGf = c41646Ibe.A08;
        if (interfaceC43415JGf != null) {
            interfaceC43415JGf.DdE(product);
        }
    }
}
