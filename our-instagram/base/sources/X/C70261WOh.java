package X;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* renamed from: X.WOh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70261WOh implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CheckBoxPreference A00;

    public C70261WOh(CheckBoxPreference checkBoxPreference) {
        this.A00 = checkBoxPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.A00.A0O(z);
    }
}
