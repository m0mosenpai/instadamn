package X;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UBR extends FrameLayout {
    public RadioButton A00;

    public UBR(Context context) {
        super(context, null, 0);
        addView(LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_right_add_on_radio_button, (ViewGroup) this, false));
        RadioButton radioButton = (RadioButton) findViewById(R.id.list_cell_right_add_on_radio_button);
        this.A00 = radioButton;
        if (radioButton != null) {
            VET vet = VET.A0U;
            VET vet2 = VET.A0T;
            StateListDrawable stateListDrawable = new StateListDrawable();
            int[] iArr = {android.R.attr.state_checked};
            W5t A0A = C2FP.A0A();
            int i = vet.A00;
            int i2 = vet.A01;
            Context A0L = AbstractC166997dE.A0L(radioButton);
            stateListDrawable.addState(iArr, A0A.A04(A0L, i, i2));
            stateListDrawable.addState(new int[]{android.R.attr.state_focused}, C2FP.A0A().A04(A0L, i, i2));
            stateListDrawable.addState(new int[0], C2FP.A0A().A04(A0L, vet2.A00, vet2.A01));
            radioButton.setButtonDrawable(stateListDrawable);
            RadioButton radioButton2 = this.A00;
            if (radioButton2 != null) {
                radioButton2.setEnabled(false);
                RadioButton radioButton3 = this.A00;
                if (radioButton3 != null) {
                    radioButton3.setClickable(false);
                    RadioButton radioButton4 = this.A00;
                    if (radioButton4 != null) {
                        radioButton4.setImportantForAccessibility(2);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("radioButton");
        throw C00O.createAndThrow();
    }

    public final void A00() {
        RadioButton radioButton = this.A00;
        if (radioButton == null) {
            C14360o3.A0F("radioButton");
            throw C00O.createAndThrow();
        }
        radioButton.toggle();
    }

    public final void setChecked(boolean z) {
        RadioButton radioButton = this.A00;
        if (radioButton == null) {
            C14360o3.A0F("radioButton");
            throw C00O.createAndThrow();
        }
        radioButton.setChecked(z);
    }
}
