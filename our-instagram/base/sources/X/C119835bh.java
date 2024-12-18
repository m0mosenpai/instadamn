package X;

/* renamed from: X.5bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119835bh implements InterfaceC75123Zc, InterfaceC114395Eg, InterfaceC75143Ze {
    public int A01;
    public String A02;
    public int A00 = -1;
    public EnumC114405Eh A03 = EnumC114405Eh.A04;

    @Override // X.InterfaceC114395Eg
    public final void EVm(EnumC114405Eh enumC114405Eh) {
        C14360o3.A0B(enumC114405Eh, 0);
        this.A03 = enumC114405Eh;
    }

    @Override // X.InterfaceC114395Eg
    public final EnumC114405Eh BDl() {
        return this.A03;
    }

    @Override // X.InterfaceC75123Zc
    public final /* synthetic */ int BLI() {
        return -1;
    }

    @Override // X.InterfaceC75123Zc
    public final /* synthetic */ int BLj() {
        return -1;
    }

    @Override // X.InterfaceC75143Ze
    public final boolean Ceb() {
        if (this.A03 == EnumC114405Eh.A04) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        int i = this.A00;
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("Position is not set.");
    }

    public final void A00(int i) {
        this.A00 = i;
    }
}
