package androidx.preference;

import X.C66482UJh;
import X.C70262WOi;
import android.R;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

/* loaded from: classes11.dex */
public class SwitchPreference extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final C70262WOi A02;

    /* JADX WARN: Multi-variable type inference failed */
    private void A00(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(((TwoStatePreference) this).A02);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.A01);
            r4.setTextOff(this.A00);
            r4.setOnCheckedChangeListener(this.A02);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchPreference(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r1 = 2130971330(0x7f040ac2, float:1.7551395E38)
            r0 = 16843629(0x101036d, float:2.3696016E-38)
            int r1 = X.AbstractC63040SbG.A00(r5, r1, r0)
            r3 = 0
            r4.<init>(r5, r6, r1)
            X.WOi r0 = new X.WOi
            r0.<init>(r4)
            r4.A02 = r0
            int[] r0 = X.AbstractC68645VZd.A0B
            android.content.res.TypedArray r2 = r5.obtainStyledAttributes(r6, r0, r1, r3)
            r0 = 7
            java.lang.String r0 = X.AbstractC65702TsY.A0W(r2, r0, r3)
            r4.A01 = r0
            boolean r0 = r4.A02
            if (r0 == 0) goto L29
            r4.A04()
        L29:
            r1 = 6
            r0 = 1
            java.lang.String r0 = X.AbstractC65702TsY.A0W(r2, r1, r0)
            r4.A00 = r0
            boolean r0 = r4.A02
            if (r0 != 0) goto L38
            r4.A04()
        L38:
            r1 = 9
            r0 = 3
            java.lang.String r0 = X.AbstractC65702TsY.A0W(r2, r1, r0)
            r4.A01 = r0
            r4.A04()
            r1 = 8
            r0 = 4
            java.lang.String r0 = X.AbstractC65702TsY.A0W(r2, r1, r0)
            r4.A00 = r0
            r4.A04()
            r1 = 5
            r0 = 2
            boolean r0 = r2.getBoolean(r0, r3)
            boolean r0 = r2.getBoolean(r1, r0)
            r4.A03 = r0
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final void A0B(View view) {
        super.A0B(view);
        if (((AccessibilityManager) this.A0a.getSystemService("accessibility")).isEnabled()) {
            A00(view.findViewById(R.id.switch_widget));
            A0N(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public final void A0D(C66482UJh c66482UJh) {
        super.A0D(c66482UJh);
        A00(c66482UJh.A00(R.id.switch_widget));
        A0N(c66482UJh.A00(R.id.summary));
    }
}
