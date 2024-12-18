package com.instagram.direct.wellbeing.common.upsell;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C2Fb;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class DirectWellBeingUpsellBottomSheetData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(48);
    public final int A00;
    public final C2Fb A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public DirectWellBeingUpsellBottomSheetData(C2Fb c2Fb, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z) {
        C14360o3.A0B(num, 1);
        this.A02 = num;
        this.A08 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A01 = c2Fb;
        this.A00 = i;
        this.A03 = str5;
        this.A04 = str6;
        this.A09 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectWellBeingUpsellBottomSheetData) {
                DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData = (DirectWellBeingUpsellBottomSheetData) obj;
                if (this.A02 != directWellBeingUpsellBottomSheetData.A02 || !C14360o3.A0K(this.A08, directWellBeingUpsellBottomSheetData.A08) || !C14360o3.A0K(this.A05, directWellBeingUpsellBottomSheetData.A05) || !C14360o3.A0K(this.A06, directWellBeingUpsellBottomSheetData.A06) || !C14360o3.A0K(this.A07, directWellBeingUpsellBottomSheetData.A07) || this.A01 != directWellBeingUpsellBottomSheetData.A01 || this.A00 != directWellBeingUpsellBottomSheetData.A00 || !C14360o3.A0K(this.A03, directWellBeingUpsellBottomSheetData.A03) || !C14360o3.A0K(this.A04, directWellBeingUpsellBottomSheetData.A04) || this.A09 != directWellBeingUpsellBottomSheetData.A09) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString("HIDDEN_WORDS");
        parcel.writeString(this.A08);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        C2Fb c2Fb = this.A01;
        if (c2Fb == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, c2Fb);
        }
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A09 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A09, ((((((((((((((((((-1447055436) + this.A02.intValue()) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DirectWellBeingUpsellBottomSheetData(surface=");
        if (this.A02 != null) {
            str = "HIDDEN_WORDS";
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", title=");
        A1C.append(this.A08);
        A1C.append(", subtitle=");
        A1C.append(this.A05);
        A1C.append(", subtitleSpanText=");
        A1C.append(this.A06);
        A1C.append(", subtitleSpanUrl=");
        A1C.append(this.A07);
        A1C.append(", subtitleSpanUrlSource=");
        A1C.append(this.A01);
        A1C.append(", imageRes=");
        A1C.append(this.A00);
        A1C.append(", primaryButtonText=");
        A1C.append(this.A03);
        A1C.append(", secondaryButtonText=");
        A1C.append(this.A04);
        A1C.append(", dismissOnSecondaryButtonClick=");
        A1C.append(this.A09);
        return AbstractC167017dG.A0p(A1C);
    }
}
