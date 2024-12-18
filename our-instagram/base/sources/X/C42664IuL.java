package X;

/* renamed from: X.IuL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42664IuL implements InterfaceC75123Zc, InterfaceC114395Eg, InterfaceC75143Ze {
    public EnumC114405Eh A00;
    public int A01;
    public int A02;
    public int A03;
    public final String A04;

    public C42664IuL(String str) {
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A03 = -1;
        this.A01 = -1;
        this.A02 = -1;
        this.A00 = EnumC114405Eh.A04;
    }

    @Override // X.InterfaceC114395Eg
    public final void EVm(EnumC114405Eh enumC114405Eh) {
        C14360o3.A0B(enumC114405Eh, 0);
        this.A00 = enumC114405Eh;
    }

    @Override // X.InterfaceC114395Eg
    public final EnumC114405Eh BDl() {
        return this.A00;
    }

    @Override // X.InterfaceC75123Zc
    public final int BLI() {
        return this.A01;
    }

    @Override // X.InterfaceC75123Zc
    public final int BLj() {
        return this.A02;
    }

    @Override // X.InterfaceC75143Ze
    public final boolean Ceb() {
        return AbstractC25229BEm.A1a(this.A00, EnumC114405Eh.A04);
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        int i = this.A03;
        if (i >= 0) {
            return i;
        }
        throw AbstractC166987dD.A14("Position is not set.");
    }

    public final void A00(int i) {
        AbstractC37300Gc1.A0Z();
        this.A01 = i;
    }

    public final void A01(int i) {
        AbstractC37300Gc1.A0Z();
        this.A02 = i;
    }

    public final void A02(int i) {
        AbstractC37300Gc1.A0Z();
        this.A03 = i;
    }
}
