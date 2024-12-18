package androidx.preference;

import X.AbstractC65702TsY;
import X.AbstractC68645VZd;
import X.C66482UJh;
import X.C70263WOj;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.R;

/* loaded from: classes11.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final C70263WOj A02;

    /* JADX WARN: Multi-variable type inference failed */
    private void A00(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(((TwoStatePreference) this).A02);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.A01);
            switchCompat.setTextOff(this.A00);
            switchCompat.setOnCheckedChangeListener(this.A02);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.A02 = new C70263WOj(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC68645VZd.A0C, R.attr.switchPreferenceCompatStyle, 0);
        ((TwoStatePreference) this).A01 = AbstractC65702TsY.A0W(obtainStyledAttributes, 7, 0);
        if (((TwoStatePreference) this).A02) {
            A04();
        }
        ((TwoStatePreference) this).A00 = AbstractC65702TsY.A0W(obtainStyledAttributes, 6, 1);
        if (!((TwoStatePreference) this).A02) {
            A04();
        }
        this.A01 = AbstractC65702TsY.A0W(obtainStyledAttributes, 9, 3);
        A04();
        this.A00 = AbstractC65702TsY.A0W(obtainStyledAttributes, 8, 4);
        A04();
        ((TwoStatePreference) this).A03 = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void A0B(View view) {
        super.A0B(view);
        if (((AccessibilityManager) this.A0a.getSystemService("accessibility")).isEnabled()) {
            A00(view.findViewById(R.id.switchWidget));
            A0N(view.findViewById(android.R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public final void A0D(C66482UJh c66482UJh) {
        super.A0D(c66482UJh);
        A00(c66482UJh.A00(R.id.switchWidget));
        A0N(c66482UJh.A00(android.R.id.summary));
    }
}
