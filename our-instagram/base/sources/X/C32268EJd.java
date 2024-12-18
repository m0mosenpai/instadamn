package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.Serializable;

/* renamed from: X.EJd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32268EJd extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiAgentPickerFragment";
    public C32064E6q A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (requireArguments().getBoolean("ai_agent_picker_is_modal", false)) {
            AbstractC31179DnN.A1G(interfaceC56362iU);
        }
        AbstractC31268Doq.A00(AbstractC31175DnJ.A0K(this.A02, 0));
        AbstractC31175DnJ.A1I(interfaceC56362iU, "");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return MSV.A00(430);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.ai_agent_picker_title);
        View findViewById2 = view.findViewById(R.id.ai_agent_picker_subtitle);
        View findViewById3 = view.findViewById(R.id.ai_agent_picker_bottom_button_layout);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.ai_agent_category_picker);
        AbstractC31174DnI.A17(requireContext(), recyclerView, false);
        C66362zD A0R = AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new EYL(new C57749Pjc(this, 47)));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(A0R);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.ai_agent_picker_grid);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2);
        recyclerView2.setLayoutManager(gridLayoutManager);
        recyclerView2.A0S = true;
        recyclerView2.setItemAnimator(null);
        C66392zG A0R2 = AbstractC31174DnI.A0R(this);
        A0R2.A01(new NF8(this, new C57749Pjc(this, 45)));
        C66362zD A0R3 = AbstractC31173DnH.A0R(A0R2, new EYZ(this, new C57749Pjc(this, 46)));
        recyclerView2.setAdapter(A0R3);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new D4x(viewLifecycleOwner, findViewById2, this, findViewById, gridLayoutManager, c07s, A0R3, findViewById3, A0R, null, 3), C07Y.A00(viewLifecycleOwner));
        C31267Dop c31267Dop = ((Dz9) this.A03.getValue()).A02;
        if (c31267Dop.A00() == C05F.A0N) {
            InterfaceC19610xo ARD = ((FF9) c31267Dop.A02.getValue()).A00.ARD();
            ARD.E77("picker_viewed_after_eligible", true);
            ARD.apply();
        }
    }

    public static final EnumC33519Ers A00(C32268EJd c32268EJd) {
        Serializable serializable;
        Bundle bundle = c32268EJd.mArguments;
        if (bundle != null) {
            serializable = bundle.getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        } else {
            serializable = null;
        }
        if (!(serializable instanceof EnumC33519Ers)) {
            return null;
        }
        return (EnumC33519Ers) serializable;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C32268EJd() {
        C37050GUg c37050GUg = new C37050GUg(this, 21);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37050GUg(new C37050GUg(this, 18), 19));
        this.A03 = AbstractC25225BEi.A0a(new C37050GUg(A00, 20), c37050GUg, new C50169MDw(26, A00, null), AbstractC25225BEi.A1D(Dz9.class));
        this.A01 = C37050GUg.A00(this, 17);
        this.A04 = C37050GUg.A00(this, 22);
        this.A02 = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 928483 && intent != null && intent.getBooleanExtra(AbstractC111324zv.A00(1595), false)) {
            AbstractC25231BEo.A16(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-257570632);
        super.onCreate(bundle);
        this.mLifecycleRegistry.A09((Dz9) this.A03.getValue());
        C0f9.A09(1901571182, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(545812301);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_ai_agent_picker, false);
        C0f9.A09(-470690901, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1894971729);
        super.onDestroy();
        C31600DuS.A00(AbstractC166987dD.A0r(this.A02), AbstractC166997dE.A0a()).A03();
        C0f9.A09(-1360944790, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1508288443);
        super.onResume();
        C31641Dv7 c31641Dv7 = C31600DuS.A00(AbstractC166987dD.A0r(this.A02), AbstractC166997dE.A0a()).A03;
        if (c31641Dv7 != null) {
            c31641Dv7.A08();
        }
        C0f9.A09(1976167221, A02);
    }
}
