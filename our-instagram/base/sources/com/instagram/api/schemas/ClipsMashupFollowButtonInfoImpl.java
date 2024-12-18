package com.instagram.api.schemas;

import X.AbstractC37425Ge5;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class ClipsMashupFollowButtonInfoImpl extends C0T6 implements Parcelable, ClipsMashupFollowButtonInfo {
    public static final Parcelable.Creator CREATOR = new C206149Aw(65);
    public final Boolean A00;
    public final Boolean A01;

    @Override // com.instagram.api.schemas.ClipsMashupFollowButtonInfo
    public final ClipsMashupFollowButtonInfoImpl Erz() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsMashupFollowButtonInfoImpl) {
                ClipsMashupFollowButtonInfoImpl clipsMashupFollowButtonInfoImpl = (ClipsMashupFollowButtonInfoImpl) obj;
                if (!C14360o3.A0K(this.A00, clipsMashupFollowButtonInfoImpl.A00) || !C14360o3.A0K(this.A01, clipsMashupFollowButtonInfoImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A01;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A01;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.instagram.api.schemas.ClipsMashupFollowButtonInfo
    public final Boolean BwL() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ClipsMashupFollowButtonInfo
    public final Boolean CZs() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ClipsMashupFollowButtonInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsMashupFollowButtonInfo", AbstractC37425Ge5.A00(this));
    }

    public ClipsMashupFollowButtonInfoImpl(Boolean bool, Boolean bool2) {
        this.A00 = bool;
        this.A01 = bool2;
    }
}
