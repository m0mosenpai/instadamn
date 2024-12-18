package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes6.dex */
public final class EJW extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SuggestedBlocksFragment";
    public RecyclerView A00;
    public C66362zD A01;
    public IgdsBottomButtonLayout A02;
    public SpinnerImageView A03;
    public C35155Fex A04;
    public C34947FaX A05;
    public final C34708FQt A0A = new C34708FQt(this);
    public final C31714DwJ A07 = new C31714DwJ(this, 14);
    public final View.OnClickListener A06 = ViewOnClickListenerC35682FpH.A00(this, 40);
    public final View.OnClickListener A09 = ViewOnClickListenerC35682FpH.A00(this, 39);
    public final InterfaceC37219GaU A0B = new C36765GIo(this, 5);
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131974871);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "suggested_blocks_list";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = (SpinnerImageView) view.requireViewById(R.id.suggested_blocks_loading_spinner);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.suggested_blocks_list_recyclerview);
        this.A00 = A0G;
        if (A0G != null) {
            AbstractC31177DnL.A0s(requireContext(), A0G);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.A01);
        }
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.suggested_blocks_block_all_button_view);
        this.A02 = A0j;
        if (A0j != null) {
            A0j.setPrimaryActionOnClickListener(this.A09);
        }
        AbstractC167007dF.A0x(this.A02);
        SpinnerImageView spinnerImageView = this.A03;
        if (spinnerImageView != null) {
            AbstractC31171DnF.A1M(spinnerImageView);
        }
        SpinnerImageView spinnerImageView2 = this.A03;
        if (spinnerImageView2 != null) {
            C0fQ.A00(null, spinnerImageView2);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1889706709);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A08;
        FOI foi = new FOI(requireContext, this, EnumC33486ErL.SUGGESTED_BLOCKS, this, AbstractC166987dD.A0r(interfaceC09390do), this.A0B, "suggested_blocks_list_user_row", "suggested_blocks_accounts_list", "suggested_blocks_accounts_list");
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        A0R.A01(new Object());
        this.A01 = AbstractC31173DnH.A0R(A0R, new EXV(requireContext(), this, foi));
        C35155Fex c35155Fex = new C35155Fex(requireContext(), this, AbstractC166987dD.A0r(interfaceC09390do), this.A0A);
        this.A04 = c35155Fex;
        c35155Fex.A02();
        C0f9.A09(16716229, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1141484674);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.suggested_blocks_fragment, false);
        C0f9.A09(-1157226582, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(639509479);
        super.onPause();
        C35155Fex c35155Fex = this.A04;
        if (c35155Fex != null) {
            c35155Fex.A09.A00 = null;
        }
        C0f9.A09(-1864911703, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1028821955);
        super.onResume();
        C35155Fex c35155Fex = this.A04;
        if (c35155Fex != null) {
            C34947FaX c34947FaX = c35155Fex.A09;
            C34483FHv c34483FHv = c35155Fex.A08;
            C14360o3.A0B(c34483FHv, 0);
            c34947FaX.A00 = c34483FHv;
            C34708FQt c34708FQt = c35155Fex.A0A;
            c34708FQt.A00(c35155Fex.A00);
            if (c35155Fex.A00 == 1) {
                c34708FQt.A01(C35155Fex.A00(c35155Fex, AbstractC31173DnH.A0L(c34947FaX.A01)));
            }
        }
        C0f9.A09(-1544359390, A02);
    }
}
