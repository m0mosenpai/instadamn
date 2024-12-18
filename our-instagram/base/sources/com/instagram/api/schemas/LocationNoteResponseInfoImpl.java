package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC37300Gc1;
import X.AbstractC40049Hpb;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class LocationNoteResponseInfoImpl extends C0T6 implements Parcelable, LocationNoteResponseInfo {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(76);
    public final String A00;
    public final String A01;

    @Override // com.instagram.api.schemas.LocationNoteResponseInfo
    public final LocationNoteResponseInfoImpl Ew7() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationNoteResponseInfoImpl) {
                LocationNoteResponseInfoImpl locationNoteResponseInfoImpl = (LocationNoteResponseInfoImpl) obj;
                if (!C14360o3.A0K(this.A00, locationNoteResponseInfoImpl.A00) || !C14360o3.A0K(this.A01, locationNoteResponseInfoImpl.A01)) {
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

    @Override // com.instagram.api.schemas.LocationNoteResponseInfo
    public final String BOO() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.LocationNoteResponseInfo
    public final String BOP() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.LocationNoteResponseInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTLocationNoteResponseInfo", AbstractC40049Hpb.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public LocationNoteResponseInfoImpl(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
