package com.instagram.tagging.activity.mediaTaggingInfo;

import X.AbstractC166987dD;
import X.AbstractC50524MSc;
import X.C14360o3;
import X.C55344OhA;
import X.EnumC40111tc;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class MediaTaggingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(1);
    public float A00;
    public int A01;
    public ImageUrl A02;
    public EnumC40111tc A03;
    public ClipInfo A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public ArrayList A09;
    public ArrayList A0A;
    public ArrayList A0B;
    public ArrayList A0C;
    public ArrayList A0D;
    public ArrayList A0E;
    public List A0F;
    public List A0G;
    public boolean A0H;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A08);
        parcel.writeTypedList(this.A0B);
        parcel.writeTypedList(this.A0A);
        parcel.writeTypedList(this.A0F);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeTypedList(this.A0C);
        parcel.writeTypedList(this.A0D);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeSerializable(this.A03);
        parcel.writeStringList(this.A0G);
        parcel.writeValue(this.A04);
        parcel.writeStringList(this.A0E);
        parcel.writeStringList(this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
    }

    public MediaTaggingInfo(ImageUrl imageUrl, EnumC40111tc enumC40111tc, ClipInfo clipInfo, String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, List list, List list2, List list3, List list4) {
        ArrayList arrayList5;
        List list5;
        MSZ.A1O(str, enumC40111tc);
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC50524MSc.A0L(this, A1E);
        this.A06 = str;
        this.A02 = imageUrl;
        this.A08 = str2;
        this.A03 = enumC40111tc;
        if (arrayList != null) {
            A1E.addAll(arrayList);
        }
        if (list != null) {
            this.A0F = list;
        }
        if (arrayList2 != null) {
            this.A0C.addAll(arrayList2);
        }
        if (arrayList3 != null) {
            this.A0D.addAll(arrayList3);
        }
        if (arrayList4 != null && (list5 = this.A0G) != null) {
            list5.addAll(arrayList4);
        }
        if (list2 != null) {
            this.A0E.addAll(list2);
        }
        if (list3 != null) {
            this.A09.addAll(list3);
        }
        if (list4 != null && (arrayList5 = this.A0A) != null) {
            arrayList5.addAll(list4);
        }
        this.A04 = clipInfo;
        this.A05 = str3;
        this.A07 = str4;
    }
}
