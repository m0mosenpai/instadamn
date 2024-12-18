package com.instagram.direct.sharetostory.data;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class ChannelChallengeStickerData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(40);
    public int A00;
    public int A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;
    public final boolean A0G;

    public ChannelChallengeStickerData(ImageUrl imageUrl, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, int i, int i2, boolean z) {
        C14360o3.A0B(str, 1);
        AbstractC167017dG.A1T(str3, str4);
        this.A06 = str;
        this.A07 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A02 = imageUrl;
        this.A0E = list;
        this.A0F = list2;
        this.A08 = num;
        this.A0G = z;
        this.A0B = str6;
        this.A0C = str7;
        this.A09 = str8;
        this.A0A = str9;
        this.A0D = str10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A02, i);
        List list = this.A0E;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l, i);
            }
        }
        List list2 = this.A0F;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l2 = AbstractC37304Gc5.A0l(parcel, list2);
            while (A0l2.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l2, i);
            }
        }
        AbstractC167027dH.A0o(parcel, this.A08, 0, 1);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0D);
    }
}
