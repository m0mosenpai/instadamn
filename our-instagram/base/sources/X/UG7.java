package X;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class UG7 extends AbstractDialogInterfaceOnClickListenerC66385UEt {
    public java.util.Set A00 = new HashSet();
    public boolean A01;
    public CharSequence[] A02;
    public CharSequence[] A03;

    @Override // X.AbstractDialogInterfaceOnClickListenerC66385UEt, X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArray;
        int A02 = C0f9.A02(-247075498);
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A0G();
            CharSequence[] charSequenceArr = multiSelectListPreference.A01;
            if (charSequenceArr != null && (charSequenceArray = multiSelectListPreference.A02) != null) {
                java.util.Set set = this.A00;
                set.clear();
                set.addAll(multiSelectListPreference.A00);
                this.A01 = false;
                this.A02 = charSequenceArr;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
                C0f9.A09(1842221797, A02);
                throw illegalStateException;
            }
        } else {
            java.util.Set set2 = this.A00;
            set2.clear();
            set2.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.A01 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.A02 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            charSequenceArray = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
        }
        this.A03 = charSequenceArray;
        C0f9.A09(-1143505891, A02);
    }

    @Override // X.AbstractDialogInterfaceOnClickListenerC66385UEt, X.C0SG, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.A00));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.A01);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.A02);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.A03);
    }
}
