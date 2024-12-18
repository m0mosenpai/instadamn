package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EHg extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SharedStackUpsellBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "SHARED_STACK_UPSELL_BOTTOM_SHEET";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A00;
        AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
        boolean z = ((EgY) A0k.A01(EgY.class, new MHH(A0k, 1))).A00;
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(view, R.id.upsell_bottom_sheet_headerline);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_collaborative_albums_refresh);
        int i = 2131973824;
        if (z) {
            i = 2131973827;
        }
        igdsHeadline.setHeadline(i);
        Context A0L = AbstractC166997dE.A0L(igdsHeadline);
        Resources resources = A0L.getResources();
        C35228FgL A01 = C35228FgL.A01(A0L, true);
        int i2 = 2131973830;
        if (z) {
            i2 = 2131973828;
        }
        String string = resources.getString(i2);
        int i3 = 2131973821;
        if (z) {
            i3 = 2131973826;
        }
        A01.A04(string, resources.getString(i3), R.drawable.instagram_collage_pano_outline_24);
        A01.A04(resources.getString(2131973831), resources.getString(2131973822), R.drawable.instagram_users_pano_outline_24);
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36316430981206407L)) {
            A01.A04(resources.getString(2131973832), resources.getString(2131973823), R.drawable.instagram_new_post_pano_outline_24);
        }
        igdsHeadline.setBulletList(A01.A03());
        C64P c64p = (C64P) AbstractC166987dD.A0c(view, R.id.upsell_bottom_sheet_buttons_layout);
        c64p.setDividerVisible(true);
        AbstractC31173DnH.A1H(this, c64p, 2131973825);
        c64p.setPrimaryActionOnClickListener(new ViewOnClickListenerC35666Fp0(this, 32));
        c64p.setSecondaryActionText(getString(2131973829));
        c64p.setSecondaryActionOnClickListener(new ViewOnClickListenerC35666Fp0(this, 33));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(121779989);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.shared_stack_upsell_bottom_sheet, viewGroup, false);
        C0f9.A09(565587529, A02);
        return inflate;
    }
}
