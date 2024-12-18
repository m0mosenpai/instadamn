package com.instagram.api.schemas;

import X.AbstractC37378GdK;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class FanClubStatusSyncInfoImpl extends C0T6 implements Parcelable, FanClubStatusSyncInfo {
    public static final Parcelable.Creator CREATOR = new C206149Aw(91);
    public final Long A00;
    public final boolean A01;
    public final boolean A02;

    @Override // com.instagram.api.schemas.FanClubStatusSyncInfo
    public final FanClubStatusSyncInfoImpl EtR() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FanClubStatusSyncInfoImpl) {
                FanClubStatusSyncInfoImpl fanClubStatusSyncInfoImpl = (FanClubStatusSyncInfoImpl) obj;
                if (this.A01 != fanClubStatusSyncInfoImpl.A01 || this.A02 != fanClubStatusSyncInfoImpl.A02 || !C14360o3.A0K(this.A00, fanClubStatusSyncInfoImpl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        Long l = this.A00;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    @Override // com.instagram.api.schemas.FanClubStatusSyncInfo
    public final boolean B1B() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.FanClubStatusSyncInfo
    public final boolean C3R() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.FanClubStatusSyncInfo
    public final Long C3S() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.FanClubStatusSyncInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFanClubStatusSyncInfo", AbstractC37378GdK.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        Long l = this.A00;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return i4 + hashCode;
    }

    public FanClubStatusSyncInfoImpl(Long l, boolean z, boolean z2) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = l;
    }
}
