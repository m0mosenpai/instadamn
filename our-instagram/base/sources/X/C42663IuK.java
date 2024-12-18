package X;

import java.lang.ref.WeakReference;

/* renamed from: X.IuK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42663IuK implements InterfaceC75123Zc, InterfaceC114395Eg, InterfaceC75143Ze {
    public WeakReference A00;
    public boolean A01;
    public int A02 = -1;
    public EnumC114405Eh A03 = EnumC114405Eh.A04;

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
        return AbstractC25229BEm.A1a(this.A03, EnumC114405Eh.A04);
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        boolean z = false;
        if (this.A02 >= 0) {
            z = true;
        }
        C18C.A0G(z, "Position is not set.");
        return this.A02;
    }

    public final void A00(int i) {
        C11T.A00();
        this.A02 = i;
    }

    @Override // X.InterfaceC114395Eg
    public final void EVm(EnumC114405Eh enumC114405Eh) {
        this.A03 = enumC114405Eh;
    }
}
