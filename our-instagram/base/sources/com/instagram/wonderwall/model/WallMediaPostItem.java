package com.instagram.wonderwall.model;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C38321qM;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.Medium;

/* loaded from: classes5.dex */
public final class WallMediaPostItem extends C0T6 implements WallPostItem {
    public static final Parcelable.Creator CREATOR = new C55344OhA(39);
    public Medium A00;
    public final C38321qM A01;
    public final WallPostInfo A02;

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
            if (obj instanceof WallMediaPostItem) {
                WallMediaPostItem wallMediaPostItem = (WallMediaPostItem) obj;
                if (!C14360o3.A0K(this.A02, wallMediaPostItem.A02) || !C14360o3.A0K(this.A01, wallMediaPostItem.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A02.writeToParcel(parcel, i);
        parcel.writeValue(this.A01);
    }

    @Override // com.instagram.wonderwall.model.WallPostItem
    public final String BKd() {
        return AnonymousClass001.A0R(this.A02.A06, "_media");
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A02));
    }

    public WallMediaPostItem(C38321qM c38321qM, WallPostInfo wallPostInfo) {
        AbstractC167017dG.A1P(wallPostInfo, c38321qM);
        this.A02 = wallPostInfo;
        this.A01 = c38321qM;
    }

    @Override // com.instagram.wonderwall.model.WallPostItem
    public final WallPostInfo Bez() {
        return this.A02;
    }
}
