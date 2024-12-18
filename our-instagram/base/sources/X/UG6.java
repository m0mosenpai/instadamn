package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.preference.ListPreference;

/* loaded from: classes11.dex */
public final class UG6 extends AbstractDialogInterfaceOnClickListenerC66385UEt {
    public int A00;
    public CharSequence[] A01;
    public CharSequence[] A02;

    @Override // X.AbstractDialogInterfaceOnClickListenerC66385UEt, X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArray;
        int i;
        int A02 = C0f9.A02(-462119098);
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) A0G();
            CharSequence[] charSequenceArr = listPreference.A01;
            if (charSequenceArr != null && (charSequenceArray = listPreference.A02) != null) {
                String str = listPreference.A00;
                if (str != null) {
                    i = charSequenceArray.length;
                    do {
                        i--;
                        if (i >= 0) {
                        }
                    } while (!TextUtils.equals(charSequenceArray[i].toString(), str));
                    this.A00 = i;
                    this.A01 = charSequenceArr;
                }
                i = -1;
                this.A00 = i;
                this.A01 = charSequenceArr;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
                C0f9.A09(-1702170337, A02);
                throw illegalStateException;
            }
        } else {
            this.A00 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.A01 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            charSequenceArray = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
        }
        this.A02 = charSequenceArray;
        C0f9.A09(1921414605, A02);
    }

    @Override // X.AbstractDialogInterfaceOnClickListenerC66385UEt, X.C0SG, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.A00);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.A01);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.A02);
    }
}
