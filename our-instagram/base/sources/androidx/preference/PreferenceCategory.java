package androidx.preference;

import X.AbstractC63040SbG;
import X.C66482UJh;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.R;

/* loaded from: classes11.dex */
public class PreferenceCategory extends PreferenceGroup {
    @Override // androidx.preference.Preference
    public final boolean A0J() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC63040SbG.A00(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    public final void A0D(C66482UJh c66482UJh) {
        super.A0D(c66482UJh);
        c66482UJh.itemView.setAccessibilityHeading(true);
    }

    @Override // androidx.preference.Preference
    public final boolean A0K() {
        return !super.A0J();
    }
}
