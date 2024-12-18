package X;

/* renamed from: X.5Ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114385Ef implements InterfaceC75123Zc, InterfaceC114395Eg, InterfaceC75143Ze {
    public int A01;
    public int A02;
    public C69229Vjx A03;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A09;
    public int A00 = -1;
    public int A0A = -1;
    public int A0B = -1;
    public boolean A08 = true;
    public boolean A04 = true;
    public EnumC114405Eh A0C = EnumC114405Eh.A04;

    @Override // X.InterfaceC114395Eg
    public final void EVm(EnumC114405Eh enumC114405Eh) {
        C14360o3.A0B(enumC114405Eh, 0);
        this.A0C = enumC114405Eh;
    }

    public final void A00(int i) {
        C11T.A06("This operation must be run on UI thread.");
        this.A0A = i;
    }

    public final void A01(int i) {
        C11T.A06("This operation must be run on UI thread.");
        this.A0B = i;
    }

    public final void A02(int i) {
        C11T.A06("This operation must be run on UI thread.");
        this.A00 = i;
    }

    @Override // X.InterfaceC114395Eg
    public final EnumC114405Eh BDl() {
        return this.A0C;
    }

    @Override // X.InterfaceC75123Zc
    public final int BLI() {
        return this.A0A;
    }

    @Override // X.InterfaceC75123Zc
    public final int BLj() {
        return this.A0B;
    }

    @Override // X.InterfaceC75143Ze
    public final boolean Ceb() {
        if (this.A0C == EnumC114405Eh.A04) {
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
        throw new IllegalStateException("Position is not set.");
    }
}
