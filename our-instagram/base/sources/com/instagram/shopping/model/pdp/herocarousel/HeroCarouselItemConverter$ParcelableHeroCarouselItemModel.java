package com.instagram.shopping.model.pdp.herocarousel;

import X.AbstractC37304Gc5;
import X.AbstractC41360ISn;
import X.C05F;
import X.C14360o3;
import X.C37324GcR;
import X.C38321qM;
import X.C39349HZo;
import X.C39350HZp;
import X.C39351HZq;
import X.C39352HZr;
import X.C39354HZt;
import X.IN1;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.ProductArEffectMetadata;

/* loaded from: classes7.dex */
public class HeroCarouselItemConverter$ParcelableHeroCarouselItemModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(82);
    public final ImageInfo A00;
    public final ProductArEffectMetadata A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(AbstractC41360ISn.A00(this.A02));
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A00.F5B(), i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A07);
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(Parcel parcel) {
        Integer num;
        this.A05 = parcel.readString();
        String readString = parcel.readString();
        Integer[] A00 = C05F.A00(7);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A00[i];
                if (C14360o3.A0K(AbstractC41360ISn.A00(num), readString)) {
                    break;
                } else {
                    i++;
                }
            } else {
                num = null;
                break;
            }
        }
        this.A02 = num;
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
        this.A00 = (ImageInfo) AbstractC37304Gc5.A04(parcel, ImageInfo.class);
        this.A06 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = (ProductArEffectMetadata) AbstractC37304Gc5.A04(parcel, ProductArEffectMetadata.class);
        this.A07 = parcel.readString();
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C39354HZt c39354HZt) {
        this.A05 = c39354HZt.A02;
        this.A02 = ((IN1) c39354HZt).A02;
        this.A09 = null;
        this.A08 = null;
        this.A00 = c39354HZt.A00;
        this.A06 = c39354HZt.A03;
        this.A04 = c39354HZt.A06;
        this.A03 = c39354HZt.A05;
        this.A01 = c39354HZt.A01;
        this.A07 = null;
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C39352HZr c39352HZr) {
        this.A05 = c39352HZr.A02;
        this.A02 = ((IN1) c39352HZr).A02;
        C38321qM c38321qM = c39352HZr.A00;
        this.A09 = c38321qM.getId();
        this.A08 = c38321qM.getId();
        this.A00 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A07 = c39352HZr.A01.getId();
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C39350HZp c39350HZp) {
        this.A05 = c39350HZp.A02;
        this.A02 = ((IN1) c39350HZp).A02;
        this.A09 = c39350HZp.A01.getId();
        this.A08 = c39350HZp.A00.getId();
        this.A00 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A07 = null;
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C39349HZo c39349HZo) {
        this.A05 = c39349HZo.A01;
        this.A02 = c39349HZo.A02;
        this.A09 = c39349HZo.A00.getId();
        this.A08 = null;
        this.A00 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A07 = null;
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C39351HZq c39351HZq) {
        this.A05 = c39351HZq.A01;
        this.A02 = ((IN1) c39351HZq).A02;
        this.A09 = null;
        this.A08 = null;
        this.A00 = c39351HZq.A00;
        this.A06 = c39351HZq.A02;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A07 = null;
    }
}
