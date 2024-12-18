package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.facebook.R;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;

/* loaded from: classes11.dex */
public final class V02 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SetReminderBottomSheetFragment";
    public int A00;
    public long A01;
    public C69091Vhh A02;
    public boolean A03 = true;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "limited_interactions_set_reminder_bottom_sheet";
    }

    public static final String[] A00(V02 v02) {
        Context requireContext;
        int i;
        int i2 = v02.A00;
        String[] strArr = new String[2];
        Context requireContext2 = v02.requireContext();
        if (i2 == 1) {
            strArr[0] = requireContext2.getString(2131965144);
            requireContext = v02.requireContext();
            i = 2131965149;
        } else {
            strArr[0] = requireContext2.getString(2131965145);
            requireContext = v02.requireContext();
            i = 2131965150;
        }
        strArr[1] = requireContext.getString(i);
        return strArr;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A04.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1833335897);
        super.onCreate(bundle);
        this.A01 = requireArguments().getLong("LimitedSettingsFragment.REMINDER_DATE");
        C0f9.A09(1705304956, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int A02 = C0f9.A02(-189145044);
        C14360o3.A0B(layoutInflater, 0);
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.set_reminder_bottom_sheet, false);
        View A0S = AbstractC166997dE.A0S(A0C, R.id.reminder_action_button);
        AbstractC56952jT.A01(A0S);
        WNS.A00(A0S, 35, this);
        A0S.setEnabled(true);
        NumberPicker numberPicker = (NumberPicker) AbstractC166997dE.A0R(A0C, R.id.units_picker);
        NumberPicker numberPicker2 = (NumberPicker) AbstractC166997dE.A0R(A0C, R.id.duration_picker);
        long A03 = this.A01 - AbstractC50524MSc.A03();
        long j = A03 / 604800;
        if (((float) j) > 0.0f) {
            this.A03 = false;
            i = (int) Math.ceil(j);
        } else {
            i = (int) (A03 / SandboxRepository.CACHE_TTL);
        }
        this.A00 = i;
        boolean z = this.A03;
        numberPicker.setDisplayedValues(null);
        int i3 = 4;
        if (z) {
            i3 = 6;
        }
        int i4 = 0;
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(i3 - 1);
        String[] strArr = new String[i3];
        do {
            i2 = i4 + 1;
            strArr[i4] = String.valueOf(i2);
            i4 = i2;
        } while (i2 < i3);
        numberPicker.setDisplayedValues(strArr);
        numberPicker.setValue(Math.max(this.A00 - 1, 0));
        numberPicker.setOnValueChangedListener(new WP2(3, numberPicker2, this));
        numberPicker.setWrapSelectorWheel(false);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(1);
        numberPicker2.setDisplayedValues(A00(this));
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker2.setValue(!this.A03 ? 1 : 0);
        numberPicker2.setOnValueChangedListener(new WP0(2, numberPicker, numberPicker2, this));
        C0f9.A09(-1642741927, A02);
        return A0C;
    }
}
