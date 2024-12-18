package com.instagram.infocenter.model;

import X.AbstractC25226BEj;
import X.AbstractC47053KrA;
import X.AbstractC47055KrC;
import X.C05F;
import X.C55343Oh9;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* loaded from: classes8.dex */
public final class ShareInfo implements InfoCenterShareInfoIntf {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(8);
    public ImageUrl A00;
    public ExtendedImageUrl A01;
    public ExtendedImageUrl A02;
    public ExtendedImageUrl A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;
    public List A0C;
    public boolean A0D;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.instagram.infocenter.intf.InfoCenterShareInfoIntf
    public final int[] Alw() {
        List list = this.A0C;
        if (list == null) {
            return null;
        }
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = Color.parseColor(AbstractC25226BEj.A1I(list, i));
        }
        return iArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(AbstractC47055KrC.A00(this.A05));
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeStringList(this.A0B);
        parcel.writeStringList(this.A0C);
        parcel.writeString(AbstractC47053KrA.A00(this.A04));
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
    }

    public ShareInfo() {
        Integer num = C05F.A00;
        this.A05 = num;
        this.A04 = num;
    }
}
