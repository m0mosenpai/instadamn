package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.Ego, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33001Ego extends EHT implements InterfaceC11380iw, InterfaceC60072op {
    public static final String __redex_internal_original_name = "AddBirthdayFragment";
    public int A00;
    public int A01;
    public int A02;
    public DatePicker A03;
    public TextView A04;
    public NotificationBar A05;
    public ProgressButton A06;
    public TextView A08;
    public TextView A09;
    public boolean A07 = false;
    public final DatePicker.OnDateChangedListener A0A = new C35746Fqe(this, 0);
    public final C1P1 A0B = new C32539EUp(this, 23);

    public static void A00(C33001Ego c33001Ego) {
        C35230FgN.A02(C1Q9.A07.A02(((EHT) c33001Ego).A00), ((EHT) c33001Ego).A02, EnumC31713DwI.A0e);
        C140966Yy A0N = AbstractC31177DnL.A0N(c33001Ego.requireActivity(), ((EHT) c33001Ego).A00);
        RegFlowExtras regFlowExtras = ((EHT) c33001Ego).A01;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        AbstractC31173DnH.A1B(A0b);
        AbstractC31176DnK.A1A(A0b, new C33000Egn(), A0N);
    }

    public static void A01(C33001Ego c33001Ego) {
        String A0w;
        int A00 = AbstractC35175FfS.A00(c33001Ego.A02, c33001Ego.A01, c33001Ego.A00);
        TextView textView = c33001Ego.A09;
        if (textView != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(c33001Ego.A02, c33001Ego.A01, c33001Ego.A00);
            textView.setText(DateFormat.getDateInstance(1, C1Q2.A02()).format(calendar.getTime()));
            c33001Ego.A09.setHint((CharSequence) null);
        }
        TextView textView2 = c33001Ego.A08;
        if (textView2 != null) {
            textView2.setVisibility(0);
            TextView textView3 = c33001Ego.A08;
            if (A00 == 1) {
                A0w = c33001Ego.getString(2131952278);
            } else {
                A0w = AbstractC31174DnI.A0w(c33001Ego, Integer.valueOf(A00), 2131952275);
            }
            textView3.setText(A0w);
            Context requireContext = c33001Ego.requireContext();
            int i = R.attr.igds_color_secondary_text;
            if (A00 <= 4) {
                i = R.attr.igds_color_error_or_destructive;
            }
            int A0H = AbstractC53242c7.A0H(requireContext, i);
            TextView textView4 = c33001Ego.A08;
            Activity rootActivity = c33001Ego.getRootActivity();
            rootActivity.getClass();
            AbstractC166987dD.A1O(rootActivity, textView4, A0H);
        }
        C19280xC A002 = C19280xC.A00(c33001Ego, "dob_picker_scrolled");
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(c33001Ego.A02, c33001Ego.A01, c33001Ego.A00);
        A002.A0C("to_date", new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(calendar2.getTime()));
        AbstractC31173DnH.A1S(A002, ((EHT) c33001Ego).A00);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A01(super.A00, super.A02, "enter_birthday");
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "add_birthday";
    }

    @Override // X.EHT, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1274438222);
        super.onCreate(bundle);
        Calendar calendar = Calendar.getInstance();
        this.A02 = calendar.get(1) - 1;
        this.A01 = calendar.get(2);
        this.A00 = AbstractC31173DnH.A05(calendar);
        C0f9.A09(-130713762, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(519179889);
        C35203Ffv.A00.A02(super.A00, super.A02, "enter_birthday");
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reg_container);
        ViewGroup A0F = AbstractC31173DnH.A0F(A0A, R.id.content_container);
        this.A05 = (NotificationBar) A0A.requireViewById(R.id.notification_bar);
        layoutInflater.inflate(R.layout.nux_add_birthday_fragment, A0F, true);
        this.A08 = AbstractC166997dE.A0T(A0A, R.id.calculated_age);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.date_of_birth);
        this.A09 = A0T;
        if (A0T != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(this.A02, this.A01, this.A00);
            A0T.setHint(DateFormat.getDateInstance(1, C1Q2.A02()).format(calendar.getTime()));
        }
        TextView A0T2 = AbstractC166997dE.A0T(A0A, R.id.add_age_link);
        this.A04 = A0T2;
        if (A0T2 != null) {
            ViewOnClickListenerC35667Fp2.A00(A0T2, 29, this);
        }
        ProgressButton A0U = AbstractC31180DnO.A0U(A0A);
        this.A06 = A0U;
        ViewOnClickListenerC35667Fp2.A00(A0U, 30, this);
        DatePicker datePicker = (DatePicker) A0A.requireViewById(R.id.birthday_date_picker);
        this.A03 = datePicker;
        datePicker.init(this.A02, this.A01, this.A00, this.A0A);
        this.A03.setMaxDate(Calendar.getInstance().getTimeInMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(1, -150);
        this.A03.setMinDate(calendar2.getTimeInMillis());
        if (Calendar.getInstance().get(1) - this.A02 != 1) {
            A01(this);
        }
        View requireViewById = A0A.requireViewById(R.id.field_detail_link);
        AbstractC56952jT.A01(requireViewById);
        ViewOnClickListenerC35667Fp2.A00(requireViewById, 31, this);
        C0f9.A09(-500045565, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-95512604);
        super.onDestroyView();
        this.A03 = null;
        this.A09 = null;
        this.A08 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        C0f9.A09(-433202099, A02);
    }
}
