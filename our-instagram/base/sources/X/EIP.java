package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.profile.bindergroup.AccountLinkModel;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EIP extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "EditLinksListActionFragment";
    public C25671My A00;
    public AccountLinkModel A01;
    public C6WQ A02;
    public User A03;
    public String A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_links_list_action_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.link_action_remove_link_textview);
        AccountLinkModel accountLinkModel = this.A01;
        if (accountLinkModel == null) {
            C14360o3.A0F("account");
            throw C00O.createAndThrow();
        }
        if (!(accountLinkModel instanceof AccountLinkModel.FacebookLinkData) && !(accountLinkModel instanceof AccountLinkModel.FacebookLinkDataV2)) {
            if (accountLinkModel instanceof AccountLinkModel.FacebookPageLinkData) {
                str = "facebook_page";
            } else {
                str = "external";
            }
        } else {
            str = "facebook";
        }
        this.A04 = str;
        ViewOnClickListenerC31723DwS.A01(findViewById, 29, this);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2100814268);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A05;
        this.A00 = AbstractC31176DnK.A0Q(interfaceC09390do);
        C6WQ A0i = AbstractC31174DnI.A0i(requireActivity());
        this.A02 = A0i;
        AbstractC31176DnK.A13(requireContext(), A0i);
        AccountLinkModel accountLinkModel = (AccountLinkModel) requireArguments().getParcelable("ACCOUNT_MODEL_KEY");
        if (accountLinkModel == null) {
            C9GR.A0B(getActivity(), "account_is_null");
            AbstractC25226BEj.A1Q(this);
        } else {
            this.A01 = accountLinkModel;
        }
        this.A03 = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do);
        C0f9.A09(-1116375104, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-963675692);
        C14360o3.A0B(layoutInflater, 0);
        View A07 = AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.layout_links_action_bottomsheet_dialog, false);
        C0f9.A09(1072135586, A02);
        return A07;
    }
}
