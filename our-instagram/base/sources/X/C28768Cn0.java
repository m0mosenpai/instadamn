package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;

/* renamed from: X.Cn0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28768Cn0 implements InterfaceC31144Dmj {
    public final C6O0 A00;
    public final C25740BZc A01;
    public final LazyStaggeredGridState A02;

    @Override // X.C6O2
    public final Object ArA(int i) {
        return this.A01.A01(i);
    }

    @Override // X.C6O2
    public final int BHP(Object obj) {
        return this.A00.BHP(obj);
    }

    @Override // X.C6O2
    public final Object BKc(int i) {
        Object BKc = this.A00.BKc(i);
        if (BKc == null) {
            return this.A01.A02(i);
        }
        return BKc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28768Cn0)) {
            return false;
        }
        return C14360o3.A0K(this.A01, ((C28768Cn0) obj).A01);
    }

    @Override // X.C6O2
    public final int getItemCount() {
        return ((C6Nv) this.A01.A00()).A00;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C28768Cn0(C6O0 c6o0, C25740BZc c25740BZc, LazyStaggeredGridState lazyStaggeredGridState) {
        this.A02 = lazyStaggeredGridState;
        this.A01 = c25740BZc;
        this.A00 = c6o0;
    }

    @Override // X.C6O2
    public final void A6q(C5Tl c5Tl, Object obj, int i, int i2) {
        int i3;
        c5Tl.Enr(89098518);
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
                C0fH.A01(1289168211, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item (LazyStaggeredGridItemProvider.kt:76)");
            }
            C6OC.A00(this.A02.A0A, c5Tl, obj, C5UA.A01(c5Tl, new C30499Dbi(this, i, 4), 608834466), i, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (C0fH.A02()) {
                C0fH.A00(331837716);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(obj, this, i, i2, 2);
        }
    }
}
