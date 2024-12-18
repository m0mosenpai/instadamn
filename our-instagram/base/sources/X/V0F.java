package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V0F extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceMinAgePickerBottomSheetFragmentV2";
    public NumberPicker A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01 = X55.A00(this, 48);
    public final InterfaceC09390do A03 = new C60842q8(new X55(this, 49), new X2v(this, 0), new C57253Pbb(31, null, this), new C0YZ(UFT.class));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970520);
        FRW frw = new FRW(requireContext(), interfaceC56362iU);
        WNT.A01(frw, C05F.A1F, this, 41);
        frw.A01(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_create_audience_min_age_picker_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        NumberPicker numberPicker = (NumberPicker) view.requireViewById(R.id.min_age_picker);
        this.A00 = numberPicker;
        if (numberPicker != null) {
            numberPicker.setMinValue(18);
        }
        NumberPicker numberPicker2 = this.A00;
        if (numberPicker2 != null) {
            numberPicker2.setMaxValue(25);
        }
        NumberPicker numberPicker3 = this.A00;
        if (numberPicker3 != null) {
            numberPicker3.setWrapSelectorWheel(false);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A02.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1500332521);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_min_age_picker_bottom_sheet_view, viewGroup, false);
        C0f9.A09(-1259388710, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1391601517);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(-2027353572, A02);
    }
}
