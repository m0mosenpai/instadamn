package com.instagram.wonderwall.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC25231BEo;
import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class WallMusicPostItem extends C0T6 implements WallPostItem {
    public static final Parcelable.Creator CREATOR = new C55344OhA(41);
    public final AudioOverlayTrack A00;
    public final WallPostInfo A01;
    public final List A02;

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
            if (obj instanceof WallMusicPostItem) {
                WallMusicPostItem wallMusicPostItem = (WallMusicPostItem) obj;
                if (!C14360o3.A0K(this.A01, wallMusicPostItem.A01) || !C14360o3.A0K(this.A00, wallMusicPostItem.A00) || !C14360o3.A0K(this.A02, wallMusicPostItem.A02)) {
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
        parcel.writeParcelable(this.A00, i);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A02);
        while (A0u.hasNext()) {
            parcel.writeInt(AbstractC167007dF.A0B(A0u));
        }
    }

    @Override // com.instagram.wonderwall.model.WallPostItem
    public final String BKd() {
        return AnonymousClass001.A0R(this.A01.A06, "_music");
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)));
    }

    public WallMusicPostItem(AudioOverlayTrack audioOverlayTrack, WallPostInfo wallPostInfo, List list) {
        AbstractC167027dH.A13(wallPostInfo, audioOverlayTrack, list);
        this.A01 = wallPostInfo;
        this.A00 = audioOverlayTrack;
        this.A02 = list;
    }

    @Override // com.instagram.wonderwall.model.WallPostItem
    public final WallPostInfo Bez() {
        return this.A01;
    }
}
