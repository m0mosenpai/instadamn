package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import X.CDD;
import X.CSO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes5.dex */
public final class ClipsTrialDictImpl extends C0T6 implements ClipsTrialDict, Parcelable {
    public static final Parcelable.Creator CREATOR = new C41854Ig8(18);
    public final MediaTrialGraduationStrategy A00;
    public final MediaTrialStatus A01;
    public final Boolean A02;
    public final Boolean A03;

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final ClipsTrialDictImpl EsH() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsTrialDictImpl) {
                ClipsTrialDictImpl clipsTrialDictImpl = (ClipsTrialDictImpl) obj;
                if (!C14360o3.A0K(this.A02, clipsTrialDictImpl.A02) || this.A00 != clipsTrialDictImpl.A00 || !C14360o3.A0K(this.A03, clipsTrialDictImpl.A03) || this.A01 != clipsTrialDictImpl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Boolean bool = this.A02;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        Boolean bool2 = this.A03;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final /* bridge */ /* synthetic */ CSO AKH() {
        return new CSO(this);
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTrialDict", CDD.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public ClipsTrialDictImpl(MediaTrialGraduationStrategy mediaTrialGraduationStrategy, MediaTrialStatus mediaTrialStatus, Boolean bool, Boolean bool2) {
        this.A02 = bool;
        this.A00 = mediaTrialGraduationStrategy;
        this.A03 = bool2;
        this.A01 = mediaTrialStatus;
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final Boolean Al7() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final MediaTrialGraduationStrategy BAG() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final MediaTrialStatus C0I() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final Boolean Cc9() {
        return this.A03;
    }
}
