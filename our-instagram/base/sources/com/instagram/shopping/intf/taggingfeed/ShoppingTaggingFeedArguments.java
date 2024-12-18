package com.instagram.shopping.intf.taggingfeed;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25234BEr;
import X.AbstractC41359ISm;
import X.C14360o3;
import X.C37324GcR;
import X.EnumC39584Hdu;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import java.util.List;

/* loaded from: classes7.dex */
public final class ShoppingTaggingFeedArguments implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(72);
    public boolean A00;
    public boolean A01;
    public final ClipInfo A02;
    public final EnumC39584Hdu A03;
    public final ShoppingTaggingFeedClientState A04;
    public final ShoppingTaggingFeedHeader A05;
    public final TaggingFeedMultiSelectState A06;
    public final Integer A07;
    public final Long A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H;
    public final boolean A0I;

    public ShoppingTaggingFeedArguments(ClipInfo clipInfo, EnumC39584Hdu enumC39584Hdu, ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, ShoppingTaggingFeedHeader shoppingTaggingFeedHeader, TaggingFeedMultiSelectState taggingFeedMultiSelectState, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, boolean z, boolean z2, boolean z3) {
        AbstractC25234BEr.A0j(1, str, enumC39584Hdu, str2, str3);
        C14360o3.A0B(shoppingTaggingFeedClientState, 12);
        this.A0B = str;
        this.A07 = num;
        this.A03 = enumC39584Hdu;
        this.A0G = str2;
        this.A0F = str3;
        this.A0E = str4;
        this.A0H = list;
        this.A0D = str5;
        this.A0C = str6;
        this.A0I = z;
        this.A05 = shoppingTaggingFeedHeader;
        this.A04 = shoppingTaggingFeedClientState;
        this.A02 = clipInfo;
        this.A08 = l;
        this.A09 = str7;
        this.A0A = str8;
        this.A06 = taggingFeedMultiSelectState;
        this.A01 = z2;
        this.A00 = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0B);
        parcel.writeString(AbstractC41359ISm.A01(this.A07));
        AbstractC166997dE.A1I(parcel, this.A03);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
        parcel.writeStringList(this.A0H);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A02, i);
        AbstractC167027dH.A0n(parcel, this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
