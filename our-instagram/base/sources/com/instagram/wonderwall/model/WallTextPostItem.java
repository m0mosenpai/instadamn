package com.instagram.wonderwall.model;

import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class WallTextPostItem extends C0T6 implements WallPostItem {
    public static final Parcelable.Creator CREATOR = new C55344OhA(46);
    public final WallPostInfo A00;

    public WallTextPostItem(WallPostInfo wallPostInfo) {
        C14360o3.A0B(wallPostInfo, 1);
        this.A00 = wallPostInfo;
    }

    @Override // com.instagram.wonderwall.model.WallPostItem
    public final boolean BB6() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof WallTextPostItem) && C14360o3.A0K(this.A00, ((WallTextPostItem) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }

    @Override // com.instagram.wonderwall.model.WallPostItem
    public final String BKd() {
        return AnonymousClass001.A0R(this.A00.A06, "_text");
    }

    @Override // com.instagram.wonderwall.model.WallPostItem
    public final WallPostInfo Bez() {
        return this.A00;
    }
}
