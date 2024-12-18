package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Ixy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42884Ixy implements InterfaceC43455JHt, InterfaceC1571373s {
    public EnumC153216up A00;
    public final FragmentActivity A01;
    public final IN0 A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;
    public final UserSession A05;
    public final HCT A06;
    public final String A07;
    public final Map A08;

    public C42884Ixy(FragmentActivity fragmentActivity, UserSession userSession, IN0 in0, HCT hct, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        AbstractC25233BEq.A0x(2, userSession, str, in0);
        this.A01 = fragmentActivity;
        this.A05 = userSession;
        this.A07 = str;
        this.A02 = in0;
        this.A06 = hct;
        this.A04 = interfaceC16660sJ;
        this.A03 = interfaceC16660sJ2;
        this.A08 = AbstractC166987dD.A1I();
        this.A00 = EnumC153216up.A06;
    }

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    @Override // X.InterfaceC43455JHt
    public final C1571273r Afz() {
        Map map = this.A08;
        EnumC153216up enumC153216up = this.A00;
        Object obj = map.get(enumC153216up);
        if (obj == null) {
            obj = AbstractC37300Gc1.A0J();
            map.put(enumC153216up, obj);
        }
        return (C1571273r) obj;
    }

    @Override // X.InterfaceC43455JHt
    public final EnumC153216up B1M() {
        return this.A00;
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A05;
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        C28431Ze A02 = AbstractC31364DqT.A02();
        C31368DqX A00 = AbstractC31402Dr6.A00(userSession, "shopping_featured_products_seller_management", "instagram_shopping_featured_product_seller_management");
        A00.A0O = AbstractC111324zv.A00(262);
        A00.A0c = true;
        A00.A0L = this.A07;
        C31368DqX.A02(A0P, userSession, A02, A00);
    }

    @Override // X.InterfaceC43455JHt
    public final void EgQ() {
        Map map = this.A08;
        EnumC153216up enumC153216up = EnumC153216up.A06;
        C1571273r A0J = AbstractC37300Gc1.A0J();
        FragmentActivity fragmentActivity = this.A01;
        AbstractC37304Gc5.A0q(fragmentActivity, A0J);
        A0J.A02 = R.drawable.loadmore_icon_refresh_compound;
        map.put(enumC153216up, A0J);
        EnumC153216up enumC153216up2 = EnumC153216up.A02;
        C1571273r A0J2 = AbstractC37300Gc1.A0J();
        AbstractC37304Gc5.A0q(fragmentActivity, A0J2);
        A0J2.A02 = R.drawable.ig_illustrations_illo_add_photos_videos_refresh;
        A0J2.A01 = 0;
        A0J2.A0D = fragmentActivity.getString(2131962398);
        String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131965052);
        A0J2.A07 = AnonymousClass773.A00(AbstractC25227BEk.A0B(AbstractC111324zv.A00(217)), A0p, AbstractC167007dF.A0f(fragmentActivity, A0p, 2131962397));
        A0J2.A0C = fragmentActivity.getString(2131962396);
        A0J2.A06 = this;
        map.put(enumC153216up2, A0J2);
        EnumC153216up enumC153216up3 = EnumC153216up.A04;
        C1571273r A0J3 = AbstractC37300Gc1.A0J();
        AbstractC37304Gc5.A0q(fragmentActivity, A0J3);
        A0J3.A02 = R.drawable.loadmore_icon_refresh_compound;
        ViewOnClickListenerC42033Ik2.A01(A0J3, this, 45);
        map.put(enumC153216up3, A0J3);
    }

    @Override // X.InterfaceC43455JHt
    public final void FAs() {
        EnumC153216up enumC153216up;
        EnumC153216up enumC153216up2 = this.A00;
        EnumC39539HdB enumC39539HdB = this.A02.A00;
        if (enumC39539HdB == EnumC39539HdB.A04) {
            enumC153216up = EnumC153216up.A06;
        } else if (enumC39539HdB == EnumC39539HdB.A02) {
            enumC153216up = EnumC153216up.A04;
        } else {
            enumC153216up = EnumC153216up.A02;
        }
        this.A00 = enumC153216up;
        if (enumC153216up != enumC153216up2) {
            C38975HEd.A00(this.A06.A07);
        }
    }
}
