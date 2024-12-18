package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* loaded from: classes8.dex */
public final class KCG extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteLeadGenCtaSelectionFragment";
    public IgdsBottomButtonLayout A00;
    public IgRadioGroup A01;
    public AnonymousClass195 A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970757);
        interfaceC56362iU.Ehd(new C3LY(AbstractC31174DnI.A0K()));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_lead_gen_cta_selection";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A04;
        C44504JmA c44504JmA = (C44504JmA) interfaceC09390do.getValue();
        AbstractC43592JPx.A1Q(c44504JmA.A01, c44504JmA.A05, "lead_gen_cta_selection", "cta_selection_impression", "impression");
        AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((C44504JmA) interfaceC09390do.getValue()).A00, new C50259MHo(this, 49), 11);
        AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((AbstractC51032Mgg) this.A03.getValue()).A00, new C50368MLv(this, 0), 11);
        IgRadioGroup igRadioGroup = (IgRadioGroup) view.requireViewById(R.id.lead_gen_cta_option_group);
        for (XIGIGBoostCallToAction xIGIGBoostCallToAction : AbstractC16960so.A1Q(XIGIGBoostCallToAction.A05, XIGIGBoostCallToAction.A0L, XIGIGBoostCallToAction.A0I, XIGIGBoostCallToAction.A0Q, XIGIGBoostCallToAction.A0R)) {
            C66359UCf c66359UCf = new C66359UCf(requireActivity());
            c66359UCf.setTag(xIGIGBoostCallToAction);
            c66359UCf.setPrimaryText(AbstractC25227BEk.A0v(this, W6g.A00(xIGIGBoostCallToAction)));
            igRadioGroup.addView(c66359UCf);
        }
        igRadioGroup.A02 = new C71085Wnh(this, 2);
        this.A01 = igRadioGroup;
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.bottom_button_layout);
        this.A00 = A0j;
        if (A0j != null) {
            A0j.setPrimaryAction(getString(2131964935), new ViewOnClickListenerC48064LPp(this, 38));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return ((C44504JmA) this.A04.getValue()).A04;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C44504JmA c44504JmA = (C44504JmA) this.A04.getValue();
        AbstractC43592JPx.A1Q(c44504JmA.A01, c44504JmA.A05, "lead_gen_cta_selection", "cancel", "click");
        C51748MtX c51748MtX = (C51748MtX) ((AbstractC51032Mgg) this.A03.getValue()).A00.A02();
        if (c51748MtX != null && c51748MtX.A03) {
            return true;
        }
        AbstractC25226BEj.A1P(this);
        return true;
    }

    public KCG() {
        X2v x2v = new X2v(this, 30);
        X2v x2v2 = new X2v(this, 24);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new X2v(x2v2, 25));
        this.A04 = AbstractC25225BEi.A0a(new X2v(A00, 26), x2v, new C57253Pbb(35, null, A00), AbstractC25225BEi.A1D(C44504JmA.class));
        X2v x2v3 = new X2v(this, 23);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new X2v(new X2v(this, 27), 28));
        this.A03 = AbstractC25225BEi.A0a(new X2v(A002, 29), x2v3, new C57253Pbb(36, null, A002), AbstractC25225BEi.A1D(C52590NOl.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1796017619);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_cta_selection, viewGroup, false);
        C0f9.A09(2107172525, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2108863102);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        C0f9.A09(-1407791894, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1556276316);
        super.onStart();
        this.A02 = AbstractC18560vj.A03(AbstractC25229BEm.A0a(this), new C15340po(new MC5(this, null, 35), ((AbstractC51032Mgg) this.A03.getValue()).A03));
        C0f9.A09(2055178168, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1825516099);
        super.onStop();
        AnonymousClass195 anonymousClass195 = this.A02;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A02 = null;
        C0f9.A09(1618147064, A02);
    }
}
