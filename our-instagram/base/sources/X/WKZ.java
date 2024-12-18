package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class WKZ implements TextWatcher {
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        Locale locale;
        Object[] objArr;
        String valueOf;
        if (this instanceof C67755UxU) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ((C67755UxU) this).A00;
            Chip chip = chipTextInputComboView.A03;
            if (isEmpty) {
                str = "%02d";
                locale = chipTextInputComboView.getResources().getConfiguration().locale;
                objArr = new Object[1];
                valueOf = String.valueOf("00");
            } else {
                str = "%02d";
                locale = chipTextInputComboView.getResources().getConfiguration().locale;
                objArr = new Object[1];
                valueOf = String.valueOf(editable);
            }
            objArr[0] = AbstractC58319PtB.A0m(valueOf);
            chip.setText(String.format(locale, str, objArr));
            return;
        }
        if (!(this instanceof C67753UxS)) {
            return;
        }
        C67753UxS c67753UxS = (C67753UxS) this;
        C67777Uxt c67777Uxt = c67753UxS.A00;
        EditText editText = ((AbstractC69084Vha) c67777Uxt).A02.A0F;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (c67777Uxt.A04.isTouchExplorationEnabled() && autoCompleteTextView.getKeyListener() != null && !((AbstractC69084Vha) c67777Uxt).A01.hasFocus()) {
                autoCompleteTextView.dismissDropDown();
            }
            autoCompleteTextView.post(new RunnableC71466WuS(autoCompleteTextView, c67753UxS));
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1 == false) goto L8;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void beforeTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C67754UxT
            if (r0 == 0) goto L20
            r0 = r3
            X.UxT r0 = (X.C67754UxT) r0
            X.Uxr r0 = r0.A00
            com.google.android.material.internal.CheckableImageButton r2 = r0.A01
            com.google.android.material.textfield.TextInputLayout r0 = r0.A02
            android.widget.EditText r0 = r0.A0F
            if (r0 == 0) goto L1a
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r1 = r0 instanceof android.text.method.PasswordTransformationMethod
            r0 = 1
            if (r1 != 0) goto L1b
        L1a:
            r0 = 0
        L1b:
            r0 = r0 ^ 1
            r2.setChecked(r0)
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WKZ.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
