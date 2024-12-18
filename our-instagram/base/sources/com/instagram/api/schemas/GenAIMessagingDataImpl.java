package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC39935HnQ;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class GenAIMessagingDataImpl extends C0T6 implements Parcelable, GenAIMessagingData {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(92);
    public final String A00;
    public final String A01;

    @Override // com.instagram.api.schemas.GenAIMessagingData
    public final GenAIMessagingDataImpl Etn() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenAIMessagingDataImpl) {
                GenAIMessagingDataImpl genAIMessagingDataImpl = (GenAIMessagingDataImpl) obj;
                if (!C14360o3.A0K(this.A00, genAIMessagingDataImpl.A00) || !C14360o3.A0K(this.A01, genAIMessagingDataImpl.A01)) {
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
    }

    @Override // com.instagram.api.schemas.GenAIMessagingData
    public final String AhP() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GenAIMessagingData
    public final String C7I() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.GenAIMessagingData
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTGenAIMessagingData", AbstractC39935HnQ.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public GenAIMessagingDataImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
