package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31181DnP;
import X.AbstractC37300Gc1;
import X.AbstractC39912Hmz;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class EventPageNavigationMetadataImpl extends C0T6 implements Parcelable, EventPageNavigationMetadata {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(75);
    public final Integer A00;
    public final String A01;
    public final String A02;

    @Override // com.instagram.api.schemas.EventPageNavigationMetadata
    public final EventPageNavigationMetadataImpl EtE() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EventPageNavigationMetadataImpl) {
                EventPageNavigationMetadataImpl eventPageNavigationMetadataImpl = (EventPageNavigationMetadataImpl) obj;
                if (!C14360o3.A0K(this.A01, eventPageNavigationMetadataImpl.A01) || !C14360o3.A0K(this.A00, eventPageNavigationMetadataImpl.A00) || !C14360o3.A0K(this.A02, eventPageNavigationMetadataImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.EventPageNavigationMetadata
    public final Integer BmM() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.EventPageNavigationMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTEventPageNavigationMetadata", AbstractC39912Hmz.A00(this));
    }

    @Override // com.instagram.api.schemas.EventPageNavigationMetadata
    public final String getDescription() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.EventPageNavigationMetadata
    public final String getSubtitle() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public EventPageNavigationMetadataImpl(String str, Integer num, String str2) {
        this.A01 = str;
        this.A00 = num;
        this.A02 = str2;
    }
}
