package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes6.dex */
public final class EI0 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AddAccountBottomSheetFragment";
    public UserSession A00;
    public C35020Fbt A01;
    public String A02;
    public FxSsoViewModel A03;
    public final C34973Fay A04 = new Object();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "add_account_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1512729380);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A02 = requireArguments.getString("AddAccountBottomSheetFragment.ARGUMENT_ENTRY_POINT");
        this.A01 = new C35020Fbt(requireActivity(), this.A00, true);
        this.A03 = AbstractC31178DnM.A0O(requireActivity());
        C0f9.A09(472094527, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        int i;
        int A02 = C0f9.A02(-1739718917);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            igdsBottomButtonLayout = null;
            i = -792248591;
        } else {
            C14360o3.A0B(this.A00, 2);
            AbstractC31176DnK.A0v(activity);
            InterfaceC02900Bo A00 = C0BQ.A00(this.A00);
            Bundle bundle2 = A00.AEY(activity, null, this.A00, this.A02, false).A00;
            igdsBottomButtonLayout = new IgdsBottomButtonLayout(requireContext());
            igdsBottomButtonLayout.setPrimaryAction(activity.getResources().getString(2131965712), new ViewOnClickListenerC35684FpJ(53, this, bundle2, activity));
            C35020Fbt c35020Fbt = this.A01;
            if (c35020Fbt != null && c35020Fbt.A02()) {
                this.A03.A03(requireActivity(), bundle2, this.A00);
                AbstractC31172DnG.A0F(this.A03.A03).A06(activity, new C35763Fr0(1, bundle2, activity, igdsBottomButtonLayout, this));
            }
            igdsBottomButtonLayout.setSecondaryAction(activity.getResources().getString(2131956964), new ViewOnClickListenerC35684FpJ(52, this, A00, activity));
            i = -1566353457;
        }
        C0f9.A09(i, A02);
        return igdsBottomButtonLayout;
    }
}
