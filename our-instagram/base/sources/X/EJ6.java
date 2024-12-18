package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EJ6 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorSubscriberChatQuickPromotionFragment";
    public IgdsBottomButtonLayout A00;
    public IgdsHeadline A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131974835);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31172DnG.A0j(view, R.id.bottom_button);
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(view, R.id.headline_container);
        this.A01 = A0Q;
        String str = "headline";
        if (A0Q != null) {
            A0Q.A02 = true;
            A0Q.EW2(R.drawable.ig_illustrations_illo_subscriber_crown_badge_refresh, true);
            IgdsHeadline igdsHeadline = this.A01;
            if (igdsHeadline != null) {
                igdsHeadline.setHeadline(2131957239);
                IgdsHeadline igdsHeadline2 = this.A01;
                if (igdsHeadline2 != null) {
                    C35228FgL A01 = C35228FgL.A01(requireContext(), true);
                    A01.A04(getString(2131957236), getString(2131957233), R.drawable.instagram_clock_dotted_pano_outline_24);
                    A01.A04(getString(2131957237), getString(2131957234), R.drawable.instagram_app_messenger_pano_outline_24);
                    C35228FgL.A02(A01, igdsHeadline2, getString(2131957238), getString(2131957235), R.drawable.instagram_sticker_pano_outline_24);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
                    str = "bottomButton";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setDividerVisible(true);
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
                        if (igdsBottomButtonLayout2 != null) {
                            AbstractC31173DnH.A1H(this, igdsBottomButtonLayout2, 2131957212);
                            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A00;
                            if (igdsBottomButtonLayout3 != null) {
                                igdsBottomButtonLayout3.setPrimaryActionOnClickListener(ViewOnClickListenerC35679FpE.A00(this, 64));
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-313020631);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.quick_promotion, false);
        C0f9.A09(-2079275323, A02);
        return A0R;
    }
}
