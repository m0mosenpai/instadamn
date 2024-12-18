package com.instagram.wonderwall.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.mediasize.GifUrlImpl;

/* loaded from: classes5.dex */
public final class WallGifPostItem extends C0T6 implements WallPostItem {
    public static final Parcelable.Creator CREATOR = new C55344OhA(34);
    public final GifUrlImpl A00;
    public final WallPostInfo A01;
    public final String A02;

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
            if (obj instanceof WallGifPostItem) {
                WallGifPostItem wallGifPostItem = (WallGifPostItem) obj;
                if (!C14360o3.A0K(this.A01, wallGifPostItem.A01) || !C14360o3.A0K(this.A02, wallGifPostItem.A02) || !C14360o3.A0K(this.A00, wallGifPostItem.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeValue(this.A00);
    }

    @Override // com.instagram.wonderwall.model.WallPostItem
    public final String BKd() {
        return AnonymousClass001.A0R(this.A01.A06, "_gif");
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A01)));
    }

    public WallGifPostItem(GifUrlImpl gifUrlImpl, WallPostInfo wallPostInfo, String str) {
        AbstractC167027dH.A13(wallPostInfo, str, gifUrlImpl);
        this.A01 = wallPostInfo;
        this.A02 = str;
        this.A00 = gifUrlImpl;
    }

    @Override // com.instagram.wonderwall.model.WallPostItem
    public final WallPostInfo Bez() {
        return this.A01;
    }
}
