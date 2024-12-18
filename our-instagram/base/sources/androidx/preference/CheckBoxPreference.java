package androidx.preference;

import X.C66482UJh;
import X.C70261WOh;
import android.R;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* loaded from: classes11.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final C70261WOh A00;

    /* JADX WARN: Multi-variable type inference failed */
    private void A00(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(((TwoStatePreference) this).A02);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.A00);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CheckBoxPreference(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r1 = 2130969007(0x7f0401af, float:1.7546684E38)
            r0 = 16842895(0x101008f, float:2.369396E-38)
            int r1 = X.AbstractC63040SbG.A00(r5, r1, r0)
            r3 = 0
            r4.<init>(r5, r6, r1)
            X.WOh r0 = new X.WOh
            r0.<init>(r4)
            r4.A00 = r0
            int[] r0 = X.AbstractC68645VZd.A01
            android.content.res.TypedArray r2 = r5.obtainStyledAttributes(r6, r0, r1, r3)
            r0 = 5
            java.lang.String r0 = X.AbstractC65702TsY.A0W(r2, r0, r3)
            r4.A01 = r0
            boolean r0 = r4.A02
            if (r0 == 0) goto L29
            r4.A04()
        L29:
            r1 = 4
            r0 = 1
            java.lang.String r0 = X.AbstractC65702TsY.A0W(r2, r1, r0)
            r4.A00 = r0
            boolean r0 = r4.A02
            if (r0 != 0) goto L38
            r4.A04()
        L38:
            r1 = 3
            r0 = 2
            boolean r0 = r2.getBoolean(r0, r3)
            boolean r0 = r2.getBoolean(r1, r0)
            r4.A03 = r0
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final void A0B(View view) {
        super.A0B(view);
        if (((AccessibilityManager) this.A0a.getSystemService("accessibility")).isEnabled()) {
            A00(view.findViewById(R.id.checkbox));
            A0N(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public final void A0D(C66482UJh c66482UJh) {
        super.A0D(c66482UJh);
        A00(c66482UJh.A00(R.id.checkbox));
        A0N(c66482UJh.A00(R.id.summary));
    }
}
