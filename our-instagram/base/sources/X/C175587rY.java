package X;

/* renamed from: X.7rY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175587rY implements InterfaceC175597rZ {
    public volatile InterfaceC175577rX A00;

    @Override // X.InterfaceC175597rZ
    public final void DIE() {
        DIF(null);
    }

    @Override // X.InterfaceC175597rZ
    public final void DII() {
    }

    @Override // X.InterfaceC175597rZ
    public final void EfS(Integer num) {
    }

    @Override // X.InterfaceC175597rZ
    public final void stop() {
        this.A00 = null;
    }

    @Override // X.InterfaceC175597rZ
    public final void DIF(Long l) {
        InterfaceC175577rX interfaceC175577rX = this.A00;
        if (interfaceC175577rX != null) {
            interfaceC175577rX.EGZ(l);
        }
    }

    @Override // X.InterfaceC175597rZ
    public final void Emi(InterfaceC175577rX interfaceC175577rX) {
        this.A00 = interfaceC175577rX;
    }
}
