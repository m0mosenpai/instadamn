package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.user.model.User;

/* renamed from: X.Ejo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33145Ejo extends ELn {
    public static final String __redex_internal_original_name = "ShareToFriendsStoryAudiencePickerFragment";
    public IngestSessionShim A00;
    public IgdsButton A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "audience_selection";
    }

    @Override // X.ELn, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(requireView(), R.id.audience_picker_disclaimer_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String A0v = AbstractC25227BEk.A0v(this, 2131973776);
        Context A00 = ELn.A00(spannableStringBuilder, this, A0v, 2131973781);
        AnonymousClass773.A05(spannableStringBuilder, new AnonymousClass522(AbstractC31174DnI.A0q(A00, AbstractC53242c7.A0C(A00))), A0v);
        A0N.setText(spannableStringBuilder);
        ViewOnClickListenerC35682FpH.A01(A0N, 5, this);
        IgdsButton A0W = AbstractC31173DnH.A0W(requireView(), R.id.done_button);
        A0W.setEnabled(false);
        A0W.setText(2131973280);
        A0W.setVisibility(0);
        ViewOnClickListenerC35682FpH.A01(A0W, 6, this);
        this.A01 = A0W;
        A0A().A00 = new C34624FNh(AbstractC166997dE.A0L(view), null, null, 0, false);
        A0A().A03(requireContext(), null, EnumC153216up.A06);
        Context requireContext = requireContext();
        C08790ch A002 = AbstractC018607g.A00(this);
        C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC25230BEn.A0k(this.A04, 0));
        A0M.A0B("friendships/share_to_friends_story_suggested_users/");
        A0M.A9s("search_surface", "share_to_friends_story_share_sheet");
        C1ON A0e = AbstractC25227BEk.A0e(A0M, EC5.class, FXZ.class);
        C31714DwJ.A00(A0e, this, 3);
        C1GJ.A00(requireContext, A002, A0e);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.ELn
    public final void A0D(IgdsCheckBox igdsCheckBox, C32069E6v c32069E6v) {
        Context requireContext;
        int i;
        AbstractC167017dG.A1N(c32069E6v, igdsCheckBox);
        User user = c32069E6v.A02;
        if (user.A2O()) {
            requireContext = requireContext();
            i = 2131973785;
        } else {
            Boolean AkF = user.A03.AkF();
            if (AkF != null && AkF.booleanValue()) {
                super.A0D(igdsCheckBox, c32069E6v);
                Activity rootActivity = getRootActivity();
                if (rootActivity != null) {
                    AbstractC13880nE.A0K(rootActivity);
                }
                EQ8 A0A = A0A();
                java.util.Set set = super.A03.A03;
                A0A.A02(set.size());
                A0A().A01();
                IgdsButton igdsButton = this.A01;
                if (igdsButton == null) {
                    return;
                }
                igdsButton.setEnabled(AbstractC167007dF.A1O(set.size()));
                return;
            }
            requireContext = requireContext();
            i = 2131973777;
        }
        String A0c = AbstractC31178DnM.A0c(requireContext, user, i);
        C14360o3.A07(A0c);
        C193328hC A0O = AbstractC31175DnJ.A0O(this);
        A0O.A0A(2131973766);
        A0O.A0r(A0c);
        AbstractC31176DnK.A1W(A0O);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31176DnK.A1C(ViewOnClickListenerC35682FpH.A00(this, 4), AbstractC31179DnN.A0B(interfaceC56362iU, AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131973780)), interfaceC56362iU);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25227BEk.A1B(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1005057803);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = (IngestSessionShim) requireArguments.getParcelable(MSV.A00(1005));
        this.A02 = requireArguments.getBoolean("ShareToFriendsStoryAudiencePickerFragment.ARGUMENTS_IS_FROM_SHARECUT", false);
        this.A03 = requireArguments.getBoolean("ShareToFriendsStoryAudiencePickerFragment.ARGUMENTS_IS_PARTIAL_SCREEN_BOTTOMSHEET", false);
        super.A02 = "share_to_friends_story_share_sheet";
        C0f9.A09(1731084547, A02);
    }

    @Override // X.ELn, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(541981231);
        C14360o3.A0B(layoutInflater, 0);
        super.A00 = new EQ8(requireContext(), this, this, this, this, this, A0C(), true, true);
        View inflate = layoutInflater.inflate(R.layout.layout_audience_picker, viewGroup, false);
        if (this.A03) {
            ViewGroup.LayoutParams layoutParams = AbstractC166997dE.A0S(inflate, R.id.main_container).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && layoutParams != null) {
                layoutParams.height = (int) (AbstractC13890nF.A00(requireContext()) * 0.6d);
            }
        }
        C0f9.A09(-24950860, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-559687641);
        super.onDestroyView();
        this.A01 = null;
        C0f9.A09(-37664739, A02);
    }
}
