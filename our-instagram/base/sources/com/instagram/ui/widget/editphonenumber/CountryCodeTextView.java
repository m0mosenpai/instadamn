package com.instagram.ui.widget.editphonenumber;

import X.AnonymousClass001;
import X.C55344OhA;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.instagram.phonenumber.model.CountryCodeData;

/* loaded from: classes6.dex */
public class CountryCodeTextView extends TextView {
    public String A00;

    /* loaded from: classes9.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = C55344OhA.A00(16);
        public final String A00;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.A00 = parcel.readString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.A00);
        }

        public SavedState(String str, Parcelable parcelable) {
            super(parcelable);
            this.A00 = str;
        }
    }

    public String getCountryCode() {
        String str = this.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getCountryCodeWithoutPlus() {
        String str = this.A00;
        if (str == null) {
            return "";
        }
        return str.replace("+", "");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A00 = savedState.A00;
    }

    public void setCountryCodeWithPlus(String str) {
        if (str != null && !str.isEmpty()) {
            if (!str.startsWith("+")) {
                str = AnonymousClass001.A0R("+", str);
            }
            this.A00 = str;
            setText(str);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        return new SavedState(this.A00, onSaveInstanceState);
    }

    public void setCountryCodeWithCountryPrefix(CountryCodeData countryCodeData) {
        this.A00 = countryCodeData.A00();
        setText(countryCodeData.A02());
    }

    public CountryCodeTextView(Context context) {
        super(context);
    }

    public CountryCodeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setCountryCodeWithPlus(CountryCodeData countryCodeData) {
        setCountryCodeWithPlus(countryCodeData.A00());
    }
}
