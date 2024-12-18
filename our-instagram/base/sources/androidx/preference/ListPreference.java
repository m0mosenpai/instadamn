package androidx.preference;

import X.AbstractC63040SbG;
import X.AbstractC65702TsY;
import X.AbstractC68645VZd;
import X.C70368WSw;
import X.InterfaceC71881X8o;
import X.Py5;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import com.facebook.R;

/* loaded from: classes11.dex */
public class ListPreference extends DialogPreference {
    public String A00;
    public CharSequence[] A01;
    public CharSequence[] A02;
    public String A03;
    public boolean A04;

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.WSw] */
    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC68645VZd.A04, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.A01 = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.A02 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            C70368WSw c70368WSw = C70368WSw.A00;
            C70368WSw c70368WSw2 = c70368WSw;
            if (c70368WSw == null) {
                ?? obj = new Object();
                C70368WSw.A00 = obj;
                c70368WSw2 = obj;
            }
            this.A09 = c70368WSw2;
            A04();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC68645VZd.A06, i, 0);
        this.A03 = AbstractC65702TsY.A0W(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    /* loaded from: classes10.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = Py5.A00(57);
        public String A00;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.A00);
        }
    }

    @Override // androidx.preference.Preference
    public final CharSequence A03() {
        InterfaceC71881X8o interfaceC71881X8o = this.A09;
        if (interfaceC71881X8o != null) {
            return interfaceC71881X8o.E6i(this);
        }
        CharSequence A0N = A0N();
        CharSequence A03 = super.A03();
        String str = this.A03;
        if (str != null) {
            if (A0N == null) {
                A0N = "";
            }
            String format = String.format(str, A0N);
            if (!TextUtils.equals(format, A03)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return A03;
    }

    @Override // androidx.preference.Preference
    public final void A0A(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.A0A(savedState.getSuperState());
            A0O(savedState.A00);
            return;
        }
        super.A0A(parcelable);
    }

    public final CharSequence A0N() {
        CharSequence[] charSequenceArr;
        String str = this.A00;
        if (str != null && (charSequenceArr = this.A02) != null) {
            int length = charSequenceArr.length;
            do {
                length--;
                if (length < 0) {
                    return null;
                }
            } while (!TextUtils.equals(charSequenceArr[length].toString(), str));
            CharSequence[] charSequenceArr2 = this.A01;
            if (charSequenceArr2 != null) {
                return charSequenceArr2[length];
            }
            return null;
        }
        return null;
    }

    public final void A0O(String str) {
        boolean z = !TextUtils.equals(this.A00, str);
        if (z || !this.A04) {
            this.A00 = str;
            this.A04 = true;
            A0G(str);
            if (z) {
                A04();
            }
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC63040SbG.A00(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
