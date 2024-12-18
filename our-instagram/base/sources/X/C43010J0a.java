package X;

/* renamed from: X.J0a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43010J0a implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;

    public C43010J0a(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        switch (this.A00) {
            case 0:
                ((InterfaceC1118853a) this.A01).EJJ();
                return;
            case 1:
                C41742IeG c41742IeG = (C41742IeG) this.A01;
                InterfaceC1119153d interfaceC1119153d = c41742IeG.A01;
                if (interfaceC1119153d != null) {
                    interfaceC1119153d.Czx();
                }
                c41742IeG.A00 = null;
                c41742IeG.A01 = null;
                return;
            case 2:
                C145726hV c145726hV = ((C37952Gmu) this.A01).A0W;
                if (c145726hV == null) {
                    return;
                }
                c145726hV.A00();
                return;
            case 3:
            case 4:
            default:
                return;
            case 5:
                C59952od c59952od = ((IN9) this.A01).A05;
                if (c59952od == null) {
                    return;
                }
                c59952od.DCM();
                return;
        }
    }

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
        ILW ilw;
        switch (this.A00) {
            case 3:
                ilw = ((C37675GiC) this.A01).A0N;
                break;
            case 4:
                ilw = ((C37595Ggq) this.A01).A07;
                break;
            default:
                return;
        }
        ilw.A00();
    }
}
