package com.instagram.api.schemas;

import X.AbstractC39746HkI;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class AppstoreMetadataDictImpl extends C0T6 implements AppstoreMetadataDict, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(44);
    public final Float A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final List A04;

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final AppstoreMetadataDictImpl Eqw() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppstoreMetadataDictImpl) {
                AppstoreMetadataDictImpl appstoreMetadataDictImpl = (AppstoreMetadataDictImpl) obj;
                if (!C14360o3.A0K(this.A00, appstoreMetadataDictImpl.A00) || !C14360o3.A0K(this.A02, appstoreMetadataDictImpl.A02) || !C14360o3.A0K(this.A01, appstoreMetadataDictImpl.A01) || !C14360o3.A0K(this.A03, appstoreMetadataDictImpl.A03) || !C14360o3.A0K(this.A04, appstoreMetadataDictImpl.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A00;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.A02;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.A01;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.A03;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.A04;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Float f = this.A00;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.A02);
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A03);
        List list = this.A04;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final Float Aen() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final String BIT() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final Integer BXz() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final String BY0() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final List Bqw() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAppstoreMetadataDict", AbstractC39746HkI.A00(this));
    }

    public AppstoreMetadataDictImpl(Float f, Integer num, String str, String str2, List list) {
        this.A00 = f;
        this.A02 = str;
        this.A01 = num;
        this.A03 = str2;
        this.A04 = list;
    }
}
