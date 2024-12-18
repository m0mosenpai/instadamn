package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.EKr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32304EKr extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AccountLinkingIGPCToACUpsellFragment";
    public C2049995m A00;
    public FQ8 A01;
    public UserSession A02;
    public boolean A03;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkF(true);
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.setTitle(requireActivity().getString(2131952070));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "account_linking_igpc_to_ac_upsell";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        UserSession userSession = this.A02;
        String obj = EnumC72430Xda.A03.toString();
        boolean A1a = AbstractC167017dG.A1a(userSession, obj);
        C35191Ffj.A00(userSession, "linking_prescreen_xout_clicked", obj);
        AbstractC25226BEj.A1P(this);
        return A1a;
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        AbstractC10360h2 parentFragmentManager;
        String str;
        super.afterOnResume();
        FQ8 fq8 = this.A01;
        if (fq8.A01) {
            parentFragmentManager = getParentFragmentManager();
            str = AbstractC111324zv.A00(1858);
        } else {
            if (!fq8.A00) {
                return;
            }
            boolean z = this.A03;
            parentFragmentManager = getParentFragmentManager();
            if (z) {
                str = "AccountLinkingMainGroupManagementFragment.BACK_STACK_STATE_NAME";
            } else {
                str = "AccountLinkingChildGroupManagementFragment.BACK_STACK_STATE_NAME";
            }
        }
        parentFragmentManager.A0x(str, 0);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-138460773);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A02 = A0S;
        this.A00 = C2049995m.A01(A0S);
        this.A03 = requireArguments.getBoolean("is_parent_account");
        this.A01 = new FQ8(this.A02);
        C0f9.A09(-2121905841, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String username;
        String username2;
        List list;
        int A02 = C0f9.A02(-785406218);
        View inflate = layoutInflater.inflate(R.layout.account_linking_setup_igpc_to_ac_upsell_fragment, viewGroup, false);
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(inflate, R.id.igpc_to_ac_upsell_title_textview);
        A0Q.A02 = true;
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.continue_linking_button);
        User A10 = AbstractC166987dD.A10(this.A02);
        User user = null;
        AccountFamily A0H = AbstractC31176DnK.A0H(C2049995m.A01(this.A02), this.A02);
        if (A0H != null) {
            if (this.A00.A07(A10.getId())) {
                list = A0H.A03;
            } else {
                list = A0H.A04;
            }
            if (!list.isEmpty()) {
                user = (User) list.get(0);
            }
        }
        user.getClass();
        if (this.A00.A07(A10.getId())) {
            username = A10.getUsername();
            username2 = user.getUsername();
        } else {
            username = user.getUsername();
            username2 = A10.getUsername();
        }
        A0Q.setBody(AbstractC07900bA.A01(AbstractC166997dE.A0N(this), new String[]{username, username2}, 2131952078));
        progressButton.setText(AbstractC166997dE.A0N(this).getString(2131952082));
        A0Q.setHeadline(AbstractC166997dE.A0N(this).getString(2131952081));
        this.A00.A04(this.A02);
        ViewOnClickListenerC35683FpI.A00(progressButton, 1, this, user);
        Fp1.A00(inflate.requireViewById(R.id.not_now_button), 3, this);
        UserSession userSession = this.A02;
        String obj = EnumC72430Xda.A03.toString();
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(obj, 1);
        C35191Ffj.A01(userSession, "linking_prescreen_screen_shown", obj, null);
        UserSession userSession2 = this.A02;
        C14360o3.A0B(userSession2, 1);
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint = XFBFXIGPCEntryPoint.A06;
        try {
            C25621Ms A0c = AbstractC167017dG.A0c(userSession2);
            A0c.A03();
            A0c.A0B("api/v1/fxcal/igpc_update_upsell_timestamp/");
            A0c.A0P(null, EA8.class, FS8.class, false);
            C1ON A0T = AbstractC31172DnG.A0T(A0c, "upsell_entrypoint", xFBFXIGPCEntryPoint.A00);
            C14360o3.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FXCALIGPCUpsellResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FXCALIGPCUpsellResponse>>");
            C1GJ.A03(A0T);
        } catch (Exception e) {
            String obj2 = xFBFXIGPCEntryPoint.toString();
            String A0z = AbstractC166997dE.A0z("Failed to update IGPC Upsell timestamp! \n%s", AbstractC166997dE.A1b(e.getMessage(), 1));
            AbstractC167017dG.A1N(userSession2, obj2);
            C35191Ffj.A01(userSession2, "generic_error", obj2, A0z);
        }
        C0f9.A09(-58505277, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1960784976);
        super.onResume();
        C0f9.A09(-1805290785, A02);
    }
}
