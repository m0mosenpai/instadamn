package X;

import android.os.Parcelable;

/* renamed from: X.IuI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42661IuI implements InterfaceC75123Zc, InterfaceC114395Eg {
    public Parcelable A00;
    public int A03 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public EnumC114405Eh A04 = EnumC114405Eh.A04;

    @Override // X.InterfaceC114395Eg
    public final void EVm(EnumC114405Eh enumC114405Eh) {
        C14360o3.A0B(enumC114405Eh, 0);
        this.A04 = enumC114405Eh;
    }

    @Override // X.InterfaceC114395Eg
    public final EnumC114405Eh BDl() {
        return this.A04;
    }

    @Override // X.InterfaceC75123Zc
    public final int BLI() {
        return this.A01;
    }

    @Override // X.InterfaceC75123Zc
    public final int BLj() {
        return this.A02;
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        int i = this.A03;
        if (i >= 0) {
            return i;
        }
        throw AbstractC166987dD.A12("Position is not set.");
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
