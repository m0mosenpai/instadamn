package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class FormattedStringImpl extends C0T6 implements Parcelable, FormattedString {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(85);
    public final String A00;

    public FormattedStringImpl(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // com.instagram.api.schemas.FormattedString
    public final FormattedStringImpl Eth() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FormattedStringImpl) && C14360o3.A0K(this.A00, ((FormattedStringImpl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    @Override // com.instagram.api.schemas.FormattedString
    public final String getText() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.FormattedString
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            AbstractC37300Gc1.A15(str, A0X);
        }
        return AbstractC37300Gc1.A05("XDTFormattedString", AbstractC06930Yk.A0B(A0X));
    }
}
