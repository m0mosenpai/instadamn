package X;

/* renamed from: X.Oyn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56278Oyn implements InterfaceC58113Ppc {
    public final /* synthetic */ C52135N5j A00;

    public C56278Oyn(C52135N5j c52135N5j) {
        this.A00 = c52135N5j;
    }

    @Override // X.InterfaceC58113Ppc
    public final int BsJ() {
        InterfaceC09390do interfaceC09390do = this.A00.A0X;
        if (AbstractC166987dD.A1b(C51033Mgh.A01(interfaceC09390do).A01)) {
            return C51033Mgh.A00(interfaceC09390do);
        }
        throw AbstractC166987dD.A14("segments not available");
    }

    @Override // X.InterfaceC58113Ppc
    public final int BsN(int i) {
        InterfaceC09390do interfaceC09390do = this.A00.A0X;
        if (AbstractC166987dD.A1b(C51033Mgh.A01(interfaceC09390do).A01)) {
            return C51033Mgh.A01(interfaceC09390do).A01(i) + C51033Mgh.A01(interfaceC09390do).A00(i);
        }
        throw AbstractC166987dD.A14("segments not available");
    }

    @Override // X.InterfaceC58113Ppc
    public final int BsQ(int i) {
        InterfaceC09390do interfaceC09390do = this.A00.A0X;
        if (AbstractC166987dD.A1b(C51033Mgh.A01(interfaceC09390do).A01)) {
            return C51033Mgh.A01(interfaceC09390do).A01(i);
        }
        throw AbstractC166987dD.A14("segments not available");
    }
}
