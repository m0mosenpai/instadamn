package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.Calendar;

/* renamed from: X.Egn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33000Egn extends EHT implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "EnterAgeFragment";
    public EditText A00;
    public TextView A01;
    public NotificationBar A02;
    public ProgressButton A03;
    public TextView A04;
    public TextView A05;
    public final TextWatcher A06 = new Em2(this, 10);
    public final Runnable A07 = new RunnableC36851GLy(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "enter_age";
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(367901935);
        C35203Ffv.A00.A02(super.A00, super.A02, "add_age");
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reg_container);
        ViewGroup A05 = AbstractC31180DnO.A05(A0A);
        this.A02 = AbstractC31180DnO.A0S(A0A);
        layoutInflater.inflate(R.layout.nux_enter_age_fragment, A05, true);
        TextView A0e = AbstractC166987dD.A0e(A0A, R.id.field_detail);
        this.A05 = A0e;
        if (A0e != null) {
            AbstractC31177DnL.A10(A0e, this, DateUtils.formatDateTime(getRootActivity(), Calendar.getInstance().getTimeInMillis(), 24), 2131961862);
        }
        EditText editText = (EditText) A0A.findViewById(R.id.entered_age);
        this.A00 = editText;
        if (editText != null) {
            editText.addTextChangedListener(this.A06);
        }
        this.A01 = AbstractC166987dD.A0e(A0A, R.id.error);
        TextView A0e2 = AbstractC166987dD.A0e(A0A, R.id.add_birthday_link);
        this.A04 = A0e2;
        if (A0e2 != null) {
            ViewOnClickListenerC35667Fp2.A00(A0e2, 63, this);
        }
        ProgressButton progressButton = (ProgressButton) A0A.findViewById(R.id.next_button);
        this.A03 = progressButton;
        if (progressButton != null) {
            ViewOnClickListenerC35667Fp2.A00(progressButton, 64, this);
        }
        C0f9.A09(-523766988, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1374654636);
        super.onDestroyView();
        EditText editText = this.A00;
        if (editText != null) {
            editText.removeCallbacks(this.A07);
        }
        this.A03 = null;
        this.A05 = null;
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        this.A02 = null;
        C0f9.A09(1245554873, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1555630562);
        super.onResume();
        EditText editText = this.A00;
        if (editText != null) {
            editText.postDelayed(this.A07, 200L);
        }
        C0f9.A09(-1359973329, A02);
    }
}
