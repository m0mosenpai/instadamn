package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC39907Hmu;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class EntityImpl extends C0T6 implements Parcelable, Entity {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(70);
    public final String A00;
    public final String A01;
    public final String A02;

    public EntityImpl(String str, String str2, String str3) {
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // com.instagram.api.schemas.Entity
    public final EntityImpl EtC() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EntityImpl) {
                EntityImpl entityImpl = (EntityImpl) obj;
                if (!C14360o3.A0K(this.A00, entityImpl.A00) || !C14360o3.A0K(this.A01, entityImpl.A01) || !C14360o3.A0K(this.A02, entityImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.Entity
    public final String CBy() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.Entity
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTEntity", AbstractC39907Hmu.A00(this));
    }

    @Override // com.instagram.api.schemas.Entity
    public final String getId() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.Entity
    public final String getUrl() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A02);
    }
}
