package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P6t implements InterfaceC156026zW {
    public final Context A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    @Override // X.InterfaceC156026zW
    public final String Abf() {
        return "products";
    }

    @Override // X.InterfaceC156026zW
    public final String BN1() {
        return null;
    }

    @Override // X.InterfaceC156026zW
    public final EnumC125765mR BiA() {
        return null;
    }

    @Override // X.InterfaceC156026zW
    public final void Dro(boolean z) {
    }

    @Override // X.InterfaceC156026zW
    public final void Drp() {
    }

    @Override // X.InterfaceC156026zW
    public final void Drv(boolean z) {
    }

    @Override // X.InterfaceC156026zW
    public final InterfaceC152836uD AMq(boolean z) {
        UserSession userSession = this.A01;
        String str = this.A04;
        String str2 = this.A02;
        String str3 = this.A05;
        boolean z2 = this.A06;
        String str4 = this.A03;
        Bundle A08 = MSX.A08(userSession);
        A08.putString(AbstractC111324zv.A00(134), str);
        A08.putString("ad_retrieval_key", str2);
        A08.putString("tracking_token", str3);
        A08.putBoolean("should_show_floating_cta", z2);
        A08.putString("advertiser_name", str4);
        HCY hcy = new HCY();
        hcy.setArguments(A08);
        return hcy;
    }

    @Override // X.InterfaceC156026zW
    public final String C4o() {
        return AbstractC111324zv.A00(1192);
    }

    @Override // X.InterfaceC156026zW
    public final String C4q() {
        return "tap_ads_products_tab";
    }

    public P6t(Context context, UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A06 = z;
        this.A03 = str4;
    }

    @Override // X.InterfaceC156026zW
    public final View ANH(ViewGroup viewGroup, String str, int i) {
        AbstractC167017dG.A1N(viewGroup, str);
        InterfaceC154386wo A00 = AbstractC154376wm.A00(viewGroup, str, i);
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_shopping_bag_pano_outline_24);
        if (drawable != null) {
            A00.setIcon(drawable);
        }
        A00.setActiveIcon(context.getDrawable(R.drawable.instagram_shopping_bag_pano_filled_24));
        A00.setTitle(AbstractC166997dE.A0p(context, 2131970243));
        View view = A00.getView();
        view.setContentDescription(AbstractC166997dE.A0p(context, 2131970243));
        return view;
    }
}
