package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC40425HwG;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class TrackOrOriginalSoundSchema extends C0T6 implements TrackOrOriginalSoundSchemaIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(72);
    public final OriginalSoundData A00;
    public final TrackData A01;
    public final TrackMetadata A02;

    @Override // com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf
    public final TrackOrOriginalSoundSchema F3R(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrackOrOriginalSoundSchema) {
                TrackOrOriginalSoundSchema trackOrOriginalSoundSchema = (TrackOrOriginalSoundSchema) obj;
                if (!C14360o3.A0K(this.A02, trackOrOriginalSoundSchema.A02) || !C14360o3.A0K(this.A00, trackOrOriginalSoundSchema.A00) || !C14360o3.A0K(this.A01, trackOrOriginalSoundSchema.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf
    public final TrackMetadata BTR() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf
    public final /* bridge */ /* synthetic */ OriginalSoundDataIntf BZv() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf
    public final TrackData CA8() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTrackOrOriginalSoundSchema", AbstractC40425HwG.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public TrackOrOriginalSoundSchema(OriginalSoundData originalSoundData, TrackData trackData, TrackMetadata trackMetadata) {
        this.A02 = trackMetadata;
        this.A00 = originalSoundData;
        this.A01 = trackData;
    }

    @Override // com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf
    public final TrackOrOriginalSoundSchemaIntf EB8(C1DY c1dy) {
        return this;
    }
}
