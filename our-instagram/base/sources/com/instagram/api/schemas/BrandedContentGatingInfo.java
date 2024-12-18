package com.instagram.api.schemas;

import X.AbstractC39780Hkq;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class BrandedContentGatingInfo extends C0T6 implements Parcelable, BrandedContentGatingInfoIntf {
    public static final Parcelable.Creator CREATOR = new C206149Aw(56);
    public final Integer A00;
    public final String A01;
    public final HashMap A02;
    public final List A03;
    public final List A04;

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final BrandedContentGatingInfo ErN() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrandedContentGatingInfo) {
                BrandedContentGatingInfo brandedContentGatingInfo = (BrandedContentGatingInfo) obj;
                if (!C14360o3.A0K(this.A02, brandedContentGatingInfo.A02) || !C14360o3.A0K(this.A03, brandedContentGatingInfo.A03) || !C14360o3.A0K(this.A04, brandedContentGatingInfo.A04) || !C14360o3.A0K(this.A00, brandedContentGatingInfo.A00) || !C14360o3.A0K(this.A01, brandedContentGatingInfo.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        HashMap hashMap = this.A02;
        int hashCode = (hashMap == null ? 0 : hashMap.hashCode()) * 31;
        List list = this.A03;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A04;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.A00;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.A01;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        HashMap hashMap = this.A02;
        if (hashMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeInt(((Number) entry.getValue()).intValue());
            }
        }
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
        parcel.writeStringList(this.A04);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final /* bridge */ /* synthetic */ Map As6() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final List As7() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final List As8() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final Integer AwA() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final String BsW() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTBrandedContentGatingInfo", AbstractC39780Hkq.A00(this));
    }

    public BrandedContentGatingInfo(Integer num, String str, HashMap hashMap, List list, List list2) {
        this.A02 = hashMap;
        this.A03 = list;
        this.A04 = list2;
        this.A00 = num;
        this.A01 = str;
    }
}
