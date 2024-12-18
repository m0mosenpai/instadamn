package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class EKR extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectChallengesNuxFragment";
    public GXS A00;
    public EnumC33364Eox A01;
    public boolean A02;
    public final InterfaceC09390do A03 = C1XM.A00(new C50153MDg(this, 9));
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.direct_challenges_nux_header_title);
        int i = 2131954967;
        if (this.A02) {
            i = 2131954952;
        }
        AbstractC25227BEk.A12(A0T, this, i);
        TextView A0T2 = AbstractC166997dE.A0T(view, R.id.direct_challenges_nux_subtitle);
        int i2 = 2131954965;
        if (this.A02) {
            i2 = 2131954949;
        }
        AbstractC25227BEk.A12(A0T2, this, i2);
        boolean A00 = AbstractC72723Nt.A00(requireContext());
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.direct_challenges_nux_header_image);
        int i3 = R.drawable.channels_challenge_nux_light;
        if (A00) {
            i3 = R.drawable.channels_challenge_nux_dark;
        }
        A0I.setImageResource(i3);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.direct_challenges_nux_disclosure);
        if (this.A02) {
            String A0v = AbstractC25227BEk.A0v(this, 2131954951);
            String A0w = AbstractC31174DnI.A0w(this, A0v, 2131954950);
            C14360o3.A07(A0w);
            int A04 = AbstractC25233BEq.A04(this);
            AnonymousClass773.A07(new EPS(new C012804r(16, A0v), C05F.A01, this, A0v, A04, 1), A0N, A0v, A0w);
        } else {
            AbstractC25227BEk.A12(A0N, this, 2131954966);
        }
        ((C64P) view.requireViewById(R.id.direct_challenges_nux_cta_button)).setPrimaryActionOnClickListener(ViewOnClickListenerC35691FpR.A00(this, 2));
        if (this.A01 == EnumC33364Eox.A07) {
            Bundle requireArguments = requireArguments();
            C36298Fzs.A03(null, AbstractC31172DnG.A0e(this.A03), AbstractC31179DnN.A0X(requireArguments, "direct_thread_audience_type"), requireArguments.getString(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY), requireArguments.getString("direct_thread_key_v2"), "challenge_creator_nux_sheet_rendered", "impression", "thread_view", "thread_view", null);
            return;
        }
        C36298Fzs A0e = AbstractC31172DnG.A0e(this.A03);
        EnumC33364Eox enumC33364Eox = this.A01;
        if (enumC33364Eox != null && enumC33364Eox.ordinal() == 1) {
            str = "get_started_button";
        } else {
            str = "challenge_button";
        }
        C36298Fzs.A03(null, A0e, 0, null, null, "challenge_creator_nux_sheet_rendered", "tap", str, "thread_view", null);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC33364Eox enumC33364Eox;
        int A02 = C0f9.A02(-1708937212);
        super.onCreate(bundle);
        this.A02 = requireArguments().getBoolean("arg_is_creator");
        Serializable serializable = requireArguments().getSerializable("prompts_entry_point");
        if (serializable instanceof EnumC33364Eox) {
            enumC33364Eox = (EnumC33364Eox) serializable;
        } else {
            enumC33364Eox = null;
        }
        this.A01 = enumC33364Eox;
        C0f9.A09(636538393, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1690773600);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_challenges_bottom_sheet_nux, false);
        C0f9.A09(-128663287, A02);
        return A0R;
    }
}
