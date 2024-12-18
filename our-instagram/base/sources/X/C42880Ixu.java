package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;
import java.util.Map;

/* renamed from: X.Ixu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42880Ixu implements InterfaceC43455JHt {
    public final J1L A01;
    public final Context A02;
    public final WishListFeedFragment A03;
    public final Map A04 = AbstractC166987dD.A1G();
    public EnumC153216up A00 = EnumC153216up.A02;

    @Override // X.InterfaceC43455JHt
    public final C1571273r Afz() {
        C1571273r c1571273r = (C1571273r) this.A04.get(this.A00);
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
            C38972HEa.A01(this.A03.A01);
        }
    }

    public C42880Ixu(Context context, WishListFeedFragment wishListFeedFragment, J1L j1l) {
        this.A01 = j1l;
        this.A02 = context;
        this.A03 = wishListFeedFragment;
    }

    @Override // X.InterfaceC43455JHt
    public final void EgQ() {
        C1571273r A0J = AbstractC37300Gc1.A0J();
        A0J.A02 = R.drawable.empty_state_save;
        Context context = this.A02;
        A0J.A0D = context.getResources().getString(2131971524);
        A0J.A07 = context.getResources().getString(2131971523);
        AbstractC37304Gc5.A0q(context, A0J);
        Map map = this.A04;
        map.put(EnumC153216up.A02, A0J);
        C1571273r A0O = AbstractC37304Gc5.A0O();
        ViewOnClickListenerC42033Ik2.A01(A0O, this, 50);
        map.put(EnumC153216up.A04, A0O);
    }
}
