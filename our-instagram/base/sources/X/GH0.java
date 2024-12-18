package X;

import java.util.AbstractCollection;

/* loaded from: classes6.dex */
public final class GH0 implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
    }

    public GH0(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        switch (this.A00) {
            case 0:
                ((GZ8) this.A03).D01();
                C14510oO c14510oO = (C14510oO) this.A02;
                if (c14510oO.A00) {
                    c14510oO.A00 = false;
                    return;
                }
                C35121FeO c35121FeO = (C35121FeO) this.A01;
                int size = ((AbstractCollection) this.A04).size();
                InterfaceC02590Ai A00 = C35121FeO.A00(c35121FeO);
                AbstractC31180DnO.A1H(EnumC33496ErV.BOTTOMSHEET, A00);
                A00.A9K("num_requests", AbstractC31171DnF.A0V(size));
                C35121FeO.A01(A00, c35121FeO);
                return;
            case 1:
                InterfaceC1118853a interfaceC1118853a = (InterfaceC1118853a) this.A03;
                if (interfaceC1118853a == null) {
                    return;
                }
                interfaceC1118853a.EJJ();
                return;
            default:
                return;
        }
    }
}
