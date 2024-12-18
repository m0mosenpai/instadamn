package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class OpenInspirationHubCommandImpl extends C0T6 implements Parcelable, OpenInspirationHubCommand {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(23);
    public final XDTCreatorInspirationHubType A00;

    @Override // com.instagram.api.schemas.OpenInspirationHubCommand
    public final OpenInspirationHubCommandImpl Exd() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OpenInspirationHubCommandImpl) && this.A00 == ((OpenInspirationHubCommandImpl) obj).A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.OpenInspirationHubCommand
    public final XDTCreatorInspirationHubType C5X() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public OpenInspirationHubCommandImpl(XDTCreatorInspirationHubType xDTCreatorInspirationHubType) {
        this.A00 = xDTCreatorInspirationHubType;
    }
}
