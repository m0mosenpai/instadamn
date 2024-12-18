package com.instagram.ui.primer;

import X.AbstractC167027dH;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class PrimerBottomSheetConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(12);
    public final int A00;
    public final TitleIcon A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public PrimerBottomSheetConfig(TitleIcon titleIcon, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, String str2, String str3, String str4, List list, int i, boolean z, boolean z2, boolean z3) {
        AbstractC25233BEq.A0x(1, str, list, str2);
        C14360o3.A0B(str3, 6);
        this.A0A = str;
        this.A01 = titleIcon;
        this.A00 = i;
        this.A0D = list;
        this.A0B = str2;
        this.A0C = str3;
        this.A0F = z;
        this.A0E = z2;
        this.A08 = num;
        this.A0G = z3;
        this.A04 = num2;
        this.A05 = num3;
        this.A03 = num4;
        this.A02 = num5;
        this.A06 = num6;
        this.A07 = num7;
        this.A09 = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        TitleIcon titleIcon = this.A01;
        if (titleIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            titleIcon.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A0D);
        while (A0u.hasNext()) {
            ((InfoItem) A0u.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        AbstractC167027dH.A0o(parcel, this.A08, 0, 1);
        parcel.writeInt(this.A0G ? 1 : 0);
        AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A05, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A06, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A07, 0, 1);
        parcel.writeString(this.A09);
    }
}
