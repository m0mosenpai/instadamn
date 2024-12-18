package X;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* loaded from: classes11.dex */
public final class UG8 extends AbstractDialogInterfaceOnClickListenerC66385UEt {
    public EditText A01;
    public CharSequence A02;
    public final Runnable A03 = new RunnableC71224WqF(this);
    public long A00 = -1;

    public final void A0I() {
        long j = this.A00;
        if (j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.A01;
            if (editText != null && editText.isFocused() && !((InputMethodManager) this.A01.getContext().getSystemService("input_method")).showSoftInput(this.A01, 0)) {
                EditText editText2 = this.A01;
                Runnable runnable = this.A03;
                editText2.removeCallbacks(runnable);
                this.A01.postDelayed(runnable, 50L);
                return;
            }
            this.A00 = -1L;
        }
    }

    @Override // X.AbstractDialogInterfaceOnClickListenerC66385UEt
    public final void A0H(View view) {
        super.A0H(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.A01 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.A01.setText(this.A02);
            AbstractC167017dG.A18(this.A01);
            A0G();
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // X.AbstractDialogInterfaceOnClickListenerC66385UEt, X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        int A02 = C0f9.A02(-418290087);
        super.onCreate(bundle);
        if (bundle == null) {
            charSequence = ((EditTextPreference) A0G()).A00;
        } else {
            charSequence = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
        this.A02 = charSequence;
        C0f9.A09(88618178, A02);
    }

    @Override // X.AbstractDialogInterfaceOnClickListenerC66385UEt, X.C0SG, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.A02);
    }
}
