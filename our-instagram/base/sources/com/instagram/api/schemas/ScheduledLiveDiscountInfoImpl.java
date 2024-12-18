package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40225Hso;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ScheduledLiveDiscountInfoImpl extends C0T6 implements Parcelable, ScheduledLiveDiscountInfo {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(94);
    public final Boolean A00;
    public final String A01;

    @Override // com.instagram.api.schemas.ScheduledLiveDiscountInfo
    public final ScheduledLiveDiscountInfoImpl EzK() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScheduledLiveDiscountInfoImpl) {
                ScheduledLiveDiscountInfoImpl scheduledLiveDiscountInfoImpl = (ScheduledLiveDiscountInfoImpl) obj;
                if (!C14360o3.A0K(this.A01, scheduledLiveDiscountInfoImpl.A01) || !C14360o3.A0K(this.A00, scheduledLiveDiscountInfoImpl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A00) ? 1 : 0);
    }

    @Override // com.instagram.api.schemas.ScheduledLiveDiscountInfo
    public final String AyH() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ScheduledLiveDiscountInfo
    public final Boolean CQH() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ScheduledLiveDiscountInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTScheduledLiveDiscountInfo", AbstractC40225Hso.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public ScheduledLiveDiscountInfoImpl(String str, Boolean bool) {
        this.A01 = str;
        this.A00 = bool;
    }
}
