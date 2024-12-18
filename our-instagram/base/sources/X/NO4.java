package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class NO4 extends AbstractC50822Mcy {
    public final IgTextView A00;
    public final RadioGroup A01;
    public final IgTextView A02;

    public NO4(Context context) {
        super(context, null, 0);
        View.inflate(context, R.layout.lead_gen_view_form_multiple_choice, this);
        this.A02 = AbstractC31172DnG.A0X(this, R.id.label_text_view);
        this.A00 = AbstractC31172DnG.A0X(this, R.id.multiple_choice_error_text_view);
        this.A01 = (RadioGroup) requireViewById(R.id.multiple_choice_options);
    }

    @Override // X.AbstractC50822Mcy
    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        CompoundButton compoundButton;
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        this.A02.setText(leadGenFormBaseQuestion.A0A);
        ((AbstractC50822Mcy) this).A04 = z3;
        RadioGroup radioGroup = this.A01;
        radioGroup.removeAllViews();
        Iterator it = leadGenFormBaseQuestion.A0D.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            View inflate = AbstractC25228BEl.A0P(this).inflate(R.layout.lead_gen_view_form_multiple_choice_option, (ViewGroup) radioGroup, false);
            if ((inflate instanceof IgdsRadioButton) && (compoundButton = (CompoundButton) inflate) != null) {
                compoundButton.setText(A1B);
                if (C14360o3.A0K(A1B, leadGenFormBaseQuestion.A00)) {
                    compoundButton.setChecked(true);
                }
                compoundButton.setOnCheckedChangeListener(new C55517OlA(leadGenFormBaseQuestion, this, A1B, 0));
                radioGroup.addView(compoundButton);
            }
        }
    }
}
