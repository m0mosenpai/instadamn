package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class N15 extends AbstractC46523KiO {
    public final List A02 = AbstractC166987dD.A1E();
    public final List A01 = AbstractC166987dD.A1E();
    public int A00 = 3;

    public static final EnumC53363NjE A00(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return EnumC53363NjE.WIFI_BAND_5GHZ;
                    }
                } else {
                    return EnumC53363NjE.WIFI_BAND_2_4GHZ;
                }
            } else {
                return EnumC53363NjE.CELLULAR;
            }
        }
        return EnumC53363NjE.UNKNOWN;
    }

    @Override // X.AbstractC46523KiO
    public final void A03() {
        this.A02.clear();
        this.A01.clear();
    }

    @Override // X.AbstractC46523KiO
    public final void A04(long j) {
        List list;
        C0Zx c0Zx;
        if (this.A00 == 4) {
            list = this.A01;
            c0Zx = new C0Zx();
        } else {
            list = this.A02;
            c0Zx = new C0Zx();
        }
        c0Zx.A01(A00(super.A00), "uplink_type");
        c0Zx.A05("duration_ms", Long.valueOf(j));
        list.add(c0Zx);
    }
}
