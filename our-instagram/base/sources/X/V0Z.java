package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V0Z extends AbstractC59962oe implements InterfaceC60122ou, XAF {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceMinAgePickerBottomSheetFragment";
    public NumberPicker A00;
    public PromoteData A01;
    public PromoteState A02;
    public UserSession A03;
    public String A04;
    public FRW A05;
    public final InterfaceC09390do A06 = X55.A00(this, 47);

    @Override // X.XAF
    public final void Dc7(PromoteState promoteState, Integer num) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970520);
        FRW frw = new FRW(requireContext(), interfaceC56362iU);
        this.A05 = frw;
        WNT.A01(frw, C05F.A1F, this, 40);
        FRW frw2 = this.A05;
        if (frw2 == null) {
            C14360o3.A0F("actionBarButtonController");
            throw C00O.createAndThrow();
        }
        frw2.A01(true);
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
            NumberPicker numberPicker2 = this.A00;
            if (numberPicker2 != null) {
                numberPicker2.setMaxValue(25);
                NumberPicker numberPicker3 = this.A00;
                if (numberPicker3 != null) {
                    numberPicker3.setWrapSelectorWheel(false);
                    return;
                }
            }
        }
        C14360o3.A0F("agePicker");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A03;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1957344299);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A04 = bundle2.getString("screen");
        }
        this.A01 = InterfaceC72021XFj.A00(this);
        PromoteState A00 = XFZ.A00(this);
        this.A02 = A00;
        A00.A0A(this);
        PromoteData promoteData = this.A01;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        this.A03 = promoteData.A0y;
        C0f9.A09(-1115287989, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1834188320);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_min_age_picker_bottom_sheet_view, viewGroup, false);
        C0f9.A09(1491994967, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1433816511);
        super.onDestroyView();
        PromoteState promoteState = this.A02;
        if (promoteState == null) {
            C14360o3.A0F("promoteState");
            throw C00O.createAndThrow();
        }
        promoteState.A0B(this);
        C0f9.A09(1320149050, A02);
    }
}
