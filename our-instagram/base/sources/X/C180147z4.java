package X;

/* renamed from: X.7z4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180147z4 extends AbstractC178657wd implements InterfaceC178787wq {
    public final InterfaceC175577rX A00;
    public final InterfaceC175597rZ A01;
    public final boolean A02;
    public volatile InterfaceC178817wt A03;

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC178787wq.A00;
    }

    @Override // X.InterfaceC178787wq
    public final InterfaceC175597rZ Bma() {
        return this.A01;
    }

    @Override // X.InterfaceC178787wq
    public final void EfR(int i) {
        Integer num;
        InterfaceC175597rZ interfaceC175597rZ = this.A01;
        if (i > 0) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        interfaceC175597rZ.EfS(num);
    }

    public C180147z4(InterfaceC178207vu interfaceC178207vu, boolean z) {
        super(interfaceC178207vu);
        this.A00 = new InterfaceC175577rX() { // from class: X.9Ms
            @Override // X.InterfaceC175577rX
            public final void EGZ(Long l) {
                InterfaceC178817wt interfaceC178817wt = C180147z4.this.A03;
                if (interfaceC178817wt != null) {
                    interfaceC178817wt.EGZ(l);
                }
            }
        };
        this.A01 = new C72094XNo(((InterfaceC178297w3) ((AbstractC178657wd) this).A00.Aq1(InterfaceC178297w3.A00)).BAu("Lite-SurfacePipe-Thread"));
        this.A02 = z;
    }
}
