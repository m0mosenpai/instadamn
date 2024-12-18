package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ContextualAdResponseExtrasImpl extends C0T6 implements Parcelable, ContextualAdResponseExtras {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(36);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.ContextualAdResponseExtras
    public final ContextualAdResponseExtrasImpl EsX() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContextualAdResponseExtrasImpl) {
                ContextualAdResponseExtrasImpl contextualAdResponseExtrasImpl = (ContextualAdResponseExtrasImpl) obj;
                if (!C14360o3.A0K(this.A00, contextualAdResponseExtrasImpl.A00) || !C14360o3.A0K(this.A01, contextualAdResponseExtrasImpl.A01) || !C14360o3.A0K(this.A02, contextualAdResponseExtrasImpl.A02) || !C14360o3.A0K(this.A03, contextualAdResponseExtrasImpl.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public ContextualAdResponseExtrasImpl(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
