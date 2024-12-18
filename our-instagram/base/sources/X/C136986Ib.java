package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.6Ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136986Ib implements InterfaceC136996Ic {
    public final C6IU A00;
    public final C138156Nt A01;
    public final C6O0 A02;
    public final LazyListState A03;

    @Override // X.C6O2
    public final Object ArA(int i) {
        return this.A01.A01(i);
    }

    @Override // X.C6O2
    public final int BHP(Object obj) {
        return this.A02.BHP(obj);
    }

    @Override // X.C6O2
    public final Object BKc(int i) {
        Object BKc = this.A02.BKc(i);
        if (BKc == null) {
            return this.A01.A02(i);
        }
        return BKc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C136986Ib)) {
            return false;
        }
        return C14360o3.A0K(this.A01, ((C136986Ib) obj).A01);
    }

    @Override // X.C6O2
    public final int getItemCount() {
        return ((C6Nv) this.A01.A00()).A00;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C136986Ib(C6IU c6iu, C138156Nt c138156Nt, LazyListState lazyListState, C6O0 c6o0) {
        this.A03 = lazyListState;
        this.A01 = c138156Nt;
        this.A00 = c6iu;
        this.A02 = c6o0;
    }

    @Override // X.C6O2
    public final void A6q(C5Tl c5Tl, Object obj, int i, int i2) {
        int i3;
        c5Tl.Enr(-462424778);
        if ((i2 & 6) == 0) {
            int i4 = 2;
            if (c5Tl.AH2(i)) {
                i4 = 4;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i5 = 16;
            if (c5Tl.AH6(obj)) {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            int i6 = 128;
            if (c5Tl.AH4(this)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1732587333, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
            }
            C6OC.A00(this.A03.A0E, c5Tl, obj, C5UA.A01(c5Tl, new C207089En(this, i, 0), -824725566), i, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (C0fH.A02()) {
                C0fH.A00(-1152810109);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30504Dbn(obj, i, this, i2, 0);
        }
    }
}
