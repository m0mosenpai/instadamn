package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EIT extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AccountPrivacySwitchBottomSheetFragment";
    public FHR A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final String A05 = "999+";
    public final InterfaceC11380iw A04 = AbstractC31171DnF.A0D("privacy_switch_bottom_sheet");
    public final InterfaceC09390do A07 = C1XM.A00(new X2z(this, 33));
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "privacy_switch_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View requireViewById;
        TextView A0T;
        int i;
        String valueOf;
        String valueOf2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) AbstractC31178DnM.A0A(view, R.id.account_privacy_bottom_sheet_items_container_stub);
        boolean z = this.A02;
        boolean z2 = this.A03;
        if (!z) {
            if (z2) {
                C35228FgL c35228FgL = new C35228FgL(requireContext(), (Boolean) null, 6);
                c35228FgL.A04(null, AbstractC166997dE.A0N(this).getString(2131972579), R.drawable.instagram_reels_pano_outline_24);
                c35228FgL.A04(null, AbstractC166997dE.A0N(this).getString(2131973596), R.drawable.instagram_story_mention_pano_outline_24);
                c35228FgL.A04(null, AbstractC166997dE.A0N(this).getString(2131972580), R.drawable.instagram_remix_pano_outline_24);
                c35228FgL.A04(null, AbstractC166997dE.A0N(this).getString(2131972581), R.drawable.instagram_settings_pano_outline_24);
                Iterator it = c35228FgL.A03().iterator();
                while (it.hasNext()) {
                    viewGroup.addView((View) it.next());
                }
                InterfaceC09390do interfaceC09390do = this.A06;
                int i2 = F9N.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00;
                if (i2 > 0) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A07.getValue(), "follow_request_entrypoint_impression");
                    AbstractC31171DnF.A1I(A0f, "privacy_switch_bottom_sheet");
                    A0f.Cht();
                    View requireViewById2 = view.requireViewById(R.id.bottom_sheet_content_follow_requests_redesign);
                    requireViewById2.setVisibility(0);
                    TextView A0T2 = AbstractC166997dE.A0T(requireViewById2, R.id.follow_requests_count);
                    if (i2 > 999) {
                        valueOf2 = this.A05;
                    } else {
                        valueOf2 = String.valueOf(i2);
                    }
                    A0T2.setText(valueOf2);
                    ViewOnClickListenerC35686FpL.A00(requireViewById2, 36, this);
                    AbstractC56952jT.A01(requireViewById2);
                    requireViewById2.setContentDescription(AbstractC167017dG.A0k(AbstractC166997dE.A0N(this), i2, R.plurals.settings_panavision_public_bottom_sheet_follow_request_label));
                }
                C37855Gl9.A06(AbstractC166987dD.A0r(interfaceC09390do));
            } else {
                View requireViewById3 = view.requireViewById(R.id.bottom_sheet_content_posts);
                AbstractC166997dE.A19(requireContext(), AbstractC31173DnH.A0I(requireViewById3, R.id.content_icon), R.drawable.instagram_reels_pano_outline_24);
                AbstractC166997dE.A0T(requireViewById3, R.id.content_description).setText(2131973597);
                requireViewById3.setVisibility(0);
                View requireViewById4 = view.requireViewById(R.id.bottom_sheet_content_messages);
                AbstractC166997dE.A19(requireContext(), AbstractC31173DnH.A0I(requireViewById4, R.id.content_icon), R.drawable.instagram_story_mention_pano_outline_24);
                AbstractC166997dE.A0T(requireViewById4, R.id.content_description).setText(2131973596);
                requireViewById4.setVisibility(0);
                View requireViewById5 = view.requireViewById(R.id.bottom_sheet_content_follow_requests);
                AbstractC166997dE.A19(requireContext(), AbstractC31173DnH.A0I(requireViewById5, R.id.content_icon), R.drawable.instagram_user_follow_pano_outline_24);
                AbstractC166997dE.A0T(requireViewById5, R.id.content_description).setText(2131973594);
                requireViewById5.setVisibility(0);
                TextView A0T3 = AbstractC166997dE.A0T(requireViewById5, R.id.follow_requests_count);
                int i3 = F9N.A00(AbstractC166987dD.A0r(this.A06)).A00;
                if (i3 > 999) {
                    valueOf = this.A05;
                } else {
                    valueOf = String.valueOf(i3);
                }
                A0T3.setText(valueOf);
                A0T3.setVisibility(0);
                ImageView A0I = AbstractC31173DnH.A0I(requireViewById5, R.id.follow_requests_chevron);
                A0I.setImageAlpha(102);
                A0I.setVisibility(0);
                ViewOnClickListenerC35686FpL.A00(requireViewById5, 37, this);
                requireViewById = view.requireViewById(R.id.bottom_sheet_content_reels_remix);
                AbstractC166997dE.A19(requireContext(), AbstractC31173DnH.A0I(requireViewById, R.id.content_icon), R.drawable.instagram_remix_pano_outline_24);
                A0T = AbstractC166997dE.A0T(requireViewById, R.id.content_description);
                i = 2131973598;
                A0T.setText(i);
                requireViewById.setVisibility(0);
            }
        } else if (z2) {
            C35228FgL c35228FgL2 = new C35228FgL(requireContext(), (Boolean) null, 6);
            c35228FgL2.A04(null, AbstractC166997dE.A0N(this).getString(2131973606), R.drawable.instagram_reels_pano_outline_24);
            c35228FgL2.A04(null, AbstractC166997dE.A0N(this).getString(2131973604), R.drawable.instagram_story_mention_pano_outline_24);
            String string = AbstractC166997dE.A0N(this).getString(2131973605);
            if (this.A01) {
                if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A06, 0), 36318926354848533L)) {
                    c35228FgL2.A04(null, string, R.drawable.instagram_direct_pano_outline_24);
                }
            }
            c35228FgL2.A04(null, AbstractC166997dE.A0N(this).getString(2131972582), R.drawable.instagram_remix_pano_outline_24);
            Iterator it2 = c35228FgL2.A03().iterator();
            while (it2.hasNext()) {
                viewGroup.addView((View) it2.next());
            }
        } else {
            AbstractC166997dE.A0S(view, R.id.bottom_sheet_content_posts).setVisibility(0);
            AbstractC166997dE.A19(requireContext(), AbstractC31176DnK.A0D(view.requireViewById(R.id.bottom_sheet_content_posts), R.id.content_icon), R.drawable.instagram_photo_pano_outline_24);
            TextView A0N = AbstractC167007dF.A0N(view.requireViewById(R.id.bottom_sheet_content_posts), R.id.content_description);
            int i4 = 2131973609;
            if (this.A02) {
                i4 = 2131973606;
            }
            AbstractC25227BEk.A12(A0N, this, i4);
            AbstractC166997dE.A0S(view, R.id.bottom_sheet_content_messages).setVisibility(0);
            AbstractC166997dE.A19(requireContext(), AbstractC31176DnK.A0D(view.requireViewById(R.id.bottom_sheet_content_messages), R.id.content_icon), R.drawable.instagram_comment_pano_outline_24);
            AbstractC167007dF.A0N(view.requireViewById(R.id.bottom_sheet_content_messages), R.id.content_description).setText(2131973604);
            if (this.A01) {
                if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A06, 0), 36318926354848533L)) {
                    requireViewById = view.requireViewById(R.id.bottom_sheet_content_message_requests);
                    AbstractC166997dE.A19(requireContext(), AbstractC31173DnH.A0I(requireViewById, R.id.content_icon), R.drawable.instagram_direct_pano_outline_24);
                    A0T = AbstractC166997dE.A0T(requireViewById, R.id.content_description);
                    i = 2131973605;
                    A0T.setText(i);
                    requireViewById.setVisibility(0);
                }
            }
        }
        if (this.A03) {
            AbstractC166997dE.A0S(view, R.id.bottom_sheet_nav_bar_divider_redesign).setVisibility(0);
            AbstractC166997dE.A0S(view, R.id.bottom_sheet_nav_bar_divider).setVisibility(8);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(372024924);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getBoolean("ARG_PRIVACY_SWITCH_TO_PRIVATE");
        this.A03 = AbstractC31172DnG.A1X(requireArguments, "ARG_IS_REDESIGN");
        C0f9.A09(-1757357923, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(439125371);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.privacy_switch_bottom_sheet_redesigned_layout, viewGroup, false);
        C0f9.A09(1420095908, A02);
        return inflate;
    }
}
