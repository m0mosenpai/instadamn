package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;

/* renamed from: X.N4v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52122N4v extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "LimitsPlusWhenReminderBottomSheetFragment";
    public NumberPicker A00;
    public NumberPicker A01;
    public N7N A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "limits_plus_set_reminder_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        int i;
        Object value;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C50984Mfr c50984Mfr = (C50984Mfr) this.A04.getValue();
        O6H o6h = new O6H(this);
        long A0t = AbstractC25232BEp.A0t((Number) AbstractC50523MSb.A0C(c50984Mfr.A01.A01).A04);
        c50984Mfr.A00 = o6h;
        N7N n7n = o6h.A00.A02;
        if (n7n != null) {
            n7n.A00 = A0t;
        }
        long A03 = A0t - AbstractC50524MSc.A03();
        long j = A03 / 604800;
        float f = (float) j;
        if (f > 0.0f) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        if (f > 0.0f) {
            i = (int) Math.ceil(j);
        } else {
            i = (int) (A03 / SandboxRepository.CACHE_TTL);
        }
        C05A c05a = c50984Mfr.A03;
        do {
            value = c05a.getValue();
            C14360o3.A0B(num, 0);
        } while (!c05a.AIi(value, new C51599Mqr(num, i, A0t)));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57168PZm(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 31), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(C52122N4v c52122N4v, Integer num, boolean z) {
        int i;
        NumberPicker numberPicker = c52122N4v.A01;
        if (numberPicker != null) {
            numberPicker.setDisplayedValues(null);
            int i2 = 4;
            if (num == C05F.A00) {
                i2 = 6;
            }
            NumberPicker numberPicker2 = c52122N4v.A01;
            if (numberPicker2 != null) {
                int i3 = 0;
                numberPicker2.setMinValue(0);
                NumberPicker numberPicker3 = c52122N4v.A01;
                if (numberPicker3 != null) {
                    numberPicker3.setMaxValue(i2 - 1);
                    NumberPicker numberPicker4 = c52122N4v.A01;
                    if (numberPicker4 != null) {
                        String[] strArr = new String[i2];
                        do {
                            i = i3 + 1;
                            strArr[i3] = String.valueOf(i);
                            i3 = i;
                        } while (i < i2);
                        numberPicker4.setDisplayedValues(strArr);
                        if (z) {
                            C50984Mfr c50984Mfr = (C50984Mfr) c52122N4v.A04.getValue();
                            NumberPicker numberPicker5 = c52122N4v.A01;
                            if (numberPicker5 != null) {
                                c50984Mfr.A01(numberPicker5.getValue() + 1);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F("unitsPicker");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C52122N4v() {
        C57511Pfl c57511Pfl = new C57511Pfl(this, 18);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57511Pfl(new C57511Pfl(this, 15), 16));
        this.A04 = AbstractC25225BEi.A0a(new C57511Pfl(A00, 17), c57511Pfl, new C29895DGj(2, null, A00), AbstractC25225BEi.A1D(C50984Mfr.class));
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1422068239);
        super.onCreate(bundle);
        C0f9.A09(-1324753542, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1352838058);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.limits_plus_reminder_bottomsheet_layout, viewGroup, false);
        TextView A0Q = AbstractC25230BEn.A0Q(inflate, R.id.reminder_sub_text);
        if (AbstractC166997dE.A0c(C06090Tz.A05, AbstractC166987dD.A0o(this.A03), 36326219209258745L).booleanValue()) {
            AbstractC25227BEk.A12(A0Q, this, 2131965209);
        }
        this.A01 = (NumberPicker) inflate.requireViewById(R.id.units_picker);
        this.A00 = (NumberPicker) inflate.requireViewById(R.id.duration_picker);
        C0f9.A09(-1606366681, A02);
        return inflate;
    }
}
