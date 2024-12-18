package com.instagram.model.mediasize;

import X.AbstractC37344Gcm;
import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import X.IMD;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ImageInfoImpl extends C0T6 implements ImageInfo, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(17);
    public final AdditionalCandidates A00;
    public final SpriteSheetInfoCandidates A01;
    public final SpriteSheetInfoCandidates A02;
    public final List A03;
    public final List A04;

    @Override // com.instagram.model.mediasize.ImageInfo
    public final ImageInfoImpl F5B() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImageInfoImpl) {
                ImageInfoImpl imageInfoImpl = (ImageInfoImpl) obj;
                if (!C14360o3.A0K(this.A00, imageInfoImpl.A00) || !C14360o3.A0K(this.A01, imageInfoImpl.A01) || !C14360o3.A0K(this.A03, imageInfoImpl.A03) || !C14360o3.A0K(this.A02, imageInfoImpl.A02) || !C14360o3.A0K(this.A04, imageInfoImpl.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AdditionalCandidates additionalCandidates = this.A00;
        int hashCode = (additionalCandidates == null ? 0 : additionalCandidates.hashCode()) * 31;
        SpriteSheetInfoCandidates spriteSheetInfoCandidates = this.A01;
        int hashCode2 = (hashCode + (spriteSheetInfoCandidates == null ? 0 : spriteSheetInfoCandidates.hashCode())) * 31;
        List list = this.A03;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SpriteSheetInfoCandidates spriteSheetInfoCandidates2 = this.A02;
        int hashCode4 = (hashCode3 + (spriteSheetInfoCandidates2 == null ? 0 : spriteSheetInfoCandidates2.hashCode())) * 31;
        List list2 = this.A04;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ExtendedImageUrl) it.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.A02, i);
        List list2 = this.A04;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((ExtendedImageUrl) it2.next()).writeToParcel(parcel, i);
        }
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final /* bridge */ /* synthetic */ IMD AKm() {
        return new IMD(this);
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final AdditionalCandidates AZl() {
        return this.A00;
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final SpriteSheetInfoCandidates Abq() {
        return this.A01;
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final List AlQ() {
        return this.A03;
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final SpriteSheetInfoCandidates Br7() {
        return this.A02;
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final List BzD() {
        return this.A04;
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTImageVersion2", AbstractC37344Gcm.A00(this));
    }

    public ImageInfoImpl(AdditionalCandidates additionalCandidates, SpriteSheetInfoCandidates spriteSheetInfoCandidates, SpriteSheetInfoCandidates spriteSheetInfoCandidates2, List list, List list2) {
        this.A00 = additionalCandidates;
        this.A01 = spriteSheetInfoCandidates;
        this.A03 = list;
        this.A02 = spriteSheetInfoCandidates2;
        this.A04 = list2;
    }
}
