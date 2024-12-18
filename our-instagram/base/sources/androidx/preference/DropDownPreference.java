package androidx.preference;

import X.C0fA;
import X.C66482UJh;
import X.C70259WOe;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.facebook.R;

/* loaded from: classes11.dex */
public class DropDownPreference extends ListPreference {
    public Spinner A00;
    public final Context A01;
    public final AdapterView.OnItemSelectedListener A02;
    public final ArrayAdapter A03;

    @Override // androidx.preference.Preference
    public final void A0D(C66482UJh c66482UJh) {
        int i;
        Spinner spinner = (Spinner) c66482UJh.itemView.findViewById(R.id.spinner);
        this.A00 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.A03);
        this.A00.setOnItemSelectedListener(this.A02);
        Spinner spinner2 = this.A00;
        String str = ((ListPreference) this).A00;
        CharSequence[] charSequenceArr = ((ListPreference) this).A02;
        if (str != null && charSequenceArr != null) {
            i = charSequenceArr.length;
            do {
                i--;
                if (i >= 0) {
                }
            } while (!TextUtils.equals(charSequenceArr[i].toString(), str));
            spinner2.setSelection(i);
            super.A0D(c66482UJh);
        }
        i = -1;
        spinner2.setSelection(i);
        super.A0D(c66482UJh);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.A02 = new C70259WOe(this, 2);
        this.A01 = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.A03 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).A01;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void A04() {
        super.A04();
        ArrayAdapter arrayAdapter = this.A03;
        if (arrayAdapter != null) {
            C0fA.A00(arrayAdapter, 1859630881);
        }
    }
}
