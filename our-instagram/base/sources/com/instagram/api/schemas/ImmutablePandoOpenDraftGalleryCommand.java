package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;

/* loaded from: classes6.dex */
public final class ImmutablePandoOpenDraftGalleryCommand extends C17T implements OpenDraftGalleryCommand {
    public static final AbstractC136426Fv CREATOR = new C39307HXy(31);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.OpenDraftGalleryCommand
    public final OpenDraftGalleryCommandImpl Exb() {
        return new OpenDraftGalleryCommandImpl(getOptionalIntValueByHashCode(-1289243287));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
