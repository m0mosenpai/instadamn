package X;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;

/* renamed from: X.WSv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70367WSv implements InterfaceC71881X8o {
    public static C70367WSv A00;

    @Override // X.InterfaceC71881X8o
    public final /* bridge */ /* synthetic */ CharSequence E6i(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(editTextPreference.A00)) {
            return editTextPreference.A0a.getString(2131968698);
        }
        return editTextPreference.A00;
    }
}
