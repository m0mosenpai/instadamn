package com.instagram.feed.media;

import X.AbstractC37356Gcy;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class CreativeConfig extends C0T6 implements CreativeConfigIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(94);
    public final AttributionUser A00;
    public final EffectPreview A01;
    public final ProductItemWithAR A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final CreativeConfigIntf EBM(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final CreativeConfig F4X(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final CreativeConfig F4Y(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreativeConfig) {
                CreativeConfig creativeConfig = (CreativeConfig) obj;
                if (!C14360o3.A0K(this.A00, creativeConfig.A00) || !C14360o3.A0K(this.A0B, creativeConfig.A0B) || !C14360o3.A0K(this.A03, creativeConfig.A03) || !C14360o3.A0K(this.A0C, creativeConfig.A0C) || !C14360o3.A0K(this.A04, creativeConfig.A04) || !C14360o3.A0K(this.A05, creativeConfig.A05) || !C14360o3.A0K(this.A0D, creativeConfig.A0D) || !C14360o3.A0K(this.A01, creativeConfig.A01) || !C14360o3.A0K(this.A02, creativeConfig.A02) || !C14360o3.A0K(this.A06, creativeConfig.A06) || !C14360o3.A0K(this.A07, creativeConfig.A07) || !C14360o3.A0K(this.A08, creativeConfig.A08) || !C14360o3.A0K(this.A09, creativeConfig.A09) || !C14360o3.A0K(this.A0E, creativeConfig.A0E) || !C14360o3.A0K(this.A0A, creativeConfig.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AttributionUser attributionUser = this.A00;
        int hashCode = (attributionUser == null ? 0 : attributionUser.hashCode()) * 31;
        List list = this.A0B;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.A03;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.A0C;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A05;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list3 = this.A0D;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        EffectPreview effectPreview = this.A01;
        int hashCode8 = (hashCode7 + (effectPreview == null ? 0 : effectPreview.hashCode())) * 31;
        ProductItemWithAR productItemWithAR = this.A02;
        int hashCode9 = (hashCode8 + (productItemWithAR == null ? 0 : productItemWithAR.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A07;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A08;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A09;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list4 = this.A0E;
        int hashCode14 = (hashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str8 = this.A0A;
        return hashCode14 + (str8 != null ? str8.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeStringList(this.A0B);
        parcel.writeString(this.A03);
        List list = this.A0C;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((CameraToolInfo) it.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        List list2 = this.A0D;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((EffectPreview) it2.next()).writeToParcel(parcel, i);
            }
        }
        EffectPreview effectPreview = this.A01;
        if (effectPreview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            effectPreview.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        List list3 = this.A0E;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                parcel.writeParcelable((Parcelable) it3.next(), i);
            }
        }
        parcel.writeString(this.A0A);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final AttributionUser AdP() {
        return this.A00;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final List Ak7() {
        return this.A0B;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final List Asl() {
        return this.A0C;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String AzG() {
        return this.A04;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String AzH() {
        return this.A05;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final List B0S() {
        return this.A0D;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final /* bridge */ /* synthetic */ EffectPreviewIntf B0a() {
        return this.A01;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final /* bridge */ /* synthetic */ ProductItemWithARIntf B0b() {
        return this.A02;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String B3R() {
        return this.A06;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String B3z() {
        return this.A07;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String B85() {
        return this.A09;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final List B9a() {
        return this.A0E;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String BcZ() {
        return this.A0A;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreativeConfigDict", AbstractC37356Gcy.A00(this));
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String getCaptureType() {
        return this.A03;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String getFailureReason() {
        return this.A08;
    }

    public CreativeConfig(AttributionUser attributionUser, EffectPreview effectPreview, ProductItemWithAR productItemWithAR, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, List list3, List list4) {
        this.A00 = attributionUser;
        this.A0B = list;
        this.A03 = str;
        this.A0C = list2;
        this.A04 = str2;
        this.A05 = str3;
        this.A0D = list3;
        this.A01 = effectPreview;
        this.A02 = productItemWithAR;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A09 = str7;
        this.A0E = list4;
        this.A0A = str8;
    }
}
