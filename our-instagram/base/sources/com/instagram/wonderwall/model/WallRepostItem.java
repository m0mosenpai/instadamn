package com.instagram.wonderwall.model;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class WallRepostItem extends C0T6 implements WallPostItem {
    public static final Parcelable.Creator CREATOR = new C55344OhA(43);
    public final WallPostInfo A00;
    public final WallPostItem A01;

    @Override // com.instagram.wonderwall.model.WallPostItem
    public final boolean BB6() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WallRepostItem) {
                WallRepostItem wallRepostItem = (WallRepostItem) obj;
                if (!C14360o3.A0K(this.A00, wallRepostItem.A00) || !C14360o3.A0K(this.A01, wallRepostItem.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.wonderwall.model.WallPostItem
    public final String BKd() {
        return AnonymousClass001.A0R(this.A00.A06, "_repost");
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public WallRepostItem(WallPostInfo wallPostInfo, WallPostItem wallPostItem) {
        AbstractC167017dG.A1P(wallPostInfo, wallPostItem);
        this.A00 = wallPostInfo;
        this.A01 = wallPostItem;
    }

    @Override // com.instagram.wonderwall.model.WallPostItem
    public final WallPostInfo Bez() {
        return this.A00;
    }
}
