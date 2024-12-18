package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* loaded from: classes8.dex */
public final class KBR extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "InstantAvatarsBottomSheetFragment";
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public C53O A03;
    public IgdsButton A04;
    public StackedAvatarView A05;
    public String A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A08;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instant_avatars_bottom_sheet_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A05 = (StackedAvatarView) view.requireViewById(R.id.stacked_avatar_view);
        this.A02 = AbstractC166997dE.A0T(view, R.id.instant_avatar_upsell_title);
        this.A01 = AbstractC166997dE.A0T(view, R.id.instant_avatar_upsell_subtitle);
        this.A04 = AbstractC31173DnH.A0W(view, R.id.instant_avatar_upsell_cta_button);
        this.A00 = AbstractC166997dE.A0T(view, R.id.instant_avatar_upsell_secondary_cta_button);
        String A0p = AbstractC166997dE.A0p(requireContext(), 2131964558);
        String A0p2 = AbstractC166997dE.A0p(requireContext(), 2131964560);
        SpannableStringBuilder append = AbstractC31178DnM.A09(A0p, A0p2).append((CharSequence) ".");
        C44383JjM c44383JjM = new C44383JjM(this, 0);
        C14360o3.A0A(append);
        AnonymousClass773.A05(append, c44383JjM, A0p2);
        StackedAvatarView stackedAvatarView = this.A05;
        if (stackedAvatarView != null) {
            stackedAvatarView.setBackAvatarUrl(AbstractC31176DnK.A0g(C17060sy.A01, this.A07).Bhu(), this);
            stackedAvatarView.setFrontAvatarDrawable(new C44306Jhx(requireContext(), null, requireContext().getDrawable(R.drawable.ig_avatar_assets_instant_avatar_nux_2), null, R.dimen.action_bar_item_spacing_left, 0, 0, 0, 1528, false));
        }
        TextView textView = this.A02;
        if (textView != null) {
            AbstractC166987dD.A1P(requireContext(), textView, 2131964561);
        }
        TextView textView2 = this.A01;
        if (textView2 != null) {
            textView2.setText(append);
            textView2.setLinksClickable(true);
            textView2.setClickable(true);
            AbstractC25227BEk.A11(textView2);
        }
        IgdsButton igdsButton = this.A04;
        if (igdsButton != null) {
            igdsButton.setText(requireContext().getString(2131964556));
            ViewOnClickListenerC48064LPp.A00(igdsButton, 10, this);
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            AbstractC166987dD.A1P(requireContext(), textView3, 2131964557);
            ViewOnClickListenerC48064LPp.A00(textView3, 11, this);
        }
        C44465JlX c44465JlX = (C44465JlX) this.A08.getValue();
        String str = this.A06;
        if (str != null) {
            LJH.A01(c44465JlX.A00, str);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public KBR() {
        C50254MHj A02 = C50254MHj.A02(this, 17);
        InterfaceC09390do A00 = C50254MHj.A00(C50254MHj.A02(this, 14), EnumC09460dv.A02, 15);
        this.A08 = AbstractC25225BEi.A0a(C50254MHj.A02(A00, 16), A02, new MHV(34, (Object) null, A00), AbstractC25225BEi.A1D(C44465JlX.class));
    }

    public static final void A00(KBR kbr, boolean z) {
        String str;
        FragmentActivity requireActivity = kbr.requireActivity();
        String A0j = AbstractC167017dG.A0j();
        C44465JlX c44465JlX = (C44465JlX) kbr.A08.getValue();
        String str2 = kbr.A06;
        if (str2 != null) {
            if (z) {
                str = "instant_avatars_cta_button";
            } else {
                str = "create_from_scratch_cta_button";
            }
            LJH.A03(c44465JlX.A00, str2, str, A0j);
            C3DN A0r = AbstractC31172DnG.A0r(requireActivity);
            if (A0r != null) {
                ((C3DP) A0r).A0H = new C49627LwK(requireActivity, kbr, A0j, z);
                A0r.A0B();
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(176806918);
        super.onCreate(bundle);
        this.A06 = requireArguments().getString("args_logging_surface");
        C0f9.A09(1120795612, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1168449839);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.instant_avatar_upsell_bottom_sheet, viewGroup, false);
        C0f9.A09(-1728188908, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1030075558);
        super.onDestroyView();
        this.A05 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A00 = null;
        C0f9.A09(-563791404, A02);
    }
}
