package X;

/* renamed from: X.BVq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25654BVq implements C6O2 {
    public final C6KS A00;
    public final BWL A01 = BWL.A00;
    public final C6O0 A02;
    public final BVY A03;

    @Override // X.C6O2
    public final int BHP(Object obj) {
        return this.A02.BHP(obj);
    }

    @Override // X.C6O2
    public final Object BKc(int i) {
        Object BKc = this.A02.BKc(i);
        if (BKc == null) {
            return this.A00.A02(i);
        }
        return BKc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25654BVq)) {
            return false;
        }
        return C14360o3.A0K(this.A00, ((C25654BVq) obj).A00);
    }

    @Override // X.C6O2
    public final int getItemCount() {
        return ((C6Nv) this.A00.A00()).A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C25654BVq(C6KS c6ks, C6O0 c6o0, BVY bvy) {
        this.A03 = bvy;
        this.A00 = c6ks;
        this.A02 = c6o0;
    }

    @Override // X.C6O2
    public final void A6q(C5Tl c5Tl, Object obj, int i, int i2) {
        int i3;
        c5Tl.Enr(-1201380429);
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
                C0fH.A01(718717601, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:206)");
            }
            C6OC.A00(this.A03.A0L, c5Tl, obj, C5UA.A01(c5Tl, new C30499Dbi(this, i, 5), 1142237095), i, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (C0fH.A02()) {
                C0fH.A00(832610037);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(obj, this, i, i2, 3);
        }
    }

    @Override // X.C6O2
    public final /* synthetic */ Object ArA(int i) {
        return null;
    }
}
