package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC39875HmO;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class CreatorViewerSignalAudioDetailsImpl extends C0T6 implements Parcelable, CreatorViewerSignalAudioDetails {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(49);
    public final FormattedString A00;
    public final TrackOrOriginalSoundSchema A01;

    @Override // com.instagram.api.schemas.CreatorViewerSignalAudioDetails
    public final CreatorViewerSignalAudioDetailsImpl Esr(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalAudioDetails
    public final CreatorViewerSignalAudioDetailsImpl Ess(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalAudioDetailsImpl) {
                CreatorViewerSignalAudioDetailsImpl creatorViewerSignalAudioDetailsImpl = (CreatorViewerSignalAudioDetailsImpl) obj;
                if (!C14360o3.A0K(this.A01, creatorViewerSignalAudioDetailsImpl.A01) || !C14360o3.A0K(this.A00, creatorViewerSignalAudioDetailsImpl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalAudioDetails
    public final /* bridge */ /* synthetic */ TrackOrOriginalSoundSchemaIntf Ads() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalAudioDetails
    public final FormattedString C3a() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalAudioDetails
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCreatorViewerSignalAudioDetails", AbstractC39875HmO.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public CreatorViewerSignalAudioDetailsImpl(FormattedString formattedString, TrackOrOriginalSoundSchema trackOrOriginalSoundSchema) {
        this.A01 = trackOrOriginalSoundSchema;
        this.A00 = formattedString;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalAudioDetails
    public final CreatorViewerSignalAudioDetails E8y(C1DY c1dy) {
        return this;
    }
}
