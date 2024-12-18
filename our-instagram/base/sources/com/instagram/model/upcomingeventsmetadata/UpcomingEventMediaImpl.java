package com.instagram.model.upcomingeventsmetadata;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.I4R;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpcomingEventMediaImpl extends C0T6 implements UpcomingEventMedia, Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(70);
    public final ImageInfo A00;
    public final ProductImageContainer A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Double A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final UpcomingEventMediaImpl F6f() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpcomingEventMediaImpl) {
                UpcomingEventMediaImpl upcomingEventMediaImpl = (UpcomingEventMediaImpl) obj;
                if (!C14360o3.A0K(this.A05, upcomingEventMediaImpl.A05) || !C14360o3.A0K(this.A02, upcomingEventMediaImpl.A02) || !C14360o3.A0K(this.A03, upcomingEventMediaImpl.A03) || !C14360o3.A0K(this.A06, upcomingEventMediaImpl.A06) || !C14360o3.A0K(this.A01, upcomingEventMediaImpl.A01) || !C14360o3.A0K(this.A00, upcomingEventMediaImpl.A00) || !C14360o3.A0K(this.A07, upcomingEventMediaImpl.A07) || !C14360o3.A0K(this.A04, upcomingEventMediaImpl.A04) || !C14360o3.A0K(this.A08, upcomingEventMediaImpl.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A05);
        AbstractC31179DnN.A0p(parcel, this.A02);
        AbstractC31179DnN.A0p(parcel, this.A03);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A07);
        Double d = this.A04;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        List list = this.A08;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
        while (A0l.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0l, i);
        }
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final String AXw() {
        return this.A05;
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final Boolean B3N() {
        return this.A02;
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final Boolean BB7() {
        return this.A03;
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final ProductImageContainer BGV() {
        return this.A01;
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final ImageInfo BGx() {
        return this.A00;
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final Double CF5() {
        return this.A04;
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final List CFe() {
        return this.A08;
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTUpcomingEventMedia", I4R.A00(this));
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final String getId() {
        return this.A06;
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final String getProductType() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((((AbstractC167017dG.A0O(this.A05) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A08);
    }

    public UpcomingEventMediaImpl(ImageInfo imageInfo, ProductImageContainer productImageContainer, Boolean bool, Boolean bool2, Double d, String str, String str2, String str3, List list) {
        this.A05 = str;
        this.A02 = bool;
        this.A03 = bool2;
        this.A06 = str2;
        this.A01 = productImageContainer;
        this.A00 = imageInfo;
        this.A07 = str3;
        this.A04 = d;
        this.A08 = list;
    }
}
