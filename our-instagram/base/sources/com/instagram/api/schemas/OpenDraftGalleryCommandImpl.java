package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC31181DnP;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class OpenDraftGalleryCommandImpl extends C0T6 implements Parcelable, OpenDraftGalleryCommand {
    public static final Parcelable.Creator CREATOR = new C41855Ig9(22);
    public final Integer A00;

    @Override // com.instagram.api.schemas.OpenDraftGalleryCommand
    public final OpenDraftGalleryCommandImpl Exb() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OpenDraftGalleryCommandImpl) && C14360o3.A0K(this.A00, ((OpenDraftGalleryCommandImpl) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public OpenDraftGalleryCommandImpl(Integer num) {
        this.A00 = num;
    }
}
