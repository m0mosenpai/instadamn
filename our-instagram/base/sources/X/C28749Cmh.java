package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;

/* renamed from: X.Cmh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28749Cmh implements InterfaceC31143Dmi {
    public final BZb A00;
    public final C6O0 A01;
    public final LazyGridState A02;

    @Override // X.C6O2
    public final Object ArA(int i) {
        return this.A00.A01(i);
    }

    @Override // X.C6O2
    public final int BHP(Object obj) {
        return this.A01.BHP(obj);
    }

    @Override // X.C6O2
    public final Object BKc(int i) {
        Object BKc = this.A01.BKc(i);
        if (BKc == null) {
            return this.A00.A02(i);
        }
        return BKc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28749Cmh)) {
            return false;
        }
        return C14360o3.A0K(this.A00, ((C28749Cmh) obj).A00);
    }

    @Override // X.C6O2
    public final int getItemCount() {
        return ((C6Nv) this.A00.A00()).A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C28749Cmh(BZb bZb, LazyGridState lazyGridState, C6O0 c6o0) {
        this.A02 = lazyGridState;
        this.A00 = bZb;
        this.A01 = c6o0;
    }

    @Override // X.C6O2
    public final void A6q(C5Tl c5Tl, Object obj, int i, int i2) {
        int i3;
        c5Tl.Enr(1493551140);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, obj);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, this);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1809820591, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
            }
            C6OC.A00(this.A02.A0D, c5Tl, obj, C5UA.A01(c5Tl, new C30499Dbi(this, i, 2), 726189336), i, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (C0fH.A02()) {
                C0fH.A00(-774613370);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(obj, this, i, i2, 1);
        }
    }
}