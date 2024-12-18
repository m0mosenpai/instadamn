package X;

/* renamed from: X.CxM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29389CxM implements C7XU {
    public final int A00;
    public final Object A01;

    @Override // X.C7XU
    public final void DB3() {
    }

    public C29389CxM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C7XU
    public final void DAy() {
        switch (this.A00) {
            case 0:
                ((C25877Bcc) ((C26822Bsk) this.A01).A06.getValue()).A06(false);
                return;
            case 1:
                CQH cqh = (CQH) this.A01;
                BRG.A03(cqh.A00, cqh.A01);
                return;
            case 2:
                InterfaceC30955DjC interfaceC30955DjC = ((C26859BtL) this.A01).A00;
                if (interfaceC30955DjC == null) {
                    return;
                }
                interfaceC30955DjC.DN3();
                return;
            default:
                ((C27916CSb) this.A01).A02.invoke();
                return;
        }
    }
}
