package X;

/* renamed from: X.IuJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42662IuJ implements InterfaceC75123Zc, InterfaceC114395Eg, InterfaceC75143Ze {
    public int A00 = -1;
    public EnumC114405Eh A01 = EnumC114405Eh.A04;

    @Override // X.InterfaceC114395Eg
    public final void EVm(EnumC114405Eh enumC114405Eh) {
        C14360o3.A0B(enumC114405Eh, 0);
        this.A01 = enumC114405Eh;
    }

    @Override // X.InterfaceC114395Eg
    public final EnumC114405Eh BDl() {
        return this.A01;
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
        return AbstractC25229BEm.A1a(this.A01, EnumC114405Eh.A04);
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        if (this.A00 < 0) {
            C0w9.A01.EmN("NotesNetegoTrayState", "Position is not set");
        }
        return this.A00;
    }

    public final void A00(int i) {
        AbstractC37300Gc1.A0Z();
        this.A00 = i;
    }
}
