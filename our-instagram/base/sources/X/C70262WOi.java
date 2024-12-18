package X;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* renamed from: X.WOi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70262WOi implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SwitchPreference A00;

    public C70262WOi(SwitchPreference switchPreference) {
        this.A00 = switchPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.A00.A0O(z);
    }
}
