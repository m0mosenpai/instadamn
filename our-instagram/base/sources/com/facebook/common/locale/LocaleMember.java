package com.facebook.common.locale;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class LocaleMember implements Parcelable {
    public final Locale A00;

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            return this.A00.getCountry().equals(((LocaleMember) obj).A00.getCountry());
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.getCountry().hashCode();
    }

    public final String toString() {
        Locale locale = Locale.US;
        Locale locale2 = this.A00;
        return StringFormatUtil.formatStrLocaleSafe("%s (%s/%s)", locale2.getDisplayCountry(locale), locale2.getCountry(), locale2.getISO3Country());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.getCountry());
    }

    public LocaleMember(Locale locale) {
        this.A00 = locale;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }
}
