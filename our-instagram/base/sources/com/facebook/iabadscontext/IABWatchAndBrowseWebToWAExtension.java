package com.facebook.iabadscontext;

import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class IABWatchAndBrowseWebToWAExtension extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(11);
    public final MessagingExtensionType A00;

    public IABWatchAndBrowseWebToWAExtension(MessagingExtensionType messagingExtensionType) {
        C14360o3.A0B(messagingExtensionType, 1);
        this.A00 = messagingExtensionType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IABWatchAndBrowseWebToWAExtension) && this.A00 == ((IABWatchAndBrowseWebToWAExtension) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }
}
