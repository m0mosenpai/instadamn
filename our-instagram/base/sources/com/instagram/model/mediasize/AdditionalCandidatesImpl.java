package com.instagram.model.mediasize;

import X.AbstractC37357Gcz;
import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes.dex */
public final class AdditionalCandidatesImpl extends C0T6 implements Parcelable, AdditionalCandidates {
    public static final Parcelable.Creator CREATOR = new C9Ay(14);
    public final ExtendedImageUrl A00;
    public final ExtendedImageUrl A01;
    public final ExtendedImageUrl A02;

    @Override // com.instagram.model.mediasize.AdditionalCandidates
    public final AdditionalCandidatesImpl F5A() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdditionalCandidatesImpl) {
                AdditionalCandidatesImpl additionalCandidatesImpl = (AdditionalCandidatesImpl) obj;
                if (!C14360o3.A0K(this.A00, additionalCandidatesImpl.A00) || !C14360o3.A0K(this.A01, additionalCandidatesImpl.A01) || !C14360o3.A0K(this.A02, additionalCandidatesImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ExtendedImageUrl extendedImageUrl = this.A00;
        int hashCode = (extendedImageUrl == null ? 0 : extendedImageUrl.hashCode()) * 31;
        ExtendedImageUrl extendedImageUrl2 = this.A01;
        int hashCode2 = (hashCode + (extendedImageUrl2 == null ? 0 : extendedImageUrl2.hashCode())) * 31;
        ExtendedImageUrl extendedImageUrl3 = this.A02;
        return hashCode2 + (extendedImageUrl3 != null ? extendedImageUrl3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        ExtendedImageUrl extendedImageUrl = this.A00;
        if (extendedImageUrl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extendedImageUrl.writeToParcel(parcel, i);
        }
        ExtendedImageUrl extendedImageUrl2 = this.A01;
        if (extendedImageUrl2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extendedImageUrl2.writeToParcel(parcel, i);
        }
        ExtendedImageUrl extendedImageUrl3 = this.A02;
        if (extendedImageUrl3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extendedImageUrl3.writeToParcel(parcel, i);
        }
    }

    @Override // com.instagram.model.mediasize.AdditionalCandidates
    public final ExtendedImageUrl B6a() {
        return this.A00;
    }

    @Override // com.instagram.model.mediasize.AdditionalCandidates
    public final ExtendedImageUrl BGL() {
        return this.A01;
    }

    @Override // com.instagram.model.mediasize.AdditionalCandidates
    public final ExtendedImageUrl Bxr() {
        return this.A02;
    }

    @Override // com.instagram.model.mediasize.AdditionalCandidates
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTImageAdditionalCandidates", AbstractC37357Gcz.A00(this));
    }

    public AdditionalCandidatesImpl(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, ExtendedImageUrl extendedImageUrl3) {
        this.A00 = extendedImageUrl;
        this.A01 = extendedImageUrl2;
        this.A02 = extendedImageUrl3;
    }
}
