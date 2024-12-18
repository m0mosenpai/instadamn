package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC33700Euo;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class IGCTATextVariantImpl extends C0T6 implements Parcelable, IGCTATextVariant {
    public static final Parcelable.Creator CREATOR = new C41858IgC(27);
    public final IGCTATextVariantSource A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.IGCTATextVariant
    public final IGCTATextVariantImpl EuY() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGCTATextVariantImpl) {
                IGCTATextVariantImpl iGCTATextVariantImpl = (IGCTATextVariantImpl) obj;
                if (!C14360o3.A0K(this.A02, iGCTATextVariantImpl.A02) || !C14360o3.A0K(this.A01, iGCTATextVariantImpl.A01) || !C14360o3.A0K(this.A03, iGCTATextVariantImpl.A03) || this.A00 != iGCTATextVariantImpl.A00) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        Boolean bool = this.A01;
        if (bool == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.IGCTATextVariant
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGCTATextVariant", AbstractC33700Euo.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public IGCTATextVariantImpl(IGCTATextVariantSource iGCTATextVariantSource, Boolean bool, String str, String str2) {
        this.A02 = str;
        this.A01 = bool;
        this.A03 = str2;
        this.A00 = iGCTATextVariantSource;
    }

    @Override // com.instagram.api.schemas.IGCTATextVariant
    public final String Atp() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.IGCTATextVariant
    public final Boolean BBX() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IGCTATextVariant
    public final String BL7() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.IGCTATextVariant
    public final IGCTATextVariantSource C6k() {
        return this.A00;
    }
}
