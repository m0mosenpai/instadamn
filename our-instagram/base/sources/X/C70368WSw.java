package X;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

/* renamed from: X.WSw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70368WSw implements InterfaceC71881X8o {
    public static C70368WSw A00;

    @Override // X.InterfaceC71881X8o
    public final /* bridge */ /* synthetic */ CharSequence E6i(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.A0N())) {
            return listPreference.A0a.getString(2131968698);
        }
        return listPreference.A0N();
    }
}
