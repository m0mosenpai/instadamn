package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import java.util.Map;

/* renamed from: X.Ixw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42882Ixw implements InterfaceC43455JHt {
    public EnumC153216up A00;
    public final Context A01;
    public final FeaturedProductMediaFeedGridConfiguration A02;
    public final J1L A03;
    public final JGY A04;
    public final Map A05;

    @Override // X.InterfaceC43455JHt
    public final void EgQ() {
    }

    @Override // X.InterfaceC43455JHt
    public final C1571273r Afz() {
        return (C1571273r) this.A05.get(this.A00);
    }

    @Override // X.InterfaceC43455JHt
    public final EnumC153216up B1M() {
        return this.A00;
    }

    @Override // X.InterfaceC43455JHt
    public final void FAs() {
        EnumC153216up enumC153216up;
        EnumC153216up enumC153216up2 = this.A00;
        J1L j1l = this.A03;
        if (j1l.isLoading() && !(!j1l.A02.isEmpty())) {
            enumC153216up = EnumC153216up.A06;
        } else if (!j1l.CUG() && !(!j1l.A02.isEmpty())) {
            enumC153216up = EnumC153216up.A02;
        } else {
            enumC153216up = EnumC153216up.A04;
        }
        this.A00 = enumC153216up;
        if (enumC153216up != enumC153216up2) {
            this.A04.FAt();
        }
    }

    public C42882Ixw(Context context, JGY jgy, FeaturedProductMediaFeedGridConfiguration featuredProductMediaFeedGridConfiguration, J1L j1l) {
        AbstractC167017dG.A1R(featuredProductMediaFeedGridConfiguration, j1l);
        this.A01 = context;
        this.A02 = featuredProductMediaFeedGridConfiguration;
        this.A03 = j1l;
        this.A04 = jgy;
        EnumC153216up enumC153216up = EnumC153216up.A02;
        this.A00 = enumC153216up;
        EnumC153216up enumC153216up2 = EnumC153216up.A06;
        C1571273r A0J = AbstractC37300Gc1.A0J();
        AbstractC37304Gc5.A0q(context, A0J);
        C09530e4 A1L = AbstractC166987dD.A1L(enumC153216up2, A0J);
        C1571273r A0J2 = AbstractC37300Gc1.A0J();
        AbstractC37304Gc5.A0q(context, A0J2);
        A0J2.A0D = featuredProductMediaFeedGridConfiguration.A03;
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        FeaturedProductMediaFeedGridConfiguration featuredProductMediaFeedGridConfiguration2 = this.A02;
        String str = featuredProductMediaFeedGridConfiguration2.A02;
        if (str != null) {
            A01.append((CharSequence) str);
        }
        String str2 = featuredProductMediaFeedGridConfiguration2.A01;
        if (str2 != null) {
            String A0p = AbstractC166997dE.A0p(this.A01, 2131965052);
            A01.append((CharSequence) " ").append((CharSequence) AnonymousClass773.A00(AbstractC25227BEk.A0B(str2), A0p, A0p));
        }
        A0J2.A07 = A01;
        C09530e4 A1L2 = AbstractC166987dD.A1L(enumC153216up, A0J2);
        EnumC153216up enumC153216up3 = EnumC153216up.A04;
        C1571273r A0J3 = AbstractC37300Gc1.A0J();
        AbstractC37304Gc5.A0q(context, A0J3);
        A0J3.A02 = R.drawable.loadmore_icon_refresh_compound;
        ViewOnClickListenerC42033Ik2.A01(A0J3, this, 43);
        this.A05 = AbstractC25232BEp.A1F(enumC153216up3, A0J3, A1L, A1L2);
    }

    public static void A00(InterfaceC09390do interfaceC09390do) {
        ((C42882Ixw) interfaceC09390do.getValue()).FAs();
    }
}
