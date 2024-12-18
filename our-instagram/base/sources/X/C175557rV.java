package X;

/* renamed from: X.7rV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175557rV extends AbstractC178657wd implements InterfaceC178787wq {
    public final InterfaceC175577rX A00;
    public final InterfaceC175597rZ A01;

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

    /* JADX WARN: Type inference failed for: r0v1, types: [X.7rZ, java.lang.Object] */
    public C175557rV(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A00 = new InterfaceC175577rX() { // from class: X.7rW
            @Override // X.InterfaceC175577rX
            public final void EGZ(Long l) {
            }
        };
        this.A01 = new Object();
    }
}
