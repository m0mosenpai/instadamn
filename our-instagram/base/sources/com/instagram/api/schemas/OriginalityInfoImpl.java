package com.instagram.api.schemas;

import X.AbstractC40129Hqw;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class OriginalityInfoImpl extends C0T6 implements Parcelable, OriginalityInfo {
    public static final Parcelable.Creator CREATOR = new C206159Ax(78);
    public final OriginalityFollowButtonInfo A00;
    public final OriginalitySourceMediaInfo A01;
    public final Boolean A02;

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final OriginalityInfo E9W(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final OriginalityInfoImpl Exl(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final OriginalityInfoImpl Exm(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OriginalityInfoImpl) {
                OriginalityInfoImpl originalityInfoImpl = (OriginalityInfoImpl) obj;
                if (!C14360o3.A0K(this.A02, originalityInfoImpl.A02) || !C14360o3.A0K(this.A00, originalityInfoImpl.A00) || !C14360o3.A0K(this.A01, originalityInfoImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A02;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        OriginalityFollowButtonInfo originalityFollowButtonInfo = this.A00;
        int hashCode2 = (hashCode + (originalityFollowButtonInfo == null ? 0 : originalityFollowButtonInfo.hashCode())) * 31;
        OriginalitySourceMediaInfo originalitySourceMediaInfo = this.A01;
        return hashCode2 + (originalitySourceMediaInfo != null ? originalitySourceMediaInfo.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        C14360o3.A0B(parcel, 0);
        Boolean bool = this.A02;
        if (bool != null) {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final Boolean Akh() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final OriginalityFollowButtonInfo B7H() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final OriginalitySourceMediaInfo BZp() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOriginalityInfo", AbstractC40129Hqw.A00(this));
    }

    public OriginalityInfoImpl(OriginalityFollowButtonInfo originalityFollowButtonInfo, OriginalitySourceMediaInfo originalitySourceMediaInfo, Boolean bool) {
        this.A02 = bool;
        this.A00 = originalityFollowButtonInfo;
        this.A01 = originalitySourceMediaInfo;
    }
}
