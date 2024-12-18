package X;

import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import java.util.Map;

/* renamed from: X.Ixs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42878Ixs implements InterfaceC43455JHt {
    public final J1L A01;
    public final ProductCollectionFragment A02;
    public final Map A03 = AbstractC166987dD.A1G();
    public EnumC153216up A00 = EnumC153216up.A02;

    @Override // X.InterfaceC43455JHt
    public final C1571273r Afz() {
        C1571273r c1571273r = (C1571273r) this.A03.get(this.A00);
        if (c1571273r == null) {
            return AbstractC37300Gc1.A0J();
        }
        return c1571273r;
    }

    @Override // X.InterfaceC43455JHt
    public final EnumC153216up B1M() {
        return this.A00;
    }

    @Override // X.InterfaceC43455JHt
    public final void FAs() {
        EnumC153216up enumC153216up;
        EnumC153216up enumC153216up2 = this.A00;
        ProductCollectionFragment productCollectionFragment = this.A02;
        J1L j1l = this.A01;
        if (j1l.isLoading()) {
            enumC153216up = EnumC153216up.A06;
        } else if (j1l.CUG()) {
            enumC153216up = EnumC153216up.A04;
        } else {
            enumC153216up = EnumC153216up.A02;
        }
        this.A00 = enumC153216up;
        if (enumC153216up != enumC153216up2) {
            productCollectionFragment.A05.A00();
        }
    }

    public C42878Ixs(ProductCollectionFragment productCollectionFragment, J1L j1l) {
        this.A01 = j1l;
        this.A02 = productCollectionFragment;
    }

    @Override // X.InterfaceC43455JHt
    public final void EgQ() {
        C1571273r A0O = AbstractC37304Gc5.A0O();
        ViewOnClickListenerC42033Ik2.A01(A0O, this, 49);
        this.A03.put(EnumC153216up.A04, A0O);
    }
}
